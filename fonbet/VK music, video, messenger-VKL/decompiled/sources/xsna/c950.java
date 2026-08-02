package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.ads.api.di.AdsComponent;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vk.ecomm.market.good.ui.d;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.feed.tool.view.newsfeed.coauthors.CoauthorsTextLayout;
import com.vk.im.chat.api.ChatComponent;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.api.di.PodcastComponent;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsFragmentMvi;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.profile.community.members.impl.ui.MviMembersListFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.translate.impl.models.SelectLanguageInitConfig;
import com.vkontakte.android.R;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.ArrayList;
import kotlin.Lazy;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsView;
import one.video.view.OneVideoPlayerView;
import xsna.a9i0;
import xsna.tmd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c950 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c950(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i3 = MusicSubscriptionControlFragment.a0;
                h3p0.b((MusicSubscriptionControlFragment) obj);
                return s3q0.a;
            case 1:
                int i4 = yc50.x1;
                return (BridgeComponent) m7m.d((yc50) obj).a(fpf0.a(BridgeComponent.class));
            case 2:
                MviMembersListFragment.a aVar = MviMembersListFragment.T;
                return (BridgeComponent) m7m.d((MviMembersListFragment) obj).a(fpf0.a(BridgeComponent.class));
            case 3:
                View view = new View(((yv50) obj).b.getContext());
                view.setId(View.generateViewId());
                view.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_content));
                return view;
            case 4:
                NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment = (NewsEntryFeedbackCommentsFragment) obj;
                TextView textView = newsEntryFeedbackCommentsFragment.Z0;
                if (textView == null) {
                    return null;
                }
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                textView.getContext();
                e.b bVar = new e.b(textView, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                bVar.l = newsEntryFeedbackCommentsFragment.b1;
                return bVar.a();
            case 5:
                return ((AudienceResearchComponent) ((Lazy) obj).getValue()).y7().c();
            case 6:
                return new kdc0(((vz70) obj).b.j);
            case 7:
                ((etv0) obj).setVisible(true);
                return s3q0.a;
            case 8:
                int i5 = OneVideoAdControlsView.A;
                OneVideoAdBaseControls.a listener = ((OneVideoAdControlsView) obj).getListener();
                if (listener != null) {
                    listener.e();
                }
                return s3q0.a;
            case 9:
                return OneVideoPlayerView.a((OneVideoPlayerView) obj);
            case 10:
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                return ((ChatComponent) ((k7m) m7m.f((OrderFragment) obj)).a(fpf0.a(ChatComponent.class))).Cf();
            case 11:
                mc90 mc90Var = (mc90) obj;
                return Integer.valueOf(mc90Var.k.a() ? ((wak0) mc90Var.r).getIntValue() : mc90Var.k());
            case 12:
                ((vh90) obj).f.invoke();
                return s3q0.a;
            case 13:
                int i6 = PodcastEpisodeFragment.u0;
                return ((PodcastComponent) m7m.d((PodcastEpisodeFragment) obj).a(fpf0.a(PodcastComponent.class))).O0();
            case 14:
                ujb0 ujb0Var = (ujb0) obj;
                return (epx.f(ujb0Var.p, "kids_section") ? MusicPlaybackLaunchContext.w : MusicPlaybackLaunchContext.z).Eb(32).Cb(ujb0Var.p);
            case 15:
                return (AdsComponent) ((k7m) m7m.f((xzb0) obj)).mo408a(fpf0.a(AdsComponent.class));
            case 16:
                f1c0 f1c0Var = (f1c0) obj;
                VkDiagonalUserStack vkDiagonalUserStack = f1c0Var.I;
                CoauthorsTextLayout coauthorsTextLayout = f1c0Var.J;
                if (vkDiagonalUserStack != null) {
                    vkDiagonalUserStack.setContentDescription(coauthorsTextLayout.getVisibleText());
                }
                View view2 = f1c0Var.H;
                if (view2 != null) {
                    view2.setContentDescription(coauthorsTextLayout.getVisibleText());
                }
                return s3q0.a;
            case 17:
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.presenters.b) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 18:
                int i7 = PostingFragment.L0;
                return ((VkOnboardingComponent) m7m.d((PostingFragment) obj).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 19:
                int i8 = PostingSettingsFragmentMvi.Y;
                return ((PostingSettingsComponent) ((k7m) m7m.f((PostingSettingsFragmentMvi) obj)).mo408a(fpf0.a(PostingSettingsComponent.class))).u0();
            case 20:
                qcy<Object>[] qcyVarArr2 = PostsFromNotificationsFragment.p0;
                h3p0.b((PostsFromNotificationsFragment) obj);
                return s3q0.a;
            case 21:
                com.vk.ecomm.market.good.ui.e eVar = (com.vk.ecomm.market.good.ui.e) obj;
                d.a aVar2 = eVar.m;
                if (aVar2 != null) {
                    aVar2.a(eVar.b.getContext());
                }
                return s3q0.a;
            case 22:
                return ((StorefrontComponent) ((rkd0) obj).j.getValue()).a();
            case 23:
                ((ml1) obj).invoke(tmd0.d.a);
                return s3q0.a;
            case 24:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((xaf0) obj).p.getRecyclerView().getLayoutManager();
                int v = linearLayoutManager.v();
                int x = linearLayoutManager.x();
                if (v != -1 && x != -1) {
                    i2 = (x - v) + 1;
                }
                return Integer.valueOf(i2);
            case 25:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.REGISTRATION_PASSWORD_ADD, (ArrayList) obj, null, null, 28);
                return s3q0.a;
            case 26:
                return (VkCheckEditText) ((rsf0) obj).c.findViewById(R.id.related_user_pin_input);
            case 27:
                ((d0g0) obj).x();
                return s3q0.a;
            case 28:
                a9i0 a9i0Var = (a9i0) obj;
                a9i0.a aVar3 = a9i0.i1;
                nnp0 nnp0Var = a9i0Var.f1;
                hw3 hw3Var = (nnp0Var == null ? null : nnp0Var).e;
                ofy0 ofy0Var = (nnp0Var == null ? null : nnp0Var).a;
                j43 j43Var = (nnp0Var != null ? nnp0Var : null).f;
                ras rasVar = a9i0Var.h1;
                qcy<Object> qcyVar = a9i0.j1[0];
                return new j9i0(hw3Var, ofy0Var, j43Var, (SelectLanguageInitConfig) rasVar.a(a9i0Var));
            default:
                defaultNativeConfiguration = ((UnityAdsModule) obj).defaultNativeConfiguration();
                return defaultNativeConfiguration;
        }
    }
}
