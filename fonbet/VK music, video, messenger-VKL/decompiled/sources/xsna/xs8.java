package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh;
import com.vk.dto.common.GoodAlbum;
import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButtonKt;
import com.vk.music.ui.subscription.SubscriptionContext;
import com.vk.tabbar.core.api.domain.TabbarSuggestState;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vk.tabbar.settings.impl.suggests.TabbarSuggestActivity;
import xsna.qjh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs8 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xs8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                BuyMusicSubscriptionButton buyMusicSubscriptionButton = (BuyMusicSubscriptionButton) obj4;
                ys8 ys8Var = (ys8) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = BuyMusicSubscriptionButton.z;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1870620783, intValue, -1, "com.vk.music.ui.subscription.BuyMusicSubscriptionButton.onAttachedToWindow.<anonymous>.<anonymous> (BuyMusicSubscriptionButton.kt:62)");
                    }
                    qr8 qr8Var = buyMusicSubscriptionButton.x;
                    SubscriptionContext subscriptionContext = SubscriptionContext.Screen;
                    rk6 rk6Var = buyMusicSubscriptionButton.v;
                    boolean y = aVar.y(buyMusicSubscriptionButton);
                    Object x = aVar.x();
                    if (y || x == c0012a) {
                        x = new on(buyMusicSubscriptionButton, 8);
                        aVar.R(x);
                    }
                    BuyMusicSubscriptionComposeButtonKt.a(null, qr8Var, rk6Var, ys8Var, subscriptionContext, (izs) x, aVar, 24576, 1);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                GoodAlbum goodAlbum = (GoodAlbum) obj4;
                qjh.b bVar = (qjh.b) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(792390894, intValue2, -1, "com.vk.profile.community.impl.ui.profile.content.holders.market.CommunityProfileContentMarketAlbumsAdapter.ViewHolder.onBind.<anonymous> (CommunityProfileContentMarketAlbumsAdapter.kt:40)");
                    }
                    rrv0.d(null, null, null, null, kai.c(771369193, new z85(r7 ? 1 : 0, goodAlbum, bVar), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                r6l.i((uu20) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                wwp.a(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj4, (q630) obj3);
                break;
            case 4:
                fgq fgqVar = (fgq) obj4;
                String str = (String) obj3;
                String str2 = (String) obj;
                if (obj2 != null) {
                    fgqVar.a.put(str + str2, obj2);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((bkd0) obj4).t6((ose0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                nud0.f((tt9) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                SearchHistoryItemVh searchHistoryItemVh = (SearchHistoryItemVh) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1821118903, intValue3, -1, "com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh.createView.<anonymous>.<anonymous>.<anonymous> (SearchHistoryItemVh.kt:173)");
                    }
                    pn0 pn0Var = searchHistoryItemVh.e;
                    boolean y2 = aVar3.y(searchHistoryItemVh) | aVar3.y(composeView);
                    Object x2 = aVar3.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new defpackage.e0(24, searchHistoryItemVh, composeView);
                        aVar3.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    boolean y3 = aVar3.y(searchHistoryItemVh) | aVar3.y(composeView);
                    Object x3 = aVar3.x();
                    int i3 = 25;
                    if (y3 || x3 == c0012a) {
                        x3 = new defpackage.f0(i3, searchHistoryItemVh, composeView);
                        aVar3.R(x3);
                    }
                    gzs gzsVar2 = (gzs) x3;
                    boolean y4 = aVar3.y(searchHistoryItemVh) | aVar3.y(composeView);
                    Object x4 = aVar3.x();
                    if (y4 || x4 == c0012a) {
                        x4 = new rs0(20, searchHistoryItemVh, composeView);
                        aVar3.R(x4);
                    }
                    gzs gzsVar3 = (gzs) x4;
                    boolean y5 = aVar3.y(searchHistoryItemVh) | aVar3.y(composeView);
                    Object x5 = aVar3.x();
                    if (y5 || x5 == c0012a) {
                        x5 = new com.vk.movika.sdk.base.flow.binding.j(i3, searchHistoryItemVh, composeView);
                        aVar3.R(x5);
                    }
                    yuh0.a(pn0Var, gzsVar, gzsVar2, gzsVar3, (gzs) x5, null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 8:
                d3n0 d3n0Var = (d3n0) obj4;
                TabbarSuggestActivity tabbarSuggestActivity = (TabbarSuggestActivity) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i4 = TabbarSuggestActivity.h;
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(406628759, intValue4, -1, "com.vk.tabbar.settings.impl.suggests.TabbarSuggestActivity.onCreate.<anonymous>.<anonymous> (TabbarSuggestActivity.kt:48)");
                    }
                    TabbarSuggestState tabbarSuggestState = d3n0Var.a;
                    int i5 = d3n0Var.d;
                    int i6 = d3n0Var.e;
                    int i7 = d3n0Var.f;
                    String str3 = d3n0Var.g;
                    vwn0.a(new e3n0(tabbarSuggestState, i5, i6, i7, str3, d3n0Var.h, d3n0Var.i), new pwn0(tabbarSuggestActivity, ((TabbarSettingsComponent) ((k7m) m7m.f(tabbarSuggestActivity)).a(fpf0.a(TabbarSettingsComponent.class))).tf(), d3n0Var.b, tabbarSuggestState, i6, str3), aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 9:
                e6p0 e6p0Var = (e6p0) obj4;
                fuv0 fuv0Var = (fuv0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1117963154, intValue5, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.ShowTooltipComposeButtons.<anonymous>.<anonymous>.<anonymous> (TooltipScreenContent.kt:408)");
                    }
                    if (e6p0Var.j()) {
                        aVar5.K(2063957077);
                        boolean J = aVar5.J(fuv0Var);
                        Object x6 = aVar5.x();
                        if (J || x6 == c0012a) {
                            x6 = new p1d0(fuv0Var, 23);
                            aVar5.R(x6);
                        }
                        e6p0Var.c(0, aVar5, (gzs) x6, null);
                    } else {
                        aVar5.K(2046271856);
                    }
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((m8t0) obj4).b(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ xs8(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
