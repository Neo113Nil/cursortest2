package defpackage;

import io.flutter.embedding.android.SurfaceHolderCallbackCompat;
import io.flutter.embedding.engine.renderer.f;

/* loaded from: classes4.dex */
public final class fnw0 implements ctr {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ SurfaceHolderCallbackCompat b;

    public fnw0(SurfaceHolderCallbackCompat surfaceHolderCallbackCompat, Runnable runnable) {
        this.b = surfaceHolderCallbackCompat;
        this.a = runnable;
    }

    @Override // defpackage.ctr
    public final void onFlutterUiDisplayed() {
        f fVar;
        f fVar2;
        this.a.run();
        SurfaceHolderCallbackCompat surfaceHolderCallbackCompat = this.b;
        fVar = surfaceHolderCallbackCompat.flutterRenderer;
        if (fVar != null) {
            fVar2 = surfaceHolderCallbackCompat.flutterRenderer;
            fVar2.a.removeIsDisplayingFlutterUiListener(this);
        }
    }

    @Override // defpackage.ctr
    public final void onFlutterUiNoLongerDisplayed() {
    }
}
