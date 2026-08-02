package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketCheckoutFillProfileData;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: CheckoutFormStructure.kt */
/* loaded from: classes18.dex */
public final class a5c implements wzs<String, b7r, b7r> {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ z4c c;
    public final /* synthetic */ xcq0 d;
    public final /* synthetic */ Ref$BooleanRef e;
    public final /* synthetic */ w8c f;

    public a5c(Ref$BooleanRef ref$BooleanRef, z4c z4cVar, xcq0 xcq0Var, Ref$BooleanRef ref$BooleanRef2, w8c w8cVar) {
        this.b = ref$BooleanRef;
        this.c = z4cVar;
        this.d = xcq0Var;
        this.e = ref$BooleanRef2;
        this.f = w8cVar;
    }

    @Override // xsna.wzs
    public final b7r invoke(String str, b7r b7rVar) {
        b7r b7rVar2 = b7rVar;
        d0c d0cVar = (d0c) (!(b7rVar2 instanceof d0c) ? null : b7rVar2);
        if (d0cVar == null) {
            return b7rVar2;
        }
        this.b.element = z4c.U(this.c, d0cVar, this.d);
        boolean z = d0cVar.d;
        boolean z2 = !z;
        if (epx.f(d0cVar.a, "phone_prompt")) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, null, null, null, null, new CommonMarketStat$TypeMarketCheckoutFillProfileData(-this.f.b.b, !z ? CommonMarketStat$TypeMarketCheckoutFillProfileData.EventType.ON : CommonMarketStat$TypeMarketCheckoutFillProfileData.EventType.OFF), 63), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
        d0c d = d0c.d(d0cVar, z2);
        this.e.element = com.vk.ecomm.cart.impl.checkout.feature.state.a.a(d);
        return d;
    }
}
