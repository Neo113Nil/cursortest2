package xsna;

import com.vk.mvi.MviLazyViewContainer;

/* compiled from: MviLazyViewContainer.kt */
/* loaded from: classes3.dex */
public final class ol50 implements nhl {
    public final /* synthetic */ MviLazyViewContainer<vk50<Object, Object>, ao50, kj50> b;

    public ol50(MviLazyViewContainer<vk50<Object, Object>, ao50, kj50> mviLazyViewContainer) {
        this.b = mviLazyViewContainer;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        MviLazyViewContainer<vk50<Object, Object>, ao50, kj50> mviLazyViewContainer = this.b;
        vk50<Object, Object> vk50Var = mviLazyViewContainer.c;
        if (vk50Var != null) {
            vk50Var.onDestroy();
        }
        mviLazyViewContainer.c = null;
        f5zVar.getLifecycle().removeObserver(this);
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
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
