package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class lhh0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ lhh0(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((izs) this.c.getValue()).invoke(f)).floatValue());
            default:
                Long l = (Long) obj;
                l.longValue();
                this.c.setValue(l);
                return s3q0.a;
        }
    }
}
