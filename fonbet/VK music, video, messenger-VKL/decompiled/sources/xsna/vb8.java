package xsna;

import com.vk.catalog.mvi.block.video.impl.di.CatalogVideoViewComponentImpl;
import com.vk.libvideo.api.di.VideoTimerComponent;
import com.vk.music.api.MusicPlayerServiceComponent;
import com.vk.profile.community.chats.api.di.CommunityChatsComponent;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import xsna.eil0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vb8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        int i = this.b;
        ?? r1 = this.c;
        switch (i) {
            case 0:
                return (VideoShareComponent) ((g8m) r1).a(fpf0.a(VideoShareComponent.class));
            case 1:
                qcy<Object>[] qcyVarArr = CatalogVideoViewComponentImpl.y;
                return ((VideoTimerComponent) r1.getValue()).R0();
            case 2:
                gxw gxwVar = (gxw) r1;
                xkg xkgVar = xkg.a;
                bpn0 bpn0Var = r870.c;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                bpn0 bpn0Var2 = y501.d;
                return new em9(new sf2(new dm9(gxwVar.c(), bpn0Var, bpn0Var2 != null ? bpn0Var2 : null)));
            case 3:
                return ((CommunityChatsComponent) ((LinksBridgeComponentImpl) r1).n.getValue()).a();
            case 4:
                return ((MusicPlayerServiceComponent) ((k7m) m7m.f((jp40) r1)).a(fpf0.a(MusicPlayerServiceComponent.class))).o4();
            case 5:
                return new eil0.e(((eil0) r1).a);
            default:
                if (((qks0) r1).a) {
                    VideoFeatures videoFeatures = VideoFeatures.VIDEO_STICKY_HEADERS_DRAWING_FIX;
                    videoFeatures.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
