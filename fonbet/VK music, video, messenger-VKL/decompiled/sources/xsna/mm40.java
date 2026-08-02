package xsna;

import android.content.SharedPreferences;
import com.vk.core.apps.BuildInfo;

/* compiled from: MusicKidsModeStore.kt */
/* loaded from: classes3.dex */
public final class mm40 {
    public final bpn0 a;
    public final utk0 b;
    public final utk0 c;
    public final utk0 d;
    public final utk0 e;

    public mm40() {
        bpn0 bpn0Var = new bpn0(new lz2(19));
        this.a = bpn0Var;
        utk0 a = BuildInfo.u() ? vtk0.a(Boolean.valueOf(((SharedPreferences) bpn0Var.getValue()).getBoolean("music_kids_mode_state", false))) : vtk0.a(Boolean.FALSE);
        this.b = a;
        utk0 a2 = BuildInfo.u() ? vtk0.a(Boolean.valueOf(((SharedPreferences) bpn0Var.getValue()).getBoolean("music_kids_pin_state", false))) : vtk0.a(Boolean.FALSE);
        this.c = a2;
        this.d = a;
        this.e = a2;
    }

    public final void a(boolean z) {
        utk0 utk0Var;
        Object value;
        SharedPreferences.Editor edit = ((SharedPreferences) this.a.getValue()).edit();
        edit.putBoolean("music_kids_mode_state", z);
        edit.apply();
        do {
            utk0Var = this.b;
            value = utk0Var.getValue();
            ((Boolean) value).getClass();
        } while (!utk0Var.compareAndSet(value, Boolean.valueOf(z)));
    }

    public final void b() {
        utk0 utk0Var;
        Object value;
        SharedPreferences.Editor edit = ((SharedPreferences) this.a.getValue()).edit();
        edit.putBoolean("music_kids_pin_state", true);
        edit.apply();
        do {
            utk0Var = this.c;
            value = utk0Var.getValue();
            ((Boolean) value).getClass();
        } while (!utk0Var.compareAndSet(value, Boolean.TRUE));
    }
}
