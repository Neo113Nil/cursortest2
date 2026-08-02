package xsna;

import android.view.ViewStub;
import android.widget.TextView;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.uploader.impl.ClipsUploadSdkUploaderComponentBase;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.crop.CropImageView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.profile.CommunityInternalMenu$Companion$MenuItemType;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.friends.impl.di.FeedFriendsComponentImpl;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.video.profile.presentation.a;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.b;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUploaderComponentVkApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.mem;
import xsna.xn50;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class z4f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z4f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        z4h z4hVar;
        int i;
        boolean z;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                xtx0 xtx0Var = (xtx0) this.c;
                xtx0Var.a.a = xtx0Var.a();
                return s3q0.a;
            case 1:
                ClipsUploadSdkUploaderComponentBase clipsUploadSdkUploaderComponentBase = (ClipsUploadSdkUploaderComponentBase) this.c;
                qcy<Object>[] qcyVarArr = ClipsUploadSdkUploaderComponentBase.c;
                return new qbf(((ClipsUploadSdkUploaderComponentVkApp) clipsUploadSdkUploaderComponentBase).k());
            case 2:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) this.c;
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                hh1 hh1Var = new hh1(clipsViewerComponentImpl, 19);
                return new ajd(hh1Var, new vid(new ry0(clipsViewerComponentImpl, 23)), new wid(hh1Var, g620.f().e().m()), clipsViewerComponentImpl.n.s().C());
            case 3:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i2 = ClipsWrapperFragment.Q0;
                return clipsWrapperFragment.io().Lf();
            case 4:
                return ((BridgeComponent) this.c).p();
            case 5:
                ((wlg) this.c).c.invoke(new a.f(false));
                return s3q0.a;
            case 6:
                d4h d4hVar = (d4h) this.c;
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                UserId userId = d4hVar.d.a.c;
                g2h g2hVar = new g2h(userId);
                g2hVar.b = "info";
                g2hVar.h = "more";
                g2hVar.a();
                Set<String> set = p0e0.a;
                if (userId.b < 0) {
                    b.d dVar = new b.d("group_info_click");
                    dVar.b(userId, "group_id");
                    dVar.e();
                }
                d3hVar.c.c();
                return s3q0.a;
            case 7:
                j5h j5hVar = (j5h) this.c;
                if (epx.f((String) ((zak0) j5hVar.t).getValue(), "market_cart") && ((wak0) j5hVar.u).getIntValue() > 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 8:
                return new llh((klh) this.c);
            case 9:
                ExtendedCommunityProfile extendedCommunityProfile = ((CommunityProfileState) ((com.vk.profile.community.impl.ui.profile.a) this.c).h.c).b;
                if (extendedCommunityProfile != null && (z4hVar = extendedCommunityProfile.g2) != null) {
                    if (z4hVar.d == null) {
                        z = z4hVar.c;
                    } else {
                        List<z4h.a> list = z4hVar.a;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator<T> it = list.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                if (((z4h.a) it.next()).g == CommunityInternalMenu$Companion$MenuItemType.REGULAR && (i = i + 1) < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                        z = i < z4hVar.d.intValue();
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 10:
                return ((BridgeComponent) ((k7m) m7m.f((hrh) this.c)).a(fpf0.a(BridgeComponent.class))).t().b();
            case 11:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                int i3 = CommunityReviewsFragment.o0;
                c.r.i iVar = c.r.i.b;
                communityReviewsFragment.getClass();
                xn50.a.c(communityReviewsFragment, iVar);
                return s3q0.a;
            case 12:
                return (TextView) ((c1j) this.c).itemView.findViewById(R.id.voip_room_participant_name);
            case 13:
                ((puj) this.c).x.j(true);
                return Boolean.TRUE;
            case 14:
                CropImageView cropImageView = ((com.vk.avatarpicker.b) this.c).j;
                if (cropImageView != null) {
                    return cropImageView;
                }
                return null;
            case 15:
                mem.a aVar = ((sem) this.c).l;
                if (aVar != null) {
                    mem memVar = mem.this;
                    io.reactivex.rxjava3.disposables.c cVar = memVar.o;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    memVar.o = null;
                }
                return s3q0.a;
            case 16:
                return (ViewStub) ((gfm) this.c).a().findViewById(R.id.dialog_header_edit_container);
            case 17:
                ksm ksmVar = (ksm) this.c;
                return new tkm(ksmVar.a, ksmVar.c, ksmVar.d);
            case 18:
                return ((DiscoverSimilarFeedFragment) this.c).b0;
            case 19:
                VkAuthErrorStatedEditText vkAuthErrorStatedEditText = ((opp) this.c).t;
                return String.valueOf((vkAuthErrorStatedEditText != null ? vkAuthErrorStatedEditText : null).getText());
            case 20:
                return ((FeedFriendsComponentImpl) this.c).a.t().b();
            case 21:
                ror rorVar = (ror) this.c;
                rorVar.requestLayout();
                rorVar.invalidate();
                return s3q0.a;
            case 22:
                return ((NewsFeedComponent) ((k7m) m7m.c(((f6s) this.c).G)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 23:
                ((zak0) ((fxt0) this.c).h).setValue("");
                return s3q0.a;
            case 24:
                return (ButtonsSwipeView) ((ajs) this.c).itemView;
            case 25:
                return ((evs) this.c).y;
            case 26:
                return Boolean.valueOf(((GalleryFragmentImpl) this.c).u0);
            case 27:
                GamesCatalogFragment gamesCatalogFragment = (GamesCatalogFragment) this.c;
                int i4 = GamesCatalogFragment.i0;
                return new ddt(((GamesCatalogComponent) gamesCatalogFragment.X.getValue()).c());
            case 28:
                twt0.b(6, 100L, ((fzt) this.c).i);
                return s3q0.a;
            default:
                kiu kiuVar = ((giu) this.c).w;
                if (kiuVar != null) {
                    return kiuVar.a.a;
                }
                return null;
        }
    }
}
