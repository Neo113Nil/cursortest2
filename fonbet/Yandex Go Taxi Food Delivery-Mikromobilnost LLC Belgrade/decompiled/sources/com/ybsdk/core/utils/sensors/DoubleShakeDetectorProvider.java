package com.ybsdk.core.utils.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import defpackage.arq0;
import defpackage.bhr0;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/ybsdk/core/utils/sensors/DoubleShakeDetectorProvider;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lzy11;", "onShake", "<init>", "(Landroid/content/Context;Lsls;)V", "registerListener", "()V", "", "now", "()J", "Lbhr0;", "shakeRemoteConfig", "enable", "(Lbhr0;)V", "disable", "unregisterListener", "Landroid/hardware/SensorEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "p0", "", "p1", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Lsls;", "lastShakeTimestampMs", "J", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "accelerometer", "Landroid/hardware/Sensor;", "Lbhr0;", "Larq0;", "queue", "Larq0;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleShakeDetectorProvider implements SensorEventListener {
    private final Sensor accelerometer;
    private long lastShakeTimestampMs;
    private final sls onShake;
    private arq0 queue;
    private final SensorManager sensorManager;
    private bhr0 shakeRemoteConfig;

    public DoubleShakeDetectorProvider(Context context, sls slsVar) {
        this.onShake = slsVar;
        SensorManager sensorManager = (SensorManager) (context != null ? context.getSystemService("sensor") : null);
        this.sensorManager = sensorManager;
        this.accelerometer = sensorManager.getDefaultSensor(10);
    }

    private final long now() {
        return System.currentTimeMillis();
    }

    private final void registerListener() {
        this.sensorManager.registerListener(this, this.accelerometer, 1);
    }

    public final void disable() {
        unregisterListener();
    }

    public final void enable(bhr0 shakeRemoteConfig) {
        throw null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor p0, int p1) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        float[] fArr = event.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        throw null;
    }

    public final void unregisterListener() {
        this.sensorManager.unregisterListener(this, this.accelerometer);
    }
}
