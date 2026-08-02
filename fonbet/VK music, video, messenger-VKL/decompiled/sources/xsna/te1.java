package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.games.presentation.catalog.model.items.GameCatalogBadge;
import com.vk.lists.DefaultEmptyView;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.me70;
import xsna.pox0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class te1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ te1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1299219628, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseViewRedesign.<anonymous> (AlbumChooseViewRedesign.kt:61)");
                    }
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new oe1(izsVar, 0);
                        aVar2.R(x);
                    }
                    i3p0.a(48, aVar2, (gzs) x, null, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((Boolean) obj).getClass();
                ((fh5) obj3).S0(((gmq) obj2).X());
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                int i2 = z5h.j1;
                ((z5h) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj3;
                String[] strArr = DebugDevSettingsFragment.t0;
                String charSequence = ((CharSequence) obj2).toString();
                int parseInt = charSequence.isEmpty() ? 0 : Integer.parseInt(charSequence);
                o2l.a.getClass();
                o2l.i(parseInt, "__dbg_music_ad_slot_id");
                debugDevSettingsFragment.findPreference("__dbg_music_ad_slot_id").I(parseInt == 0 ? "Slot id" : lhg.a(parseInt, ""));
                return null;
            case 4:
                gxl gxlVar = (gxl) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1118314578, intValue2, -1, "com.vk.ecomm.cart.impl.points_map.ui.filters.DeliveryPointsMapFiltersBottomSheet.view$delegate.<anonymous>.<anonymous>.<anonymous> (DeliveryPointsMapFiltersBottomSheet.kt:35)");
                    }
                    emi.e.g(6, aVar3, kai.c(942076876, new uog(gxlVar, r12 ? 1 : 0), aVar3));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                h7t.a((GameCatalogBadge) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ue70.c((me70.f) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                hb80 hb80Var = (hb80) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1087177424, intValue3, -1, "com.vk.catalog2.common.ui.mvp.OnScrollGrowthTrapButtonRenderer.createButton.<anonymous>.<anonymous>.<anonymous> (OnScrollGrowthTrapButtonRenderer.kt:129)");
                    }
                    q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 7);
                    aVar4.K(-1100444573);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar4.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getBackground().x;
                    aVar4.j();
                    uog0 b = vog0.b(50);
                    aVar4.K(246259384);
                    float f = (float) 0.33d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar4.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    y18 a = aqw.a(f, ylu0Var2.p().c);
                    aVar4.j();
                    uov0.a(H, b, j, 0L, a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-69149431, new v95(hb80Var, r9), aVar4), aVar4, 1572870, 40);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 8:
                ggd0 ggd0Var = (ggd0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(859917312, intValue4, -1, "com.vk.profile.user.impl.ui.adapter.holders.PrivateUserProfileContentViewHolder.Content.<anonymous> (PrivateUserProfileContentViewHolder.kt:42)");
                    }
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(50548752, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-LockOutline56> (VkSdkIcons.kt:2168)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_lock_outline_56, 0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar5.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    wiu0.b(F, false, Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(a2, size, ylu0Var3.getIcon().l, null, null, aVar5, 196664, 24), null, aVar5, 2), Cell$Middle.a.a(Cell$Middle.d.b.a((String) ((zak0) ggd0Var.o).getValue(), null, null, 0, null, null, aVar5, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, Cell$Middle.b.a.a((String) ((zak0) ggd0Var.p).getValue(), 0, null, aVar5, 24576, 14), null, aVar5, 196608, 26), null, null, null, aVar5, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((jmd0) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultEmptyView defaultEmptyView = ((ReactionsFeedFragment) obj3).d0;
                if (defaultEmptyView != null) {
                    defaultEmptyView.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                tig0.b((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                ((erq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 13:
                pak pakVar = (pak) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                return new owt(pakVar.e, pakVar.f, pakVar.g, num, pakVar.c, 0, null, null, ((xbs0) obj3).H, 992);
            default:
                pox0.d dVar = (pox0.d) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1513729788, intValue5, -1, "com.vk.community.design.compose.widget.views.WidgetMatchView.ThemedContent.<anonymous> (WidgetMatchView.kt:31)");
                    }
                    dl10.a(dVar, aVar, aVar6, 48, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ te1(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
