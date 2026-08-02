package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p750 implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ q630 f;

    public /* synthetic */ p750(List list, izs izsVar, Object obj, q630 q630Var, int i) {
        this.c = list;
        this.e = izsVar;
        this.d = obj;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                String str = (String) this.e;
                lg90 lg90Var = (lg90) this.d;
                ((Integer) obj2).getClass();
                q750.b(ne7.I(4481), (androidx.compose.runtime.a) obj, str, gzsVar, this.f, lg90Var);
                break;
            case 1:
                gzs gzsVar2 = (gzs) this.c;
                lg90 lg90Var2 = (lg90) this.d;
                String str2 = (String) this.e;
                ((Integer) obj2).getClass();
                muv0.c(ne7.I(513), (androidx.compose.runtime.a) obj, str2, gzsVar2, this.f, lg90Var2);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                k510.a((List) this.c, (izs) this.e, this.d, this.f, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p750(gzs gzsVar, String str, q630 q630Var, lg90 lg90Var, int i) {
        this.c = gzsVar;
        this.e = str;
        this.f = q630Var;
        this.d = lg90Var;
    }

    public /* synthetic */ p750(gzs gzsVar, lg90 lg90Var, String str, q630 q630Var, int i) {
        this.c = gzsVar;
        this.d = lg90Var;
        this.e = str;
        this.f = q630Var;
    }
}
