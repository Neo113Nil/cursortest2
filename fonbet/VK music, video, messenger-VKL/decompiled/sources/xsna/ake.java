package xsna;

import xsna.jke;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ake implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ake(int i, izs izsVar, xvy xvyVar, q630 q630Var, gxa0 gxa0Var) {
        this.f = gxa0Var;
        this.g = xvyVar;
        this.c = q630Var;
        this.d = izsVar;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((eke) this.f).g((jke.a) this.g, this.d, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                gxa0 gxa0Var = (gxa0) this.f;
                xvy xvyVar = (xvy) this.g;
                ((Integer) obj2).getClass();
                gxa0Var.b(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, this.d, xvyVar, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ake(eke ekeVar, jke.a aVar, izs izsVar, q630 q630Var, int i) {
        this.f = ekeVar;
        this.g = aVar;
        this.d = izsVar;
        this.c = q630Var;
        this.e = i;
    }
}
