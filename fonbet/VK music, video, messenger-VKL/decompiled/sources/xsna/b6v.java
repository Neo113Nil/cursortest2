package xsna;

import com.vk.community.design.view.components.compose.CommunityCardTitle$Text;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import xsna.kdh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class b6v implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b6v(Object obj, Object obj2, q630 q630Var, int i, int i2) {
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
                ((d6v) this.e).c(this.c, (Cell$Middle.Size) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(this.d | 1);
                crz.b((kdh0.a) this.e, (izs) this.f, this.c, (androidx.compose.runtime.a) obj, I2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I3 = ne7.I(this.d | 1);
                j5g0.f((wh50) this.e, (gzs) this.f, this.c, (androidx.compose.runtime.a) obj, I3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int I4 = ne7.I(this.d | 1);
                f9p0.a(this.e, this.c, (l5g) this.f, (androidx.compose.runtime.a) obj, I4);
                break;
            default:
                ((Integer) obj2).getClass();
                int I5 = ne7.I(this.d | 1);
                emu0.a((CommunityCardTitle$Text) this.e, (com.vk.community.design.view.components.compose.b) this.f, this.c, (androidx.compose.runtime.a) obj, I5);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ b6v(Object obj, q630 q630Var, Object obj2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = q630Var;
        this.f = obj2;
        this.d = i;
    }
}
