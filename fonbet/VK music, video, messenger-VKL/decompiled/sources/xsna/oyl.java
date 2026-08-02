package xsna;

import xsna.gfp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class oyl implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oyl(String str, String str2, izs izsVar, int i) {
        this.d = str;
        this.e = str2;
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                pyl.a(this.c, (pmb0) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                eso.a((String) this.d, (String) this.e, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            default:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(385);
                b940.a((gfp0.b.a) this.d, this.c, (q630) this.e, (androidx.compose.runtime.a) obj, I3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ oyl(izs izsVar, pmb0 pmb0Var, q630 q630Var, int i) {
        this.c = izsVar;
        this.d = pmb0Var;
        this.e = q630Var;
    }

    public /* synthetic */ oyl(gfp0.b.a aVar, izs izsVar, q630 q630Var, int i) {
        this.d = aVar;
        this.c = izsVar;
        this.e = q630Var;
    }
}
