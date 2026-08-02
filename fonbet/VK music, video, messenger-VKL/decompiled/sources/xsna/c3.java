package xsna;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c3(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.e;
                q630 q630Var = (q630) this.f;
                gzs gzsVar = (gzs) this.c;
                ((Integer) obj2).getClass();
                int I = ne7.I(385);
                l3.a(this.d, I, (androidx.compose.runtime.a) obj, str, gzsVar, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.community.design.compose.onboarding.a.c((j0h) this.e, (zzg) this.f, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rfr.a((ogr) this.e, (fdj0) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                xb10.c((List) this.e, (q630) this.f, (xz00) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((ei70) this.f).a((String) this.e, (yzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ c3(int i, int i2, String str, gzs gzsVar, q630 q630Var) {
        this.b = 0;
        this.e = str;
        this.d = i;
        this.f = q630Var;
        this.c = gzsVar;
    }

    public /* synthetic */ c3(ei70 ei70Var, String str, yzs yzsVar, int i) {
        this.b = 4;
        this.f = ei70Var;
        this.e = str;
        this.c = yzsVar;
        this.d = i;
    }
}
