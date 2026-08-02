package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: VkViewOutlineProvider.kt */
/* loaded from: classes17.dex */
public final class t0w0 extends ViewOutlineProvider {
    public final float a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ t0w0(int i, float f, boolean z, boolean z2) {
        this(f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        boolean z = this.b;
        float f = this.a;
        float f2 = z ? 0.0f : f;
        if (this.c) {
            f = 0.0f;
        }
        outline.setRoundRect(0, -an10.b(f), view.getWidth(), an10.b(view.getHeight() + f2), this.a);
    }

    public t0w0(float f, boolean z, boolean z2) {
        this.a = f;
        this.b = z;
        this.c = z2;
    }
}
