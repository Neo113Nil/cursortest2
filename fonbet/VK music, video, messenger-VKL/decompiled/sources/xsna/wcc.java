package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: CircleOutlineProvider.kt */
/* loaded from: classes17.dex */
public final class wcc extends ViewOutlineProvider {
    public static final wcc a = new wcc();

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
