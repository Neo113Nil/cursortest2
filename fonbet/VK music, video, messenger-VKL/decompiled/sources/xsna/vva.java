package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vva implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vva(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.channels.impl.comments.b bVar = (com.vk.channels.impl.comments.b) this.d;
                com.vk.channels.impl.comments.g gVar = (com.vk.channels.impl.comments.g) obj;
                bVar.n.add(Integer.valueOf(this.c));
                break;
            case 1:
                rg50 rg50Var = (rg50) this.d;
                q9x q9xVar = (q9x) obj;
                if (rg50Var.getIntValue() == 0) {
                    rg50Var.C(((int) (q9xVar.a & 4294967295L)) - this.c);
                }
                break;
            default:
                b9w0 b9w0Var = ((dbw0) this.d).i;
                if (b9w0Var == null) {
                    b9w0Var = null;
                }
                b9w0Var.b(this.c);
                break;
        }
        return s3q0.a;
    }
}
