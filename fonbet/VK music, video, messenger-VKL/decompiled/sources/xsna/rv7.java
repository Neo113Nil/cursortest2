package xsna;

import android.os.SystemClock;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh;
import com.vk.community.design.compose.components.channel.MediaType;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingActionResult;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.tabbar.settings.impl.suggests.TabbarSuggestActivity;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.jpl0;
import xsna.oap;
import xsna.q630;
import xsna.q8o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class rv7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rv7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        UserId userId;
        int i = this.b;
        int i2 = 7;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        q630.a aVar = q630.a.a;
        int i3 = 6;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wv7.c((dlv0) obj4, (BookingActionResult) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 1:
                s890 s890Var = (s890) obj4;
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(165539859, intValue, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:122)");
                    }
                    q630 C = s200.C(txj0.a(aVar, pp8.a, pp8.b), s890Var);
                    a.c cVar = androidx.compose.foundation.layout.a.e;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar, dt1.a.l, aVar2, 54);
                    int m = n34.m(aVar2);
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, C);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    cri.a.b bVar = cri.a.g;
                    if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                        kr.a(m, aVar2, m, bVar);
                    }
                    k9q0.w(aVar2, c, cri.a.d);
                    jaiVar.invoke(tpg0.a, aVar2, 6);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                dt10 dt10Var = (dt10) obj4;
                uog0 uog0Var = (uog0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1345812913, intValue2, -1, "com.vk.community.design.compose.components.channel.CommunityChannelImageCell.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityChannelImageCell.kt:79)");
                    }
                    MediaType mediaType = dt10Var.b;
                    q630 d = txj0.d(aVar, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    mug.a(mediaType, hr80.m(d, ylu0Var.getBackground().x, uog0Var), aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((edi) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                q6b0.a((t6b0) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                bkd0 bkd0Var = (bkd0) obj4;
                ikd0 ikd0Var = (ikd0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1775176957, intValue3, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.onBind.<anonymous>.<anonymous> (ProductCardCommunityInfoHolder.kt:80)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar5, 0);
                    int hashCode = Long.hashCode(n34.n(aVar5));
                    sy90 D2 = aVar5.D();
                    q630 c2 = qri.c(aVar5, aVar);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar6);
                    } else {
                        aVar5.f();
                    }
                    k9q0.w(aVar5, a2, cri.a.f);
                    k9q0.w(aVar5, D2, cri.a.e);
                    k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar5, cri.a.h);
                    k9q0.w(aVar5, c2, cri.a.d);
                    bkd0Var.q6(ikd0Var, aVar5, 0);
                    bkd0Var.x6(ikd0Var, aVar5, 0);
                    aVar5.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 6:
                SearchHistoryItemVh searchHistoryItemVh = (SearchHistoryItemVh) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(212344466, intValue4, -1, "com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh.createView.<anonymous>.<anonymous> (SearchHistoryItemVh.kt:172)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1821118903, new xs8(i2, searchHistoryItemVh, composeView), aVar7), aVar7, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ici0.a((q630) obj4, (jai) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                fll0.a((jpl0.a.b) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                d3n0 d3n0Var = (d3n0) obj4;
                TabbarSuggestActivity tabbarSuggestActivity = (TabbarSuggestActivity) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i4 = TabbarSuggestActivity.h;
                if (aVar8.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1739120846, intValue5, -1, "com.vk.tabbar.settings.impl.suggests.TabbarSuggestActivity.onCreate.<anonymous> (TabbarSuggestActivity.kt:47)");
                    }
                    rrv0.d(null, null, null, null, kai.c(406628759, new xs8(8, d3n0Var, tabbarSuggestActivity), aVar8), aVar8, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 10:
                com.vk.messagetemplates.impl.details.f fVar = (com.vk.messagetemplates.impl.details.f) obj4;
                r8o0 r8o0Var = (r8o0) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(184308078, intValue6, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsScreen.<anonymous>.<anonymous> (TemplateDetailsScreen.kt:25)");
                    }
                    boolean J = aVar9.J(r8o0Var);
                    Object x = aVar9.x();
                    if (J || x == c0012a) {
                        q8o0.c cVar2 = new q8o0.c(1, r8o0Var, r8o0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                        aVar9.R(cVar2);
                        x = cVar2;
                    }
                    p8o0.a(fVar, (izs) ((fcy) x), aVar9, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 11:
                String str = (String) obj4;
                fuv0 fuv0Var = (fuv0) obj3;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar10.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1364974673, intValue7, -1, "com.vk.design.demo.presentation.screens.TooltipScreenContent.ShowTooltipComposeButtons.<anonymous>.<anonymous>.<anonymous> (TooltipScreenContent.kt:383)");
                    }
                    boolean J2 = aVar10.J(fuv0Var);
                    Object x2 = aVar10.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new l6n0(fuv0Var, i3);
                        aVar10.R(x2);
                    }
                    mpj0.a(0, 2, aVar10, str, (gzs) x2, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
            case 12:
                SubscribeStatus subscribeStatus = (SubscribeStatus) obj4;
                UserId userId2 = (UserId) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                SubscribeStatus.Companion.getClass();
                boolean c3 = SubscribeStatus.a.c(subscribeStatus);
                for (UIBlock uIBlock : uIBlockList.y) {
                    if (uIBlock instanceof UIBlockVideo) {
                        UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                        VideoFile videoFile = uIBlockVideo.B;
                        VideoFile videoFile2 = uIBlockVideo.B;
                        if (epx.f(videoFile.I0(), userId2)) {
                            videoFile2.k3(c3);
                            videoFile2.setTimestamp(SystemClock.elapsedRealtime());
                        }
                    }
                    if (uIBlock instanceof UIBlockButtons) {
                        UIBlockButtons uIBlockButtons = (UIBlockButtons) uIBlock;
                        if (!uIBlockButtons.y.isEmpty()) {
                            UIBlock uIBlock2 = (UIBlock) j5g.Y(uIBlockButtons.y);
                            if ((uIBlock2 instanceof UIBlockActionFollow) && epx.f(uIBlock2.g, userId2)) {
                                UIBlockActionFollow uIBlockActionFollow = (UIBlockActionFollow) uIBlock2;
                                Group group = uIBlockActionFollow.z;
                                if (group != null) {
                                    group.j = c3;
                                    group.C = subscribeStatus.value;
                                }
                                UserProfile userProfile = uIBlockActionFollow.A;
                                if (userProfile != null) {
                                    userProfile.v = subscribeStatus.value;
                                }
                            }
                        }
                    }
                    if (uIBlock instanceof UIBlockSearchAuthor) {
                        UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
                        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
                        CatalogProfileLocalState catalogProfileLocalState = uIBlockSearchAuthor.C;
                        if (oapVar instanceof oap.b) {
                            userId = fkq0.e(((Group) ((oap.b) oapVar).a).c);
                        } else {
                            if (!(oapVar instanceof oap.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            userId = ((UserProfile) ((oap.a) oapVar).a).c;
                        }
                        if (epx.f(userId, userId2)) {
                            boolean h = catalogProfileLocalState.b.h();
                            SubscribeStatus.Companion.getClass();
                            catalogProfileLocalState.b = (SubscribeStatus.a.c(subscribeStatus) && h) ? CatalogProfileLocalState.FollowSource.Internal : SubscribeStatus.a.c(subscribeStatus) ? CatalogProfileLocalState.FollowSource.External : CatalogProfileLocalState.FollowSource.None;
                            oap<? extends UserProfile, ? extends Group> oapVar2 = uIBlockSearchAuthor.y;
                            if (oapVar2 instanceof oap.b) {
                                Group group2 = (Group) ((oap.b) oapVar2).a;
                                if ((group2.C() || group2.n()) && SubscribeStatus.a.c(subscribeStatus) && !fkq0.c(group2.L)) {
                                    group2.j = false;
                                    group2.C = 4;
                                } else {
                                    boolean c4 = SubscribeStatus.a.c(subscribeStatus);
                                    group2.j = c4;
                                    group2.C = c4 ? 1 : -1;
                                }
                            } else {
                                if (!(oapVar2 instanceof oap.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ((UserProfile) ((oap.a) oapVar2).a).v = SubscribeStatus.a.d(subscribeStatus);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                return uIBlockList;
            case 13:
                ((Integer) obj2).getClass();
                ((m8t0) obj4).a((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                kmu0 kmu0Var = (kmu0) obj4;
                jai jaiVar2 = (jai) obj3;
                androidx.compose.runtime.a aVar11 = (androidx.compose.runtime.a) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (aVar11.t(intValue8 & 1, (intValue8 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-927387602, intValue8, -1, "com.vk.core.compose.modal.VkComposeModalBottomSheetBuilder.setContent.<anonymous> (VkComposeModalBottomSheetBuilder.kt:19)");
                    }
                    if (kmu0Var.g) {
                        aVar11.K(1720600723);
                        his0.c(54, aVar11, kai.c(1877733676, new aza(jaiVar2, 11), aVar11));
                        aVar11.j();
                    } else {
                        aVar11.K(1720702062);
                        his0.b(6, aVar11, kai.c(-1190743628, new fne(jaiVar2, 12), aVar11));
                        aVar11.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar11.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ rv7(SubscribeStatus subscribeStatus, UserId userId, dks0 dks0Var) {
        this.b = 12;
        this.c = subscribeStatus;
        this.d = userId;
    }

    public /* synthetic */ rv7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
