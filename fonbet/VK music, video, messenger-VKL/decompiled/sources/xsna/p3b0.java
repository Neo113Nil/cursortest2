package xsna;

import xsna.h3b0;
import xsna.x7j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3b0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ p3b0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new h3b0.g(((Float) obj).floatValue()));
                break;
            default:
                this.c.invoke(x7j0.k.b);
                break;
        }
        return s3q0.a;
    }
}
