package xsna;

import android.view.View;
import com.unity3d.ads.core.domain.events.MaxAdRevenueCommunicatorProxyFactory;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchOwnerVideosCatalogRootVh;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.dto.Push;
import com.vk.dto.attaches.CarouselRatio;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stickers.keyboard.StickersView;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import xsna.nyd0.n;
import xsna.tzp0;
import xsna.wed0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hj60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hj60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        q0c q0cVar;
        MaxAdRevenueCommunicatorProxyFactory initialize$lambda$220$lambda$150;
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return ((NewsfeedFragment) obj).fo();
            case 1:
                mo60 mo60Var = (mo60) obj;
                return new mrp(mo60Var.k, mo60Var.j, mo60Var.J);
            case 2:
                d070 d070Var = (d070) obj;
                return new ftl0(new q8(d070Var, 8), ((StoriesComponent) d070Var.d.getValue()).w());
            case 3:
                vx6 vx6Var = (vx6) obj;
                if (vx6Var != null && (q0cVar = (q0c) ((r0c) vx6Var.c).a) != null) {
                    q0cVar.e();
                }
                return s3q0.a;
            case 4:
                Push push = (Push) obj;
                if (ine0.g(push)) {
                    ine0.p(push, null);
                }
                return s3q0.a;
            case 5:
                int i2 = PaginatedFriendsListFragment.p0;
                return ((PaginatedFriendsListFragment) obj).po();
            case 6:
                return ((PlaylistScreenFragmentInternalComponent) obj).h.O();
            case 7:
                tzp0.c.a aVar = PollEditorModalBottomSheet.o1;
                ModalBottomSheetBehavior<?> bo = ((PollEditorModalBottomSheet) obj).bo();
                if (bo != null) {
                    bo.O(3);
                }
                return s3q0.a;
            case 8:
                return ((UserProfileComponent) ((k7m) m7m.f((xzb0) obj)).mo408a(fpf0.a(UserProfileComponent.class))).m3();
            case 9:
                return (BridgeComponent) ((k7m) m7m.f((y1c0) obj)).a(fpf0.a(BridgeComponent.class));
            case 10:
                int i3 = PostFragment.S0;
                return ((AudioModelsComponent) m7m.d((PostFragment) obj).a(fpf0.a(AudioModelsComponent.class))).r();
            case 11:
                int i4 = PostingFragment.L0;
                return (ibc0) ((PostingFragment) obj).s0.getValue();
            case 12:
                return ((ClipsUploadVkComponent) ((k7m) m7m.f((ikc0) obj)).a(fpf0.a(ClipsUploadVkComponent.class))).Uc();
            case 13:
                PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) obj;
                return new uq60(postsFromNotificationsFragment, postsFromNotificationsFragment.W, postsFromNotificationsFragment.eo().a.Y, postsFromNotificationsFragment.eo().f);
            case 14:
                jg8 jg8Var = (jg8) obj;
                hpt0 hpt0Var = (hpt0) jg8Var.b;
                CarouselRatio carouselRatio = (CarouselRatio) jg8Var.c;
                hpt0Var.getClass();
                return new s3d0(carouselRatio.b, carouselRatio.c);
            case 15:
                qcy<Object>[] qcyVarArr2 = cfd0.q1;
                ((afd0) obj).C(new wed0.a(null));
                return s3q0.a;
            case 16:
                nnd0 nnd0Var = (nnd0) obj;
                nbf0 nbf0Var = nnd0Var.H;
                if (nbf0Var != null) {
                    nbf0Var.c = null;
                }
                nnd0Var.R6().submitList(null, new d0(nnd0Var, 9));
                return s3q0.a;
            case 17:
                return ((nyd0) obj).new n();
            case 18:
                PublishState publishState = (PublishState) obj;
                if (!publishState.N && !publishState.O && !publishState.P) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                return Integer.valueOf(((ewh) obj).b.size());
            case 20:
                ((View) obj).performClick();
                return s3q0.a;
            case 21:
                frf0.d((SchemeStatSak$EventScreen) obj, null, null, 8);
                return s3q0.a;
            case 22:
                return (AudienceResearchComponent) ((k7m) m7m.f((smh0) obj)).a(fpf0.a(AudienceResearchComponent.class));
            case 23:
                return ((SearchOwnerVideosCatalogRootVh) obj).t;
            case 24:
                int i5 = yhi0.f1;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.B0.m().a.d0();
                ((yhi0) obj).tn();
                return s3q0.a;
            case 25:
                initialize$lambda$220$lambda$150 = ServiceProvider.initialize$lambda$220$lambda$150((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$150;
            case 26:
                o4j0 o4j0Var = (o4j0) obj;
                wh50 wh50Var = o4j0Var.d;
                if (((mxj0) ((zak0) wh50Var).getValue()).a == 9205357640488583168L || mxj0.d(((mxj0) ((zak0) wh50Var).getValue()).a)) {
                    return null;
                }
                return o4j0Var.b.c(((mxj0) ((zak0) wh50Var).getValue()).a);
            case 27:
                int i6 = StickersDatabase_Impl.B;
                return new gtq((StickersDatabase_Impl) obj);
            case 28:
                ((StickersView) obj).g.K();
                return s3q0.a;
            default:
                int i7 = StoryArchiveFragment.h0;
                return ((NarrativeComponent) ((k7m) m7m.f((StoryArchiveFragment) obj)).a(fpf0.a(NarrativeComponent.class))).h3();
        }
    }
}
