package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lh2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ mtk0 c;

    public /* synthetic */ lh2(mtk0 mtk0Var, int i) {
        this.b = i;
        this.c = mtk0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((tdu) obj).j(((Number) this.c.getValue()).floatValue());
                return s3q0.a;
            default:
                return new h9x((0 << 32) | (an10.b(((Number) this.c.getValue()).floatValue()) & 4294967295L));
        }
    }
}
