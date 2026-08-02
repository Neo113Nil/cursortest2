package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.view.ThumbsImageView;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ceq0;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;
import xsna.ruf;
import xsna.smt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class s77 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s77(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        lg90 a;
        UIBlockMusicTrack uIBlockMusicTrack;
        int i = this.b;
        int i2 = 6;
        int i3 = 7;
        int i4 = 25;
        Object obj3 = null;
        SearchStatsLoggingInfo searchStatsLoggingInfo = null;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i5 = 2;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(529307765, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.ContentScene.<anonymous>.<anonymous>.<anonymous> (BiometricsLockPinView.kt:182)");
                    }
                    if (epx.f(cVar, c.e.a)) {
                        aVar.K(1782800805);
                        qzu0.a.getClass();
                        a = qzu0.h0(aVar);
                        aVar.j();
                    } else {
                        aVar.K(1782909801);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1412848894, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationConfirmationCodeList120H> (VkIcons.kt:3668)");
                        }
                        a = pg90.a(R.drawable.vk_icon_illustration_confirmation_code_list_120h, 0, aVar);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar.j();
                    }
                    vjw.a(a, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 56, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                tuf tufVar = (tuf) obj4;
                ruf rufVar = (ruf) obj;
                Pair pair = (Pair) rli0.n(rli0.j(new i5g((List) obj2), new cqf(rufVar, r12 ? 1 : 0)));
                ceq0 ceq0Var = pair != null ? (ceq0) pair.j() : null;
                if (ceq0Var != null) {
                    suf sufVar = tufVar.b;
                    Set<Integer> a2 = rufVar.a();
                    if (ceq0Var instanceof ceq0.g) {
                        obj3 = new ruf.e(ceq0Var, a2);
                    } else if ((ceq0Var instanceof ceq0.e) || (ceq0Var instanceof ceq0.a)) {
                        obj3 = new ruf.d(ceq0Var, izi0.k(a2, Integer.valueOf(ceq0Var.b())));
                    } else if (ceq0Var instanceof ceq0.c) {
                        obj3 = new ruf.a(ceq0Var, a2);
                    }
                    if (obj3 != null) {
                    }
                }
                break;
            case 2:
                z5h z5hVar = (z5h) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = z5h.j1;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(336029065, intValue2, -1, "com.vk.profile.community.details.impl.invitelink.CommunityInviteLinkBottomSheet.ThemedContent.<anonymous> (CommunityInviteLinkBottomSheet.kt:100)");
                    }
                    z5hVar.eo(8, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                VkOnboardingComponent.Companion companion = VkOnboardingComponent.Companion;
                break;
            case 4:
                vmt vmtVar = (vmt) obj4;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a3 = ruiVar.a(new bmt(vmtVar, nn50Var));
                es60 es60Var = vmtVar.l;
                zlt zltVar = vmtVar.k;
                final f64 a4 = ruiVar.a(new x5o0(es60Var, zltVar, nn50Var));
                final f64 a5 = ruiVar.a(new w5o0(es60Var, zltVar, nn50Var));
                final f64 a6 = ruiVar.a(new z5o0(es60Var, zltVar, nn50Var));
                final f64 a7 = ruiVar.a(new y5o0(es60Var, zltVar, nn50Var));
                final f64 a8 = ruiVar.a(new b6o0(es60Var, zltVar, nn50Var));
                final f64 a9 = ruiVar.a(new v5o0(es60Var, zltVar, nn50Var));
                final f64 a10 = ruiVar.a(new a6o0(es60Var, zltVar, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.imt
                    @Override // xsna.wzs
                    public final Object invoke(Object obj5, Object obj6) {
                        qk50 qk50Var = (qk50) obj5;
                        smt smtVar = (smt) obj6;
                        if (smtVar instanceof smt.a) {
                            return qk50Var.a(f64.this, smtVar);
                        }
                        if (smtVar instanceof nmt) {
                            return qk50Var.a(a4, smtVar);
                        }
                        if (smtVar instanceof pmt) {
                            return qk50Var.a(a6, smtVar);
                        }
                        if (smtVar instanceof mmt) {
                            return qk50Var.a(a5, smtVar);
                        }
                        if (smtVar instanceof omt) {
                            return qk50Var.a(a7, smtVar);
                        }
                        if (smtVar instanceof rmt) {
                            return qk50Var.a(a8, smtVar);
                        }
                        if (smtVar instanceof lmt) {
                            return qk50Var.a(a9, smtVar);
                        }
                        if (smtVar instanceof qmt) {
                            return qk50Var.a(a10, smtVar);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((vn20) obj4).d(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 6:
                az20 az20Var = (az20) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(65288713, intValue3, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.getComposeBottomContent.<anonymous> (ModalCardScreenContent.kt:317)");
                    }
                    UserStackSize userStackSize = UserStackSize.Large;
                    boolean J = aVar3.J(az20Var);
                    Object x = aVar3.x();
                    if (J || x == c0012a) {
                        x = new w910(az20Var, i5);
                        aVar3.R(x);
                    }
                    hyv0.d(null, userStackSize, null, null, (izs) x, aVar3, 48, 13);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 7:
                View view = (View) obj;
                UIBlockLink uIBlockLink = (UIBlockLink) obj2;
                SearchStatInfoProvider searchStatInfoProvider = ((de40) obj4).f;
                if (searchStatInfoProvider != null) {
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.LINK;
                    String r = uIBlockLink.r();
                    if (r == null) {
                        r = "";
                    }
                    searchStatsLoggingInfo = searchStatInfoProvider.b(type, r, false);
                }
                LaunchContext.a aVar4 = new LaunchContext.a();
                aVar4.d = uIBlockLink.f;
                if (searchStatsLoggingInfo != null) {
                    aVar4.m = searchStatsLoggingInfo;
                }
                maz.c(xwk.d().e(), view.getContext(), uIBlockLink.y.e, aVar4.a(), null, null, 24);
                break;
            case 8:
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) obj4;
                ThumbsImageView thumbsImageView = (ThumbsImageView) obj;
                vrr vrrVar = (vrr) obj2;
                MusicClipsSelectorCatalogRootVh.a aVar5 = MusicClipsSelectorCatalogRootVh.J;
                if (!(vrrVar instanceof MusicClipsSelectorCatalogRootVh.b)) {
                    break;
                } else {
                    thumbsImageView.setCornerRadius(cn70.c(52));
                    thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_song_outline_28);
                    if (musicClipsSelectorCatalogRootVh.m.b.i.K0() != null) {
                        thumbsImageView.animate().scaleX(0.6f).scaleY(0.6f).setDuration(250L).withEndAction(new qye(i2, thumbsImageView, ((MusicClipsSelectorCatalogRootVh.b) vrrVar).a)).start();
                    } else {
                        thumbsImageView.setThumb(((MusicClipsSelectorCatalogRootVh.b) vrrVar).a);
                    }
                    break;
                }
            case 9:
                MusicTrackCellVh musicTrackCellVh = (MusicTrackCellVh) obj4;
                ((Integer) obj).intValue();
                MusicTrack b = musicTrackCellVh.b.b();
                if (b != null && (uIBlockMusicTrack = musicTrackCellVh.p) != null && (epx.f(uIBlockMusicTrack.z.Fb(), b.Fb()) || uIBlockMusicTrack.Qb(b))) {
                    r11 = true;
                }
                break;
            case 10:
                hb80 hb80Var = (hb80) obj4;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1056288651, intValue4, -1, "com.vk.catalog2.common.ui.mvp.OnScrollGrowthTrapButtonRenderer.createButton.<anonymous>.<anonymous> (OnScrollGrowthTrapButtonRenderer.kt:128)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1087177424, new te1(hb80Var, i3), aVar6), aVar6, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((ote0) obj4).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 12:
                ((Integer) obj2).getClass();
                tig0.f((String) obj4, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 13:
                zdm0 zdm0Var = (zdm0) obj4;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(750203930, intValue5, -1, "com.vk.story.viewer.impl.presentation.holders.StoryStatHolder.bindData.<anonymous>.<anonymous> (StoryStatHolder.kt:20)");
                    }
                    com.vk.core.compose.component.cell.content.k0 a11 = Cell$Middle.a.a(Cell$Middle.d.b.a(zdm0Var.a, null, null, 0, null, null, aVar7, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar7, 196608, 30);
                    String str = zdm0Var.b;
                    Object x2 = aVar7.x();
                    if (x2 == c0012a) {
                        x2 = new kpr(i4);
                        aVar7.R(x2);
                    }
                    com.vk.core.compose.component.cell.content.s0 a12 = com.vk.core.compose.component.cell.content.m.a(str, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), aVar7, 384, 0);
                    Object x3 = aVar7.x();
                    if (x3 == c0012a) {
                        x3 = new zsw(24);
                        aVar7.R(x3);
                    }
                    wiu0.b(egi0.b(q630.a.a, true, (izs) x3), false, null, a11, a12, null, null, aVar7, 0, 102);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                break;
            case 14:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1579053086, intValue6, -1, "com.vk.camera.clips.impl.di.VideoToClipsProviderImpl.showNewVtcModal.<anonymous>.<anonymous> (VideoToClipsProviderImpl.kt:63)");
                    }
                    orj0 orj0Var = new orj0(ref$ObjectRef, i4);
                    vy20 a13 = qy20.c.a.a(pg90.a(R.drawable.vk_icon_illustration_clips_player_120h, 0, aVar8), 0L, null, aVar8, 6);
                    xy20 a14 = py20.a.a(384, 0, aVar8, d370.N(R.string.clips_vtc_dialog_title_new, 0, aVar8), d370.N(R.string.clips_vtc_dialog_description_new, 0, aVar8));
                    String N = d370.N(R.string.clips_vtc_dialog_button_new, 0, aVar8);
                    oqh0 oqh0Var = new oqh0(ref$ObjectRef, 21);
                    Object x4 = aVar8.x();
                    if (x4 == c0012a) {
                        x4 = new mcl0(13);
                        aVar8.R(x4);
                    }
                    b5v0.a(orj0Var, q630.a.a, a13, a14, null, oy20.b.a(oy20.a.C3478a.a(N, oqh0Var, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), aVar8, 0, 4092), null, false, aVar8, 6), false, false, null, aVar8, 12582960, 336);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                break;
            case 15:
                com.vk.core.compose.component.datetime.d dVar = (com.vk.core.compose.component.datetime.d) obj4;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(14855588, intValue7, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog.<anonymous>.<anonymous> (VkDatePicker.kt:84)");
                    }
                    boolean J2 = aVar9.J(dVar);
                    Object x5 = aVar9.x();
                    if (J2 || x5 == c0012a) {
                        x5 = new oqh0(dVar, i4);
                        aVar9.R(x5);
                    }
                    bqv0.e((gzs) x5, aVar9, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((lnx0) obj4).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ s77(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
