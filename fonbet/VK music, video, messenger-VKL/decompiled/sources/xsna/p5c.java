package xsna;

import com.vk.core.fragments.FragmentImpl;

/* compiled from: CheckoutInnerRouter.kt */
/* loaded from: classes18.dex */
public final class p5c implements nhl {
    public final /* synthetic */ q5c b;

    public p5c(q5c q5cVar) {
        this.b = q5cVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
        q5c q5cVar = this.b;
        FragmentImpl fragmentImpl = q5cVar.a;
        fragmentImpl.kn().getSupportFragmentManager().l0("checkout_city_request_key", f5zVar, ((mfc) q5cVar.c.c.getValue()).a(new ix2(q5cVar, 17)));
        fragmentImpl.getLifecycle().removeObserver(this);
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
    }
}
