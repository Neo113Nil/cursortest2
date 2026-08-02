package com.yandex.mobile.drive.map;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import defpackage.afo;
import defpackage.tt5;
import defpackage.xeo;
import defpackage.zeo;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u0013\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/mobile/drive/map/LocationDirectionHandler;", "Lzeo;", "Landroid/hardware/SensorEventListener;", "Landroid/app/Application;", "app", "Ltt5;", "messenger", "<init>", "(Landroid/app/Application;Ltt5;)V", "Lzy11;", "publish", "()V", "dispose", "start", "stop", "", "arguments", "Lxeo;", "events", "onListen", "(Ljava/lang/Object;Lxeo;)V", "onCancel", "(Ljava/lang/Object;)V", "Landroid/hardware/SensorEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Lafo;", "channel", "Lafo;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "", "rotation", "[F", "orientation", "Lxeo;", "", "direction", "Ljava/lang/Double;", "", "started", "Z", "drive_map_mobile_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocationDirectionHandler implements zeo, SensorEventListener {
    private final afo channel;
    private Double direction;
    private xeo events;
    private final float[] orientation;
    private final float[] rotation;
    private final SensorManager sensorManager;
    private boolean started;

    public LocationDirectionHandler(Application application, tt5 tt5Var) {
        afo afoVar = new afo(tt5Var, "sensor/direction");
        this.channel = afoVar;
        this.sensorManager = (SensorManager) application.getSystemService(SensorManager.class);
        this.rotation = new float[9];
        this.orientation = new float[3];
        afoVar.a(this);
    }

    private final void publish() {
        Double d = this.direction;
        if (d != null) {
            double doubleValue = d.doubleValue();
            xeo xeoVar = this.events;
            if (xeoVar != null) {
                xeoVar.success(Double.valueOf(doubleValue));
            }
        }
    }

    public final void dispose() {
        stop();
        this.channel.a(null);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // defpackage.zeo
    public void onCancel(Object arguments) {
        this.events = null;
    }

    @Override // defpackage.zeo
    public void onListen(Object arguments, xeo events) {
        this.events = events;
        publish();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        SensorManager.getRotationMatrixFromVector(this.rotation, event.values);
        SensorManager.getOrientation(this.rotation, this.orientation);
        this.direction = Double.valueOf(Math.toDegrees(this.orientation[0]));
        publish();
    }

    public final void start() {
        Sensor defaultSensor;
        if (this.started) {
            return;
        }
        this.started = true;
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(11)) == null) {
            return;
        }
        sensorManager.registerListener(this, defaultSensor, 3);
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            SensorManager sensorManager = this.sensorManager;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        }
    }
}
