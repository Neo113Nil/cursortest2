package defpackage;

import java.util.List;

/* loaded from: classes15.dex */
public final class g7b implements o2r {
    public final /* synthetic */ h7b a;
    public final /* synthetic */ i7b b;
    public final /* synthetic */ yw80 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ jsa0 e;

    public g7b(h7b h7bVar, i7b i7bVar, yw80 yw80Var, long j, jsa0 jsa0Var) {
        this.a = h7bVar;
        this.b = i7bVar;
        this.c = yw80Var;
        this.d = j;
        this.e = jsa0Var;
    }

    @Override // defpackage.o2r
    public final void a(k2r k2rVar) {
        h7b h7bVar = this.a;
        z83.f((x08) h7bVar.b, null);
        h7bVar.c = null;
        i7b i7bVar = this.b;
        ax80 ax80Var = i7bVar.e;
        List list = k2rVar.a;
        yw80 yw80Var = this.c;
        h7bVar.b = i7bVar.d(ax80.a(ax80Var, yw80Var, list, yw80Var.h, yw80Var.i), this.d, this.e);
    }

    @Override // defpackage.o2r
    public final void b(i2r i2rVar) {
    }
}
