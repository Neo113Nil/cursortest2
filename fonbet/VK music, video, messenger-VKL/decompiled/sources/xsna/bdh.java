package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bdh implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ bdh(cdh cdhVar, String str, q630 q630Var, String str2, gzs gzsVar, int i) {
        this.e = cdhVar;
        this.f = str;
        this.h = q630Var;
        this.g = str2;
        this.c = gzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                cdh cdhVar = (cdh) this.e;
                String str = (String) this.f;
                q630 q630Var = (q630) this.h;
                String str2 = (String) this.g;
                ((Integer) obj2).getClass();
                cdhVar.b(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, str2, this.c, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((c0l) this.e).a(this.c, (gzs) this.f, (x5) this.g, (izs) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((se90) this.e).a(this.c, (gzs) this.f, (x5) this.g, (izs) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bdh(c0l c0lVar, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.e = c0lVar;
        this.c = gzsVar;
        this.f = gzsVar2;
        this.g = x5Var;
        this.h = izsVar;
        this.d = i;
    }

    public /* synthetic */ bdh(se90 se90Var, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.e = se90Var;
        this.c = gzsVar;
        this.f = gzsVar2;
        this.g = x5Var;
        this.h = izsVar;
        this.d = i;
    }
}
