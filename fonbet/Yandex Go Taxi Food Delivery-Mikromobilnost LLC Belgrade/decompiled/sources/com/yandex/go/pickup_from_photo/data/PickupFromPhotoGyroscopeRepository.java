package com.yandex.go.pickup_from_photo.data;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import defpackage.ffx;
import defpackage.hbj;
import defpackage.jq80;
import defpackage.lz40;
import defpackage.tpr;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0012J\u000f\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J\u0013\u00100\u001a\b\u0012\u0004\u0012\u00020,0/¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001f\u0010:\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0016\u0010C\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010AR\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010H\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u0014\u0010I\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\u0014\u0010J\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010ER\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020,0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lcom/yandex/go/pickup_from_photo/data/PickupFromPhotoGyroscopeRepository;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "values", "Lzy11;", "handleRotationVector", "([F)V", "handleAccelerometer", "handleMagnetometer", "input", "output", "applyLowPassFilterWithNormalization", "([F[F)V", "calculateOrientationFromMatrix", "()V", "", "rawPitch", "rawRoll", "calculateExtendedPitch", "(FF)F", "pitch", "normalizePitch", "(F)F", "calculateOrientationFromAccelMag", "matrix", "adjustForScreenRotation", "([F)[F", "azimuth", "normalizeAzimuth", "Lcom/yandex/go/pickup_from_photo/data/OrientationAccuracy;", "getCurrentAccuracy", "()Lcom/yandex/go/pickup_from_photo/data/OrientationAccuracy;", "roll", "updateOrientation", "(FFF)V", "Ljq80;", ConfigConstants.CONFIG, "startListening", "(Ljq80;)V", "stopListening", "Lhbj;", "getCurrentOrientation", "()Lhbj;", "Ltpr;", "observeOrientation", "()Ltpr;", "Landroid/hardware/SensorEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/content/Context;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "accelerometer", "Landroid/hardware/Sensor;", "magnetometer", "rotationVectorSensor", "accelerometerData", "[F", "magnetometerData", "rotationMatrix", "orientationData", "filteredAccelerometer", "filteredMagnetometer", "Ljq80;", "", "isListening", "Z", "currentOrientation", "Lhbj;", "", "lastUpdateTime", "J", "accelerometerAccuracy", CA20Status.STATUS_USER_I, "magnetometerAccuracy", "Llz40;", "_orientationFlow", "Llz40;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickupFromPhotoGyroscopeRepository implements SensorEventListener {
    public static final int $stable = 8;
    private final lz40 _orientationFlow;
    private final Sensor accelerometer;
    private int accelerometerAccuracy;
    private final float[] accelerometerData;
    private jq80 config;
    private final Context context;
    private hbj currentOrientation;
    private final float[] filteredAccelerometer;
    private final float[] filteredMagnetometer;
    private boolean isListening;
    private long lastUpdateTime;
    private final Sensor magnetometer;
    private int magnetometerAccuracy;
    private final float[] magnetometerData;
    private final float[] orientationData;
    private final float[] rotationMatrix;
    private final Sensor rotationVectorSensor;
    private final SensorManager sensorManager;

    public PickupFromPhotoGyroscopeRepository(Context context) {
        this.context = context;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.accelerometer = sensorManager.getDefaultSensor(1);
        this.magnetometer = sensorManager.getDefaultSensor(2);
        this.rotationVectorSensor = sensorManager.getDefaultSensor(11);
        this.accelerometerData = new float[3];
        this.magnetometerData = new float[3];
        this.rotationMatrix = new float[9];
        this.orientationData = new float[3];
        this.filteredAccelerometer = new float[3];
        this.filteredMagnetometer = new float[3];
        this.config = new jq80(7);
        this.accelerometerAccuracy = 2;
        this.magnetometerAccuracy = 2;
        this._orientationFlow = ffx.c(1, 0, BufferOverflow.DROP_OLDEST, 2);
    }

    private final float[] adjustForScreenRotation(float[] matrix) {
        int rotation;
        Display display;
        float[] fArr = new float[9];
        WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            display = this.context.getDisplay();
            rotation = display.getRotation();
        } else {
            rotation = windowManager.getDefaultDisplay().getRotation();
        }
        if (rotation == 0) {
            SensorManager.remapCoordinateSystem(matrix, 1, 3, fArr);
            return fArr;
        }
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(matrix, 2, 3, fArr);
            return fArr;
        }
        if (rotation == 2) {
            SensorManager.remapCoordinateSystem(matrix, HProv.PP_SECURITY_LEVEL, 3, fArr);
            return fArr;
        }
        if (rotation != 3) {
            System.arraycopy(matrix, 0, fArr, 0, 9);
            return fArr;
        }
        SensorManager.remapCoordinateSystem(matrix, 130, 3, fArr);
        return fArr;
    }

    private final void applyLowPassFilterWithNormalization(float[] input, float[] output) {
        float f = input[0];
        float f2 = input[1];
        float f3 = input[2];
        float f4 = f3 * f3;
        float sqrt = (float) Math.sqrt(f4 + (f2 * f2) + (f * f));
        int length = input.length;
        for (int i = 0; i < length; i++) {
            float f5 = this.config.b;
            output[i] = ((1.0f - f5) * input[i]) + (output[i] * f5);
        }
        float f6 = output[0];
        float f7 = output[1];
        float f8 = (f7 * f7) + (f6 * f6);
        float f9 = output[2];
        float sqrt2 = (float) Math.sqrt((f9 * f9) + f8);
        if (sqrt2 > 0.0f) {
            float f10 = sqrt / sqrt2;
            int length2 = output.length;
            for (int i2 = 0; i2 < length2; i2++) {
                output[i2] = output[i2] * f10;
            }
        }
    }

    private final float calculateExtendedPitch(float rawPitch, float rawRoll) {
        if (Math.abs(rawRoll) > 90.0f) {
            rawPitch = rawPitch >= 0.0f ? (90.0f - rawPitch) + 90.0f : (-180.0f) - rawPitch;
        }
        return normalizePitch(rawPitch);
    }

    private final void calculateOrientationFromAccelMag() {
        if (SensorManager.getRotationMatrix(this.rotationMatrix, null, this.accelerometerData, this.magnetometerData)) {
            calculateOrientationFromMatrix();
        }
    }

    private final void calculateOrientationFromMatrix() {
        SensorManager.getOrientation(adjustForScreenRotation(this.rotationMatrix), this.orientationData);
        float normalizeAzimuth = normalizeAzimuth((float) Math.toDegrees(this.orientationData[0]));
        float degrees = (float) Math.toDegrees(this.orientationData[1]);
        float degrees2 = (float) Math.toDegrees(this.orientationData[2]);
        updateOrientation(normalizeAzimuth, calculateExtendedPitch(degrees, degrees2), degrees2);
    }

    private final OrientationAccuracy getCurrentAccuracy() {
        int min = Math.min(this.accelerometerAccuracy, this.magnetometerAccuracy);
        return min != 1 ? min != 2 ? min != 3 ? OrientationAccuracy.UNRELIABLE : OrientationAccuracy.HIGH : OrientationAccuracy.MEDIUM : OrientationAccuracy.LOW;
    }

    private final void handleAccelerometer(float[] values) {
        if (this.config.a) {
            applyLowPassFilterWithNormalization(values, this.filteredAccelerometer);
            System.arraycopy(this.filteredAccelerometer, 0, this.accelerometerData, 0, 3);
        } else {
            System.arraycopy(values, 0, this.accelerometerData, 0, 3);
        }
        for (float f : this.magnetometerData) {
            if (f != 0.0f) {
                calculateOrientationFromAccelMag();
                return;
            }
        }
    }

    private final void handleMagnetometer(float[] values) {
        if (this.config.a) {
            applyLowPassFilterWithNormalization(values, this.filteredMagnetometer);
            System.arraycopy(this.filteredMagnetometer, 0, this.magnetometerData, 0, 3);
        } else {
            System.arraycopy(values, 0, this.magnetometerData, 0, 3);
        }
        for (float f : this.accelerometerData) {
            if (f != 0.0f) {
                calculateOrientationFromAccelMag();
                return;
            }
        }
    }

    private final void handleRotationVector(float[] values) {
        SensorManager.getRotationMatrixFromVector(this.rotationMatrix, values);
        calculateOrientationFromMatrix();
    }

    private final float normalizeAzimuth(float azimuth) {
        return (azimuth + 360.0f) % 360.0f;
    }

    private final float normalizePitch(float pitch) {
        while (pitch > 180.0f) {
            pitch -= 360.0f;
        }
        while (pitch < -180.0f) {
            pitch += 360.0f;
        }
        return pitch;
    }

    private final void updateOrientation(float azimuth, float pitch, float roll) {
        hbj hbjVar = new hbj(azimuth, pitch, roll, getCurrentAccuracy());
        this.currentOrientation = hbjVar;
        this._orientationFlow.g(hbjVar);
    }

    public final hbj getCurrentOrientation() {
        return this.currentOrientation;
    }

    public final tpr observeOrientation() {
        return e.c(this._orientationFlow);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        int type = sensor.getType();
        if (type == 1) {
            this.accelerometerAccuracy = accuracy;
        } else {
            if (type != 2) {
                return;
            }
            this.magnetometerAccuracy = accuracy;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastUpdateTime < this.config.c) {
            return;
        }
        int type = event.sensor.getType();
        if (type == 1) {
            handleAccelerometer(event.values);
        } else if (type == 2) {
            handleMagnetometer(event.values);
        } else if (type == 11) {
            handleRotationVector(event.values);
        }
        this.lastUpdateTime = currentTimeMillis;
    }

    public final void startListening(jq80 config) {
        if (this.isListening) {
            return;
        }
        this.config = config;
        this.isListening = true;
        Sensor sensor = this.rotationVectorSensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, 2);
            return;
        }
        Sensor sensor2 = this.accelerometer;
        if (sensor2 != null) {
            this.sensorManager.registerListener(this, sensor2, 2);
        }
        Sensor sensor3 = this.magnetometer;
        if (sensor3 != null) {
            this.sensorManager.registerListener(this, sensor3, 2);
        }
    }

    public final void stopListening() {
        if (this.isListening) {
            this.sensorManager.unregisterListener(this);
            this.isListening = false;
        }
    }
}
