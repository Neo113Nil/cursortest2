package xsna;

import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import xsna.h47;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q37 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q37(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                ((Integer) obj2).intValue();
                r37.c((h47.b) this.d, (a47) this.e, (zzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((zq20) this.d).a((MiniInfoCell$Mode) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                kib0 kib0Var = (kib0) this.d;
                izs izsVar = (izs) this.e;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).intValue();
                kib0Var.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                zkv0.b((l7k0) this.d, (q630) this.e, (jai) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
