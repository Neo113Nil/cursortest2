package xsna;

import android.animation.Animator;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import java.util.HashMap;
import java.util.List;
import xsna.wjt0;

/* compiled from: Animator.kt */
/* loaded from: classes17.dex */
public final class b5q implements Animator.AnimatorListener {
    public final /* synthetic */ com.vk.clips.viewer.impl.routing.transition.b b;
    public final /* synthetic */ gnp0 c;

    public b5q(com.vk.clips.viewer.impl.routing.transition.b bVar, gnp0 gnp0Var) {
        this.b = bVar;
        this.c = gnp0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yg5 yg5Var = bmp0.a;
        bmp0.a(null);
        com.vk.clips.viewer.impl.routing.transition.a Uh = this.b.c.Uh();
        if (Uh != null) {
            io2 io2Var = Uh.a.a;
            if (!io2Var.M() && yg5Var != null) {
                yg5Var.pause();
            }
            io2Var.C();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        HashMap hashMap;
        com.vk.clips.viewer.impl.routing.transition.b bVar = this.b;
        bVar.d.removeCallbacks(bVar.e);
        gnp0 gnp0Var = this.c;
        Object obj = (gnp0Var == null || (hashMap = gnp0Var.a) == null) ? null : hashMap.get("RELEASE_TEXTURE_BACKGROUND");
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            for (Object obj2 : list) {
                if (obj2 instanceof wjt0.a) {
                    VideoTextureView videoTextureView = ((wjt0.a) obj2).a;
                    qj80.a(videoTextureView, new c5q(videoTextureView, (wjt0.a) obj2));
                }
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
