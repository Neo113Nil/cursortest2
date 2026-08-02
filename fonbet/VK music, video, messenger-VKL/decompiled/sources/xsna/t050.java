package xsna;

import xsna.dt1;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t050 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t050(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((u050) this.e).a((q630) this.c, (dt1.b) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.w0) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                ((l1h0) this.e).c(this.c, (jai) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((sum0) this.e).i((sum0.c) this.c, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((tmt0) this.e).f((vmt0) this.c, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t050(com.vk.core.compose.component.cell.content.w0 w0Var, spg0 spg0Var, q630 q630Var, int i) {
        this.b = 1;
        this.e = w0Var;
        this.f = spg0Var;
        this.c = q630Var;
        this.d = i;
    }
}
