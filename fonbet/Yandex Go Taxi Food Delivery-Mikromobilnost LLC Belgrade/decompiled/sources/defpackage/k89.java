package defpackage;

/* loaded from: classes12.dex */
public final class k89 implements x880 {
    public final int a;
    public final /* synthetic */ l89 b;

    public k89(l89 l89Var, int i) {
        this.b = l89Var;
        this.a = i;
    }

    @Override // defpackage.x880
    public final void n() {
        l89 l89Var = this.b;
        int size = l89Var.a.size();
        int i = this.a;
        if (i < size) {
            l89Var.b(i);
        } else {
            l89Var.c = false;
        }
    }

    @Override // defpackage.x880
    public final void o() {
        this.b.c = false;
    }
}
