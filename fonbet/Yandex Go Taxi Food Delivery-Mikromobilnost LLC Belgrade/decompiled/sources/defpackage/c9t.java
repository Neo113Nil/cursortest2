package defpackage;

import android.content.Context;

/* loaded from: classes15.dex */
public final class c9t extends vds0 {
    public final Context b;
    public final uu10 c;
    public final kcy0 d;
    public final n421 e;

    public c9t(Context context, uu10 uu10Var, kcy0 kcy0Var, n421 n421Var, kse kseVar) {
        super(kseVar.b);
        this.b = context;
        this.c = uu10Var;
        this.d = kcy0Var;
        this.e = n421Var;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        w8t w8tVar = (w8t) obj;
        tje.e();
        return (tpr) w8tVar.b.a(new a9t(this, this.b, w8tVar.a));
    }
}
