package xsna;

import android.graphics.Rect;
import android.view.View;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.video.ad.e;

/* compiled from: AnimationAdDialogController.kt */
/* loaded from: classes5.dex */
public final class xm2 {
    public final io2 a;
    public final e.a b;
    public final int c;
    public final emh0 d;
    public final vpn0 e;
    public final g8n0 f;

    public xm2(io2 io2Var, e.a aVar, int i, emh0 emh0Var, vpn0 vpn0Var, g8n0 g8n0Var) {
        this.a = io2Var;
        this.b = aVar;
        this.c = i;
        this.d = emh0Var;
        this.e = vpn0Var;
        this.f = g8n0Var;
    }

    public static pn10 a(tn10 tn10Var, io2 io2Var, boolean z, int i) {
        Rect rect = new Rect();
        View b = tn10Var.b();
        int[] iArr = {0, 0};
        b.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        rect.left = i2;
        rect.top = iArr[1];
        rect.right = b.getWidth() + i2;
        rect.bottom = b.getHeight() + iArr[1];
        VideoResizer.VideoFitType videoFitType = VideoResizer.VideoFitType.FIT;
        pn10 pn10Var = new pn10(io2Var.t0(), io2Var.g0(), videoFitType, (int) io2Var.i0(), rect, videoFitType, i, z, tn10Var);
        pn10Var.setDuration(BaseAnimationDialog.a0);
        pn10Var.setInterpolator(BaseAnimationDialog.Z);
        return pn10Var;
    }
}
