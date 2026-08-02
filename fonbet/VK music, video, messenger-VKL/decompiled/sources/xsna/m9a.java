package xsna;

import xsna.aiq0;
import xsna.mbf;
import xsna.q0j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class m9a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ m9a(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(Boolean.FALSE);
                break;
            case 1:
                this.c.invoke(new mbf.a.C3331a((m36) obj));
                break;
            case 2:
                this.c.invoke(new aiq0.g.b(((Boolean) obj).booleanValue(), false));
                break;
            default:
                this.c.invoke(new q0j0.e(((Boolean) obj).booleanValue()));
                break;
        }
        return s3q0.a;
    }
}
