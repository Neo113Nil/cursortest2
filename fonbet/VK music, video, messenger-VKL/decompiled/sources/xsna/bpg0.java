package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* compiled from: RoundedCornersFrameLayout.kt */
/* loaded from: classes18.dex */
public class bpg0 extends FrameLayout {

    /* compiled from: RoundedCornersFrameLayout.kt */
    public static final class a extends ViewOutlineProvider {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
            view.setClipToOutline(true);
        }
    }
}
