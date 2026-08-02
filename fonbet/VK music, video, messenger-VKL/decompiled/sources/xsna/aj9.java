package xsna;

import com.vk.core.preference.Preference;

/* compiled from: CameraManager.kt */
/* loaded from: classes16.dex */
public final class aj9 {
    public bpn0 a;

    public final boolean a() {
        jhu0 jhu0Var = ((fj9) this.a.getValue()).a;
        return (jhu0Var != null ? jhu0Var.j() : false) && Preference.d("camera_prefs", "use_front_camera", false);
    }

    public final Integer b() {
        jhu0 jhu0Var = ((fj9) this.a.getValue()).a;
        if (jhu0Var != null) {
            return jhu0Var.s();
        }
        return null;
    }

    public final khu0 c(int i) {
        jhu0 jhu0Var = ((fj9) this.a.getValue()).a;
        if (jhu0Var != null) {
            return jhu0Var.n(i);
        }
        return null;
    }

    public final Integer d() {
        jhu0 jhu0Var = ((fj9) this.a.getValue()).a;
        if (jhu0Var != null) {
            return jhu0Var.t();
        }
        return null;
    }

    public final sj9 e() {
        jhu0 jhu0Var = ((fj9) this.a.getValue()).a;
        if (jhu0Var != null) {
            return jhu0Var.getParameters();
        }
        return null;
    }

    public final boolean f() {
        jhu0 jhu0Var = ((fj9) this.a.getValue()).a;
        if (jhu0Var != null) {
            return jhu0Var.j();
        }
        return false;
    }

    public final boolean g() {
        jhu0 jhu0Var = ((fj9) this.a.getValue()).a;
        return jhu0Var != null && jhu0Var.c();
    }
}
