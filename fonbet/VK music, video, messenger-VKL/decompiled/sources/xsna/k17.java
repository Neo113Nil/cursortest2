package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k17 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ k17(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                qgi0.h((tgi0) obj, this.c);
                break;
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.j(tgi0Var, 0);
                qgi0.h(tgi0Var, this.c);
                break;
            default:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, this.c);
                qgi0.n(tgi0Var2, 5);
                break;
        }
        return s3q0.a;
    }
}
