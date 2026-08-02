package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: classes12.dex */
public final class j5z implements c5z {
    public final /* synthetic */ Lifecycle b;
    public final /* synthetic */ k5z c;

    public j5z(k5z k5zVar, Lifecycle lifecycle) {
        this.c = k5zVar;
        this.b = lifecycle;
    }

    @Override // xsna.c5z
    public final void onDestroy() {
        this.c.a.remove(this.b);
    }

    @Override // xsna.c5z
    public final void onStart() {
    }

    @Override // xsna.c5z
    public final void onStop() {
    }
}
