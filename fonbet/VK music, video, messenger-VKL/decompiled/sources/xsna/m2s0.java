package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class m2s0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xzs f;

    public /* synthetic */ m2s0(List list, izs izsVar, izs izsVar2, q630 q630Var, int i) {
        this.d = list;
        this.e = izsVar;
        this.f = izsVar2;
        this.c = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                n2s0.b((List) this.d, (izs) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                lg90 lg90Var = (lg90) this.d;
                String str = (String) this.e;
                gzs gzsVar = (gzs) this.f;
                ((Integer) obj2).getClass();
                juu0.a(ne7.I(393), (androidx.compose.runtime.a) obj, str, gzsVar, this.c, lg90Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ m2s0(gzs gzsVar, String str, q630 q630Var, lg90 lg90Var, int i) {
        this.d = lg90Var;
        this.e = str;
        this.c = q630Var;
        this.f = gzsVar;
    }
}
