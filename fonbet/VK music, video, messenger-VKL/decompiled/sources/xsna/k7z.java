package xsna;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.container.PagerGridListVh;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;
import com.vk.ecomm.moderation.impl.restrictions.di.ModerationComponentImpl;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonView;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vkontakte.android.R;
import kotlin.Result;
import ru.ok.media.OkmpStreamPublisher;
import xsna.fgo0;
import xsna.rfa0.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class k7z implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k7z(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 stop$lambda$37;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                dw20 dw20Var = ((m7z) obj).b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 1:
                return pw0.c(((ir00) obj).a);
            case 2:
                qcy<Object>[] qcyVarArr = MarketLinkedContentFragment.R;
                return ((BridgeComponent) m7m.d((MarketLinkedContentFragment) obj).a(fpf0.a(BridgeComponent.class))).ob();
            case 3:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e.c((com.vk.newsfeed.posting.market_picker.presentation.base.view.e) obj);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((MiniPlayerControllersWrapper) obj).w);
            case 5:
                return new z330(((ModerationComponentImpl) obj).a);
            case 6:
                return Integer.valueOf(e3m.d(R.attr.im_msg_box_margin_start_with_avatar, ((MsgSkeletonView.c) obj).itemView.getContext()));
            case 7:
                uo40 uo40Var = (uo40) obj;
                return new jba(new wba(), uo40Var.z0(), uo40Var.A0());
            case 8:
                ro50 ro50Var = (ro50) obj;
                ro50Var.j.setAdapter(ro50Var.o);
                ro50Var.w.un();
                return null;
            case 9:
                return (StoryViewerComponent) ((k7m) m7m.f((fa60) obj)).a(fpf0.a(StoryViewerComponent.class));
            case 10:
                return (ehv) ((mo60) obj).p.b;
            case 11:
                qcy<Object>[] qcyVarArr2 = NewsfeedSearchFragment.p0;
                return ((NewsfeedSearchFragment) obj).getActivity();
            case 12:
                int i2 = NotificationListFragment.a0;
                return ((MarketComponent) m7m.d((NotificationListFragment) obj).a(fpf0.a(MarketComponent.class))).Ob();
            case 13:
                stop$lambda$37 = OkmpStreamPublisher.stop$lambda$37((OkmpStreamPublisher) obj);
                return stop$lambda$37;
            case 14:
                gp80 gp80Var = (gp80) obj;
                return new og00(gp80Var.a, gp80Var.b);
            case 15:
                return ((nr80) obj).i.invoke();
            case 16:
                return new pco(q6x.z(fgo0.f, fgo0.g, ((fgo0.b) obj).a()));
            case 17:
                RecyclerView recyclerView = ((PagerGridListVh) obj).m;
                return (recyclerView != null ? recyclerView : null).getContext();
            case 18:
                return (FrescoImageView) ((u2a0) obj).itemView.findViewById(R.id.video_preview);
            case 19:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) obj;
                int i3 = PhotoFlowFragment.m0;
                return new b8a0(photoFlowFragment.go(), (f8a0) photoFlowFragment.T.getValue(), new h630(photoFlowFragment, 14));
            case 20:
                return ((rfa0) obj).new h();
            case 21:
                ueb0 ueb0Var = (ueb0) obj;
                ghp0 ghp0Var = ueb0Var.a;
                if (ghp0Var == null) {
                    ghp0Var = null;
                }
                ghp0 ghp0Var2 = ueb0Var.b;
                if (ghp0Var2 == null) {
                    ghp0Var2 = null;
                }
                ghp0 ghp0Var3 = ueb0Var.c;
                return e43.l(ghp0Var, ghp0Var2, ghp0Var3 != null ? ghp0Var3 : null);
            case 22:
                int i4 = PodcastFragment.m0;
                return ((BridgeComponent) m7m.d((PodcastFragment) obj).a(fpf0.a(BridgeComponent.class))).h8();
            case 23:
                return new gf7((b25) ((com.vk.newsfeed.common.util.j) obj).b.getValue());
            case 24:
                z7c0 z7c0Var = (z7c0) obj;
                z7c0Var.t = z7c0Var.s;
                o1l0 accessibilityListener = z7c0Var.getAccessibilityListener();
                if (accessibilityListener != null) {
                    ((kdl0) accessibilityListener).a(z7c0Var);
                }
                return s3q0.a;
            case 25:
                PostViewFragment postViewFragment = (PostViewFragment) obj;
                String[] strArr = PostViewFragment.T0;
                Bundle arguments = postViewFragment.getArguments();
                if (arguments == null || !arguments.getBoolean("is_time_spent_tracker_enabled", false)) {
                    return null;
                }
                return new PostViewFragmentTimeSpentTracker(new lw20(postViewFragment, 20));
            case 26:
                return ((UserProfileComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.presenters.b) obj)).mo408a(fpf0.a(UserProfileComponent.class))).m3();
            case 27:
                int i5 = PostingFragment.L0;
                return (tkx) ((Posting2Component) ((k7m) m7m.f((PostingFragment) obj)).mo408a(fpf0.a(Posting2Component.class))).qd();
            case 28:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((cqc0) obj)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            default:
                lwc0 lwc0Var = ((pvc0) obj).f;
                return new Result(lwc0Var.a.f(new vxf0(), new gjj0(lwc0Var.b)));
        }
    }
}
