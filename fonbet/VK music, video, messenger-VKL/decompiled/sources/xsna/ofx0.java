package xsna;

import xsna.pox0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ofx0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ofx0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                izs izsVar = (izs) this.c;
                String str = ((pox0.b.C3524b) this.d).c;
                if (str == null) {
                    str = "";
                }
                izsVar.invoke(str);
                break;
            default:
                ((izs) this.c).invoke(((pox0.h.a.C3526a) this.d).b);
                break;
        }
        return s3q0.a;
    }
}
