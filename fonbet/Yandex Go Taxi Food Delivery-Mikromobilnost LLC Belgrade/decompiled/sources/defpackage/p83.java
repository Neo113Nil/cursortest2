package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;

/* loaded from: classes.dex */
public final class p83 implements Runnable {
    public boolean a;
    public final /* synthetic */ AspectRatioFrameLayout b;

    public p83(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.b = aspectRatioFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        AspectRatioFrameLayout.access$100(this.b);
    }
}
