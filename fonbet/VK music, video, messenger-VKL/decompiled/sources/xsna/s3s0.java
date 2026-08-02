package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: VideoAutoPlayHolder.kt */
/* loaded from: classes7.dex */
public final class s3s0 extends ViewOutlineProvider {
    public final /* synthetic */ float a;

    public s3s0(float f) {
        this.a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
    }
}
