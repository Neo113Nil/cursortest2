package defpackage;

/* loaded from: classes.dex */
public final class ma3 extends xij {
    public final /* synthetic */ oa3 a;

    public ma3(oa3 oa3Var) {
        this.a = oa3Var;
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        oa3 oa3Var = this.a;
        Object obj = oa3Var.a.get(i);
        Object obj2 = oa3Var.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((zij) oa3Var.x.b.c).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        ny61.w();
        return false;
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        oa3 oa3Var = this.a;
        Object obj = oa3Var.a.get(i);
        Object obj2 = oa3Var.b.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((zij) oa3Var.x.b.c).b(obj, obj2);
    }

    @Override // defpackage.xij
    public final Object c(int i, int i2) {
        oa3 oa3Var = this.a;
        Object obj = oa3Var.a.get(i);
        Object obj2 = oa3Var.b.get(i2);
        if (obj != null && obj2 != null) {
            return ((zij) oa3Var.x.b.c).c(obj, obj2);
        }
        ny61.w();
        return null;
    }

    @Override // defpackage.xij
    public final int d() {
        return this.a.b.size();
    }

    @Override // defpackage.xij
    public final int e() {
        return this.a.a.size();
    }
}
