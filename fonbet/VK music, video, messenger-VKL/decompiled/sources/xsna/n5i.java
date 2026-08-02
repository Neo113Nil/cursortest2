package xsna;

import android.transition.Transition;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.im.ui.fragments.ContactsListFragmentRedesign;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.notifications.di.NotificationsComponent;
import com.vk.settings.impl.presentation.base.fragment.communities.ManageCommunitiesNotificationsFragment;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasStoryAvatarView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vungle.ads.internal.protos.Sdk;
import xsna.a3n;
import xsna.bsm;
import xsna.l310;
import xsna.mms;
import xsna.vjj.a;
import xsna.vvs.b;
import xsna.xey;
import xsna.xn50;
import xsna.y6k.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class n5i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n5i(FragmentImpl fragmentImpl, Transition transition) {
        this.b = 14;
        this.c = fragmentImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        t4p t4pVar;
        ViewGroup.LayoutParams layoutParams;
        ExposedFunction invoke$lambda$18;
        int i = this.b;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                return q5i.X6((q5i) obj);
            case 1:
                int i2 = ContactsListFragmentRedesign.q0;
                ((ContactsListFragmentRedesign) obj).finish();
                return s3q0.a;
            case 2:
                return ((vjj) obj).new a();
            case 3:
                return Integer.valueOf(((mc90) obj).r());
            case 4:
                y6k y6kVar = (y6k) obj;
                return new j7k(y6kVar.i, y6kVar.p, y6kVar.new b());
            case 5:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj).e;
                if (efmVar != null) {
                    efmVar.o(true);
                }
                return s3q0.a;
            case 6:
                return new bsm.g((bsm) obj);
            case 7:
                a3n a3nVar = (a3n) obj;
                a3n.a aVar = a3nVar.b;
                mo60 mo60Var = a3nVar.a;
                return new c3n(aVar, (la60) mo60Var.Q.getValue(), mo60Var.n, a3nVar.d);
            case 8:
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) obj;
                if (BuildInfo.g() || ((t4pVar = hVar.i) != null && !t4pVar.b())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                pop popVar = (pop) obj;
                popVar.zn(0.5f);
                int intValue = ((Number) popVar.G.getValue()).intValue();
                ImageView imageView = popVar.s;
                if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
                    layoutParams.width = intValue;
                    layoutParams.height = intValue;
                }
                ImageView imageView2 = popVar.s;
                if (imageView2 != null) {
                    imageView2.requestLayout();
                }
                return s3q0.a;
            case 10:
                ((zak0) ((c9q) obj).c).setValue(Boolean.FALSE);
                return s3q0.a;
            case 11:
                return "Session aggregator " + ((xti0) obj) + " already exists";
            case 12:
                return m33.a(R.drawable.vk_icon_donut_color_16, ((com.vk.newsfeed.common.recycler.holders.a) obj).itemView.getContext());
            case 13:
                return ((NewsFeedComponent) ((k7m) m7m.c(((f6s) obj).G)).a(fpf0.a(NewsFeedComponent.class))).X5();
            case 14:
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                fragmentImpl.x = false;
                if (fragmentImpl.isVisible()) {
                    fragmentImpl.Vn();
                }
                return s3q0.a;
            case 15:
                ((tms) obj).a.a(new mms.b(false));
                return s3q0.a;
            case 16:
                int i3 = FriendsSelectionFragment.w0;
                Object obj2 = ((FriendsSelectionFragment) obj).h0;
                ((md6) (obj2 != null ? obj2 : null)).g();
                return s3q0.a;
            case 17:
                int i4 = vvs.C;
                return new fdf0(((vvs) obj).new b(), 6);
            case 18:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                h3p0.b((GeoPostsFragment) obj);
                return s3q0.a;
            case 19:
                return ((y4u) obj).n.p();
            case 20:
                ((g8u) obj).n.c();
                return s3q0.a;
            case 21:
                int i5 = GroupedNotificationsFragment.f0;
                return ((NotificationsComponent) ((k7m) m7m.f((GroupedNotificationsFragment) obj)).a(fpf0.a(NotificationsComponent.class))).b();
            case 22:
                invoke$lambda$18 = HandleInvocationsFromAdViewer.invoke$lambda$18((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$18;
            case 23:
                m5v m5vVar = (m5v) obj;
                m5vVar.q.b(NarrativePublishEventType.SHARE_NARRATIVE, m5vVar.p, m5vVar.q6());
                kbj0.e(nr4.b(), m5vVar.itemView.getContext(), new NarrativeAttachment(m5vVar.q6()), false, null, false, null, 60);
                return s3q0.a;
            case 24:
                IdeasStoryAvatarView ideasStoryAvatarView = (IdeasStoryAvatarView) obj;
                int i6 = IdeasStoryAvatarView.g;
                return new lsv(ideasStoryAvatarView.b, ideasStoryAvatarView.c, ((StickersComponent) ((k7m) m7m.c(ideasStoryAvatarView)).a(fpf0.a(StickersComponent.class))).zc(), ((StoriesComponent) ((k7m) m7m.c(ideasStoryAvatarView)).a(fpf0.a(StoriesComponent.class))).t0());
            case 25:
                mbx mbxVar = (mbx) obj;
                mbxVar.b();
                mbxVar.c(R.attr.vk_ui_icon_positive, R.drawable.vk_icon_check_circle_outline_24, R.string.story_opinion_sent, iah0.a(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE), mbxVar.a.getView());
                return s3q0.a;
            case 26:
                ((xey) obj).G(xey.d.b);
                return s3q0.a;
            case 27:
                VideoFile currentVideoFile = ((LiveVideoDialog) obj).i0.getCurrentVideoFile();
                if (currentVideoFile == null) {
                    return null;
                }
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                return b.C1208b.a().e(currentVideoFile, null);
            case 28:
                int i7 = ManageCommunitiesNotificationsFragment.S;
                return ((BridgeComponent) ((k7m) m7m.f((ManageCommunitiesNotificationsFragment) obj)).a(fpf0.a(BridgeComponent.class))).s();
            default:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj;
                int i8 = MarketItemReviewsFragment.w0;
                l310.f fVar = l310.f.b;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, fVar);
                return s3q0.a;
        }
    }

    public /* synthetic */ n5i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
