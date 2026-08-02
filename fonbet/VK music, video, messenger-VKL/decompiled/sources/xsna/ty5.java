package xsna;

import xsna.vid0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ty5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ty5(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                ((wy5) this.d).b((vid0.b) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                r37.a((izs) this.d, (yzs) this.e, (zzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(385), this.c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                t7c.a((s7c) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hwl.e((lg90) this.d, (String) this.e, (jai) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((uzp) this.d).e((String) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.c | 1);
                fjd0.c(this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ty5(izs izsVar, yzs yzsVar, zzs zzsVar, int i, int i2) {
        this.b = 1;
        this.d = izsVar;
        this.e = yzsVar;
        this.f = zzsVar;
        this.c = i2;
    }

    public /* synthetic */ ty5(lg90 lg90Var, String str, jai jaiVar, int i) {
        this.b = 3;
        this.d = lg90Var;
        this.e = str;
        this.f = jaiVar;
        this.c = i;
    }
}
