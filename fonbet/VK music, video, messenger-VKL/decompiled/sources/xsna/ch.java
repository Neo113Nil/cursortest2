package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: AbstractPollView.kt */
/* loaded from: classes6.dex */
public final class ch extends ViewOutlineProvider {
    public final int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public ch(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.a = Math.max(i, i2);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.b;
        int i2 = this.a;
        outline.setRoundRect(0, i == 0 ? -i2 : 0, view.getWidth(), view.getHeight() + (this.c == 0 ? i2 : 0), i2);
        view.setClipToOutline(true);
    }
}
