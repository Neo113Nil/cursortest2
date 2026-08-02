package xsna;

import android.annotation.SuppressLint;
import com.vk.core.preference.Preference;
import com.vk.voip.OKVoipEngine;

/* compiled from: CameraMediaSettingsImpl.kt */
@SuppressLint({"UnsupportedChromeOsCameraSystemFeature"})
/* loaded from: classes7.dex */
public final class hj9 implements gj9 {
    public final w9 a;
    public final vrj b;
    public final OKVoipEngine.g c;
    public volatile Boolean d;
    public final bpn0 e = new bpn0(new defpackage.r(this, 14));
    public final bpn0 f = new bpn0(new yh(this, 12));
    public volatile boolean g = true;
    public final bpn0 h = new bpn0(new ic(this, 12));

    public hj9(w9 w9Var, vrj vrjVar, sk4 sk4Var, OKVoipEngine.g gVar) {
        this.a = w9Var;
        this.b = vrjVar;
        this.c = gVar;
    }

    @Override // xsna.gj9
    public final void a() {
        this.c.invoke(new h9(this, 8));
    }

    @Override // xsna.gj9
    public final void b(boolean z) {
        this.c.invoke(new ns6(this, z, 1));
    }

    @Override // xsna.gj9
    public final io.reactivex.rxjava3.subjects.d c() {
        return (io.reactivex.rxjava3.subjects.d) this.f.getValue();
    }

    @Override // xsna.gj9
    public final io.reactivex.rxjava3.internal.operators.observable.y d() {
        io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) this.e.getValue();
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    @Override // xsna.gj9
    public final boolean e() {
        return this.g;
    }

    @Override // xsna.gj9
    public final void f(boolean z) {
        this.g = z;
        ((io.reactivex.rxjava3.subjects.d) this.f.getValue()).onNext(Boolean.valueOf(z));
    }

    @Override // xsna.gj9
    public final boolean g() {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = Preference.f("voip_prefs_shared").getBoolean("is_front_camera_mirroring_enabled", true);
        this.d = Boolean.valueOf(z);
        return z;
    }

    @Override // xsna.gj9
    public final void h(boolean z) {
        this.d = Boolean.valueOf(z);
        qaj0.c(Preference.f("voip_prefs_shared"), "is_front_camera_mirroring_enabled", Boolean.valueOf(z));
        ((io.reactivex.rxjava3.subjects.d) this.e.getValue()).onNext(Boolean.valueOf(z));
    }
}
