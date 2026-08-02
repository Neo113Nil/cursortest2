package xsna;

import xsna.yf9;

/* compiled from: CommonCameraBridgeMedia.kt */
/* loaded from: classes7.dex */
public final class eig implements yf9.a {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;

    public eig() {
        o2l.a.getClass();
        this.a = o2l.b("__dbg_dyn_masks_enabled_", false);
        this.b = o2l.b("__dbg_dyn_masks_err_resp_enabled_", false);
        this.c = o2l.b("__dbg_dyn_gesture_detection_enabled_", false);
        this.d = o2l.b("__dbg_dyn_gesture_detection_err_resp_enabled_", false);
        this.e = o2l.b("__dbg_dyn_lives_publisher_enabled_", false);
        o2l.b("__dbg_dyn_lives_publisher_err_resp_enabled_", false);
        this.f = o2l.b("__dbg_dyn_filters_enabled_", false);
        this.g = o2l.b("__dbg_dyn_filters_err_resp_enabled_", false);
        this.h = "__app_start_camera_back_resolution__";
        this.i = "__app_start_camera_front_resolution__";
    }

    public final String a() {
        return this.h;
    }

    public final String b() {
        return this.i;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean g() {
        return this.b;
    }
}
