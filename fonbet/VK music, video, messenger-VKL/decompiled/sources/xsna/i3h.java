package xsna;

import com.vk.ecomm.market.good.ui.j;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import kotlin.Pair;
import xsna.j3h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class i3h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i3h(int i, int i2, Object obj, Object obj2, Object obj3) {
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
                ((j3h.a) this.d).a((Pair) this.e, (zzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                a270.b((String) this.d, this.c, (jiq0) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((pq20) this.d).e((String) this.e, (yzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                yw80.a((gpd0) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((com.vk.ecomm.market.good.ui.j) this.d).j((hid0) this.e, (j.a) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                com.vk.profile.design.compose.buttons.a.a((ProfileButtons.ButtonType) this.d, (rv5) this.e, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ i3h(String str, int i, jiq0 jiq0Var, izs izsVar, int i2) {
        this.b = 1;
        this.d = str;
        this.c = i;
        this.e = jiq0Var;
        this.f = izsVar;
    }
}
