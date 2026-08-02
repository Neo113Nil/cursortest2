package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bzf implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ bzf(int i, String str, List list, izs izsVar, boolean z) {
        this.e = list;
        this.c = z;
        this.f = str;
        this.g = izsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                List list = (List) this.e;
                String str = (String) this.f;
                izs izsVar = (izs) this.g;
                ((Integer) obj2).intValue();
                czf.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, list, izsVar, this.c);
                break;
            default:
                ((Integer) obj2).intValue();
                eap0.e(this.c, (rmw) this.e, (v9p0) this.f, (w9p0) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bzf(boolean z, rmw rmwVar, v9p0 v9p0Var, w9p0 w9p0Var, int i) {
        this.c = z;
        this.e = rmwVar;
        this.f = v9p0Var;
        this.g = w9p0Var;
        this.d = i;
    }
}
