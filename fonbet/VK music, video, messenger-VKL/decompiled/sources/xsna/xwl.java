package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.api.generated.market.dto.MarketGetResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.glu;
import xsna.gs90;
import xsna.kyl;
import xsna.nyd0;
import xsna.p810;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xwl implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xwl(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v30, types: [T, xsna.dp0] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        MultipickerProduct.Owner owner;
        Object obj3;
        WebApiApplication webApiApplication;
        WebApiApplication webApiApplication2;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                bxl.d((izs) this.c, (kyl.e.C3216e) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                mc90 mc90Var = (mc90) this.d;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(829036413, intValue, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContent.<anonymous>.<anonymous> (GamesCatalogMainTabScreen.kt:102)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630.a aVar2 = q630.a.a;
                    q630 c = qri.c(aVar, aVar2);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    set.a((tet) mtk0Var.getValue(), izsVar, txj0.f(aVar2, 1.0f), aVar, 384);
                    pet.a(mc90Var, null, aVar, 0);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                glu gluVar = (glu) this.c;
                f810 f810Var = (f810) this.d;
                y810 y810Var = (y810) this.e;
                List list = (List) obj;
                List<MarketMarketItemDto> d = ((MarketGetResponseDto) obj2).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (MarketMarketItemDto marketMarketItemDto : d) {
                    boolean z = f810Var.k;
                    List<glu> list2 = y810Var.f;
                    UserId q = marketMarketItemDto.q();
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        owner = null;
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (epx.f(((glu) obj3).b, fkq0.a(q))) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    glu gluVar2 = (glu) obj3;
                    if (gluVar2 != null) {
                        UserId userId = gluVar2.b;
                        String str = gluVar2.d;
                        Boolean bool = gluVar2.f;
                        owner = new MultipickerProduct.Owner(userId, str, bool != null ? bool.booleanValue() : false);
                    }
                    arrayList.add(new ha10(fno.a(marketMarketItemDto, z, owner)));
                }
                return new p810.c(arrayList.size(), arrayList, glu.a.a(gluVar.b, list));
            case 3:
                ((Integer) obj2).getClass();
                s8o0.a((c8p0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) this.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.e;
                ProfileAction profileAction = (ProfileAction) obj;
                int i = UserProfileDialogs.b.$EnumSwitchMapping$0[((UserProfileDialogs.ItemCallPlace) obj2).ordinal()];
                long j = 0;
                if (i != 1) {
                    if (i == 2) {
                        nyd0.b a2 = userProfileDialogs.f.a();
                        gs90.a payload = profileAction.getPayload();
                        if (payload != null && (webApiApplication2 = payload.a) != null) {
                            j = webApiApplication2.b;
                        }
                        a2.getClass();
                        a2.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.CLICK_TO_THIRD_PARTY_BUTTON, Long.valueOf(j));
                    } else if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (profileAction.getType() == ProfileAction.Type.OPEN_APP) {
                    nyd0.b a3 = userProfileDialogs.f.a();
                    gs90.a payload2 = profileAction.getPayload();
                    if (payload2 != null && (webApiApplication = payload2.a) != null) {
                        j = webApiApplication.b;
                    }
                    a3.b(j);
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                ref$ObjectRef2.element = new dp0(23, userProfileDialogs, profileAction);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                twu0.a((e7v0) this.c, (gys) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ xwl(Object obj, Object obj2, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = q630Var;
    }

    public /* synthetic */ xwl(c8p0 c8p0Var, izs izsVar, q630 q630Var, int i) {
        this.b = 3;
        this.d = c8p0Var;
        this.c = izsVar;
        this.e = q630Var;
    }
}
