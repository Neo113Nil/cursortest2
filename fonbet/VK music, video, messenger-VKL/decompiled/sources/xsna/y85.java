package xsna;

import java.util.List;
import xsna.kb70;
import xsna.sum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class y85 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y85(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                ((Integer) obj2).getClass();
                d95.c((List) this.e, (q630) this.c, (rv5) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.j0) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((wb50) this.e).a((spg0) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ma70.a((kb70.d) this.e, (izs) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((g1i0) this.c).b((mc90) this.f, (List) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((sum0) this.e).d((sum0.d) this.c, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ y85(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = q630Var;
        this.d = i;
    }

    public /* synthetic */ y85(g1i0 g1i0Var, mc90 mc90Var, List list, int i) {
        this.b = 4;
        this.c = g1i0Var;
        this.f = mc90Var;
        this.e = list;
        this.d = i;
    }
}
