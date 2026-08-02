package xsna;

import androidx.fragment.app.Fragment;

/* compiled from: ReactionsFeedMviMappers.kt */
/* loaded from: classes4.dex */
public class g4f0 implements yt60 {
    public final Object b;
    public Object c;
    public Object d;

    public g4f0(a5f0 a5f0Var, m4f0 m4f0Var, e4f0 e4f0Var) {
        this.b = a5f0Var;
        this.c = m4f0Var;
        this.d = e4f0Var;
    }

    public void N3() {
        if (((io.reactivex.rxjava3.disposables.c) this.c) != null) {
            return;
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.c = vdx0Var.k().i().subscribe(new cl30(new gsq0(this, 6), 19), new nvm0(new gyo0(this, 12), 9));
    }

    @Override // xsna.yt60
    public zt60 Z() {
        return (m4f0) this.c;
    }

    @Override // xsna.yt60
    public au60 d0() {
        return (a5f0) this.b;
    }

    @Override // xsna.yt60
    public xt60 h1() {
        return (e4f0) this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g4f0(e0v0 e0v0Var) {
        this.b = (Fragment) e0v0Var;
    }
}
