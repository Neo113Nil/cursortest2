package com.cloudwebrtc.webrtc.video.camera;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.view.Display;
import android.view.WindowManager;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public class DeviceOrientationManager {
    private static final IntentFilter orientationIntentFilter = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");
    private final Activity activity;
    private BroadcastReceiver broadcastReceiver;
    private PlatformChannel$DeviceOrientation lastOrientation;
    private final int sensorOrientation;

    public DeviceOrientationManager(Activity activity, int i) {
        this.activity = activity;
        this.sensorOrientation = i;
    }

    public static DeviceOrientationManager create(Activity activity, int i) {
        return new DeviceOrientationManager(activity, i);
    }

    public static void handleOrientationChange(PlatformChannel$DeviceOrientation platformChannel$DeviceOrientation, PlatformChannel$DeviceOrientation platformChannel$DeviceOrientation2) {
    }

    public PlatformChannel$DeviceOrientation calculateSensorOrientation(int i) {
        int i2 = i + 45;
        if (getDeviceDefaultOrientation() == 2) {
            i2 = i + HProv.PP_CONTAINER_DEFAULT;
        }
        return new PlatformChannel$DeviceOrientation[]{PlatformChannel$DeviceOrientation.PORTRAIT_UP, PlatformChannel$DeviceOrientation.LANDSCAPE_LEFT, PlatformChannel$DeviceOrientation.PORTRAIT_DOWN, PlatformChannel$DeviceOrientation.LANDSCAPE_RIGHT}[(i2 % 360) / 90];
    }

    public int getDeviceDefaultOrientation() {
        Configuration configuration = this.activity.getResources().getConfiguration();
        int rotation = getDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public Display getDisplay() {
        return ((WindowManager) this.activity.getSystemService("window")).getDefaultDisplay();
    }

    public PlatformChannel$DeviceOrientation getLastUIOrientation() {
        return this.lastOrientation;
    }

    public PlatformChannel$DeviceOrientation getUIOrientation() {
        int rotation = getDisplay().getRotation();
        int i = this.activity.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? PlatformChannel$DeviceOrientation.PORTRAIT_UP : (rotation == 0 || rotation == 1) ? PlatformChannel$DeviceOrientation.LANDSCAPE_LEFT : PlatformChannel$DeviceOrientation.LANDSCAPE_RIGHT : (rotation == 0 || rotation == 1) ? PlatformChannel$DeviceOrientation.PORTRAIT_UP : PlatformChannel$DeviceOrientation.PORTRAIT_DOWN;
    }

    public void handleUIOrientationChange() {
        PlatformChannel$DeviceOrientation uIOrientation = getUIOrientation();
        handleOrientationChange(uIOrientation, this.lastOrientation);
        this.lastOrientation = uIOrientation;
    }

    public void start() {
        if (this.broadcastReceiver != null) {
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.cloudwebrtc.webrtc.video.camera.DeviceOrientationManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                DeviceOrientationManager.this.handleUIOrientationChange();
            }
        };
        this.broadcastReceiver = broadcastReceiver;
        this.activity.registerReceiver(broadcastReceiver, orientationIntentFilter);
        this.broadcastReceiver.onReceive(this.activity, null);
    }

    public void stop() {
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        if (broadcastReceiver == null) {
            return;
        }
        this.activity.unregisterReceiver(broadcastReceiver);
        this.broadcastReceiver = null;
    }
}
