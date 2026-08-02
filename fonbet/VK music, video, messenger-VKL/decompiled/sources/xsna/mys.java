package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mys implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ String c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ xzs g;

    public /* synthetic */ mys(String str, List list, izs izsVar, q630 q630Var, int i) {
        this.c = str;
        this.f = list;
        this.g = izsVar;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((oys) this.f).b(this.c, this.d, (jai) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                fe00.c(this.c, (List) this.f, (izs) this.g, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mys(oys oysVar, String str, q630 q630Var, jai jaiVar, int i) {
        this.f = oysVar;
        this.c = str;
        this.d = q630Var;
        this.g = jaiVar;
        this.e = i;
    }
}
