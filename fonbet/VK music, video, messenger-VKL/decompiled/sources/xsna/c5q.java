package xsna;

import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import xsna.wjt0;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class c5q implements Runnable {
    public final /* synthetic */ Object b;

    public c5q(VideoTextureView videoTextureView, wjt0.a aVar) {
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((wjt0.a) this.b).a.setBackground(null);
    }
}
