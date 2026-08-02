package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.h47;
import xsna.jto0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o37 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o37(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                r37.b((h47.b) this.d, (a47) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                gzs gzsVar = (gzs) this.d;
                q630 q630Var = (q630) this.e;
                gzs gzsVar2 = (gzs) this.f;
                ((Integer) obj2).getClass();
                tqd.b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, gzsVar, gzsVar2, q630Var);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.h1) this.d).c((q630) this.e, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((jto0) this.d).d((jto0.b) this.e, (i0b0) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((v5s0) this.d).a((ksr) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
