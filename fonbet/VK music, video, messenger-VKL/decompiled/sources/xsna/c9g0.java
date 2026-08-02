package xsna;

import xsna.jrt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class c9g0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ c9g0(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new diq0(false));
                break;
            default:
                this.c.invoke(new jrt0.f(((Long) obj).longValue()));
                break;
        }
        return s3q0.a;
    }
}
