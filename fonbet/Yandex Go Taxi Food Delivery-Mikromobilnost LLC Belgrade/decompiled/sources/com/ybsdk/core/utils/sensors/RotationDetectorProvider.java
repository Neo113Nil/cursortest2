package com.ybsdk.core.utils.sensors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ybsdk.rconfig.b;
import defpackage.fdh;
import defpackage.g8e;
import defpackage.ixk0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.pey;
import defpackage.sls;
import defpackage.tv3;
import defpackage.tvt0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u00016B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010#R\u0016\u0010,\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0014\u00100\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010&R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u00105\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010&¨\u00067"}, d2 = {"Lcom/ybsdk/core/utils/sensors/RotationDetectorProvider;", "Landroid/hardware/SensorEventListener;", "Ltvt0;", "Lkotlin/Function0;", "Lzy11;", "onRotation", "Landroid/hardware/SensorManager;", "sensorManager", "Lixk0;", "rotationRemoteConfig", "<init>", "(Lsls;Landroid/hardware/SensorManager;Lixk0;)V", "", "now", "()J", "Lpey;", "viewLifecycleOwner", "changeDetectorEnable", "(Lpey;)V", "Landroid/hardware/SensorEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "p0", "", "p1", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Lsls;", "Landroid/hardware/SensorManager;", "Lcom/ybsdk/core/utils/sensors/RotationDetectorProvider$InitialPosition;", "initialPosition", "Lcom/ybsdk/core/utils/sensors/RotationDetectorProvider$InitialPosition;", "initialRotationTimeStampMs", "J", "", "frontLeanOccurred", "Z", "backLeanOccurred", "startRangeForFirstLean", CA20Status.STATUS_USER_I, "startRangeForReturnLean", "timeWindowMs", "gravitySensor", "Landroid/hardware/Sensor;", "accelerometerSensor", "sensor", "isUsingGravitySensor", "", "accelerometerAlpha", "F", "accelerometerFilteredZ", "accelerometerFilterInitialized", "InitialPosition", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RotationDetectorProvider implements SensorEventListener, tvt0 {
    private final float accelerometerAlpha;
    private boolean accelerometerFilterInitialized;
    private float accelerometerFilteredZ;
    private final Sensor accelerometerSensor;
    private boolean backLeanOccurred;
    private boolean frontLeanOccurred;
    private final Sensor gravitySensor;
    private InitialPosition initialPosition = InitialPosition.OFF;
    private long initialRotationTimeStampMs = now();
    private final boolean isUsingGravitySensor;
    private final sls onRotation;
    private final Sensor sensor;
    private final SensorManager sensorManager;
    private int startRangeForFirstLean;
    private int startRangeForReturnLean;
    private long timeWindowMs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/ybsdk/core/utils/sensors/RotationDetectorProvider$InitialPosition;", "", "OFF", "FRONT", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitialPosition {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InitialPosition[] $VALUES;
        public static final InitialPosition FRONT;
        public static final InitialPosition OFF;

        static {
            InitialPosition initialPosition = new InitialPosition("OFF", 0);
            OFF = initialPosition;
            InitialPosition initialPosition2 = new InitialPosition("FRONT", 1);
            FRONT = initialPosition2;
            InitialPosition[] initialPositionArr = {initialPosition, initialPosition2};
            $VALUES = initialPositionArr;
            $ENTRIES = a.a(initialPositionArr);
        }

        public static InitialPosition valueOf(String str) {
            return (InitialPosition) Enum.valueOf(InitialPosition.class, str);
        }

        public static InitialPosition[] values() {
            return (InitialPosition[]) $VALUES.clone();
        }
    }

    public RotationDetectorProvider(sls slsVar, SensorManager sensorManager, ixk0 ixk0Var) {
        this.onRotation = slsVar;
        this.sensorManager = sensorManager;
        b bVar = ((tv3) ixk0Var).a;
        this.startRangeForFirstLean = bVar.k().getStartRangeForFirstLean();
        this.startRangeForReturnLean = bVar.k().getStartRangeForReturnLean();
        this.timeWindowMs = bVar.k().getTimeWindowMs();
        Sensor defaultSensor = sensorManager.getDefaultSensor(9);
        this.gravitySensor = defaultSensor;
        Sensor defaultSensor2 = jl40.l(bVar.k().getAccelerometerFallbackEnabled(), Boolean.TRUE) ? sensorManager.getDefaultSensor(1) : null;
        this.accelerometerSensor = defaultSensor2;
        defaultSensor = defaultSensor == null ? defaultSensor2 : defaultSensor;
        this.sensor = defaultSensor;
        this.isUsingGravitySensor = defaultSensor != null && defaultSensor.getType() == 9;
        Float accelerometerAlpha = bVar.k().getAccelerometerAlpha();
        this.accelerometerAlpha = accelerometerAlpha != null ? accelerometerAlpha.floatValue() : 0.8f;
    }

    private final long now() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.tvt0
    public void changeDetectorEnable(pey viewLifecycleOwner) {
        viewLifecycleOwner.getLifecycle().a(new fdh(2, this));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor p0, int p1) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        float f;
        boolean z = this.isUsingGravitySensor;
        float[] fArr = event.values;
        if (z) {
            f = fArr[2];
        } else {
            float f2 = fArr[2];
            if (this.accelerometerFilterInitialized) {
                float f3 = this.accelerometerAlpha;
                this.accelerometerFilteredZ = g8e.b(1.0f, f3, f2, this.accelerometerFilteredZ * f3);
            } else {
                this.accelerometerFilteredZ = f2;
                this.accelerometerFilterInitialized = true;
            }
            f = this.accelerometerFilteredZ;
        }
        long now = now() - this.initialRotationTimeStampMs;
        InitialPosition initialPosition = this.initialPosition;
        InitialPosition initialPosition2 = InitialPosition.OFF;
        if (initialPosition != initialPosition2 && now > this.timeWindowMs) {
            this.initialPosition = initialPosition2;
            this.frontLeanOccurred = false;
            this.backLeanOccurred = false;
        }
        InitialPosition initialPosition3 = this.initialPosition;
        if (initialPosition3 == initialPosition2) {
            if (f > 0.0f) {
                this.initialPosition = InitialPosition.FRONT;
            }
            this.initialRotationTimeStampMs = now();
            return;
        }
        if (initialPosition3 == InitialPosition.FRONT) {
            boolean z2 = this.backLeanOccurred;
            if (!z2 && f < (-this.startRangeForFirstLean)) {
                this.backLeanOccurred = true;
            } else if (z2 && f > this.startRangeForReturnLean) {
                this.frontLeanOccurred = true;
            }
        }
        if (this.frontLeanOccurred && this.backLeanOccurred) {
            this.initialPosition = initialPosition2;
            this.frontLeanOccurred = false;
            this.backLeanOccurred = false;
            this.onRotation.invoke();
        }
    }
}
