package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ xj2(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                String str = this.c;
                if (str != null) {
                    qgi0.h(tgi0Var, str);
                }
                break;
            case 1:
                qgi0.h((tgi0) obj, this.c);
                break;
            case 2:
                ((Boolean) obj).getClass();
                pla.e().b().b(this.c);
                hl60.d = null;
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
