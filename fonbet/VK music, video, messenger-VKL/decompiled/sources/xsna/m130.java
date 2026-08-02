package xsna;

import androidx.fragment.app.Fragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.datepicker.api.di.DatePickerComponent;
import com.vk.dto.common.Peer;
import com.vk.dzenarticle.api.DzenArticleComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.views.clips.NewsFeedControlsLayout;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.posting.presentation.model.PickerRootParams;
import com.vk.posting.presentation.root.PickerRootFragment;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.story.api.di.StoriesComponent;
import com.vk.video.playlist.playlistscreen.PlaylistScreenArgs;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicReference;
import xsna.mbc0;
import xsna.mih0;
import xsna.pn60;
import xsna.pr50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m130 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m130(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        f2d0 f2d0Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = ModalPostReactionsFragment.f0;
                Fragment parentFragment = ((ModalPostReactionsFragment) obj).getParentFragment();
                FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                if (fragmentImpl != null) {
                    fragmentImpl.a0();
                }
                return s3q0.a;
            case 1:
                return x330.c((x330) obj);
            case 2:
                return Integer.valueOf(((hk30) obj).f());
            case 3:
                return ((jl30) obj).b.a(OpenMessagesHistoryReporter.Span.LOADER_SPINNER);
            case 4:
                long j = ((kz30) obj).e;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return Peer.a.b(j);
            case 5:
                ((g440) obj).ik();
                return s3q0.a;
            case 6:
                return ((MusicCatalogRootVh) obj).t;
            case 7:
                MusicSearchCatalogRootVh musicSearchCatalogRootVh = (MusicSearchCatalogRootVh) obj;
                bpn0 bpn0Var = o25.a;
                return new jyh0(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c(), (yp70) musicSearchCatalogRootVh.w.getValue());
            case 8:
                cjx cjxVar = ((pr50) obj).E;
                return new pr50.a(cjxVar != null ? cjxVar : null);
            case 9:
                int i3 = NewsFeedControlsLayout.D;
                return (VkBlurView) ((NewsFeedControlsLayout) obj).findViewById(R.id.feed_carousel_product_market_control_blur);
            case 10:
                return (DzenArticleComponent) ((mo60) obj).c().a(fpf0.a(DzenArticleComponent.class));
            case 11:
                ct60 ct60Var = (ct60) obj;
                return new rw60(ct60Var.y, ct60Var.a, (AtomicReference) ct60Var.c.a.b);
            case 12:
                b2r b2rVar = ((a880) obj).h;
                if (b2rVar != null) {
                    b2rVar.n();
                }
                return s3q0.a;
            case 13:
                return new bhg(((im90) obj).b.Mb());
            case 14:
                return ((com.vk.photos.root.photoflow.presentation.j) obj).l.getRecyclerView();
            case 15:
                return ((StoriesComponent) ((k7m) m7m.f((oba0) obj)).a(fpf0.a(StoriesComponent.class))).eb();
            case 16:
                int i4 = PhotosRootFragment.X;
                return ((UserProfileComponent) ((k7m) m7m.f((PhotosRootFragment) obj)).mo408a(fpf0.a(UserProfileComponent.class))).g3();
            case 17:
                int i5 = PickerRootFragment.W;
                return (PickerRootParams) ((PickerRootFragment) obj).requireArguments().getParcelable("params_picker_id");
            case 18:
                q1s0 q1s0Var = ((mwa0) obj).f;
                if (q1s0Var == null || (f2d0Var = q1s0Var.b) == null) {
                    return null;
                }
                return f2d0Var.d;
            case 19:
                ((mih0.l.a) obj).getClass();
                return new BaseBadgeHolder.a.C0709a(R.drawable.vk_icon_chevron_down_small_12, R.attr.vk_ui_icon_contrast);
            case 20:
                PlaylistScreenArgs playlistScreenArgs = ((PlaylistScreenFragmentInternalComponent) obj).a.a;
                return new PlaylistScreenState(playlistScreenArgs.b, playlistScreenArgs.c, null, playlistScreenArgs.d, null, null, false, false, null, null, null, 2036, null);
            case 21:
                return (NewsFeedComponent) ((k7m) m7m.f((y1c0) obj)).a(fpf0.a(NewsFeedComponent.class));
            case 22:
                return ((y8c0) obj).A;
            case 23:
                return new mbc0.e((mbc0) obj);
            case 24:
                return ((BridgeComponent) ((k7m) m7m.f((ikc0) obj)).a(fpf0.a(BridgeComponent.class))).t();
            case 25:
                return ((DatePickerComponent) ((k7m) m7m.f((dmc0) obj)).mo408a(fpf0.a(DatePickerComponent.class))).u0();
            case 26:
                PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) obj;
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) postsFromNotificationsFragment.eo().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0());
                postsFromNotificationsFragment.P = qn60Var;
                pn60 pn60Var = new pn60(new pn60.a((s1c0) postsFromNotificationsFragment.R.getValue(), postsFromNotificationsFragment.go().get(), postsFromNotificationsFragment.go().get()), postsFromNotificationsFragment.eo().b);
                postsFromNotificationsFragment.Q = pn60Var;
                rn60.a(qn60Var);
                PostsFromNotificationsFragment.d dVar = new PostsFromNotificationsFragment.d(postsFromNotificationsFragment.go());
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar2 = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) dVar);
                return new zvc0(new lwc0(qn60Var, pn60Var, eh60Var, new s1v(), postsFromNotificationsFragment.eo().a, new AtomicReference(new wn60((byte) 0)), new f870(new sa30()), (muc0) postsFromNotificationsFragment.N.getValue(), cVar2, new lvc0(new iwc0(), new svc0(), new evc0(), 0), fs60.a(qn60Var, pn60Var, cVar2, postsFromNotificationsFragment.eo().a)));
            case 27:
                return Boolean.valueOf(((a4d0) obj).J.g);
            case 28:
                qcy<Object>[] qcyVarArr2 = cfd0.q1;
                return (BridgeComponent) m7m.d((cfd0) obj).a(fpf0.a(BridgeComponent.class));
            default:
                return ((MarketComponent) ((k7m) m7m.f((nnd0) obj)).a(fpf0.a(MarketComponent.class))).Ob();
        }
    }
}
