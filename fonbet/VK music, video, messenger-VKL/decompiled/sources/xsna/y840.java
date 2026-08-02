package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y840 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ y840(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue(new q9x(((q9x) obj).a));
                break;
            default:
                Integer num = (Integer) obj;
                num.intValue();
                this.c.setValue(num);
                break;
        }
        return s3q0.a;
    }
}
