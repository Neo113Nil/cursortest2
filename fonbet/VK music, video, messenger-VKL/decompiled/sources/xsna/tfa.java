package xsna;

import java.util.List;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tfa implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tfa(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, izs izsVar) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = izsVar;
        this.g = obj3;
        this.h = obj4;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                vfa.a((bga) this.e, (wfa) this.f, this.c, (ksr) this.g, (q630) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                sum0 sum0Var = (sum0) this.e;
                sum0.c cVar = (sum0.c) this.f;
                List list = (List) this.g;
                izs izsVar = (izs) this.h;
                ((Integer) obj2).intValue();
                sum0Var.c(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, list, this.c, izsVar, cVar);
                break;
        }
        return s3q0.a;
    }
}
