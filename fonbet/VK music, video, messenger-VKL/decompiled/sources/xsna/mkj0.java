package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.content.design.view.camera.ShutterButton;

/* compiled from: ShutterButton.kt */
/* loaded from: classes17.dex */
public final class mkj0 extends io.reactivex.rxjava3.observers.a<Float> {
    public final /* synthetic */ ShutterButton c;

    public mkj0(ShutterButton shutterButton) {
        this.c = shutterButton;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        this.c.H.p0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        ShutterButton shutterButton = this.c;
        shutterButton.H.r0 = floatValue;
        shutterButton.invalidate();
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
    }
}
