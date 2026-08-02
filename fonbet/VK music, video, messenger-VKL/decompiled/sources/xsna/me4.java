package xsna;

import com.vk.core.compose.component.defaults.TabMode;
import java.util.List;
import xsna.wpc0;
import xsna.z5h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class me4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ me4(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                oe4.b((te4) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                List list = (List) this.d;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                cx5.c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, list, q630Var);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((z5h.c) this.d).e((yzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((jrv) this.d).a((q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.vk.profile.community.members.impl.ui.d.b((ksy) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                rz50.a((wpc0.a.C3948a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((m2e0) this.d).a((lgu0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((otn0) this.d).a((TabMode) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ me4(m2e0 m2e0Var, lgu0 lgu0Var, int i) {
        this.b = 6;
        this.d = m2e0Var;
        this.e = lgu0Var;
        this.c = i;
    }

    public /* synthetic */ me4(otn0 otn0Var, TabMode tabMode, int i) {
        this.b = 7;
        this.d = otn0Var;
        this.e = tabMode;
        this.c = i;
    }
}
