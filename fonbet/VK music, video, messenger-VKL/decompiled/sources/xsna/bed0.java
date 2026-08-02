package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bed0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ bed0(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tny tnyVar = (tny) obj;
                if (!jgz.p(tnyVar).z(tnyVar, true).g()) {
                    this.c.setValue(Boolean.TRUE);
                }
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
