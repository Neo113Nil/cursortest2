package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.ads.api.di.AdsComponent;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.camera.ui.SuperappQrCameraActivity;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.im.engine.di.ImCmdCoroutinesExecutorComponent;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import com.vk.im.engine.di.executor.ImCmdCoroutinesExecutorScopedComponentImpl;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.di.StickyPlayerComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.playlist.display.audiobook.offline.presentation.fragment.OfflineAudioBookChaptersFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.a;
import com.vk.superapp.libverify.js.bridge.api.di.JsLibverifyDelegateComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.ccr0;
import xsna.u4a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gzv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gzv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        TextView textView;
        TextView textView2;
        VideoFile videoFile;
        int i2 = 20;
        int i3 = 22;
        int i4 = 16;
        int i5 = 0;
        switch (this.b) {
            case 0:
                ImCmdCoroutinesExecutorScopedComponentImpl imCmdCoroutinesExecutorScopedComponentImpl = (ImCmdCoroutinesExecutorScopedComponentImpl) this.c;
                acw acwVar = imCmdCoroutinesExecutorScopedComponentImpl.a;
                return acwVar.a ? new fzv(sdy.n(acwVar)) : ((ImCmdCoroutinesExecutorComponent) imCmdCoroutinesExecutorScopedComponentImpl.b.getValue()).g();
            case 1:
                ImSettingsDialogThemeFragment imSettingsDialogThemeFragment = (ImSettingsDialogThemeFragment) this.c;
                int i6 = ImSettingsDialogThemeFragment.c0;
                return ((ImCmdRxExecutorComponent) m7m.d(imSettingsDialogThemeFragment).a(fpf0.a(ImCmdRxExecutorComponent.class))).g();
            case 2:
                return ((JsLibverifyDelegateComponent) x6y.H().a(fpf0.a(JsLibverifyDelegateComponent.class))).g6().a((x6y) this.c);
            case 3:
                is8 is8Var = ((t1z) this.c).i;
                if (is8Var != null) {
                    is8Var.c();
                }
                return s3q0.a;
            case 4:
                p5z p5zVar = (p5z) this.c;
                jz8 jz8Var = p5zVar.c;
                q7r q7rVar = p5zVar.a;
                mkm0 mkm0Var = q7rVar.i0;
                com.vk.story.api.a aVar = q7rVar.p;
                StoryEntry currentStory = mkm0Var.getCurrentStory();
                mkm0 mkm0Var2 = jz8Var.a.i0;
                iz8 c = jz8Var.c(mkm0Var2.getWidth(), mkm0Var2.getHeight(), (currentStory == null || (videoFile = currentStory.n) == null || videoFile.getWidth() == 0 || (videoFile.getWidth() < videoFile.getHeight() && !currentStory.Lb())) ? false : true);
                if (c.equals(q7rVar.d0)) {
                    return s3q0.a;
                }
                vrl0 a = q7rVar.a();
                if (a != null) {
                    a.b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.ON_PRE_DRAW_LISTENER_STORY_VIEW, mkm0Var.getCurrentStory(), mkm0Var.f, q7rVar.b());
                }
                jz8 jz8Var2 = p5zVar.c;
                float f = c.d;
                float f2 = c.c;
                q7r q7rVar2 = jz8Var2.a;
                q7rVar2.d0 = c;
                mkm0 mkm0Var3 = q7rVar2.i0;
                jz8Var2.b(q7rVar2.x, c);
                jz8Var2.b(q7rVar2.y, c);
                ViewGroup viewGroup = q7rVar2.w;
                if (viewGroup != null) {
                    jz8Var2.b(viewGroup, c);
                }
                jz8Var2.b(q7rVar2.B, c);
                jz8Var2.b(q7rVar2.r, c);
                if (q7rVar2.n0) {
                    jz8Var2.b(q7rVar2.q0, c);
                }
                jz8Var2.a(c);
                zbx zbxVar = q7rVar2.l0;
                if (zbxVar != null) {
                    hz8 c2 = mkm0Var3.getDependencies().j.c(c);
                    i = 16;
                    FrameLayout a2 = zbxVar.a();
                    a2.setTranslationY(f2);
                    a2.setOutlineProvider(c2);
                    a2.setClipToOutline(true);
                    com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.a aVar2 = zbxVar.c;
                    if (aVar2 != null) {
                        aVar2.e = c;
                        a.C1837a c1837a = aVar2.f;
                        if (c1837a != null) {
                            aVar2.a(c1837a.a, c1837a.b, c1837a.c, c1837a.d);
                        }
                    }
                    e2f0 e2f0Var = zbxVar.e;
                    if (e2f0Var != null) {
                        e2f0Var.g = c;
                        e2f0Var.c();
                    }
                } else {
                    i = 16;
                }
                View view = q7rVar2.E;
                if (view != null) {
                    view.setTranslationY(f2);
                }
                hz8 hz8Var = new hz8(mkm0Var3.getDependencies().j.c(c).a, false);
                View view2 = q7rVar2.E;
                if (view2 != null) {
                    view2.setOutlineProvider(hz8Var);
                }
                View view3 = q7rVar2.E;
                if (view3 != null) {
                    view3.setClipToOutline(true);
                }
                StoryViewHeader storyViewHeader = q7rVar2.P;
                if (storyViewHeader != null) {
                    storyViewHeader.setTranslationY(f2);
                }
                fmm0 fmm0Var = q7rVar2.R;
                if (fmm0Var != null && (textView2 = fmm0Var.f) != null) {
                    textView2.setTranslationY((-f) - cn70.b(i));
                }
                gmm0 gmm0Var = q7rVar2.S;
                if (gmm0Var != null && (textView = gmm0Var.c) != null) {
                    textView.setTranslationY((-f) - cn70.b(i));
                }
                CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = mkm0Var.getStoriesContainer().g;
                ArrayList arrayList = new ArrayList();
                Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ClickableStickers clickableStickers = it.next().X;
                    if (clickableStickers != null) {
                        arrayList.add(clickableStickers);
                    }
                }
                yjc yjcVar = mkm0Var.getDependencies().h;
                float f3 = c.h;
                int i7 = 22;
                xjc a3 = yjcVar.a(arrayList, new RectF(f3, f2, c.a + f3, c.b + f2), new i37(p5zVar, 10), new j37(p5zVar, 7), new r9k(p5zVar, i7), new uoh(p5zVar, 29), null, new b1h(p5zVar, 25), new m1k(p5zVar, 19), new qcl(p5zVar, i7));
                a3.c();
                q7rVar.Q = a3;
                qkc qkcVar = a3 instanceof qkc ? (qkc) a3 : null;
                if (qkcVar != null) {
                    qkcVar.f = new com.vk.movika.tools.controls.seekbar.v(p5zVar, 9);
                }
                if ("open_miniapp_popup".equals(aVar.a)) {
                    atu atuVar = p5zVar.e;
                    if (atuVar.a.i0.getCurrentStory() != null && atuVar.a.i0.getCurrentStory().X != null) {
                        q7r q7rVar3 = atuVar.a;
                        if (q7rVar3.Q != null) {
                            ClickableApp Ab = q7rVar3.i0.getCurrentStory().X.Ab();
                            if (Ab == null) {
                                Ab = atuVar.a.i0.getCurrentStory().X.zb();
                            }
                            if (Ab != null) {
                                q7r q7rVar4 = atuVar.a;
                                q7rVar4.Q.b(q7rVar4.j0, Ab);
                            }
                        }
                    }
                    aVar.a = "";
                }
                return s3q0.a;
            case 5:
                com.vk.clips.sdk.shared.item.market_ads.b bVar = (com.vk.clips.sdk.shared.item.market_ads.b) this.c;
                jp00 jp00Var = bVar.l;
                return new yp00(bVar, jp00Var.j(), jp00Var.a(), jp00Var.q(), new rob(jp00Var.e(new tp00(2, bVar, com.vk.clips.sdk.shared.item.market_ads.b.class, "onMarketAdNotInterested", "onMarketAdNotInterested(Ljava/lang/String;Lcom/vk/clips/sdk/models/ads/SdkAdsChoices;)V", 0), new up00(2, bVar, com.vk.clips.sdk.shared.item.market_ads.b.class, "onMarketAdReport", "onMarketAdReport(Ljava/lang/String;Lcom/vk/clips/sdk/models/ads/SdkAdsChoices;)V", 0), bVar.r)));
            case 6:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                int i8 = MarketItemReviewsFragment.w0;
                h3p0.b(marketItemReviewsFragment);
                return s3q0.a;
            case 7:
                c810 c810Var = (c810) this.c;
                int i9 = c810.o1;
                Bundle arguments = c810Var.getArguments();
                return arguments != null && arguments.getBoolean("shouldMeasureTechStats", false) ? new eil(new m1k(c810Var, 24)) : new fsm0();
            case 8:
                return new k810(((f910) this.c).c);
            case 9:
                return new r020((s020) this.c);
            case 10:
                return ((VkClientMultiAccountComponent) j6i.b(m7m.f((MenuListView) this.c), VkClientMultiAccountComponent.class)).getExperiments();
            case 11:
                ModalAuthHostActivity modalAuthHostActivity = (ModalAuthHostActivity) this.c;
                hb0<Intent> hb0Var = modalAuthHostActivity.g;
                int i10 = SuperappQrCameraActivity.g;
                hb0Var.a(SuperappQrCameraActivity.a.a(14, modalAuthHostActivity, false));
                return s3q0.a;
            case 12:
                return Integer.valueOf((int) ((hk30) this.c).b.b(R.dimen.msg_bubble_max_width));
            case 13:
                return (TextView) ((un30) this.c).d.findViewById(R.id.deleted_title);
            case 14:
                Context context = ((cr30) this.c).d;
                return new ek30(context == null ? null : context, 0);
            case 15:
                cv30 cv30Var = (cv30) this.c;
                synchronized (cv30Var) {
                    if (cv30Var.c) {
                        cv30Var.e.b(cv30Var.d);
                        cv30Var.c = false;
                    }
                }
                return s3q0.a;
            case 16:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((u440) this.c)).a(fpf0.a(StoryEditorExtDepsComponent.class))).p();
            case 17:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) this.c;
                u4a u4aVar = musicMyAudiosCatalogRootVh.m;
                MusicCollectionType musicCollectionType = musicMyAudiosCatalogRootVh.L;
                u4a.a aVar3 = u4aVar.b;
                nda ndaVar = aVar3.b;
                q3a q3aVar = aVar3.e;
                i7p0 i7p0Var = new i7p0(null, null, null, new w61(musicMyAudiosCatalogRootVh, 8), 7);
                wba N = aVar3.s.N();
                u4a u4aVar2 = musicMyAudiosCatalogRootVh.m;
                u4a.a aVar4 = u4aVar2.b;
                eda edaVar = new eda(N, aVar4.e, aVar4.s.K(u4aVar2), new rf3(21));
                SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                return new VkTopBarVh(ndaVar, q3aVar, i7p0Var, new w7p0(true, null, com.vk.core.compose.component.semantics.b.a(mode, new l8k(23), 2), com.vk.core.compose.component.semantics.b.a(mode, new com(i2), 2), com.vk.core.compose.component.semantics.b.a(mode, new gvs(12), 2), com.vk.core.compose.component.semantics.b.a(mode, new nyq(i4), 2), com.vk.core.compose.component.semantics.b.a(mode, new wo40(i5), 2), com.vk.core.compose.component.semantics.b.a(mode, new x8m(i3), 2), com.vk.core.compose.component.semantics.b.a(mode, new d0k(i4), 2), 20534), tq.h(tlo0.Companion, (((Boolean) musicMyAudiosCatalogRootVh.p.getValue()).booleanValue() && musicCollectionType == MusicCollectionType.AUDIOS) ? R.string.music_title_my_audios_kids : musicCollectionType.n()), edaVar, new yo40(), ((Boolean) musicMyAudiosCatalogRootVh.K.getValue()).booleanValue() ? new u6k(musicMyAudiosCatalogRootVh, 27) : null, 864);
            case 18:
                nwy nwyVar = ((StickyPlayerComponent) ((k7m) m7m.c((rv40) this.c)).mo408a(fpf0.a(StickyPlayerComponent.class))).a;
                qcy<Object> qcyVar = StickyPlayerComponent.c[0];
                return (oel0) nwyVar.c();
            case 19:
                return ((AuthBridgeComponent) ((k7m) m7m.f((MusicSearchCatalogConfiguration) this.c)).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 20:
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return new gt60(new hj60(newsfeedFragment, i5), new f550(newsfeedFragment, 3), new f5x(newsfeedFragment, i2), new ag20(newsfeedFragment, 11), newsfeedFragment.U);
            case 21:
                return (AdsComponent) ((mo60) this.c).c().mo408a(fpf0.a(AdsComponent.class));
            case 22:
                ct60 ct60Var = (ct60) this.c;
                return new hv50(ct60Var.v, ct60Var.w, ((NewsFeedComponent) ct60Var.e.getValue()).cc());
            case 23:
                q970 q970Var = (q970) this.c;
                int i11 = q970.i1;
                q970Var.hide();
                euk eukVar = q970Var.h1;
                if (eukVar != null) {
                    eukVar.a(false);
                }
                return s3q0.a;
            case 24:
                OfflineAudioBookChaptersFragment offlineAudioBookChaptersFragment = (OfflineAudioBookChaptersFragment) this.c;
                OfflineAudioBookChaptersFragment.b bVar2 = OfflineAudioBookChaptersFragment.Q;
                return ((OfflineAudioComponent) m7m.d(offlineAudioBookChaptersFragment).a(fpf0.a(OfflineAudioComponent.class))).Ja();
            case 25:
                b2r b2rVar = ((a880) this.c).h;
                if (b2rVar == null) {
                    return null;
                }
                Context context2 = b2rVar.b.getContext();
                int i12 = ccr0.q;
                ccr0 a4 = ccr0.a.a(context2);
                int b = cn70.b(40);
                int b2 = cn70.b(40);
                a4.m = b;
                a4.n = b2;
                a4.u(dhr0.t.a(R.drawable.user_placeholder));
                return a4;
            case 26:
                ((lv90) this.c).mo();
                return s3q0.a;
            case 27:
                lba0 lba0Var = (lba0) this.c;
                lba0Var.p = lba0Var.o;
                o1l0 accessibilityListener = lba0Var.getAccessibilityListener();
                if (accessibilityListener != null) {
                    ((kdl0) accessibilityListener).a(lba0Var);
                }
                return s3q0.a;
            case 28:
                PhotosRootFragment photosRootFragment = (PhotosRootFragment) this.c;
                int i13 = PhotosRootFragment.X;
                return ((PhotosComponent) ((k7m) m7m.f(photosRootFragment)).a(fpf0.a(PhotosComponent.class))).p7().a();
            default:
                VkErrorView vkErrorView = (VkErrorView) this.c;
                int i14 = PickerRecyclerPaginatedView.O;
                vkErrorView.a();
                return s3q0.a;
        }
    }
}
