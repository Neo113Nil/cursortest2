package defpackage;

import com.yandex.go.navigation.screen.c;

/* loaded from: classes12.dex */
public final class gif implements pft0 {
    public final c a;
    public final c9l0 b;
    public final fif c;
    public final zqz0 d;
    public final biv0 e;
    public l30 f;

    public gif(c cVar, c9l0 c9l0Var, fif fifVar, zqz0 zqz0Var, biv0 biv0Var) {
        this.a = cVar;
        this.b = c9l0Var;
        this.c = fifVar;
        this.d = zqz0Var;
        this.e = biv0Var;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        ob0 ob0Var = new ob0(2, this);
        fif fifVar = this.c;
        fifVar.c.set(ob0Var);
        this.f = new l30(4, fifVar, ob0Var);
    }

    @Override // defpackage.pft0
    public final void onPause() {
        l30 l30Var = this.f;
        if (l30Var != null) {
            l30Var.cancel();
        }
        this.f = null;
    }
}
