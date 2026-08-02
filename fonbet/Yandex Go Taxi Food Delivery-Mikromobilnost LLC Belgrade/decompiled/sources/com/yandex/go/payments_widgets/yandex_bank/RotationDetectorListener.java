package com.yandex.go.payments_widgets.yandex_bank;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments_widgets.yandex_bank.RotationDetectorListener;
import defpackage.cey;
import defpackage.dai;
import defpackage.exk0;
import defpackage.g18;
import defpackage.hea0;
import defpackage.hr51;
import defpackage.iea0;
import defpackage.jv51;
import defpackage.k4o;
import defpackage.mxk0;
import defpackage.qke;
import defpackage.u2w0;
import defpackage.v2w0;
import defpackage.yaa0;
import defpackage.zaa0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u00017\b\u0007\u0018\u00002\u00020\u0001:\u0001EBM\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010(\u0012\u0004\b)\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00101R\u0016\u0010?\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010C¨\u0006F"}, d2 = {"Lcom/yandex/go/payments_widgets/yandex_bank/RotationDetectorListener;", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorManager;", "sensorManager", "Lmxk0;", "rotationRepository", "Landroid/content/Context;", "uiContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Ljv51;", "ybScreenVisibilityInteractor", "Lu2w0;", "superAppMainScreenOverlappedRepository", "Lhea0;", "paymentMiniWidgetsVisibilityRepository", "Lyaa0;", "paymentMethodsHideBalanceExperimentRepository", "<init>", "(Landroid/hardware/SensorManager;Lmxk0;Landroid/content/Context;Landroidx/lifecycle/Lifecycle;Ljv51;Lu2w0;Lhea0;Lyaa0;)V", "", "now", "()J", "Lzy11;", "changeDetectorEnable", "()V", "unregisterListener", "Landroid/hardware/SensorEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "p0", "", "p1", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/hardware/SensorManager;", "Lmxk0;", "Landroid/content/Context;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$annotations", "Ljv51;", "Lu2w0;", "Lhea0;", "Lcom/yandex/go/payments_widgets/yandex_bank/RotationDetectorListener$InitialPosition;", "initialPosition", "Lcom/yandex/go/payments_widgets/yandex_bank/RotationDetectorListener$InitialPosition;", "lastSuccessActionMs", "J", "initialRotationTimeStampMs", "", "frontLeanOccurred", "Z", "backLeanOccurred", "exk0", "rotationRemoteConfig", "Lexk0;", "", "startRangeForFirstLean", CA20Status.STATUS_REQUEST_D, "startRangeForReturnLean", "timeWindowMs", "sensor", "Landroid/hardware/Sensor;", "Lg18;", "onPauseCancellable", "Lg18;", "onResumeCancellable", "InitialPosition", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RotationDetectorListener implements SensorEventListener {
    private boolean backLeanOccurred;
    private boolean frontLeanOccurred;
    private long lastSuccessActionMs;
    private final Lifecycle lifecycle;
    private g18 onPauseCancellable;
    private g18 onResumeCancellable;
    private final hea0 paymentMiniWidgetsVisibilityRepository;
    private final mxk0 rotationRepository;
    private final Sensor sensor;
    private final SensorManager sensorManager;
    private double startRangeForFirstLean;
    private double startRangeForReturnLean;
    private final u2w0 superAppMainScreenOverlappedRepository;
    private long timeWindowMs;
    private final Context uiContext;
    private final jv51 ybScreenVisibilityInteractor;
    private InitialPosition initialPosition = InitialPosition.OFF;
    private long initialRotationTimeStampMs = now();
    private final exk0 rotationRemoteConfig = new exk0();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/payments_widgets/yandex_bank/RotationDetectorListener$InitialPosition;", "", "OFF", "FRONT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
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
            $ENTRIES = kotlin.enums.a.a(initialPositionArr);
        }

        public static InitialPosition valueOf(String str) {
            return (InitialPosition) Enum.valueOf(InitialPosition.class, str);
        }

        public static InitialPosition[] values() {
            return (InitialPosition[]) $VALUES.clone();
        }
    }

    public RotationDetectorListener(SensorManager sensorManager, mxk0 mxk0Var, Context context, Lifecycle lifecycle, jv51 jv51Var, u2w0 u2w0Var, hea0 hea0Var, yaa0 yaa0Var) {
        this.sensorManager = sensorManager;
        this.rotationRepository = mxk0Var;
        this.uiContext = context;
        this.lifecycle = lifecycle;
        this.ybScreenVisibilityInteractor = jv51Var;
        this.superAppMainScreenOverlappedRepository = u2w0Var;
        this.paymentMiniWidgetsVisibilityRepository = hea0Var;
        zaa0 zaa0Var = (zaa0) yaa0Var;
        this.startRangeForFirstLean = ((PaymentMethodsHideBalanceExperiment) zaa0Var.c()).d;
        this.startRangeForReturnLean = ((PaymentMethodsHideBalanceExperiment) zaa0Var.c()).e;
        this.timeWindowMs = ((PaymentMethodsHideBalanceExperiment) zaa0Var.c()).c;
        this.sensor = sensorManager.getDefaultSensor(9);
        dai daiVar = g18.u1;
        this.onPauseCancellable = daiVar;
        this.onResumeCancellable = daiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeDetectorEnable$lambda$0(RotationDetectorListener rotationDetectorListener) {
        rotationDetectorListener.sensorManager.unregisterListener(rotationDetectorListener, rotationDetectorListener.sensor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeDetectorEnable$lambda$1(RotationDetectorListener rotationDetectorListener) {
        rotationDetectorListener.sensorManager.registerListener(rotationDetectorListener, rotationDetectorListener.sensor, 1);
    }

    private static /* synthetic */ void getLifecycle$annotations() {
    }

    private final long now() {
        return System.currentTimeMillis();
    }

    public final void changeDetectorEnable() {
        final int i = 0;
        this.onPauseCancellable = cey.a(this.lifecycle, Lifecycle.Event.ON_PAUSE, new Runnable(this) { // from class: dxk0
            public final /* synthetic */ RotationDetectorListener b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                RotationDetectorListener rotationDetectorListener = this.b;
                switch (i2) {
                    case 0:
                        RotationDetectorListener.changeDetectorEnable$lambda$0(rotationDetectorListener);
                        break;
                    default:
                        RotationDetectorListener.changeDetectorEnable$lambda$1(rotationDetectorListener);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.onResumeCancellable = cey.a(this.lifecycle, Lifecycle.Event.ON_RESUME, new Runnable(this) { // from class: dxk0
            public final /* synthetic */ RotationDetectorListener b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                RotationDetectorListener rotationDetectorListener = this.b;
                switch (i22) {
                    case 0:
                        RotationDetectorListener.changeDetectorEnable$lambda$0(rotationDetectorListener);
                        break;
                    default:
                        RotationDetectorListener.changeDetectorEnable$lambda$1(rotationDetectorListener);
                        break;
                }
            }
        });
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor p0, int p1) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (((Boolean) ((iea0) this.paymentMiniWidgetsVisibilityRepository).a.getValue()).booleanValue()) {
            return;
        }
        hr51 hr51Var = (hr51) this.ybScreenVisibilityInteractor;
        if ((!hr51Var.b.isInitialized() || hr51Var.a().getChildCount() == 0) && !((Boolean) ((v2w0) this.superAppMainScreenOverlappedRepository).a.getValue()).booleanValue()) {
            float f = event.values[2];
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
                boolean z = this.backLeanOccurred;
                if (!z && f < (-this.startRangeForFirstLean)) {
                    this.backLeanOccurred = true;
                } else if (z && f > this.startRangeForReturnLean) {
                    this.frontLeanOccurred = true;
                }
            }
            if (this.frontLeanOccurred && this.backLeanOccurred) {
                this.initialPosition = initialPosition2;
                this.frontLeanOccurred = false;
                this.backLeanOccurred = false;
                this.lastSuccessActionMs = now();
                this.rotationRepository.a();
                qke.E(this.uiContext, HapticController$Effect.TICK, false, 8);
            }
        }
    }

    public final void unregisterListener() {
        this.onPauseCancellable.cancel();
        this.onResumeCancellable.cancel();
        this.sensorManager.unregisterListener(this, this.sensor);
    }
}
