package defpackage;

/* loaded from: classes10.dex */
public class fm51 implements xwo {
    public boolean c = false;
    public boolean w = false;
    public int a = 0;
    public int b = 0;

    @Override // defpackage.mb10
    public final pb10 o(lb10 lb10Var) {
        return p(lb10Var, null);
    }

    @Override // defpackage.xwo
    public final pb10 p(lb10 lb10Var, ub10 ub10Var) {
        int i;
        int i2 = this.b;
        boolean z = false;
        boolean z2 = i2 == 0 || i2 == 1;
        int i3 = tw21.a;
        if (i3 >= 23 && ((i = this.a) == 1 || (i == 0 && i3 >= 31))) {
            z = true;
        }
        if (!z2) {
            if (!z) {
                qlh qlhVar = new qlh();
                qlhVar.a = this.w;
                return qlhVar.p(lb10Var, ub10Var);
            }
            int i4 = eh20.i(lb10Var.c.n);
            lk91.h("YMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(tw21.K(i4)));
            s5h s5hVar = new s5h(i4);
            s5hVar.c = this.w;
            return s5hVar.p(lb10Var, ub10Var);
        }
        if (!z) {
            k2o k2oVar = new k2o();
            k2oVar.a = this.c;
            k2oVar.b = this.w;
            return k2oVar.p(lb10Var, ub10Var);
        }
        int i5 = eh20.i(lb10Var.c.n);
        lk91.h("YMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(tw21.K(i5)));
        rii0 rii0Var = new rii0(i5);
        rii0Var.c = this.c;
        rii0Var.w = this.w;
        return rii0Var.p(lb10Var, ub10Var);
    }
}
