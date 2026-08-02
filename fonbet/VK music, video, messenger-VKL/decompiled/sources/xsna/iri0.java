package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.user.UserProfileGift;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubFragment;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.api.di.VideoPromoComponent;
import com.vk.libvideo.impl.di.VideoNotificationsPermissionComponentImpl;
import com.vk.libvideo.tooltips.VideoTooltip;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import java.util.HashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b5y0.b;
import xsna.c0s0;
import xsna.g7n0;
import xsna.ypq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class iri0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iri0(VideoTooltip videoTooltip, VideoTooltip.a aVar) {
        this.b = 23;
        this.c = videoTooltip;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        InitializeBoldSDK initialize$lambda$220$lambda$129;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                initialize$lambda$220$lambda$129 = ServiceProvider.initialize$lambda$220$lambda$129((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$129;
            case 1:
                return (FrameLayout) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_header_container);
            case 2:
                ((zvk0) obj).b.a(zwk0.b);
                return s3q0.a;
            case 3:
                ((m9l0) obj).getClass();
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                StickersDatabase.a.b().F().c();
                return s3q0.a;
            case 4:
                int i2 = StickersRouletteFragment.o0;
                ((k7x) obj).invoke();
                return s3q0.a;
            case 5:
                return ((PlayerAnalyticsComponent) ((k7m) m7m.c((jfl0) obj)).a(fpf0.a(PlayerAnalyticsComponent.class))).z7();
            case 6:
                return ((MarketComponent) ((k7m) m7m.f((wjl0) obj)).a(fpf0.a(MarketComponent.class))).C3();
            case 7:
                ((jhm0) obj).getClass();
                return null;
            case 8:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj;
                g7n0.b d = superAppFragment.d0.d();
                if (d != null) {
                    d.g();
                }
                FragmentWithGlobalSearch$TargetAction fragmentWithGlobalSearch$TargetAction = FragmentWithGlobalSearch$TargetAction.HeaderSearchQueryViewClick;
                FragmentActivity activity = superAppFragment.getActivity();
                if (activity != null) {
                    int i3 = SuperAppFragment.a.$EnumSwitchMapping$1[fragmentWithGlobalSearch$TargetAction.ordinal()];
                    q7n0.a().a().f(activity, i3 != 1 ? i3 != 2 ? i3 != 3 ? FragmentWithGlobalSearch$EntryMethod.Unknown : FragmentWithGlobalSearch$EntryMethod.SuperAppScreenQueryView : FragmentWithGlobalSearch$EntryMethod.SuperAppScreenSearchIcon : FragmentWithGlobalSearch$EntryMethod.SuperAppBottomIconLongTap);
                }
                return s3q0.a;
            case 9:
                qcy<Object>[] qcyVarArr = ovn0.m1;
                return ((TabbarSettingsComponent) ((k7m) m7m.f((ovn0) obj)).a(fpf0.a(TabbarSettingsComponent.class))).tf();
            case 10:
                return Boolean.valueOf(!((gho0) obj).C);
            case 11:
                return Boolean.valueOf(((ToolbarRedesignVh) obj).h);
            case 12:
                return ((AuthBridgeComponent) ((dpq0) obj).a.a(fpf0.a(AuthBridgeComponent.class))).s();
            case 13:
                ypq0.b bVar = (ypq0.b) obj;
                View findViewById = bVar.s.findViewById(R.id.ds_internal_cell_right_extra_action_more);
                GiftItem giftItem = (GiftItem) bVar.m;
                if (giftItem != null) {
                    PopupMenu popupMenu = new PopupMenu(bVar.itemView.getContext(), findViewById);
                    UserProfileGift userProfileGift = giftItem.f;
                    if (userProfileGift != null && userProfileGift.h0) {
                        popupMenu.getMenu().add(0, R.string.gifts_of_placeholder, 0, bVar.itemView.getContext().getString(R.string.gifts_of_placeholder, userProfileGift.i0));
                    }
                    if (bVar.n.a()) {
                        popupMenu.getMenu().add(0, R.string.delete, 0, R.string.delete);
                    }
                    popupMenu.setOnMenuItemClickListener(bVar);
                    popupMenu.show();
                }
                return s3q0.a;
            case 14:
                return ((vxq0) obj).p;
            case 15:
                int i4 = VerificationStubFragment.O;
                ((VerificationStubFragment) obj).kn().onBackPressed();
                return s3q0.a;
            case 16:
                c0s0 c0s0Var = (c0s0) obj;
                c0s0.b bVar2 = c0s0Var.i1;
                if (bVar2 != null) {
                    bVar2.b();
                }
                c0s0Var.dismiss();
                return s3q0.a;
            case 17:
                int i5 = VideoCatalogFragment.l0;
                return ((VideoPromoComponent) m7m.d((VideoCatalogFragment) obj).a(fpf0.a(VideoPromoComponent.class))).yf();
            case 18:
                int i6 = VideoCatalogRootVh.M0;
                return ((VideoKidsComponent) ((k7m) m7m.f((VideoCatalogRootVh) obj)).a(fpf0.a(VideoKidsComponent.class))).I4();
            case 19:
                qcy<Object>[] qcyVarArr2 = VideoFileAdapter.l;
                return ((VideoFileAdapter) obj).d().s();
            case 20:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i7 = VideoMinimizableDiscoveryFragment.p1;
                j0a o3 = ((CastComponent) videoMinimizableDiscoveryFragment.ko().e.getValue()).o3();
                videoMinimizableDiscoveryFragment.requireContext();
                return new ffs0(o3.create(), new sus0(videoMinimizableDiscoveryFragment, 1));
            case 21:
                nwy nwyVar = ((VideoNotificationsPermissionComponentImpl) obj).a;
                qcy<Object> qcyVar = VideoNotificationsPermissionComponentImpl.c[0];
                return new wj70((z970) nwyVar.c());
            case 22:
                int i8 = VideoRelatedVideosFragment.n0;
                return (VideoPlaylistReversionComponent) m7m.d((VideoRelatedVideosFragment) obj).a(fpf0.a(VideoPlaylistReversionComponent.class));
            case 23:
                ((VideoTooltip) obj).b.dispose();
                return s3q0.a;
            case 24:
                return ((ggu0) obj).b;
            case 25:
                utj utjVar = (utj) ((Ref$ObjectRef) obj).element;
                if (utjVar != null) {
                    utjVar.b();
                }
                return s3q0.a;
            case 26:
                return (TextView) ((oxw0) obj).findViewById(R.id.error_text);
            case 27:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                final e9z e9zVar = webViewFragment.E0.get(webViewFragment.p0);
                if (e9zVar != null) {
                    final boolean z = e9zVar.c;
                    tmq.a().h(webViewFragment.kn(), e9zVar, null, new wzs() { // from class: xsna.rix0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj2, Object obj3) {
                            int i9 = WebViewFragment.O0;
                            e9z.this.s0(!z);
                            return null;
                        }
                    }, new rfs0(e9zVar, z), true, null, null, null);
                }
                return null;
            default:
                return ((b5y0) obj).new b();
        }
    }

    public /* synthetic */ iri0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
