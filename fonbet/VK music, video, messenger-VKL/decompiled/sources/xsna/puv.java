package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: IdeasStoryView.kt */
/* loaded from: classes6.dex */
public final class puv extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        int i = iz8.j;
        outline.setRoundRect(0, 0, width, height, iz8.j);
    }
}
