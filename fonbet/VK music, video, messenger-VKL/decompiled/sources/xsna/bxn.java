package xsna;

import java.util.List;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bxn implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bxn(int i, List list, izs izsVar, izs izsVar2, sum0.c cVar, sum0 sum0Var) {
        this.f = sum0Var;
        this.c = cVar;
        this.g = list;
        this.d = izsVar;
        this.h = izsVar2;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((cxn) this.f).a((gzs) this.c, (gzs) this.g, (x5) this.h, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                k9t.a((String) this.f, (String) this.g, (String) this.h, (gzs) this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                sum0 sum0Var = (sum0) this.f;
                sum0.c cVar = (sum0.c) this.c;
                List list = (List) this.g;
                izs izsVar = (izs) this.h;
                ((Integer) obj2).intValue();
                sum0Var.b(ne7.I(this.e | 1), (androidx.compose.runtime.a) obj, list, this.d, izsVar, cVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bxn(String str, String str2, String str3, gzs gzsVar, izs izsVar, int i) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.c = gzsVar;
        this.d = izsVar;
        this.e = i;
    }

    public /* synthetic */ bxn(cxn cxnVar, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.f = cxnVar;
        this.c = gzsVar;
        this.g = gzsVar2;
        this.h = x5Var;
        this.d = izsVar;
        this.e = i;
    }
}
