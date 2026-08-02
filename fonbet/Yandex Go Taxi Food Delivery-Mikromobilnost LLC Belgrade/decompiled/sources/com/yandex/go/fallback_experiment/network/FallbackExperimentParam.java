package com.yandex.go.fallback_experiment.network;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/fallback_experiment/network/FallbackExperimentParam;", "", "Companion", "Point", "$serializer", "com/yandex/go/fallback_experiment/network/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FallbackExperimentParam {
    public static final a Companion = new a();
    public final Point a;
    public final Point b;
    public final String c;

    public /* synthetic */ FallbackExperimentParam(int i, Point point, Point point2, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, FallbackExperimentParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = point;
        this.b = point2;
        this.c = str;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/fallback_experiment/network/FallbackExperimentParam$Point;", "", "Companion", "$serializer", "com/yandex/go/fallback_experiment/network/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Point {
        public static final b Companion = new b();
        public final double a;
        public final double b;

        public /* synthetic */ Point(double d, double d2, int i) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, FallbackExperimentParam$Point$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = d;
            this.b = d2;
        }

        public Point(double d, double d2) {
            this.a = d;
            this.b = d2;
        }
    }

    public FallbackExperimentParam(Point point, Point point2, String str) {
        this.a = point;
        this.b = point2;
        this.c = str;
    }
}
