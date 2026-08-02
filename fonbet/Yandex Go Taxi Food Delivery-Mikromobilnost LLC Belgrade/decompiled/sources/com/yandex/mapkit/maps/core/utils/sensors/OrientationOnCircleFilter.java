package com.yandex.mapkit.maps.core.utils.sensors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tJ \u0010\u0017\u001a\u00020\u0018*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/yandex/mapkit/maps/core/utils/sensors/OrientationOnCircleFilter;", "", "parameters", "Lcom/yandex/mapkit/maps/core/utils/sensors/OrientationOnCircleFilter$Parameters;", "<init>", "(Lcom/yandex/mapkit/maps/core/utils/sensors/OrientationOnCircleFilter$Parameters;)V", "rotationMatricesLastSomeTime", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "noiseRotationsLastSomeTime", "lastSentRotationTime", "prevRotation", "lastSentRotation", "listForRotations", "", "listForNoiseRotations", "rightLeft", "", "rightLeftMax", "filteredRotation", "rotation", "clearOlderThan", "", "", "olderPossibleTime", "Parameters", "Companion", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrientationOnCircleFilter {
    private static final double LOW_PASS_ALPHA_DEFAULT = 1.0d;
    private double lastSentRotation;
    private long lastSentRotationTime;
    private final Parameters parameters;
    private final LinkedHashMap<Long, Double> rotationMatricesLastSomeTime = new LinkedHashMap<>();
    private final LinkedHashMap<Long, Double> noiseRotationsLastSomeTime = new LinkedHashMap<>();
    private double prevRotation = Double.NaN;
    private final List<Double> listForRotations = new ArrayList();
    private final List<Double> listForNoiseRotations = new ArrayList();
    private final double[] rightLeft = new double[2];
    private final double[] rightLeftMax = new double[2];

    public OrientationOnCircleFilter(Parameters parameters) {
        this.parameters = parameters;
    }

    private final boolean clearOlderThan(Map<Long, Double> map, long j) {
        Iterator<T> it = map.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (clearOlderThan$lambda$0(j, (Map.Entry) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private static final boolean clearOlderThan$lambda$0(long j, Map.Entry entry) {
        return ((Number) entry.getKey()).longValue() < j;
    }

    public final double filteredRotation(double rotation) {
        double d;
        long currentTimeMillis = System.currentTimeMillis();
        this.rotationMatricesLastSomeTime.put(Long.valueOf(currentTimeMillis), Double.valueOf(rotation));
        if (currentTimeMillis - this.lastSentRotationTime > this.parameters.getSendsInterval()) {
            this.lastSentRotationTime = currentTimeMillis;
            clearOlderThan(this.rotationMatricesLastSomeTime, currentTimeMillis - this.parameters.getAccumulateInterval());
            List<Double> list = this.listForRotations;
            list.clear();
            list.addAll(this.rotationMatricesLastSomeTime.values());
            clearOlderThan(this.noiseRotationsLastSomeTime, currentTimeMillis - this.parameters.getDetectNoiseInterval());
            List<Double> list2 = this.listForNoiseRotations;
            list2.clear();
            list2.addAll(this.noiseRotationsLastSomeTime.values());
            double averageDegree = RotationsOnCircleUtilsKt.averageDegree(list);
            RotationsOnCircleUtilsKt.averageRightLeft(list2, averageDegree, this.rightLeft);
            double[] dArr = this.rightLeft;
            double abs = Math.abs(dArr[0] + dArr[1]);
            RotationsOnCircleUtilsKt.maxRightLeftDist(list2, averageDegree, this.rightLeftMax);
            double[] dArr2 = this.rightLeftMax;
            double d2 = dArr2[0] + dArr2[1];
            double d3 = LOW_PASS_ALPHA_DEFAULT;
            double d4 = (abs == 0.0d || d2 == 0.0d) ? 1.0d : (2.0d * abs) / d2;
            if (d4 < 0.0d) {
                d3 = 0.01d;
            } else if (d4 <= LOW_PASS_ALPHA_DEFAULT) {
                d = d4;
                double lowPass360 = FiltersMathKt.lowPass360(averageDegree, this.prevRotation, d);
                this.prevRotation = lowPass360;
                this.noiseRotationsLastSomeTime.put(Long.valueOf(currentTimeMillis), Double.valueOf(lowPass360));
                if (!list2.isEmpty() || abs > this.parameters.getMaxAsymmetryToKeepLast()) {
                    this.lastSentRotation = lowPass360;
                    return lowPass360;
                }
            }
            d = d3;
            double lowPass3602 = FiltersMathKt.lowPass360(averageDegree, this.prevRotation, d);
            this.prevRotation = lowPass3602;
            this.noiseRotationsLastSomeTime.put(Long.valueOf(currentTimeMillis), Double.valueOf(lowPass3602));
            if (!list2.isEmpty()) {
            }
            this.lastSentRotation = lowPass3602;
            return lowPass3602;
        }
        return this.lastSentRotation;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/yandex/mapkit/maps/core/utils/sensors/OrientationOnCircleFilter$Parameters;", "", "maxAsymmetryToKeepLast", "", "sendsInterval", "", "accumulateInterval", "detectNoiseInterval", "<init>", "(DJJJ)V", "getMaxAsymmetryToKeepLast", "()D", "getSendsInterval", "()J", "getAccumulateInterval", "getDetectNoiseInterval", "Companion", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Parameters {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long accumulateInterval;
        private final long detectNoiseInterval;
        private final double maxAsymmetryToKeepLast;
        private final long sendsInterval;

        public Parameters(double d, long j, long j2, long j3) {
            this.maxAsymmetryToKeepLast = d;
            this.sendsInterval = j;
            this.accumulateInterval = j2;
            this.detectNoiseInterval = j3;
        }

        public final long getAccumulateInterval() {
            return this.accumulateInterval;
        }

        public final long getDetectNoiseInterval() {
            return this.detectNoiseInterval;
        }

        public final double getMaxAsymmetryToKeepLast() {
            return this.maxAsymmetryToKeepLast;
        }

        public final long getSendsInterval() {
            return this.sendsInterval;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/mapkit/maps/core/utils/sensors/OrientationOnCircleFilter$Parameters$Companion;", "", "<init>", "()V", "compass", "Lcom/yandex/mapkit/maps/core/utils/sensors/OrientationOnCircleFilter$Parameters;", "panorama", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Parameters compass() {
                return new Parameters(OrientationOnCircleFilter.LOW_PASS_ALPHA_DEFAULT, 50L, 100L, 5000L);
            }

            public final Parameters panorama() {
                return new Parameters(0.5d, 16L, 50L, 7000L);
            }

            private Companion() {
            }
        }
    }
}
