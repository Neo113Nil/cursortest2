package xsna;

import android.graphics.Path;
import android.view.ViewGroup;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateVh;
import com.vk.catalog2.feature.music.holders.MusicKidsCatalogVh;
import com.vk.catalog2.feature.music.holders.view.a;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.reporters.api.util.PerformanceReporters;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonViewRedesign;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.di.PostingSettingsComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent;
import com.vk.utils.vectordrawable.internal.element.PathElement;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import ru.ok.media.OkmpStreamPublisher;
import xsna.htd0;
import xsna.k840;
import xsna.m760.a;
import xsna.rfa0.d;
import xsna.tc60;
import xsna.tw90;
import xsna.xh60;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a040 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a040(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 pause$lambda$27;
        Path path_delegate$lambda$0;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Integer.valueOf(e3m.d(R.attr.im_msg_box_margin_start_no_avatar, ((MsgSkeletonViewRedesign.c) obj).itemView.getContext()));
            case 1:
                return new a.b(k840.a.h() ? R.string.music_offline_mode_kids_error_description : R.string.music_offline_mode_error_description, new wcj((MusicCatalogErrorRedesignedStateVh) obj, 25));
            case 2:
                return ((BridgeComponent) ((k7m) m7m.f((MusicKidsCatalogVh) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 3:
                int i2 = MusicOfflineCatalogFragment.X;
                return ((VkClientMultiAccountComponent) m7m.d((MusicOfflineCatalogFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 4:
                return m33.a(R.drawable.vk_icon_illustration_disclaimer_energy_drinks_360w, ((bv50) obj).b.getContext());
            case 5:
                m760 m760Var = (m760) obj;
                int i3 = m760.A;
                return ((JsAdsDelegateComponent) m7m.d(m760Var).a(fpf0.a(JsAdsDelegateComponent.class))).C5().a(new af50(m760Var, 3), new cfl(m760Var, 28), m760Var.new a());
            case 6:
                return ((VoipStereoRouterComponent) ((k7m) m7m.f((fa60) obj)).a(fpf0.a(VoipStereoRouterComponent.class))).a();
            case 7:
                return new tc60.b((tc60) obj);
            case 8:
                return ((NewsfeedCustomFragment2) obj).Z;
            case 9:
                wg60 wg60Var = ((sg60) obj).j;
                return new Result(wg60Var.b.f(new txf0(), new kjj0(wg60Var.c)));
            case 10:
                yj60 yj60Var = (yj60) obj;
                yj60Var.h.m("Display fresh news button");
                yj60Var.c(new xh60.b.a(true));
                return s3q0.a;
            case 11:
                pause$lambda$27 = OkmpStreamPublisher.pause$lambda$27((OkmpStreamPublisher) obj);
                return pause$lambda$27;
            case 12:
                return Integer.valueOf(((hh80) obj).c.size());
            case 13:
                path_delegate$lambda$0 = PathElement.path_delegate$lambda$0((PathElement) obj);
                return path_delegate$lambda$0;
            case 14:
                int i4 = tw90.a.$EnumSwitchMapping$0[((PerformanceReporters.ChatType) ((f5) obj).invoke()).ordinal()];
                if (i4 == 1) {
                    return ReporterType.CHAT;
                }
                if (i4 == 2) {
                    return ReporterType.GROUP_CHAT;
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                int i5 = PhotoFlowFragment.m0;
                return ((PhotoFlowFragment) obj).fo().Od();
            case 16:
                return ((rfa0) obj).new d();
            case 17:
                PinDotsView pinDotsView = ((mma0) obj).r;
                (pinDotsView != null ? pinDotsView : null).a();
                return s3q0.a;
            case 18:
                PodcastFragment podcastFragment = (PodcastFragment) obj;
                int i6 = PodcastFragment.m0;
                bpn0 bpn0Var = lyd.d;
                ((fl4) (bpn0Var != null ? bpn0Var : null).getValue()).N(podcastFragment.kn());
                return s3q0.a;
            case 19:
                return (SharingComponent) ((k7m) m7m.f((vmb0) obj)).a(fpf0.a(SharingComponent.class));
            case 20:
                return (ViewGroup) ((hpb0) obj).g(R.id.poll_toolbar);
            case 21:
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.impl.presenters.b) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 22:
                int i7 = PostingFragment.L0;
                return ((PostingSettingsComponent) ((k7m) m7m.f((PostingFragment) obj)).mo408a(fpf0.a(PostingSettingsComponent.class))).u0();
            case 23:
                return ((BridgeComponent) ((k7m) m7m.f((pgc0) obj)).a(fpf0.a(BridgeComponent.class))).t().b();
            case 24:
                return ((PhotoEditorComponent) ((k7m) m7m.f((rhc0) obj)).a(fpf0.a(PhotoEditorComponent.class))).k4();
            case 25:
                sbc0 sbc0Var = ((ikc0) obj).x;
                return Integer.valueOf((sbc0Var != null ? sbc0Var : null).R);
            case 26:
                ((enc0) obj).U.invoke(new PostingAction.MediaPicker.SheetTransition(MediaPickerState.SheetState.Hidden));
                return s3q0.a;
            case 27:
                return new uvc0(((lwc0) obj).h.b, ur60.h);
            case 28:
                return ((MarketComponent) ((zqd0) obj).b.getValue()).Ob();
            default:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj;
                int i8 = ProductsSelectionBottomSheet.u1;
                htd0.h hVar = htd0.h.b;
                productsSelectionBottomSheet.getClass();
                xn50.a.c(productsSelectionBottomSheet, hVar);
                return s3q0.a;
        }
    }
}
