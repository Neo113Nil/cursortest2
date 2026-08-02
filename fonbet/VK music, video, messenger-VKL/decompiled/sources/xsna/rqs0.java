package xsna;

import android.content.Intent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerProgress;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.media_request.VoipEnableOwnMicAndVideoRequestedDialog;
import xsna.b78;
import xsna.j9d0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rqs0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rqs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((DonutVideoComponent) ((VideoItemListLargeVh) obj).j0.getValue()).getActionHandler();
            case 1:
                VideoPlayerState P0 = ((com.vk.video.ui.discovery.minimizable.g) obj).a0.P0();
                VideoPlayerProgress videoPlayerProgress = P0 != null ? P0.c : null;
                VideoPlayerProgress.Vod vod = videoPlayerProgress instanceof VideoPlayerProgress.Vod ? (VideoPlayerProgress.Vod) videoPlayerProgress : null;
                if (vod != null) {
                    return Long.valueOf(vod.b);
                }
                return null;
            case 2:
                return Boolean.valueOf(!(((VideoMinimizableDiscoveryFragment) obj).X != null ? epx.f(r0.b(), Boolean.TRUE) : false));
            case 3:
                int i2 = VideoToolbarView.M;
                return (DonutVideoComponent) ((k7m) m7m.c((VideoToolbarView) obj)).a(fpf0.a(DonutVideoComponent.class));
            case 4:
                ((b78.g) obj).a().invoke(new sx40.g0(PlayerContext.MINI));
                return s3q0.a;
            case 5:
                ggu0 ggu0Var = (ggu0) obj;
                return new ber0(ggu0Var.e, ggu0Var, ggu0Var.d, new v5n0(ggu0Var, 20));
            case 6:
                return new VkButton(((VkGroupHeader.b) obj).b, null, 6, 0);
            case 7:
                ((com.vk.superapp.verification.account.d) obj).onActivityResult(114097, 0, new Intent().putExtra("force_closure", true));
                return s3q0.a;
            case 8:
                VoipEnableOwnMicAndVideoRequestedDialog voipEnableOwnMicAndVideoRequestedDialog = (VoipEnableOwnMicAndVideoRequestedDialog) obj;
                voipEnableOwnMicAndVideoRequestedDialog.c = null;
                xnw0 xnw0Var = voipEnableOwnMicAndVideoRequestedDialog.d;
                if (xnw0Var != null) {
                    OKVoipEngine.b.getClass();
                    OKVoipEngine.k.o.a.remove(xnw0Var);
                }
                return s3q0.a;
            case 9:
                return new it80(((r4x0) obj).a());
            default:
                ((glx0) obj).e(j9d0.j.a);
                return s3q0.a;
        }
    }

    public /* synthetic */ rqs0(mhv0 mhv0Var, com.vk.superapp.verification.account.d dVar) {
        this.b = 7;
        this.c = dVar;
    }
}
