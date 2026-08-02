package xsna;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import java.util.HashSet;
import one.video.controls20.SimpleControlsView;
import xsna.bqx0;
import xsna.sqt0;

/* compiled from: VideoInsetsHelper.kt */
/* loaded from: classes3.dex */
public final class jqs0 {
    public final View a;
    public final sqt0.b b;
    public final iqs0 c;
    public boolean d;

    /* compiled from: VideoInsetsHelper.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            jqs0 jqs0Var = jqs0.this;
            View view2 = jqs0Var.a;
            view2.setOnApplyWindowInsetsListener(jqs0Var.c);
            qcy<Object>[] qcyVarArr = bwt0.a;
            view2.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            jqs0.this.a.setOnApplyWindowInsetsListener(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.iqs0] */
    public jqs0(SimpleControlsView simpleControlsView, sqt0.b bVar) {
        this.a = simpleControlsView;
        this.b = bVar;
        a aVar = new a();
        this.c = new View.OnApplyWindowInsetsListener() { // from class: xsna.iqs0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                h4x a2;
                VideoTopBarView topControlsView;
                bqx0 h = bqx0.h(null, windowInsets);
                jqs0 jqs0Var = jqs0.this;
                if (jqs0Var.d) {
                    bqx0.q qVar = h.a;
                    h4x i = qVar.i(128);
                    h4x i2 = qVar.i(519);
                    h4x j = qVar.j(2);
                    Context context = jqs0Var.a.getContext();
                    HashSet hashSet = iah0.a;
                    if (fnj.d(context)) {
                        i2 = h4x.a(i2, j);
                    }
                    a2 = h4x.a(i, i2);
                } else {
                    a2 = h4x.e;
                }
                sqt0.b bVar2 = jqs0Var.b;
                int i3 = a2.d;
                int i4 = a2.b;
                int i5 = a2.a;
                sqt0 sqt0Var = sqt0.this;
                SimpleControlsView simpleControlsView2 = sqt0Var.C;
                int i6 = a2.c;
                Integer valueOf = bVar2.a ? null : Integer.valueOf(i6);
                int intValue = valueOf != null ? valueOf.intValue() : 0;
                simpleControlsView2.getClass();
                Object obj = x5r0.a;
                nn80 nn80Var = simpleControlsView2.u;
                x5r0.h(nn80Var.e, i5, i4, intValue, i3);
                x5r0.g(i4, nn80Var.B);
                x5r0.g(i4, nn80Var.d);
                x5r0.g(i4, nn80Var.E);
                f4m.u(sqt0Var.getAdControlsView(), i5, i4, i6, i3);
                VideoFullscreenBottomBarView fullscreenBottomControlsView = sqt0Var.getFullscreenBottomControlsView();
                if (fullscreenBottomControlsView != null) {
                    f4m.u(fullscreenBottomControlsView, i5, i4, i6, i3);
                }
                topControlsView = sqt0Var.getTopControlsView();
                if (topControlsView != null) {
                    f4m.u(topControlsView, i5, i4, i6, i3);
                }
                VideoSkippablePartView videoSkippablePartView = sqt0Var.o0;
                int i7 = VideoSkippablePartView.C;
                videoSkippablePartView.o(false, false);
                return windowInsets;
            }
        };
        simpleControlsView.addOnAttachStateChangeListener(aVar);
    }
}
