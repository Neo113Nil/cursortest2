package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import java.util.List;
import xsna.acx;
import xsna.yks0;

/* compiled from: VideoInteractiveFullscreenFragment.kt */
/* loaded from: classes3.dex */
public final class mqs0 implements yks0.a {
    public final /* synthetic */ VideoInteractiveFullscreenFragment b;

    public mqs0(VideoInteractiveFullscreenFragment videoInteractiveFullscreenFragment) {
        this.b = videoInteractiveFullscreenFragment;
    }

    @Override // xsna.yks0.a
    public final void He(List list, VideoFile videoFile) {
        rcx rcxVar = this.b.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        rcxVar.t1(videoFile);
    }

    @Override // xsna.yks0.a
    public final void uf(boolean z) {
        rcx rcxVar = this.b.t0;
        if (rcxVar == null) {
            rcxVar = null;
        }
        rcxVar.a(new acx.k(z));
    }

    @Override // xsna.yks0.a
    public final void dismiss() {
    }

    @Override // xsna.yks0.a
    public final void vk(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void L9(VideoFile videoFile, boolean z) {
    }
}
