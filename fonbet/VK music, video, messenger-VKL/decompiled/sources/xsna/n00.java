package xsna;

import xsna.it0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class n00 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n00(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.d | 1);
                ((o00) this.e).a((spg0) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                bt0.c((it0.c) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            default:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                ((bkd0) this.e).v6((us2) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
        }
        return s3q0.a;
    }
}
