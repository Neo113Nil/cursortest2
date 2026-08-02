package xsna;

import xsna.c1b0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cya0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ cya0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((String) obj);
                break;
            case 1:
                this.c.invoke(new c1b0.a(((Boolean) obj).booleanValue()));
                break;
            default:
                Throwable th = (Throwable) obj;
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
                break;
        }
        return s3q0.a;
    }
}
