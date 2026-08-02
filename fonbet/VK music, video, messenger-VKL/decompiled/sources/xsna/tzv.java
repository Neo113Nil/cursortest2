package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.music.analytics.api.di.MusicAnalyticsComponent;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.onepasspromo.impl.OnePassPromoFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.tags.presentation.PhotoTagsFragment;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.location.js.bridge.api.di.JsLocationDelegateComponent;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.UUID;
import xsna.b7d0;
import xsna.b9a0;
import xsna.iax;
import xsna.l310;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class tzv implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tzv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ImContactsListFragment imContactsListFragment = (ImContactsListFragment) obj2;
                AppBarLayout appBarLayout = imContactsListFragment.Y;
                d3m.e(appBarLayout != null ? appBarLayout : null, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new kl2(imContactsListFragment, 3), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return s3q0.a;
            case 1:
                jax jaxVar = (jax) obj2;
                jaxVar.getClass();
                jaxVar.i(iax.a.e.a);
                return s3q0.a;
            case 2:
                return ((StoriesComponent) ((k7m) m7m.f((zex) obj2)).a(fpf0.a(StoriesComponent.class))).bf();
            case 3:
                return new uvp(((v3y) obj2).d);
            case 4:
                l7y l7yVar = (l7y) obj2;
                return ((JsLocationDelegateComponent) x6y.H().a(fpf0.a(JsLocationDelegateComponent.class))).k2().b(l7yVar, new k7y(l7yVar, r1), l7yVar.p);
            case 5:
                int i2 = MarketAllReviewsFragment.d0;
                return ((ReviewsComponent) m7m.d((MarketAllReviewsFragment) obj2).a(fpf0.a(ReviewsComponent.class))).Md();
            case 6:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj2;
                int i3 = MarketItemReviewsFragment.w0;
                l310.q.f fVar = l310.q.f.b;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, fVar);
                return s3q0.a;
            case 7:
                gr10 gr10Var = (gr10) obj2;
                Integer num = gr10Var.g;
                Integer num2 = gr10Var.h;
                if (num == null || num2 == null) {
                    return null;
                }
                Integer num3 = gr10Var.i;
                return (num3 != null ? num3.intValue() : 0) % 180 == 0 ? new Size(num.intValue(), num2.intValue()) : new Size(num2.intValue(), num.intValue());
            case 8:
                return ((VideoSeekComponent) ((k7m) m7m.c((k120) obj2)).mo408a(fpf0.a(VideoSeekComponent.class))).E1();
            case 9:
                ((ViewGroup) obj2).setTranslationY(r3.getHeight());
                return s3q0.a;
            case 10:
                ((zak0) ((az20) obj2).p).setValue(Boolean.TRUE);
                return s3q0.a;
            case 11:
                Context context = ((vo30) obj2).e;
                return Integer.valueOf(e3m.a(R.dimen.msg_content_max_height, context != null ? context : null));
            case 12:
                return ((MusicAnalyticsComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) obj2)).a(fpf0.a(MusicAnalyticsComponent.class))).Bd();
            case 13:
                nrl nrlVar = ((rt40) obj2).p1;
                if (nrlVar != null) {
                    nrlVar.a();
                }
                return s3q0.a;
            case 14:
                return "state=" + ((ry40) obj2);
            case 15:
                int i4 = ck50.k1;
                ((ck50) obj2).getClass();
                return new srm0();
            case 16:
                return ((BridgeComponent) ((k7m) m7m.c((kq50) obj2)).a(fpf0.a(BridgeComponent.class))).a0();
            case 17:
                VkSearchView vkSearchView = ((NewsfeedSearchFragment) obj2).T;
                if (vkSearchView != null) {
                    vkSearchView.d0();
                }
                return s3q0.a;
            case 18:
                ((dw20) obj2).hide();
                return s3q0.a;
            case 19:
                int i5 = OnePassPromoFragment.R;
                return ((UserProfileComponent) m7m.d((OnePassPromoFragment) obj2).mo408a(fpf0.a(UserProfileComponent.class))).M7();
            case 20:
                OnlineBookingInternalComponent.a aVar = OnlineBookingInternalComponent.n;
                return new xm7(((OnlineBookingInternalComponent) obj2).Ef());
            case 21:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).h.b(b9a0.g.a);
                return s3q0.a;
            case 22:
                PhotoTagsFragment photoTagsFragment = (PhotoTagsFragment) obj2;
                int i6 = PhotoTagsFragment.U;
                return ((PhotosComponent) ((k7m) m7m.f(photoTagsFragment)).a(fpf0.a(PhotosComponent.class))).F4().c((UserId) photoTagsFragment.Q.getValue()).f();
            case 23:
                return MusicFeatures.SAVING_PLAYER_STATE.h() ? ((MusicPlaybackQueueComponent) j6i.b(m7m.f((e2b0) obj2), MusicPlaybackQueueComponent.class)).za() : new s370();
            case 24:
                mbb0 mbb0Var = (mbb0) obj2;
                mbb0Var.j.setAdapter(mbb0Var.k);
                qbb0 W0 = mbb0Var.j.W0();
                int i7 = W0.k;
                if (i7 == 0) {
                    i7 = 100;
                }
                W0.tn(0, i7);
                return null;
            case 25:
                return ((h0c0) obj2).f;
            case 26:
                return ((ClipsViewerComponent) ((k7m) m7m.f((y1c0) obj2)).a(fpf0.a(ClipsViewerComponent.class))).d9();
            case 27:
                String[] strArr = PostViewFragment.T0;
                ((PostViewFragment) obj2).s();
                return s3q0.a;
            case 28:
                Bundle bundle = ((rbc0) obj2).a;
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = bundle.getSerializable("screenUniqueId", UUID.class);
                } else {
                    ?? serializable = bundle.getSerializable("screenUniqueId");
                    obj = (UUID) (serializable instanceof UUID ? serializable : null);
                }
                UUID uuid = (UUID) obj;
                return uuid == null ? UUID.randomUUID() : uuid;
            default:
                b7d0 b7d0Var = (b7d0) obj2;
                PollAttachment pollAttachment = (PollAttachment) b7d0Var.C;
                if (pollAttachment != null) {
                    return new b7d0.a(pollAttachment, (p870) b7d0Var.J.getValue());
                }
                return null;
        }
    }
}
