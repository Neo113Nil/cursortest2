package xsna;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audiomsg.player.service.AudioMsgPlayerNotificationService;
import com.vk.audiomsg.player.service.AudioMsgPlayerNotificationService.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.domain.model.PinLockLogoutReason;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponentImpl;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.ui.BookingNavHostFragment;
import com.vk.ecomm.product_list.di.ProductListComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.msg.BombView;
import com.vk.mytarget.AdsSdkComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vkontakte.android.R;
import xsna.ig3;
import xsna.ihd;
import xsna.xn50;
import xsna.y7f.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class yc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((zc) obj).x.invoke();
                return Boolean.TRUE;
            case 1:
                ((w01) obj).b.a(xz0.b);
                return s3q0.a;
            case 2:
                int i2 = AlbumDetailsFragment.p0;
                return ((NewsFeedBridgeComponent) m7m.d((AlbumDetailsFragment) obj).a(fpf0.a(NewsFeedBridgeComponent.class))).Ad();
            case 3:
                return Boolean.valueOf((((wv70) obj).a() & 9223372034707292159L) != 9205357640488583168L);
            case 4:
                ArchiveFragment archiveFragment = (ArchiveFragment) obj;
                int i3 = ArchiveFragment.e0;
                ig3.e.c cVar = ig3.e.c.b;
                archiveFragment.getClass();
                xn50.a.c(archiveFragment, cVar);
                return s3q0.a;
            case 5:
                int i4 = AudioMsgPlayerNotificationService.k;
                return ((AudioMsgPlayerNotificationService) obj).new a();
            case 6:
                AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = (AutoSuggestStickersPopupWindow) obj;
                c5l0 c5l0Var = new c5l0(autoSuggestStickersPopupWindow.b, new jod(autoSuggestStickersPopupWindow.d));
                c5l0Var.b.setMenuListener(new com.vk.stickers.autosuggest.b(autoSuggestStickersPopupWindow.b, c5l0Var, autoSuggestStickersPopupWindow.e, autoSuggestStickersPopupWindow.d, autoSuggestStickersPopupWindow.o, new hd(autoSuggestStickersPopupWindow, 5), new jk5(autoSuggestStickersPopupWindow)));
                return c5l0Var;
            case 7:
                GradientDrawable gradientDrawable = new GradientDrawable();
                ((com.vk.im.ui.views.avatars.b) obj).getClass();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(dhr0.u.c(R.attr.vk_ui_image_placeholder));
                return gradientDrawable;
            case 8:
                ((r46) obj).D();
                return s3q0.a;
            case 9:
                g1k0 g1k0Var = (g1k0) obj;
                float floatValue = g1k0Var.b.getStart().floatValue();
                float floatValue2 = g1k0Var.b.c().floatValue() - floatValue;
                return Float.valueOf(swe0.f(floatValue2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - floatValue) / floatValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            case 10:
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.i) obj).f.b(new g.a(PinLockLogoutReason.USER_LOGOUT));
                return s3q0.a;
            case 11:
                return new BombView.a(((BombView) obj).d);
            case 12:
                BookingNavHostFragment bookingNavHostFragment = (BookingNavHostFragment) obj;
                int i5 = BookingNavHostFragment.S;
                return new tq7(bookingNavHostFragment, (qdz) bookingNavHostFragment.N.getValue(), ((MarketComponent) ((k7m) m7m.f(bookingNavHostFragment)).a(fpf0.a(MarketComponent.class))).U1(), ((OnlineBookingInternalComponent) bookingNavHostFragment.P.getValue()).Df());
            case 13:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 14:
                return Integer.valueOf((int) ((vak0) ((f12) obj).j).getFloatValue());
            case 15:
                ChatFragment chatFragment = (ChatFragment) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                return new ya20(((ProductListComponent) m7m.d(chatFragment).mo408a(fpf0.a(ProductListComponent.class))).a(), ((MarketComponent) m7m.d(chatFragment).a(fpf0.a(MarketComponent.class))).Ob());
            case 16:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 17:
                x6d x6dVar = (x6d) obj;
                return new e6z(x6dVar.a.getContext(), x6dVar);
            case 18:
                return ((UserProfileComponent) ((k7m) m7m.c((View) obj)).mo408a(fpf0.a(UserProfileComponent.class))).m3();
            case 19:
                cfd cfdVar = (cfd) obj;
                VkTooltip vkTooltip = cfdVar.P0;
                if (vkTooltip != null) {
                    vkTooltip.dismiss();
                }
                if (cfdVar.Q0) {
                    d3m.c(cfdVar.J0, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
            case 20:
                return (VkCellButton) ((ihd.a) obj).l.findViewById(R.id.clips_author_create_channel_btn);
            case 21:
                return ((AdsSdkComponent) ((k7m) m7m.f((ekd) obj)).mo408a(fpf0.a(AdsSdkComponent.class))).P5();
            case 22:
                qcy<Object>[] qcyVarArr = ClipsCoauthorsComponentImpl.d;
                return new nnd((ClipsCoauthorsInternalComponent) obj);
            case 23:
                Integer num = ClipsEditorFragment.W;
                return (ClipsUploadUiVkComponent) m7m.d((ClipsEditorFragment) obj).mo408a(fpf0.a(ClipsUploadUiVkComponent.class));
            case 24:
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                return ((ClipsViewerComponent) ((ClipsGridFragment) obj).a0.getValue()).i6();
            case 25:
                return ((ClipsTemplatesEditorComponent) ((k7m) m7m.f((kke) obj)).a(fpf0.a(ClipsTemplatesEditorComponent.class))).l4();
            case 26:
                return ((BridgeComponent) ((k7m) m7m.f((r5f) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 27:
                y7f y7fVar = (y7f) obj;
                return new j9f(y7fVar.new i(), (n0e) y7fVar.m.getValue());
            case 28:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj;
                String str = ClipsUploadFragmentImpl.a0;
                return new yud(clipsUploadFragmentImpl.requireContext(), m7m.d(clipsUploadFragmentImpl), clipsUploadFragmentImpl.fo().j(), clipsUploadFragmentImpl);
            default:
                return ((BridgeComponent) ((k7m) m7m.f((mlf) obj)).a(fpf0.a(BridgeComponent.class))).x().a();
        }
    }
}
