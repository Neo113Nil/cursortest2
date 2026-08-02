package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a32 implements yw60 {
    public final zz2 a;
    public boolean b;
    public boolean c = true;

    public a32(zz2 zz2Var) {
        this.a = zz2Var;
    }

    @Override // defpackage.yw60
    public final void a(boolean z) {
        this.c = z;
    }

    @Override // defpackage.yw60
    public final void b() {
        this.b = false;
        zz2 zz2Var = this.a;
        zz2Var.getClass();
        zz2Var.a.a("Application.Paused", new HashMap(), 1, new HashMap());
    }

    @Override // defpackage.s150
    public final String getName() {
        return "FirstAppResumeConsumerListener";
    }
}
