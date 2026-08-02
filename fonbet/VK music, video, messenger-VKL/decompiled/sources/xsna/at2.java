package xsna;

import java.util.List;
import xsna.t0j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class at2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ at2(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                bt2.a((us2) this.d, (List) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xab0.b((i9b0) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                pun0.c((t0j0.a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
