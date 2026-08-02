package xsna;

import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.coowners.di.NewsfeedCoownersComponent;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.fave.di.FaveComponent;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.settings.PostingSettingsFragment;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent;
import com.vk.push.rustore.impl.di.RuStoreComponentImpl;
import com.vk.stories.StoriesFilterListFragment;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.voip.ui.permissions.PictureInPicturePermissionFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.m5u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class su80 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ su80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ovj defaultDispatcher;
        GetInitializationRequestPayload initialize$lambda$220$lambda$102;
        int i = this.b;
        Object obj = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = OrderFragment.Y;
                return (CartComponent) ((k7m) m7m.f((OrderFragment) obj2)).a(fpf0.a(CartComponent.class));
            case 1:
                ((c290) obj2).e = null;
                return s3q0.a;
            case 2:
                int i2 = PhotoFlowFragment.m0;
                return ((NewsFeedComponent) m7m.d((PhotoFlowFragment) obj2).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 3:
                PictureInPicturePermissionFragment pictureInPicturePermissionFragment = (PictureInPicturePermissionFragment) obj2;
                int i3 = PictureInPicturePermissionFragment.S;
                pictureInPicturePermissionFragment.startActivityForResult(new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS", Uri.parse("package:" + pictureInPicturePermissionFragment.requireContext().getPackageName())), 60091);
                pictureInPicturePermissionFragment.R = true;
                return s3q0.a;
            case 4:
                int i4 = PodcastEpisodeFragment.u0;
                return ((BridgeComponent) m7m.d((PodcastEpisodeFragment) obj2).a(fpf0.a(BridgeComponent.class))).F();
            case 5:
                return ((rhb0) obj2).itemView.findViewById(R.id.audio_menu);
            case 6:
                return (ThumbsImageView) ((ujb0) obj2).itemView.findViewById(R.id.audio_image);
            case 7:
                return ((NewsFeedComponent) ((k7m) m7m.f((xzb0) obj2)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 8:
                return ((NewsfeedCoownersComponent) ((k7m) m7m.f((f1c0) obj2)).a(fpf0.a(NewsfeedCoownersComponent.class))).a();
            case 9:
                int i5 = PostingFragment.L0;
                return ((CreationOnboardingComponent) ((k7m) m7m.f((PostingFragment) obj2)).mo408a(fpf0.a(CreationOnboardingComponent.class))).Zd();
            case 10:
                xlc0 xlc0Var = ((PostingSettingsFragment) obj2).T;
                if (xlc0Var != null) {
                    xlc0Var.j = null;
                    PostingSettingsFragment postingSettingsFragment = xlc0Var.b;
                    postingSettingsFragment.ko(true);
                    postingSettingsFragment.mo(false);
                    postingSettingsFragment.lo("");
                }
                return s3q0.a;
            case 11:
                return ((CommunityComponent) ((rkd0) obj2).g.getValue()).ke();
            case 12:
                ((lbe) obj2).invoke(m5u.c.b);
                return s3q0.a;
            case 13:
                q76.d((com.vk.qrcode.c) obj2, null, new xmz(25), 3);
                return s3q0.a;
            case 14:
                return (TextView) ((rsf0) obj2).c.findViewById(R.id.related_user_pin_enter_text_view);
            case 15:
                int i6 = mhg0.l1;
                return ((ReviewsComponent) m7m.d((mhg0) obj2).a(fpf0.a(ReviewsComponent.class))).Md();
            case 16:
                RuStoreComponentImpl ruStoreComponentImpl = (RuStoreComponentImpl) obj2;
                qcy<Object>[] qcyVarArr2 = RuStoreComponentImpl.f;
                return new jrg0(ruStoreComponentImpl.se(), ruStoreComponentImpl.Ma());
            case 17:
                defaultDispatcher = ((UnityAdsModule) obj2).defaultDispatcher();
                return defaultDispatcher;
            case 18:
                initialize$lambda$220$lambda$102 = ServiceProvider.initialize$lambda$220$lambda$102((ServicesRegistry) obj2);
                return initialize$lambda$220$lambda$102;
            case 19:
                return ((com.vk.sharing.core.view.f) obj2).findViewById(R.id.layout_sharing_footer_disabled_hint);
            case 20:
                return Boolean.valueOf(((clj0) obj2).c.h());
            case 21:
                StickerStockItemWithStickerId stickerStockItemWithStickerId = (StickerStockItemWithStickerId) obj2;
                Iterator<T> it = stickerStockItemWithStickerId.b.g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((StickerItem) next).b == stickerStockItemWithStickerId.c) {
                            obj = next;
                        }
                    }
                }
                StickerItem stickerItem = (StickerItem) obj;
                if (stickerItem != null) {
                    return stickerItem;
                }
                return new StickerItem(stickerStockItemWithStickerId.c, stickerStockItemWithStickerId.b.b, null, null, null, null, false, null, null, null, 1020, null);
            case 22:
                return ((CommonEditorComponent) ((k7m) m7m.f((nbl0) obj2)).a(fpf0.a(CommonEditorComponent.class))).W3();
            case 23:
                return (BridgeComponent) ((k7m) m7m.c((jfl0) obj2)).a(fpf0.a(BridgeComponent.class));
            case 24:
                return ((FaveComponent) ((k7m) m7m.f((wjl0) obj2)).mo408a(fpf0.a(FaveComponent.class))).S8();
            case 25:
                ((arl0) obj2).x.clear();
                return s3q0.a;
            case 26:
                int i7 = StoriesFilterListFragment.T0;
                ((StoriesFilterListFragment) obj2).finish();
                return s3q0.a;
            case 27:
                return StoryAvatarView.f1((StoryAvatarView) obj2);
            case 28:
                ((xmm0) obj2).a.v0(true, (r3 & 2) != 0, false);
                return s3q0.a;
            default:
                return ((SuggestedPostsFragment) obj2).b0;
        }
    }
}
