package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseCodeMessageDto;
import com.vk.catalog2.common.ui.holders.video.VideoOnboardingVh;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.mediapicker.adapter.SelectedPreviewsAdapter;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.design.demo.presentation.screens.SkeletonScreenContent;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickersRecommendationBlock;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.fullscreenvideo.design.view.top.TopControlsView;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.im.ui.components.theme_chooser.b;
import com.vk.im.ui.components.theme_chooser.c;
import com.vk.imageloader.view.VkImageViewTopCrop;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.posting.presentation.video.search.a;
import com.vk.profile.user.impl.ui.f;
import com.vk.sharing.api.dto.Target;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenOrientationLockType;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.awn0;
import xsna.bh6;
import xsna.cys;
import xsna.dbe0;
import xsna.e8v0;
import xsna.fys;
import xsna.gm50;
import xsna.jpo0;
import xsna.kxi0;
import xsna.n9a;
import xsna.tj50;
import xsna.xn50;
import xsna.ypr0;
import xsna.zvn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class n7b0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n7b0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0250  */
    /* JADX WARN: Type inference failed for: r1v105, types: [xsna.jpo0$a] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.vk.design.demo.presentation.screens.SkeletonScreenContent] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object aVar;
        boolean z;
        Iterator it;
        jpo0.c cVar;
        int i = this.b;
        int i2 = -1;
        p9m p9mVar = null;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "watch_all_button");
                String str = ((q4t0) obj2).e;
                if (str != null) {
                    qgi0.s(tgi0Var, ws2.e(str));
                }
                return s3q0.a;
            case 1:
                AttachmentType attachmentType = (AttachmentType) obj;
                ikc0 ikc0Var = ((PostingFragment) obj2).h0;
                if (ikc0Var != null) {
                    ikc0Var.s3(attachmentType);
                }
                return s3q0.a;
            case 2:
                PublishState publishState = (PublishState) obj;
                boolean z2 = publishState.H;
                boolean z3 = ((dbe0.a.c) ((dbe0.a) obj2)).b;
                return PublishState.a(publishState, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, z3, null, null, (!publishState.I || z3) ? z2 : false, z2 && z3, null, false, false, null, false, false, false, false, -536870913, 2044);
            case 3:
                xn50.a.c(((com.vk.posting.presentation.video.search.g) obj2).c, new a.c(String.valueOf((Editable) obj)));
                return s3q0.a;
            case 4:
                SelectedPreviewsAdapter.a aVar2 = (SelectedPreviewsAdapter.a) obj2;
                SelectedPreviewsAdapter.c cVar2 = aVar2.m;
                Object obj3 = aVar2.l;
                cVar2.b(((SelectedPreviewsAdapter.b) (obj3 != null ? obj3 : null)).a);
                return s3q0.a;
            case 5:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, ((MarketProductTileConfig.b) obj2).b);
                qgi0.r(tgi0Var2, "product_cta_button");
                qgi0.n(tgi0Var2, 0);
                return s3q0.a;
            case 6:
                ((kxi0) obj2).a.onNext(kxi0.a.TRANSITION);
                return s3q0.a;
            case 7:
                uhj0 uhj0Var = (uhj0) obj2;
                uhj0Var.Z((ActionLink) obj);
                UserId userId = uhj0Var.e;
                long j = fkq0.b(userId) ? -userId.b : 0L;
                z20 z20Var = new z20("actionLinks.getByTag", i3);
                z20Var.K("tag", "live");
                if (j != 0) {
                    z20Var.D(j, "group_id");
                }
                return rsg0.y0(z20Var, null, null, 3);
            case 8:
                ?? r7 = (SkeletonScreenContent) obj2;
                ThemableShimmer themableShimmer = r7.c;
                Context context = (Context) obj;
                ?? linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout.setOrientation(1);
                if (linearLayout.isAttachedToWindow()) {
                    themableShimmer.b();
                } else {
                    linearLayout.addOnAttachStateChangeListener(new wyj0(linearLayout, r7));
                }
                if (linearLayout.isAttachedToWindow()) {
                    linearLayout.addOnAttachStateChangeListener(new xyj0(linearLayout, r7));
                } else {
                    themableShimmer.c();
                }
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                linearLayout2.setOrientation(0);
                r7.f(linearLayout2, new VkSkeleton.a.C0862a(0), linearLayout);
                linearLayout.addView(linearLayout2);
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                linearLayout3.setOrientation(0);
                r7.f(linearLayout3, VkSkeleton.a.b.a, linearLayout);
                linearLayout.addView(linearLayout3);
                VkTextSkeleton vkTextSkeleton = new VkTextSkeleton(context, null, 6, 0);
                vkTextSkeleton.setShimmer(themableShimmer);
                vkTextSkeleton.setShimmerManagedExternally(true);
                vkTextSkeleton.setArea(new a.C0863a(linearLayout));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                int b = hbh0.b(4, context);
                layoutParams.setMargins(b, b, b, b);
                vkTextSkeleton.setLayoutParams(layoutParams);
                vkTextSkeleton.setTextAppearance(context, R.style.VkUiTypography_Text);
                vkTextSkeleton.setText(r7.d);
                linearLayout.addView(vkTextSkeleton);
                return linearLayout;
            case 9:
                e7m0 e7m0Var = (e7m0) obj2;
                u76 u76Var = e7m0Var.m;
                bh6.c cVar3 = (bh6.c) obj;
                if (cVar3 instanceof bh6.d) {
                    tyl0<?> tyl0Var = e7m0Var.d;
                    f7m0 f7m0Var = tyl0Var instanceof f7m0 ? (f7m0) tyl0Var : null;
                    if (f7m0Var != null) {
                        f7m0Var.setActive(false);
                    }
                } else if (cVar3 instanceof n9a.b) {
                    e7m0Var.p = true;
                    e7m0Var.l(((n9a.b) cVar3).a);
                    if (e7m0Var.d == null) {
                        e7m0Var.h(null);
                    }
                    u76Var.k7();
                } else if (cVar3 instanceof bh6.a) {
                    e7m0Var.p = true;
                    e7m0Var.l(e7m0Var.i);
                    u76Var.P2();
                    u76Var.Q2().b(false);
                } else if (cVar3 instanceof n9a.c) {
                    u76Var.Q2().b(((n9a.c) cVar3).a);
                } else if ((cVar3 instanceof bh6.b) && !e7m0Var.p) {
                    e7m0Var.p = true;
                    e7m0Var.l(e7m0Var.i);
                    u76Var.P2();
                    u76Var.Q2().b(false);
                }
                return s3q0.a;
            case 10:
                com.vk.stories.design.view.stats.tabs.stickers.mvi.i iVar = (com.vk.stories.design.view.stats.tabs.stickers.mvi.i) obj2;
                tj50.a aVar3 = (tj50.a) obj;
                hhm0 hhm0Var = hhm0.b;
                ao8 ao8Var = ao8.d;
                return new StoryStatisticsStickersViewState.a(aVar3.a(hhm0Var, ao8Var), aVar3.a(new com.vk.stories.design.view.stats.tabs.stickers.mvi.g(1, iVar, com.vk.stories.design.view.stats.tabs.stickers.mvi.i.class, "buildVisibilityState", "buildVisibilityState(Lcom/vk/stories/design/view/stats/tabs/stickers/mvi/StoryStatisticsStickersState;)Lcom/vk/stories/design/view/stats/tabs/stickers/mvi/StoryStatisticsStickersViewState$VisibilityState;", 0), ao8Var), aVar3.a(new com.vk.stories.design.view.stats.tabs.stickers.mvi.h(1, iVar, com.vk.stories.design.view.stats.tabs.stickers.mvi.i.class, "buildListState", "buildListState(Lcom/vk/stories/design/view/stats/tabs/stickers/mvi/StoryStatisticsStickersState;)Lcom/vk/stories/design/view/stats/tabs/stickers/mvi/StoryStatisticsStickersViewState$ListState;", 0), ao8Var));
            case 11:
                ((xmm0) obj2).b.X0(((Integer) obj).intValue());
                return s3q0.a;
            case 12:
                ((com.vk.lists.c) obj2).s(((StickersRecommendationBlock) obj).e);
                return s3q0.a;
            case 13:
                nvn0 nvn0Var = (nvn0) obj2;
                nvn0Var.T(new awn0.e(false, !epx.f(nvn0Var.h.h(), nvn0Var.j)));
                nvn0Var.n.b(zvn0.b.a);
                return s3q0.a;
            case 14:
                Dialog dialog = (Dialog) obj;
                g9e0 g9e0Var = ((fyn0) obj2).o;
                qcy<Object> qcyVar = fyn0.p[0];
                Toolbar toolbar = ((gyn0) g9e0Var.b()).e;
                (toolbar != null ? toolbar : null).setTitle(dialog.tc() ? R.string.vkim_dialog_attaches_open_channel : dialog.uc() ? R.string.vkim_dialog_attaches_open_chat : R.string.vkim_dialog_attaches_open_dialog);
                return s3q0.a;
            case 15:
                ((com.vk.sharing.core.view.h) obj2).V5((Target) obj, false);
                return s3q0.a;
            case 16:
                com.vk.im.ui.components.theme_chooser.b bVar = (com.vk.im.ui.components.theme_chooser.b) obj2;
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                bVar.t.onNext(themeChooserState);
                com.vk.im.ui.components.theme_chooser.a aVar4 = bVar.o;
                int i4 = b.d.$EnumSwitchMapping$0[themeChooserState.a.ordinal()];
                if (i4 == 1) {
                    List<DialogBackground> list = themeChooserState.g;
                    String str2 = themeChooserState.d.b;
                    ow5 ow5Var = new ow5(list);
                    p4t p4tVar = ow5.e;
                    ArrayList arrayList = ow5Var.c;
                    arrayList.add(p4tVar);
                    ow5Var.b = str2;
                    ow5Var.d = aVar4.b.d.b;
                    hfr l = rli0.l(new ulp0(rli0.x(new i5g(list), new fli0(DialogBackground.e)), new n40(ow5Var, 7)), new cj1(2));
                    nw5 nw5Var = new nw5(ow5Var, 0);
                    List B = rli0.B(l);
                    g5g.L(B, nw5Var);
                    Iterator it2 = ((ArrayList) B).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                    aVar = new c.AbstractC1159c.a(arrayList);
                } else if (i4 == 2) {
                    List<p9m> list2 = themeChooserState.h;
                    String Y0 = com.vk.im.ui.components.theme_chooser.b.Y0(themeChooserState.c, list2);
                    String Y02 = com.vk.im.ui.components.theme_chooser.b.Y0(aVar4.b.c, list2);
                    t6g t6gVar = new t6g(list2);
                    t6gVar.b = new r6g(Y0, i3);
                    t6gVar.c = new com.vk.movika.sdk.base.observable.g(Y02, 22);
                    List<p9m> list3 = list2;
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            ?? next = it3.next();
                            if (epx.f(((p9m) next).a, c.h.c.a)) {
                                p9mVar = next;
                            }
                        }
                    }
                    int i5 = 28;
                    aVar = new c.AbstractC1159c.b(rli0.A(new ulp0(new qli0(rli0.j(new i5g(list3), new com.vk.movika.sdk.base.observable.e(p9mVar, i5)), new s6g(t6gVar)), new ul1(t6gVar, i5))));
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<DialogTheme> list4 = themeChooserState.f;
                    String str3 = themeChooserState.b;
                    lpo0 lpo0Var = new lpo0();
                    b.c cVar4 = bVar.l;
                    b.c.a aVar5 = cVar4.b;
                    String str4 = cVar4.a;
                    boolean z4 = aVar5 instanceof b.c.a.C1157a;
                    List<DialogTheme> list5 = list4;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it4 = list5.iterator();
                        while (it4.hasNext()) {
                            if (epx.f(((DialogTheme) it4.next()).b, c.h.c)) {
                                z = true;
                                ArrayList arrayList2 = lpo0Var.a;
                                if (!z4 && str4.length() > 0) {
                                    arrayList2.add(new jpo0.a.c(false));
                                } else if (!z4) {
                                    s3q0 s3q0Var = s3q0.a;
                                } else if (z) {
                                    arrayList2.add(new jpo0.a.b(false));
                                } else {
                                    arrayList2.add(new jpo0.a.C3138a(false));
                                }
                                if (z4) {
                                    lpo0Var.a(list4);
                                } else {
                                    Set y0 = rl3.y0(new com.vk.im.engine.models.dialogs.c[]{c.C1124c.c, c.h.c});
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj4 : list5) {
                                        if (!y0.contains(((DialogTheme) obj4).b)) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    lpo0Var.a(arrayList3);
                                }
                                it = arrayList2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (epx.f(((jpo0) it.next()).a, str3)) {
                                            i2 = i3;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                if (i2 >= 0) {
                                    jpo0 jpo0Var = (jpo0) arrayList2.get(i2);
                                    if (!jpo0Var.isChecked()) {
                                        if (jpo0Var instanceof jpo0.a) {
                                            cVar = ((jpo0.a) jpo0Var).a();
                                        } else {
                                            if (!(jpo0Var instanceof jpo0.c)) {
                                                if (!(jpo0Var instanceof jpo0.d)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                throw null;
                                            }
                                            jpo0.c cVar5 = (jpo0.c) jpo0Var;
                                            cVar = new jpo0.c(cVar5.c, cVar5.d, cVar5.e, cVar5.f, cVar5.g, cVar5.h, true);
                                        }
                                        arrayList2.set(i2, cVar);
                                    }
                                }
                                lpo0Var.b = str4;
                                aVar = new c.AbstractC1159c.d(j5g.D0(new kpo0(lpo0Var), arrayList2));
                            }
                        }
                    }
                    z = false;
                    ArrayList arrayList22 = lpo0Var.a;
                    if (!z4) {
                    }
                    if (!z4) {
                    }
                    if (z4) {
                    }
                    it = arrayList22.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                        i3++;
                    }
                    if (i2 >= 0) {
                    }
                    lpo0Var.b = str4;
                    aVar = new c.AbstractC1159c.d(j5g.D0(new kpo0(lpo0Var), arrayList22));
                }
                return aVar;
            case 17:
                qyo0 qyo0Var = (qyo0) obj2;
                String str5 = (String) obj;
                if (str5.length() == 0) {
                    return qyo0Var.b;
                }
                List<VoipScheduleCallTimeZone> list6 = qyo0Var.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list6) {
                    VoipScheduleCallTimeZone voipScheduleCallTimeZone = (VoipScheduleCallTimeZone) obj5;
                    if (drm0.D(voipScheduleCallTimeZone.c, str5, true) || drm0.D(voipScheduleCallTimeZone.d, str5, true)) {
                        arrayList4.add(obj5);
                    }
                }
                return arrayList4;
            case 18:
                ToolbarRedesignVh toolbarRedesignVh = (ToolbarRedesignVh) obj2;
                toolbarRedesignVh.g(ToolbarRedesignVh.a.a(toolbarRedesignVh.s, null, null, (t7p0) obj, 3));
                return s3q0.a;
            case 19:
                return TopControlsView.A((TopControlsView) obj2, (com.vk.fullscreenvideo.a) obj);
            case 20:
                ((bpq0) obj2).n.B(f.l.b.a);
                return s3q0.a;
            case 21:
                ppr0 ppr0Var = (ppr0) obj2;
                ypr0.a aVar6 = (ypr0.a) obj;
                ppr0Var.k.Q4();
                cp2.c(ppr0Var.k, 0L, 0L, null, null, 15);
                gm50.a.a(ppr0Var, aVar6.a, new alj0(ppr0Var, 17));
                gm50.a.a(ppr0Var, aVar6.b, new m2l0(ppr0Var, 14));
                return s3q0.a;
            case 22:
                ((jn2) obj2).invoke();
                return s3q0.a;
            case 23:
                return VideoEditTimelineView.T4((VideoEditTimelineView) obj2, ((Integer) obj).intValue());
            case 24:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                fys fysVar = (fys) obj;
                cys cysVar = videoMinimizableDiscoveryFragment.Y;
                if (cysVar != null) {
                    cys.a aVar7 = cysVar.f;
                    if (fysVar instanceof fys.b) {
                        fys.b bVar2 = (fys.b) fysVar;
                        cysVar.a(bVar2.a);
                        aVar7.a.setVisibility(0);
                        if (!(cysVar.e instanceof fys.b) && !bVar2.b) {
                            cysVar.b();
                        }
                    } else if (fysVar instanceof fys.d) {
                        aVar7.a.setVisibility(8);
                        if (!epx.f(cysVar.e, fysVar)) {
                            cysVar.a(FullscreenOrientationLockType.None);
                        }
                    } else if (!(fysVar instanceof fys.a)) {
                        if (!(fysVar instanceof fys.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar7.a.setVisibility(8);
                    } else if (!epx.f(cysVar.e, fysVar)) {
                        VkButton vkButton = aVar7.b;
                        vkButton.setText(R.string.video_fullscreen_unlocked_button_label);
                        vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_unlock_outline_16));
                        vkButton.setClickable(false);
                        d3m.c(vkButton, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new k0(3, vkButton, cysVar), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    cysVar.e = fysVar;
                }
                MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper != null) {
                    miniPlayerControllersWrapper.L3(fysVar);
                }
                com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                if (mVar != null) {
                    mVar.t = fysVar;
                }
                return s3q0.a;
            case 25:
                VideoOnboardingVh videoOnboardingVh = (VideoOnboardingVh) obj2;
                String message = ((BaseCodeMessageDto) obj).getMessage();
                if (message != null) {
                    ryc rycVar = videoOnboardingVh.p;
                    TextView textView = videoOnboardingVh.m;
                    (textView != null ? textView : null).setText(message);
                    videoOnboardingVh.b(false);
                    i0q0.g(rycVar);
                    i0q0.d(2500L, rycVar);
                }
                return s3q0.a;
            case 26:
                kym0 kym0Var = (kym0) obj;
                UserId userId2 = kym0Var.b;
                SubscribeStatus.a aVar8 = SubscribeStatus.Companion;
                SubscribeStatus subscribeStatus = kym0Var.a;
                aVar8.getClass();
                ((com.vk.video.profile.presentation.c) obj2).C(new a.i0(userId2, SubscribeStatus.a.c(subscribeStatus)));
                return s3q0.a;
            case 27:
                ((com.vk.auth.ui.consent.i) obj2).a.g0();
                return s3q0.a;
            case 28:
                int i6 = VkImageViewTopCrop.c;
                ((u9e) obj2).invoke((Bitmap) obj);
                return s3q0.a;
            default:
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = (VkOnboardingStat$Delegate) obj2;
                ((ggj) obj).s1();
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.m.b);
                }
                return s3q0.a;
        }
    }
}
