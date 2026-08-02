package xsna;

import android.app.Activity;
import androidx.activity.ComponentActivity;

/* compiled from: GmsInAppUpdateEngine.kt */
/* loaded from: classes6.dex */
public final class e3u implements vrw {
    public final Activity a;
    public final boolean b;
    public final boolean c;
    public final ro d;
    public final bpn0 e = new bpn0(new qbj(this, 13));
    public final String f = "com.android.vending";

    public e3u(ComponentActivity componentActivity, boolean z, boolean z2, ro roVar) {
        this.a = componentActivity;
        this.b = z;
        this.c = z2;
        this.d = roVar;
    }

    @Override // xsna.vrw
    public final String a() {
        return this.f;
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.q<wrw> b(wrw wrwVar) {
        this.d.l("download gms update:" + wrwVar);
        Object obj = wrwVar.f;
        qa3 qa3Var = obj instanceof qa3 ? (qa3) obj : null;
        return qa3Var == null ? io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("payload is null")) : new io.reactivex.rxjava3.internal.operators.observable.q(new d3u(this, wrwVar, qa3Var)).r0(io.reactivex.rxjava3.schedulers.a.b());
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.x<wrw> c(int i) {
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.v(new lrg(this)).q(io.reactivex.rxjava3.schedulers.a.b()).o(Boolean.FALSE), new d22(new dhh(this, 19), 19));
    }

    @Override // xsna.vrw
    public final boolean d() {
        return false;
    }

    @Override // xsna.vrw
    public final boolean e() {
        return this.b;
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.a f(wrw wrwVar) {
        return new io.reactivex.rxjava3.internal.operators.completable.e(new rff(this, wrwVar));
    }

    public final ra3 g() {
        return (ra3) this.e.getValue();
    }
}
