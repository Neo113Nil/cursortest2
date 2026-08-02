package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7o implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ z7o(String str, int i) {
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
            default:
                qgi0.h((tgi0) obj, this.c);
                break;
        }
        return s3q0.a;
    }
}
