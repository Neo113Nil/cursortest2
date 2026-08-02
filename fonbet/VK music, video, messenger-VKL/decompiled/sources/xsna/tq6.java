package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BaseVideoOverlayViewHelper.kt */
/* loaded from: classes.dex */
public final class tq6 implements l1t0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public tq6() {
        t03 t03Var = new t03(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, t03Var);
        this.b = msy.a(lazyThreadSafetyMode, new e53(1));
        int i = 0;
        this.c = msy.a(lazyThreadSafetyMode, new rq6(i));
        this.d = msy.a(lazyThreadSafetyMode, new sq6(i));
    }

    @Override // xsna.l1t0
    public final void a(View view, float f, float f2, float f3, float f4) {
        ((VideoOverlayView) view).h5(f, f2, f3, f4);
    }

    @Override // xsna.l1t0
    public final void b(int i, int i2, View view) {
        ((VideoOverlayView) view).i5(i, i2);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l1t0
    public final void d(View view, VideoFile videoFile, View view2, izs izsVar, izs izsVar2, View view3) {
        VideoFile A;
        bpn0 bpn0Var = VideoOverlayView.I;
        VideoOverlayView videoOverlayView = (VideoOverlayView) view;
        boolean c = fxc0.B().c(videoFile);
        VideoRestriction O = videoFile.O();
        String str = null;
        com.vk.libvideo.design.view.overlay.b a = O != null ? ((a390) this.c.getValue()).a(O) : null;
        boolean z = videoFile.d8() || videoFile.z0();
        VideoPipStateHolder.a.getClass();
        yg5 c2 = VideoPipStateHolder.c();
        if (c2 != null && (A = c2.A()) != null) {
            str = A.a1();
        }
        VideoOverlayView.b.a(new VideoOverlayView.a(view2, videoOverlayView, new n0(6, izsVar, videoFile), izsVar2, view3, false, false, c, new f5(videoFile, 8), new ss3(2, this, videoFile), a, z, epx.f(str, videoFile.a1()), new i70(this, 8), (i1t0) this.d.getValue(), null, 65728));
    }

    @Override // xsna.l1t0
    public final View e(Context context, float f) {
        return new VideoOverlayView(context, null, new VideoOverlayView.d(f), 6);
    }

    @Override // xsna.l1t0
    public final void f(int i, int i2, View view) {
        ((VideoOverlayView) view).j5(i, i2);
    }
}
