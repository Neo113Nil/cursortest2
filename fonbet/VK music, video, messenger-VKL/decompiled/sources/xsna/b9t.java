package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b9t implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ b9t(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, this.c);
                break;
            case 1:
                qgi0.r((tgi0) obj, this.c);
                break;
            default:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, this.c);
                qgi0.r(tgi0Var2, "TEST_TAG_IMAGE");
                break;
        }
        return s3q0.a;
    }
}
