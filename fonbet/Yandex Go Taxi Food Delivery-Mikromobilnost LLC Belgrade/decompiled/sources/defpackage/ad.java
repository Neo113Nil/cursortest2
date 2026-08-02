package defpackage;

import android.content.Context;

/* loaded from: classes6.dex */
public final class ad implements v7p {
    public final /* synthetic */ int a;
    public final t0g b;
    public final xvf0 c;

    public /* synthetic */ ad(t0g t0gVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = t0gVar;
        this.c = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        t0g t0gVar = this.b;
        switch (i) {
            case 0:
                return new zc(0, (Context) t0gVar.get(), (w030) xvf0Var.get());
            case 1:
                return new p370((Context) t0gVar.get(), (z0a0) xvf0Var.get());
            case 2:
                return new phj0((Context) t0gVar.get(), (i130) xvf0Var.get());
            default:
                return new mmv0((pdc) xvf0Var.get(), (Context) t0gVar.get());
        }
    }
}
