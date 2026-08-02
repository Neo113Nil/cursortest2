package xsna;

import xsna.g9k;
import xsna.mmh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class j8k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j8k(Object obj, Object obj2, q630 q630Var, int i, int i2) {
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
                g9k.a aVar = (g9k.a) this.e;
                izs izsVar = (izs) this.f;
                ((Integer) obj2).getClass();
                k8k.f(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, aVar, izsVar, this.c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                o7t.c((h8t) this.e, (i8t) this.f, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                ((com.vk.core.compose.component.group.header.f) this.e).a((com.vk.core.compose.component.group.header.b) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                amh0.a((mmh0.b) this.e, this.c, (izs) this.f, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(this.d | 1);
                p7u0.a((jai) this.e, (jai) this.f, this.c, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j8k(mmh0.b bVar, q630 q630Var, izs izsVar, int i) {
        this.b = 3;
        this.e = bVar;
        this.c = q630Var;
        this.f = izsVar;
        this.d = i;
    }
}
