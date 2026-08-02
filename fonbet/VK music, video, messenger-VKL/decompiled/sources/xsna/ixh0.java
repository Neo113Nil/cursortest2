package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ixh0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ mtk0 c;

    public /* synthetic */ ixh0(mtk0 mtk0Var, int i) {
        this.b = i;
        this.c = mtk0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        float floatValue;
        switch (this.b) {
            case 0:
                floatValue = ((Number) this.c.getValue()).floatValue();
                break;
            default:
                floatValue = ((Number) this.c.getValue()).longValue();
                break;
        }
        return Float.valueOf(floatValue);
    }
}
