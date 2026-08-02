package xsna;

import xsna.pox0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class g8v0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g8v0(int i, Object obj, izs izsVar) {
        this.b = i;
        this.c = izsVar;
        this.d = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke((buv0) this.d);
                break;
            default:
                String str = ((pox0.b.a) this.d).c;
                if (str == null) {
                    str = "";
                }
                this.c.invoke(str);
                break;
        }
        return s3q0.a;
    }
}
