package xsna;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.clips.design.view.timeline.TimelineView;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.VideoAdData;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.messagetemplates.impl.details.TemplateDetailsFragment;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.newsfeed.impl.fragments.video.thread.VideoCommentsThreadInPlayerFragment;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.a;
import com.vk.superapp.browser.internal.ui.sheet.VkOrderResultSheetDialog;
import com.vk.video.ad.VideoAdDialog;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLEngine;
import kotlin.text.Regex;
import xsna.b4;
import xsna.xn50;
import xsna.yno0.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kcj0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kcj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Float f = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                com.vk.sharing.core.view.f fVar = (com.vk.sharing.core.view.f) obj;
                fVar.B1();
                fVar.c2(true);
                return s3q0.a;
            case 1:
                HorizontalRecyclerPaginationView a = ((znj0) obj).h().a();
                if (a != null) {
                    a.K9();
                }
                return s3q0.a;
            case 2:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj;
                int i2 = StoryMediaPickerFragment.d0;
                p3t go = storyMediaPickerFragment.go();
                if (go != null && go.Wm()) {
                    xn50.a.c(storyMediaPickerFragment, new a.f(storyMediaPickerFragment.c0.getCurrentList(), storyMediaPickerFragment.ho()));
                }
                return s3q0.a;
            case 3:
                Iterator it = ((ymn0) obj).c().entrySet().iterator();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
                    while (it.hasNext()) {
                        floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
                    }
                    f = Float.valueOf(floatValue);
                }
                return Float.valueOf(f != null ? f.floatValue() : Float.NEGATIVE_INFINITY);
            case 4:
                return ByteBuffer.allocate(((SSLEngine) ((srn0) obj).a).getSession().getPacketBufferSize());
            case 5:
                qcy<Object>[] qcyVarArr = TemplateDetailsFragment.R;
                int i3 = ((TemplateDetailsFragment) obj).requireArguments().getInt("id", -1);
                Integer valueOf = Integer.valueOf(i3);
                if (i3 == -1) {
                    return null;
                }
                return valueOf;
            case 6:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((bmo0) obj)).a(fpf0.a(StoryEditorExtDepsComponent.class))).R();
            case 7:
                return ((yno0) obj).new a();
            case 8:
                TimelineView timelineView = (TimelineView) obj;
                gip0 gip0Var = timelineView.j;
                gip0Var.i.resize(c5g.v(gip0Var.b.g).size() + 10);
                timelineView.c();
                return s3q0.a;
            case 9:
                return ((com.vk.profile.user.impl.ui.i) obj).n.y0();
            case 10:
                u8r0 u8r0Var = (u8r0) obj;
                RecyclerPaginatedView recyclerPaginatedView = u8r0Var.a.g;
                if (recyclerPaginatedView == null) {
                    recyclerPaginatedView = null;
                }
                if (!recyclerPaginatedView.getRecyclerView().canScrollVertically(1)) {
                    com.vk.lists.c cVar = u8r0Var.d;
                    (cVar != null ? cVar : null).n(false);
                }
                return s3q0.a;
            case 11:
                Regex regex = hgr0.X;
                return ((hgr0) obj).vn();
            case 12:
                return (TextView) ((lor0) obj).a.findViewById(R.id.nativeads_votes);
            case 13:
                int i4 = VideoAdDialog.W;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                return b.C1208b.a().e(((VideoAdData) ((VideoAdDialog) obj).U.getValue()).b, null);
            case 14:
                VideoCatalogSearchRootVh videoCatalogSearchRootVh = (VideoCatalogSearchRootVh) obj;
                int i5 = VideoCatalogSearchRootVh.S;
                vtk0.d().d(videoCatalogSearchRootVh.R(), videoCatalogSearchRootVh.E.n);
                return s3q0.a;
            case 15:
                int i6 = VideoCommentsThreadInPlayerFragment.Q;
                return ((BridgeComponent) m7m.d((VideoCommentsThreadInPlayerFragment) obj).a(fpf0.a(BridgeComponent.class))).s();
            case 16:
                ((c4) obj).d(b4.t.a);
                return s3q0.a;
            case 17:
                ebs0 videoClickActionCallback = ((hgs0) obj).getVideoClickActionCallback();
                if (videoClickActionCallback != null) {
                    videoClickActionCallback.bk(tms0.a);
                }
                return s3q0.a;
            case 18:
                int i7 = VideoInteractiveFullscreenFragment.Q0;
                return ((VideoMinimizablePlayerComponent) m7m.d((VideoInteractiveFullscreenFragment) obj).a(fpf0.a(VideoMinimizablePlayerComponent.class))).P7();
            case 19:
                return ((DonutVideoComponent) ((VideoItemSliderVh) obj).b0.getValue()).s3();
            case 20:
                com.vk.video.ui.discovery.minimizable.m mVar = ((VideoMinimizableDiscoveryFragment) obj).J0;
                if (mVar != null) {
                    mVar.b();
                }
                return s3q0.a;
            case 21:
                return (VideoMinimizablePlayerComponent) ((f8m) obj).a(fpf0.a(VideoMinimizablePlayerComponent.class));
            case 22:
                return new vjt0((VideoTextureView) ((tjt0) obj).b.getValue());
            case 23:
                return VideoView.I((VideoView) obj);
            case 24:
                bst0 bst0Var = (bst0) obj;
                bst0Var.g.seekTo(0L);
                bst0Var.g();
                return s3q0.a;
            case 25:
                uxt0 uxt0Var = (uxt0) obj;
                return new nvk0((qxk0) uxt0Var.U.getValue(), uxt0Var.q, uxt0Var.g);
            case 26:
                com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                Bundle arguments = aVar.getArguments();
                if (arguments != null) {
                    return aVar.ln(arguments);
                }
                throw new IllegalStateException("Initialization before onAttach!");
            case 27:
                int i8 = VkOverlayCircleButton.j;
                return Integer.valueOf(krv0.m(R.attr.vk_ui_overlay_secondary, (Context) obj));
            case 28:
                ((lgv0) obj).un();
                return s3q0.a;
            default:
                mov0 mov0Var = (mov0) obj;
                VkOrderResultSheetDialog vkOrderResultSheetDialog = new VkOrderResultSheetDialog(((ggu0) mov0Var.f.c).b);
                WebApiApplication v = mov0Var.d.v();
                vkOrderResultSheetDialog.a(v != null ? v.e() : false, VkOrderResultSheetDialog.Mode.NEGATIVE, null);
                return s3q0.a;
        }
    }
}
