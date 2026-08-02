package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.f;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase_Impl;
import com.vk.superapp.browser_events.di.BrowserEventsComponent;
import com.vk.superapp.navigation.api.di.VkAnalyticsComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.io.File;
import xsna.to90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y3l0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y3l0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [xsna.a4n0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [xsna.b4n0] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((StickersComponent) ((k7m) m7m.f((z3l0) this.c)).a(fpf0.a(StickersComponent.class))).zc();
            case 1:
                return ((BridgeComponent) ((h7m) this.c).a(fpf0.a(BridgeComponent.class))).F();
            case 2:
                return ((hwl0) this.c).a;
            case 3:
                return ((StoryViewerComponent) ((k7m) m7m.c(((com.vk.story.viewer.impl.presentation.stories.view.storyview.b) this.c).a)).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 4:
                d9m0 d9m0Var = (d9m0) this.c;
                int i = d9m0.n1;
                return ((NewsFeedComponent) ((k7m) m7m.f(d9m0Var)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 5:
                return new dfm0((StoryStatisticsDatabase_Impl) this.c);
            case 6:
                ((uic) this.c).clear();
                return s3q0.a;
            case 7:
                final SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) this.c;
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                return new y3n0(suggestedPostsFragment.eo().a, suggestedPostsFragment.eo().a.v, suggestedPostsFragment.i0, new bin0() { // from class: xsna.a4n0
                    @Override // xsna.bin0
                    public final Object get() {
                        qcy<Object>[] qcyVarArr2 = SuggestedPostsFragment.r0;
                        return SuggestedPostsFragment.this;
                    }
                }, new bin0() { // from class: xsna.b4n0
                    @Override // xsna.bin0
                    public final Object get() {
                        return SuggestedPostsFragment.this.b0;
                    }
                }, new rvh(suggestedPostsFragment, 2));
            case 8:
                ((man0) this.c).c = true;
                return s3q0.a;
            case 9:
                xpn0 xpn0Var = (xpn0) this.c;
                q3t q3tVar = xpn0Var.b;
                GalleryFragmentImpl galleryFragmentImpl = xpn0Var.h;
                t4t t4tVar = xpn0Var.i;
                q3tVar.c(t4tVar.n);
                qg90 i2 = vua0.i(true);
                Integer num = (Integer) i2.a;
                Uri N = com.vk.core.files.a.N((File) i2.b);
                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                intent.putExtra("output", N);
                int i3 = t4tVar.t;
                if (i3 > 0) {
                    intent.putExtra("android.intent.extra.durationLimit", i3 / 1000);
                }
                if (intent.resolveActivity(galleryFragmentImpl.kn().getPackageManager()) == null) {
                    BuildInfo.Client client = BuildInfo.a;
                    VKApplication vKApplication = com.vk.core.apps.a.a;
                } else {
                    galleryFragmentImpl.startActivityForResult(intent, num.intValue());
                }
                return s3q0.a;
            case 10:
                com.vk.im.ui.components.theme_chooser.b bVar = (com.vk.im.ui.components.theme_chooser.b) this.c;
                return new w2t(bVar.i, bVar.k, bVar.m, bVar.n);
            case 11:
                return ((ToolbarRedesignVh) this.c).v;
            case 12:
                qeh qehVar = (qeh) this.c;
                if (qehVar != null) {
                    qehVar.e();
                }
                return s3q0.a;
            case 13:
                Boolean bool = (Boolean) ((mtk0) this.c).getValue();
                bool.booleanValue();
                return bool;
            case 14:
                return ((VkOnboardingComponent) ((isq0) this.c).f.l.a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 15:
                wtq0 wtq0Var = (wtq0) this.c;
                wtq0Var.n.B(new f.e.n(((UserProfileAdapterItem.PromoButtons.a) wtq0Var.m).g));
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((VideoAlbumVh) this.c).e.J().c1());
            case 17:
                VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) this.c;
                int i4 = VideoCatalogFragment.l0;
                return ((VkClientMultiAccountComponent) m7m.d(videoCatalogFragment).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 18:
                return VideoEpisodesFragment.io((VideoEpisodesFragment) this.c);
            case 19:
                return (ucg0) ((VideoItemListSmallVh) this.c).T.getValue();
            case 20:
                return ((VideoMinimizableDiscoveryFragment) this.c).B0;
            case 21:
                return new j9t0(((com.vk.video.profile.presentation.c) this.c).A);
            case 22:
                Context context = (Context) this.c;
                int i5 = VideoSkippablePartView.C;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setId(R.id.video_skippable_parts_row);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(8388693);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388693));
                return linearLayout;
            case 23:
                return new gah0(((ggu0) this.c).b);
            case 24:
                nwy nwyVar = ((BrowserEventsComponent) ((k7m) m7m.f(((ihu0) this.c).j)).a(fpf0.a(BrowserEventsComponent.class))).a;
                qcy<Object> qcyVar = BrowserEventsComponent.c[0];
                return (t9u0) nwyVar.c();
            case 25:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) this.c;
                dateTimePickerState.getClass();
                ((zak0) dateTimePickerState.k).setValue(DateTimePickerState.DialogState.DatePicker.b);
                return s3q0.a;
            case 26:
                return (ma80) this.c;
            case 27:
                VkPayFragment vkPayFragment = (VkPayFragment) this.c;
                int i6 = VkPayFragment.g0;
                return ((VkAnalyticsComponent) m7m.d(vkPayFragment).mo408a(fpf0.a(VkAnalyticsComponent.class))).qc();
            case 28:
                VkTopBar vkTopBar = (VkTopBar) this.c;
                int i7 = VkTopBar.I;
                return Float.valueOf(vkTopBar.getTransformFraction());
            default:
                ((puw0) this.c).C(to90.c.a.b);
                return s3q0.a;
        }
    }
}
