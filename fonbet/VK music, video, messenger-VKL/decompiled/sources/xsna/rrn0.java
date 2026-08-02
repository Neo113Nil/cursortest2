package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoAdData;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.messagetemplates.impl.details.TemplateDetailsFragment;
import com.vk.movika.api.MovikaComponent;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.video.thread.VideoCommentsThreadInPlayerFragment;
import com.vk.oauth.tinkoff.VkTinkoffBaseActivity;
import com.vk.popupmanager.api.PopupPriority;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.video.ad.VideoAdDialog;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import kotlin.text.Regex;
import xsna.owm;
import xsna.q4a0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class rrn0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rrn0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        pk30 pk30Var;
        l7m c;
        String str;
        zzv0 zzv0Var;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ByteBuffer.allocate(((SSLEngine) ((srn0) obj2).a).getSession().getPacketBufferSize());
            case 1:
                int i2 = TaggedItemsBottomSheet.o1;
                Bundle requireArguments = ((TaggedItemsBottomSheet) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("tagged_goods_args", TaggedItemsBottomSheet.FragmentArgs.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("tagged_goods_args");
                    obj = (TaggedItemsBottomSheet.FragmentArgs) (parcelable2 instanceof TaggedItemsBottomSheet.FragmentArgs ? parcelable2 : null);
                }
                return (TaggedItemsBottomSheet.FragmentArgs) obj;
            case 2:
                qcy<Object>[] qcyVarArr = TemplateDetailsFragment.R;
                return (Peer) ((TemplateDetailsFragment) obj2).requireArguments().getParcelable("group_id");
            case 3:
                return ((CommonEditorComponent) ((k7m) m7m.f((bmo0) obj2)).a(fpf0.a(CommonEditorComponent.class))).Zc();
            case 4:
                wh50 wh50Var = ((e6p0) obj2).l;
                ((zak0) wh50Var).setValue(Boolean.valueOf(true ^ ((Boolean) ((zak0) wh50Var).getValue()).booleanValue()));
                return s3q0.a;
            case 5:
                return ((NewsFeedComponent) ((loq0) obj2).l.getValue()).w();
            case 6:
                com.vk.profile.user.impl.ui.i iVar = (com.vk.profile.user.impl.ui.i) obj2;
                bwt0.c0(cn70.b(1) + ((ViewGroup) iVar.e).getHeight(), iVar.f);
                return s3q0.a;
            case 7:
                u8r0 u8r0Var = (u8r0) obj2;
                com.vk.lists.c cVar = u8r0Var.d;
                if (cVar == null) {
                    cVar = null;
                }
                cVar.p(false);
                RecyclerPaginatedView recyclerPaginatedView = u8r0Var.a.g;
                (recyclerPaginatedView != null ? recyclerPaginatedView : null).f0();
                return s3q0.a;
            case 8:
                Regex regex = hgr0.X;
                BrowserPerfState browserPerfState = ((hgr0) obj2).G;
                if (browserPerfState != null) {
                    return browserPerfState;
                }
                return null;
            case 9:
                return (TextView) ((lor0) obj2).a.findViewById(R.id.nativeads_rating);
            case 10:
                eur0 eur0Var = (eur0) obj2;
                MsgPin msgPin = eur0Var.r;
                if (msgPin != null && (pk30Var = eur0Var.s) != null) {
                    pk30Var.z(msgPin.F);
                }
                return s3q0.a;
            case 11:
                int i3 = VideoAdDialog.W;
                return (VideoAdData) ((VideoAdDialog) obj2).requireArguments().getParcelable("video_ad_data");
            case 12:
                View view = ((VideoCatalogHeaderDebrandedVh) obj2).k;
                if (view == null || (c = m7m.c(view)) == null) {
                    return null;
                }
                CastComponent castComponent = (CastComponent) ((k7m) c).a(fpf0.a(CastComponent.class));
                if (castComponent != null) {
                    return castComponent.n9();
                }
                return null;
            case 13:
                return ((VideoCatalogSearchRootVh) obj2).C;
            case 14:
                int i4 = VideoCommentsThreadInPlayerFragment.Q;
                return ((AttachmentMappersComponent) m7m.d((VideoCommentsThreadInPlayerFragment) obj2).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 15:
                return Boolean.valueOf(((hgs0) obj2).getUiVisible());
            case 16:
                int i5 = VideoInteractiveFullscreenFragment.Q0;
                return ((MovikaComponent) m7m.d((VideoInteractiveFullscreenFragment) obj2).mo408a(fpf0.a(MovikaComponent.class))).U4();
            case 17:
                return ((DonutVideoComponent) ((VideoItemSliderVh) obj2).b0.getValue()).getActionHandler();
            case 18:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                int i6 = VideoMinimizableDiscoveryFragment.p1;
                c.a1.C1973c c1973c = c.a1.C1973c.b;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, c1973c);
                return s3q0.a;
            case 19:
                return (VideoSeekComponent) ((f8m) obj2).c(fpf0.a(VideoSeekComponent.class));
            case 20:
                VideoPlaylistRootVh videoPlaylistRootVh = (VideoPlaylistRootVh) obj2;
                DisableableViewPager disableableViewPager = videoPlaylistRootVh.x.o;
                if (disableableViewPager == null) {
                    disableableViewPager = null;
                }
                CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = (CatalogRecyclerPaginatedView) disableableViewPager.findViewById(R.id.paginated_list);
                videoPlaylistRootVh.u = catalogRecyclerPaginatedView;
                if (catalogRecyclerPaginatedView != null) {
                    catalogRecyclerPaginatedView.Om(videoPlaylistRootVh);
                }
                videoPlaylistRootVh.C = null;
                return s3q0.a;
            case 21:
                final VideoProfileCatalogContentVh videoProfileCatalogContentVh = (VideoProfileCatalogContentVh) obj2;
                final e7t0 e7t0Var = videoProfileCatalogContentVh.r;
                if (e7t0Var != null) {
                    return new mzt0(videoProfileCatalogContentVh, e7t0Var) { // from class: xsna.b7t0
                        public final /* synthetic */ e7t0 b;

                        {
                            this.b = e7t0Var;
                        }

                        @Override // xsna.mzt0
                        public final void u(UIBlock uIBlock) {
                            if (uIBlock instanceof UIBlockList) {
                                UIBlockList uIBlockList = (UIBlockList) uIBlock;
                                String str2 = uIBlockList.M;
                                if (str2 != null) {
                                    String i0 = drm0.i0('/', str2, str2);
                                    if (drm0.d0(i0, '@')) {
                                        i0 = "all_videos";
                                    }
                                    this.b.b(i0);
                                }
                                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_GROUP;
                                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, uIBlockList.f, null, 46, null), new com.vk.stat.scheme.r0(), 2);
                                uzp0 uzp0Var = UiTracker.h;
                                uzp0Var.getClass();
                                new bjc(mobileOfficialAppsCoreNavStat$EventScreen, b, uzp0Var.a).q();
                            }
                        }
                    };
                }
                return null;
            case 22:
                VideoView videoView = (VideoView) obj2;
                qcy<Object>[] qcyVarArr2 = VideoView.T0;
                View W3 = videoView.getViewBinding().r.W3(videoView.getContext());
                return new c20(new wcs0(videoView, 7), new icn0(W3, 15), new qjo0(W3, 11), new q6s0(videoView, 10));
            case 23:
                bst0 bst0Var = (bst0) obj2;
                q4a0.e eVar = bst0Var.e;
                if (eVar != null) {
                    int position = bst0Var.getPosition();
                    q4a0 q4a0Var = q4a0.this;
                    q4a0Var.m.put(position, true);
                    q4a0Var.c(position);
                }
                return s3q0.a;
            case 24:
                uxt0 uxt0Var = (uxt0) obj2;
                return new ow0(uxt0Var.s, uxt0Var.g, uxt0Var.q);
            case 25:
                ((q9u0) obj2).O(owm.d.b);
                return s3q0.a;
            case 26:
                Bundle arguments = ((com.vk.superapp.browser.ui.a) obj2).getArguments();
                return Boolean.valueOf(epx.f(arguments != null ? arguments.getString("key_ref") : null, "clips"));
            case 27:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = ((ggu0) obj2).x;
                if (aVar != null) {
                    return Integer.valueOf((int) (aVar.e.a() / 1000));
                }
                return null;
            case 28:
                int i7 = VkTinkoffBaseActivity.o;
                return (htk0) ((VkTinkoffBaseActivity) obj2).V1().e.getValue();
            default:
                yzv0 yzv0Var = (yzv0) obj2;
                Context context = yzv0Var.d.getContext();
                zzv0 zzv0Var2 = new zzv0(context);
                zzv0Var2.b = yzv0Var;
                LayoutInflater.from(context).inflate(R.layout.open_vk_video_popup, (ViewGroup) zzv0Var2, true);
                zzv0Var2.c = zzv0Var2.findViewById(R.id.close_btn);
                zzv0Var2.d = (LinearLayout) zzv0Var2.findViewById(R.id.content);
                View view2 = zzv0Var2.c;
                if (view2 != null) {
                    view2.setOnClickListener(new oa6(zzv0Var2, 13));
                }
                LinearLayout linearLayout = zzv0Var2.d;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(new aj6(zzv0Var2, 12));
                }
                yzv0Var.e = zzv0Var2;
                kos0 kos0Var = (kos0) yzv0Var.f.getValue();
                if (kos0Var != null && (str = kos0Var.c) != null && (zzv0Var = yzv0Var.e) != null) {
                    zzv0Var.setText(str);
                }
                yzv0Var.c.a(yzv0Var, PopupPriority.NORMAL);
                return s3q0.a;
        }
    }
}
