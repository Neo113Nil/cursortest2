package xsna;

import java.util.List;
import xsna.dz40;
import xsna.kb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class x85 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x85(Object obj, Object obj2, q630 q630Var, int i, int i2) {
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
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                d95.c((List) this.e, this.c, (rv5) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                fbc.d((dz40.d.b) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                ma70.a((kb70.d) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
            default:
                ((Integer) obj2).intValue();
                int I4 = ne7.I(this.d | 1);
                ((com.vk.core.compose.component.cell.content.x0) this.e).a((spg0) this.f, this.c, (androidx.compose.runtime.a) obj, I4);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ x85(List list, q630 q630Var, rv5 rv5Var, int i) {
        this.b = 0;
        this.e = list;
        this.c = q630Var;
        this.f = rv5Var;
        this.d = i;
    }
}
