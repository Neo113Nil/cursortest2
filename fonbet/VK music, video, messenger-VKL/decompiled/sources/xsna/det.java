package xsna;

import xsna.am;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class det implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ det(String str, int i) {
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
                qgi0.h((tgi0) obj, this.c);
                break;
            case 2:
                qgi0.s((tgi0) obj, ws2.e(this.c));
                break;
            default:
                am amVar = (am) obj;
                amVar.n("android.widget.Button");
                amVar.b(new am.a(16, this.c));
                break;
        }
        return s3q0.a;
    }
}
