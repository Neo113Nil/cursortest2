package xsna;

import com.vk.ecomm.storefrontservices.impl.presentation.feature.LoadingState;
import xsna.ise;
import xsna.mmh0;
import xsna.wzq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class n1k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n1k(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.f = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                q1k.a((ise.b) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                zz20.b((u2m) this.f, (izs) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                qmh0.a((mmh0.d) this.f, (q630) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hol0.d((LoadingState) this.f, (q630) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((wzq0.a) this.f).e((String) this.c, (yzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n1k(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.f = obj;
        this.d = q630Var;
        this.c = izsVar;
        this.e = i;
    }
}
