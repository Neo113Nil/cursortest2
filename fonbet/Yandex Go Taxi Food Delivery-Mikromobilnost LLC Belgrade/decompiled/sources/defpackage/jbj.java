package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.view.Display;
import android.view.OrientationEventListener;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation;

/* loaded from: classes4.dex */
public final class jbj {
    public final v83 a;
    public PlatformChannel$DeviceOrientation b;
    public OrientationEventListener c;

    static {
        new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");
    }

    public jbj(v83 v83Var) {
        this.a = v83Var;
    }

    public final PlatformChannel$DeviceOrientation a() {
        v83 v83Var = this.a;
        Display k = v83Var.a.k();
        int rotation = k == null ? 0 : k.getRotation();
        int i = ((Context) v83Var.a.A).getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? PlatformChannel$DeviceOrientation.PORTRAIT_UP : (rotation == 0 || rotation == 1) ? PlatformChannel$DeviceOrientation.LANDSCAPE_LEFT : PlatformChannel$DeviceOrientation.LANDSCAPE_RIGHT : (rotation == 0 || rotation == 1) ? PlatformChannel$DeviceOrientation.PORTRAIT_UP : PlatformChannel$DeviceOrientation.PORTRAIT_DOWN;
    }
}
