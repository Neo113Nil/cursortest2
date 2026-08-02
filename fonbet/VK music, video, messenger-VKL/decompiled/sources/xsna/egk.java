package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class egk implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ egk(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        tgi0 tgi0Var = (tgi0) obj;
        switch (this.b) {
            case 0:
                qgi0.h(tgi0Var, this.c);
                qgi0.r(tgi0Var, "CropEditorInfoButton");
                qgi0.n(tgi0Var, 0);
                break;
            default:
                qgi0.r(tgi0Var, "subscribe_button");
                qgi0.s(tgi0Var, ws2.e(this.c));
                break;
        }
        return s3q0.a;
    }
}
