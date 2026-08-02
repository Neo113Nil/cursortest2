package xsna;

import android.graphics.Paint;
import android.view.View;
import android.widget.LinearLayout;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.method.selector.api.MethodSelectorComponent;
import com.vk.metrics.eventtracking.VkMainTracker;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vk.network.eventhub.api.di.EventHubComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.qr.ui.VoipQrCodeScannerFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.StatGroup;
import xsna.b78;
import xsna.h7u0;
import xsna.j9d0;
import xsna.lne0;
import xsna.nbv0;
import xsna.ncl0;
import xsna.rhw0;
import xsna.shw0;
import xsna.sx40;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class hri0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hri0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        CleanAssets initialize$lambda$220$lambda$95;
        String fullName_delegate$lambda$0;
        int i = 1;
        switch (this.b) {
            case 0:
                initialize$lambda$220$lambda$95 = ServiceProvider.initialize$lambda$220$lambda$95((ServicesRegistry) this.c);
                return initialize$lambda$220$lambda$95;
            case 1:
                fullName_delegate$lambda$0 = StatGroup.fullName_delegate$lambda$0((StatGroup) this.c);
                return fullName_delegate$lambda$0;
            case 2:
                defpackage.s sVar = ((nzk0) this.c).j;
                if (sVar != null) {
                    sVar.invoke(Boolean.FALSE);
                }
                return s3q0.a;
            case 3:
                ncl0 ncl0Var = (ncl0) this.c;
                StringBuilder sb = new StringBuilder("updateOrders: ");
                ArrayList g = zik0.g(ncl0Var.f.h);
                ArrayList arrayList = new ArrayList();
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((StickerStockItem) next).k) {
                        arrayList.add(next);
                    }
                }
                List<StickerStockItem> D0 = j5g.D0(new ncl0.d(), arrayList);
                ArrayList arrayList2 = new ArrayList(c5g.u(D0, 10));
                for (StickerStockItem stickerStockItem : D0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(stickerStockItem.b);
                    sb2.append(':');
                    sb2.append(stickerStockItem.z);
                    arrayList2.add(sb2.toString());
                }
                sb.append(arrayList2);
                return sb.toString();
            case 4:
                StoryStatisticsStickersFragment storyStatisticsStickersFragment = (StoryStatisticsStickersFragment) this.c;
                int i2 = StoryStatisticsStickersFragment.X;
                return ((BridgeComponent) m7m.d(storyStatisticsStickersFragment).a(fpf0.a(BridgeComponent.class))).F();
            case 5:
                return ((plm0) this.c).a();
            case 6:
                return Boolean.valueOf(((ParentBottomSheetState) this.c) == ParentBottomSheetState.EXPANDED);
            case 7:
                return ((EventHubComponent) ((b7o0) this.c).e.getValue()).c9();
            case 8:
                return ((QueueSyncComponent) ((k7m) m7m.f((q9q0) this.c)).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 9:
                return ((UserProfileComponent) ((k7m) m7m.f((mxq0) this.c)).mo408a(fpf0.a(UserProfileComponent.class))).fa();
            case 10:
                UsersDiscoverFragment usersDiscoverFragment = (UsersDiscoverFragment) this.c;
                int i3 = UsersDiscoverFragment.t0;
                return (ProfileFragmentProviderComponent) m7m.d(usersDiscoverFragment).a(fpf0.a(ProfileFragmentProviderComponent.class));
            case 11:
                r9r0 r9r0Var = (r9r0) this.c;
                Paint c = x9.c(true);
                zp5 zp5Var = r9r0Var.c;
                c.setStrokeWidth(zp5Var.a);
                c.setStyle(zp5Var.c);
                zp5Var.b.a(c);
                return c;
            case 12:
                VideoAlbumFragment videoAlbumFragment = (VideoAlbumFragment) this.c;
                if (videoAlbumFragment.d1 != null) {
                    kfc0 kfc0Var = new kfc0(i, videoAlbumFragment);
                    h7u0.a aVar = new h7u0.a(videoAlbumFragment.kn());
                    aVar.g0(R.string.video_alert_title);
                    aVar.U(R.string.video_playlist_confirm_remove);
                    aVar.c0(R.string.delete, kfc0Var);
                    aVar.W(R.string.cancel, null);
                    aVar.m();
                }
                return s3q0.a;
            case 13:
                return ((VideoCatalogRootVh) this.c).k0.b.ck();
            case 14:
                com.vk.video.ui.discovery.minimizable.m mVar = ((VideoMinimizableDiscoveryFragment) this.c).J0;
                if (mVar != null && mVar.j()) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 15:
                ((rzl0) this.c).invoke(zgt0.a);
                return s3q0.a;
            case 16:
                return VideoToolbarView.b((VideoToolbarView) this.c);
            case 17:
                ((b78.i) this.c).a().invoke(new sx40.g0(PlayerContext.MINI));
                return s3q0.a;
            case 18:
                ggu0 ggu0Var = (ggu0) this.c;
                return new tdr0(ggu0Var.c, ggu0Var.e, (wc80) ggu0Var.k.getValue(), ggu0Var, ggu0Var.s(), new iri0(ggu0Var, 24));
            case 19:
                VkFormField vkFormField = (VkFormField) this.c;
                List<Class<? extends View>> list = VkFormField.C;
                View childAt = vkFormField.getChildAt(0);
                LinearLayout linearLayout = childAt instanceof LinearLayout ? (LinearLayout) childAt : null;
                if (linearLayout != null) {
                    return linearLayout;
                }
                throw new IllegalStateException("Label LinearLayout not found");
            case 20:
                VkMainTracker vkMainTracker = (VkMainTracker) this.c;
                k1q k1qVar = vkMainTracker.i;
                if (k1qVar != null) {
                    k1qVar.e = 0L;
                }
                Iterator<T> it2 = vkMainTracker.p().iterator();
                while (it2.hasNext()) {
                    ((ohp0) it2.next()).g();
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 21:
                return ((MethodSelectorComponent) m7m.a(((c7v0) this.c).b).mo408a(fpf0.a(MethodSelectorComponent.class))).a();
            case 22:
                return new nbv0.a((mbv0) ((nbv0) this.c).h);
            case 23:
                ((fuv0) this.c).dismiss();
                return s3q0.a;
            case 24:
                VoipQrCodeScannerFragment voipQrCodeScannerFragment = (VoipQrCodeScannerFragment) this.c;
                int i4 = VoipQrCodeScannerFragment.W;
                voipQrCodeScannerFragment.S.onNext(lne0.a.a);
                return s3q0.a;
            case 25:
                xn50.a.c(VoipCallServiceFragment.this, new rhw0.i(shw0.b.a));
                return s3q0.a;
            default:
                ((glx0) this.c).e(j9d0.g.a);
                return s3q0.a;
        }
    }
}
