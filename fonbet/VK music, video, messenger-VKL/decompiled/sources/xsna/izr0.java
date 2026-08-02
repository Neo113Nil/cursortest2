package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.vk.libvideo.design.view.ad.VideoAdLayout;

/* compiled from: VideoAdInsetsHelper.kt */
/* loaded from: classes18.dex */
public final class izr0 {
    public final View a;
    public final a b = new a(new v910(this, 1));

    /* compiled from: VideoAdInsetsHelper.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public final v910 b;

        public a(v910 v910Var) {
            this.b = v910Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            izr0 izr0Var = izr0.this;
            View view2 = izr0Var.a;
            WindowInsets rootWindowInsets = view2.getRootWindowInsets();
            if (rootWindowInsets != null) {
                izr0Var.a(rootWindowInsets);
            }
            view2.setOnApplyWindowInsetsListener(this.b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            izr0.this.a.setOnApplyWindowInsetsListener(null);
        }
    }

    public izr0(VideoAdLayout videoAdLayout) {
        this.a = videoAdLayout;
    }

    public final void a(WindowInsets windowInsets) {
        View view = this.a;
        boolean z = view.getResources().getConfiguration().orientation == 1;
        h4x a2 = h4x.a(h4x.a(bqx0.h(null, windowInsets).a.i(519), bqx0.h(null, windowInsets).a.i(64)), h4x.a(bqx0.h(null, windowInsets).a.i(128), bqx0.h(null, windowInsets).a.i(32)));
        Rect rect = new Rect(a2.a, z ? a2.b : 0, a2.c, z ? a2.d : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(rect.left, rect.top, rect.right, rect.bottom);
        view.setLayoutParams(marginLayoutParams);
    }
}
