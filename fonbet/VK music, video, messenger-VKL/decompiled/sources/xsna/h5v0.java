package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: VkModalPageContent.kt */
/* loaded from: classes17.dex */
public final class h5v0 extends LinearLayout {
    public View b;
    public View c;
    public final FrameLayout d;
    public final FrameLayout e;

    public h5v0(Context context) {
        super(context, null, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        setOrientation(1);
        addView(frameLayout);
        addView(frameLayout2);
    }

    public final void setContent(View view) {
        if (epx.f(this.c, view)) {
            return;
        }
        FrameLayout frameLayout = this.e;
        frameLayout.removeAllViews();
        frameLayout.addView(view, cpy.a(-1, -1, 0, 0, 0, 0, 60));
        this.c = view;
    }

    public final void setTopBar(View view) {
        if (epx.f(this.b, view)) {
            return;
        }
        FrameLayout frameLayout = this.d;
        frameLayout.removeAllViews();
        frameLayout.addView(view, cpy.a(-2, -1, 0, 0, 0, 0, 60));
        this.b = view;
    }
}
