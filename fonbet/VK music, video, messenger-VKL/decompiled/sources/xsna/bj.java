package xsna;

import java.util.List;
import xsna.dr20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bj implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bj(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((ej) this.d).a((yjl) this.e, (List) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((dr20.a) this.d).e((ayv0) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                List list = (List) this.f;
                izs izsVar = (izs) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                x5g0.f(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, list, izsVar, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bj(int i, List list, izs izsVar, q630 q630Var) {
        this.b = 2;
        this.f = list;
        this.d = izsVar;
        this.e = q630Var;
        this.c = i;
    }
}
