package xsna;

import xsna.f7p0;
import xsna.kb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class sy9 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sy9(Object obj, izs izsVar, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                ty9.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 1:
                ((Integer) obj2).intValue();
                un20.h((kb70.d) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                String str = (String) this.e;
                izs izsVar2 = (izs) this.c;
                ((Integer) obj2).intValue();
                b940.b(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, izsVar2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                zs70.f((dt70) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                i4d0.b((String) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((f7p0.a) this.c).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sy9(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.e = q630Var;
        this.d = i;
    }
}
