package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.cast.api.di.CastComponent;
import com.vk.catalog.info.popup.api.di.CatalogInfoPopupComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivity;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.photos.root.albums.presentation.views.AlbumsRecyclerPaginatedView;
import com.vk.posting.presentation.video.VideoPickerFragment;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.voip.ui.call_effects.presentation.VoipSelectEffectInCallFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import xsna.hp90;
import xsna.s1c0;
import xsna.wpn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vpn0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vpn0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                AlbumsRecyclerPaginatedView albumsRecyclerPaginatedView = (AlbumsRecyclerPaginatedView) ((wpn0.a) obj).c.getValue();
                if (albumsRecyclerPaginatedView != null) {
                    return (CustomSwipeRefreshLayout) albumsRecyclerPaginatedView.findViewById(R.id.swipe_refresh_layout);
                }
                return null;
            case 1:
                Context context = ((RecyclerView) obj).getContext();
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d(context));
            case 2:
                com.vk.core.compose.component.datetime.n nVar = (com.vk.core.compose.component.datetime.n) obj;
                return Boolean.valueOf(nVar.a.c() && nVar.c());
            case 3:
                return ((ToolbarRedesignVh) obj).b();
            case 4:
                Boolean bool = (Boolean) ((mtk0) obj).getValue();
                bool.booleanValue();
                return bool;
            case 5:
                vxq0 vxq0Var = (vxq0) obj;
                ?? r0 = vxq0Var.e;
                s1c0.a aVar = new s1c0.a();
                aVar.x = true;
                xwq0 xwq0Var = vxq0Var.d;
                aVar.z = xwq0Var.c;
                aVar.b = true;
                aVar.n = false;
                aVar.o = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = vxq0Var.b.mo2getContext();
                aVar.s = sf2Var.a();
                aVar.t = BuildInfo.r();
                aVar.p = xwq0Var.a == WallGetMode.MAIN;
                aVar.K = xwq0Var.b && ((b25) r0.getValue()).a((UserId) ((AtomicReference) vxq0Var.r.getValue()).get());
                ComFeatures comFeatures = ComFeatures.COM_EASY_PROMOTE;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures) && ((b25) r0.getValue()).a(xwq0Var.c) && xwq0Var.d) {
                    z = true;
                }
                aVar.L = z;
                aVar.M = true;
                return aVar.a();
            case 6:
                return hnj.a(((bdr0) obj).a);
            case 7:
                int i2 = VideoAboutFragment.S;
                ((com.vk.video.kidsprofile.restricteduseractions.a) obj).getClass();
                return null;
            case 8:
                com.vk.video.ad.e eVar = (com.vk.video.ad.e) obj;
                for (View view : e43.l(eVar.m, eVar.n)) {
                    view.setClipToOutline(false);
                    view.setOutlineProvider(null);
                }
                return s3q0.a;
            case 9:
                return ((VideoKidsComponent) ((k7m) m7m.f((VideoAlbumVh) obj)).a(fpf0.a(VideoKidsComponent.class))).I4();
            case 10:
                int i3 = VideoCatalogFragment.l0;
                return ((CatalogInfoPopupComponent) m7m.d((VideoCatalogFragment) obj).mo408a(fpf0.a(CatalogInfoPopupComponent.class))).vf();
            case 11:
                int i4 = VideoCatalogRootVh.M0;
                return ((CastComponent) ((k7m) m7m.f((VideoCatalogRootVh) obj)).a(fpf0.a(CastComponent.class))).n9();
            case 12:
                VideoContainerActivity videoContainerActivity = (VideoContainerActivity) obj;
                int i5 = VideoContainerActivity.B;
                return new gjs0(new g8n0(videoContainerActivity, 12), new jkg(videoContainerActivity, 14));
            case 13:
                int i6 = VideoPickerFragment.V;
                return new djl(new g8n0((VideoPickerFragment) obj, 13));
            case 14:
                return ((ggu0) obj).j();
            case 15:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj;
                dateTimePickerState.getClass();
                ((zak0) dateTimePickerState.k).setValue(DateTimePickerState.DialogState.Closed.b);
                return s3q0.a;
            case 16:
                return new bzb0(((lcw0) obj).a.requireContext());
            case 17:
                eo9 eo9Var = ((kkw0) obj).g;
                if (eo9Var != null) {
                    f69 f69Var = ((mjw0) eo9Var.a).S0;
                    com.vk.voip.ui.c.b.getClass();
                    f69Var.a(new izy(((r6x0) com.vk.voip.ui.c.l0()).o()));
                }
                return s3q0.a;
            case 18:
                ((krw0) obj).a();
                return s3q0.a;
            case 19:
                ((puw0) obj).s.a.b(hp90.a.a);
                return s3q0.a;
            case 20:
                VoipSelectEffectInCallFragment voipSelectEffectInCallFragment = (VoipSelectEffectInCallFragment) obj;
                int i7 = VoipSelectEffectInCallFragment.Q;
                return voipSelectEffectInCallFragment;
            case 21:
                int i8 = WriteBar.h0;
                return (ImageView) ((WriteBar) obj).findViewById(R.id.writebar_record_video);
            default:
                return ((c1y0) obj).b().getWritebarAttachNewDot();
        }
    }
}
