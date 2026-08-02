package defpackage;

/* loaded from: classes.dex */
public final class jy01 implements i1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx01 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jy01(zx01 zx01Var, Object obj, int i) {
        this.a = i;
        this.b = zx01Var;
        this.c = obj;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        zx01 zx01Var = this.b;
        switch (i) {
            case 0:
                zx01Var.j.remove((zx01) obj);
                break;
            default:
                zx01Var.getClass();
                nx01 nx01Var = (nx01) ((ox01) obj).b.getValue();
                if (nx01Var != null) {
                    zx01Var.i.remove(nx01Var.a);
                    break;
                }
                break;
        }
    }
}
