package xsna;

import com.vk.ecomm.market.good.ui.a;
import com.vk.games.model.GamesAchievementState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class r8t implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ r8t(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                v8t.c((GamesAchievementState) this.d, (tt) this.e, (nkx0) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((com.vk.ecomm.market.good.ui.j) this.d).m((a.b) this.e, (gzs) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
