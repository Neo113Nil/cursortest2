package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: CardUniConstructor.kt */
/* loaded from: classes6.dex */
public final class yt9 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    public yt9(int i) {
        this.a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view == null || outline == null) {
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
