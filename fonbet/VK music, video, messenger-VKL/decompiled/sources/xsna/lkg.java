package xsna;

import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lkg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lkg(Object obj, Object obj2, q630 q630Var, int i, int i2) {
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
                ((com.vk.core.compose.component.cell.content.x) this.e).a((spg0) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                v3z.a((us2) this.e, this.c, (izs) this.f, (androidx.compose.runtime.a) obj, I2);
                break;
            default:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                due0.b((dz40.h) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lkg(us2 us2Var, q630 q630Var, izs izsVar, int i) {
        this.b = 1;
        this.e = us2Var;
        this.c = q630Var;
        this.f = izsVar;
        this.d = i;
    }
}
