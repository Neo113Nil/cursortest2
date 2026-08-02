package xsna;

import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.ads.easypromote.impl.domain.model.FaqSource;
import com.vk.ads.easypromote.impl.presentation.b;
import com.vk.core.ui.modal.VkModal;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.fave.impl.MarketFaveComponentImpl;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingComponentImpl;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.friends.requests.api.di.FriendsRequestsComponent;
import com.vk.friends.requests.api.di.ScreenType;
import com.vk.games.di.GamesFragmentsComponent;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.home.HomeFragment2;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.music.fragment.impl.MusicAddTrackToPlaylistLauncherImpl;
import com.vk.music.view.vkmix.gl.GLShaderId;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import com.vk.toggle.data.FriendCellButtonType;
import com.vk.toggle.data.FriendCellLayout;
import com.vkontakte.android.R;
import java.nio.IntBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.webrtc.Call;
import xsna.c280;
import xsna.hfr;
import xsna.k840;
import xsna.qfa0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class xrj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xrj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Call) obj).isMeInWaitingRoom());
            case 1:
                gik gikVar = (gik) obj;
                uik uikVar = gikVar.n;
                if (uikVar != null) {
                    uikVar.c(false, new myh(gikVar, 3));
                }
                return s3q0.a;
            case 2:
                int i2 = DialogsScreenFragment.p0;
                return Integer.valueOf(((DialogsScreenFragment) obj).requireContext().getColor(R.color.vk_lavender_900));
            case 3:
                agn agnVar = (agn) obj;
                String value = agnVar.a.a(GLShaderId.Vertex).getValue();
                int glCreateShader = GLES20.glCreateShader(35633);
                GLES20.glShaderSource(glCreateShader, value);
                GLES20.glCompileShader(glCreateShader);
                IntBuffer allocate = IntBuffer.allocate(1);
                GLES20.glGetShaderiv(glCreateShader, 35713, allocate);
                if (allocate.get(0) == 0) {
                    Log.e("createShader", GLES20.glGetShaderInfoLog(glCreateShader));
                }
                String value2 = agnVar.a.a(GLShaderId.Main).getValue();
                int glCreateShader2 = GLES20.glCreateShader(35632);
                GLES20.glShaderSource(glCreateShader2, value2);
                GLES20.glCompileShader(glCreateShader2);
                IntBuffer allocate2 = IntBuffer.allocate(1);
                GLES20.glGetShaderiv(glCreateShader2, 35713, allocate2);
                if (allocate2.get(0) == 0) {
                    Log.e("createShader", GLES20.glGetShaderInfoLog(glCreateShader2));
                }
                return new lsj0(glCreateShader, glCreateShader2);
            case 4:
                int i3 = EntriesListFragment.m0;
                return (StoryViewerComponent) m7m.d((EntriesListFragment) obj).a(fpf0.a(StoryViewerComponent.class));
            case 5:
                b.a aVar = com.vk.ads.easypromote.impl.presentation.b.k1;
                Parcelable parcelable = ((com.vk.ads.easypromote.impl.presentation.b) obj).requireArguments().getParcelable("key_faq_source");
                if (parcelable != null) {
                    return (FaqSource) parcelable;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                gzs<s3q0> gzsVar = ((txq) obj).g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 7:
                return (TextView) ((wls) obj).itemView.findViewById(R.id.title);
            case 8:
                FriendsRecommendationsFragment friendsRecommendationsFragment = (FriendsRecommendationsFragment) obj;
                int i4 = FriendsRecommendationsFragment.b0;
                nss nssVar = new nss(epx.f(friendsRecommendationsFragment.V, "authors_rec") ? "authors_search" : com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_SEARCH), MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS, new cis(true, FriendCellLayout.THREE_LINES_COMPACT, FriendCellButtonType.IMAGES, true), true);
                FriendsRequestsComponent friendsRequestsComponent = (FriendsRequestsComponent) m7m.d(friendsRecommendationsFragment).mo408a(fpf0.a(FriendsRequestsComponent.class));
                io.reactivex.rxjava3.disposables.b bVar = friendsRecommendationsFragment.Z;
                njw njwVar = new njw(new bzj(friendsRecommendationsFragment, 11), new rd1(22), new b1j(friendsRecommendationsFragment, 17));
                FragmentActivity kn = friendsRecommendationsFragment.kn();
                Bundle arguments = friendsRecommendationsFragment.getArguments();
                com.vk.friends.recommendations.impl.presentation.a aVar2 = new com.vk.friends.recommendations.impl.presentation.a(friendsRecommendationsFragment, FriendsRequestsComponent.K5(friendsRequestsComponent, nssVar, njwVar, null, kn, bVar, null, (arguments == null || !arguments.getBoolean("show_rec_only", false)) ? ScreenType.ANY : ScreenType.RECOMMENDATIONS, 36));
                aVar2.n0((List) friendsRecommendationsFragment.X.getValue());
                return aVar2;
            case 9:
                ((evs) obj).T(true);
                return s3q0.a;
            case 10:
                int i5 = GamesCatalogFragment.i0;
                return ((GamesFragmentsComponent) m7m.d((GamesCatalogFragment) obj).mo408a(fpf0.a(GamesFragmentsComponent.class))).E();
            case 11:
                return ((piu) obj).findViewById(R.id.invite_button);
            case 12:
                int i6 = HomeFragment2.x0;
                return ((PostingComponent) m7m.d((HomeFragment2) obj).mo408a(fpf0.a(PostingComponent.class))).H6();
            case 13:
                return (ucg0) ((l4w) obj).G.getValue();
            case 14:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.a aVar3 = ((zbx) obj).c;
                if (aVar3 != null) {
                    hfr.a aVar4 = new hfr.a(rli0.j(new jxt0(aVar3.b), rbx.b));
                    while (aVar4.hasNext()) {
                        ((InteractivePollStickerView) aVar4.next()).setVisibility(0);
                    }
                }
                return s3q0.a;
            case 15:
                return ((StoriesComponent) ((k7m) m7m.f((zex) obj)).a(fpf0.a(StoriesComponent.class))).o7();
            case 16:
                return ((MarketComponent) ((k7m) m7m.c((stx) obj)).a(fpf0.a(MarketComponent.class))).l7();
            case 17:
                yfz yfzVar = (yfz) obj;
                BoundingBox boundingBox = yfzVar.a.d;
                boundingBox.getClass();
                float f = 2;
                float F = (boundingBox.F() * f) + (boundingBox.a0() * f);
                BoundingBox boundingBox2 = yfzVar.b.d;
                boundingBox2.getClass();
                return Float.valueOf((boundingBox2.F() * f) + (boundingBox2.a0() * f) + F);
            case 18:
                MarketFaveComponentImpl marketFaveComponentImpl = (MarketFaveComponentImpl) obj;
                p870 w = marketFaveComponentImpl.b.w();
                CartComponent cartComponent = marketFaveComponentImpl.a;
                ssw sswVar = new ssw(w, cartComponent.S3());
                fy9 f8 = cartComponent.f8();
                MarketComponent marketComponent = marketFaveComponentImpl.e;
                return new com.vk.ecomm.fave.impl.a(sswVar, new ny00(f8, marketComponent.Ob(), marketComponent.rc(), marketFaveComponentImpl.c.p(), marketFaveComponentImpl.d.dc()));
            case 19:
                return ((ViewGroup) obj).getContext().getString(R.string.product_tile_ozon_badge_order_by_title);
            case 20:
                return ((VideoSubscriptionComponent) ((k7m) m7m.c((k120) obj)).mo408a(fpf0.a(VideoSubscriptionComponent.class))).g0();
            case 21:
                ((VkModal) obj).a();
                return s3q0.a;
            case 22:
                MusicAddTrackToPlaylistLauncherImpl.a aVar5 = new MusicAddTrackToPlaylistLauncherImpl.a();
                new LinkedHashMap();
                return aVar5;
            case 23:
                return new c1a(k840.a.i, (df5) k840.a.q.getValue(), (b25) ((com.vk.catalog2.feature.music.configuration.b) obj).f0.getValue());
            case 24:
                return ((g850) obj).a.findViewById(R.id.nativeads_rating_icon);
            case 25:
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                return new ww60(new fm20((NewsfeedSearchFragment) obj, 8));
            case 26:
                return new pco(((c280) ((mtk0) obj).getValue()) instanceof c280.c ? 72 : VersionConstants.PRODUCT_MAJOR_VERSION);
            case 27:
                qcy<Object>[] qcyVarArr2 = OnlineBookingComponentImpl.c;
                return new uo80(((OnlineBookingInternalComponent) obj).Df());
            case 28:
                m8a0 m8a0Var = (m8a0) obj;
                int i7 = m8a0.v1;
                return (qfa0.i) m8a0Var.bo().F4().c((UserId) m8a0Var.s1.getValue()).f.getValue();
            default:
                return e2b0.o0(((e2b0) obj).u);
        }
    }
}
