package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class h4b implements x08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h4b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.x08
    public final void cancel() {
        ixj0 ixj0Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                i4b i4bVar = (i4b) obj2;
                zq60 zq60Var = i4bVar.a;
                zq60Var.d((dhv) obj);
                if (zq60Var.isEmpty() && (ixj0Var = i4bVar.f) != null) {
                    ixj0Var.cancel();
                    i4bVar.f = null;
                    break;
                }
                break;
            case 1:
                ((xo3) obj2).cancel();
                ((h7b) obj).cancel();
                break;
            default:
                ((x08) obj2).cancel();
                ((h7b) obj).cancel();
                break;
        }
    }
}
