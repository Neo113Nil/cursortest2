package xsna;

import android.app.Activity;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: MaskedFrameLayout.kt */
/* loaded from: classes6.dex */
public final class wg10 extends FrameLayout {
    public float b;

    /* compiled from: MaskedFrameLayout.kt */
    public final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            float f = 1 - wg10.this.b;
            int i = (int) (((r2 - r5) / 2) * f);
            outline.setRoundRect(0, i, view.getWidth(), view.getHeight() - i, (r5 / 2) * f);
            view.setClipToOutline(true);
        }
    }

    public wg10(Activity activity) {
        super(activity, null, 0);
        this.b = 1.0f;
        setOutlineProvider(new a());
    }

    public final void a(float f) {
        this.b = f;
        invalidateOutline();
    }
}
