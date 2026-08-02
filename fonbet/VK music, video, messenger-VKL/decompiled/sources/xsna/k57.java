package xsna;

import xsna.e57;
import xsna.m57;

/* compiled from: BiometricPromptPresenter.kt */
/* loaded from: classes6.dex */
public final class k57 implements d57<e57.c, Object> {
    public final /* synthetic */ l57 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ hk70 c;

    public k57(l57 l57Var, String str, hk70 hk70Var) {
        this.a = l57Var;
        this.b = str;
        this.c = hk70Var;
    }

    @Override // xsna.d57
    public final void a() {
        this.c.invoke();
    }

    @Override // xsna.d57
    public final void b(m57.a aVar) {
        e57.c cVar = aVar.a.a;
        l57 l57Var = this.a;
        l57Var.j.b(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(a8c.d(l57Var.e.a.f(this.b)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new gf0(new t9(l57Var, 8), 4)), new g57(l57Var, 0)).subscribe(new vl0(new h57(0, l57Var, cVar), 5), new ea(new i57(1, l57Var, l57.class, "handleBiometricTokenFailed", "handleBiometricTokenFailed(Ljava/lang/Throwable;)V", 0), 5)));
    }
}
