package xsna;

/* compiled from: ClipsOwnerSwipeRepositoryImpl.kt */
/* loaded from: classes17.dex */
public final class cpe implements bpe {
    public final uoe a;

    public cpe(uoe uoeVar) {
        this.a = uoeVar;
    }

    @Override // xsna.bpe
    public final void a(String str) {
        gx6 gx6Var = (gx6) this.a.a.remove(str);
        if (gx6Var != null) {
            gx6Var.b.dispose();
        }
    }

    @Override // xsna.bpe
    public final boolean b(String str) {
        dpe dpeVar;
        gx6 gx6Var = (gx6) this.a.a.get(str);
        if (gx6Var == null || (dpeVar = (dpe) gx6Var.b()) == null) {
            return false;
        }
        return dpeVar.a;
    }

    @Override // xsna.bpe
    public final io.reactivex.rxjava3.internal.operators.observable.m1 c(String str) {
        io.reactivex.rxjava3.core.q<dpe> a = this.a.a(str).a();
        asu0.a.getClass();
        return a.a0(asu0.i());
    }

    @Override // xsna.bpe
    public final void d(String str, boolean z) {
        gx6<dpe> a = this.a.a(str);
        if (a.b.c) {
            return;
        }
        dpe P0 = a.a.P0();
        dpe dpeVar = P0;
        if (dpeVar == null) {
            dpeVar = new dpe(0);
        }
        dpe a2 = dpe.a(dpeVar, z, false, null, 6);
        if (P0 != a2) {
            a.a.onNext(a2);
        }
    }

    @Override // xsna.bpe
    public final void e(String str, boolean z) {
        gx6<dpe> a = this.a.a(str);
        if (a.b.c) {
            return;
        }
        dpe P0 = a.a.P0();
        dpe dpeVar = P0;
        if (dpeVar == null) {
            dpeVar = new dpe(0);
        }
        dpe a2 = dpe.a(dpeVar, false, z, null, 5);
        if (P0 != a2) {
            a.a.onNext(a2);
        }
    }

    @Override // xsna.bpe
    public final void f(String str, doe doeVar) {
        gx6<dpe> a = this.a.a(str);
        if (a.b.c) {
            return;
        }
        dpe P0 = a.a.P0();
        dpe dpeVar = P0;
        if (dpeVar == null) {
            dpeVar = new dpe(0);
        }
        dpe a2 = dpe.a(dpeVar, false, false, doeVar, 3);
        if (P0 != a2) {
            a.a.onNext(a2);
        }
    }
}
