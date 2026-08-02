package xsna;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: LifecycleExt.kt */
/* loaded from: classes17.dex */
public final class q4z implements nhl {
    public final /* synthetic */ Lifecycle b;
    public final /* synthetic */ Collection c;
    public final /* synthetic */ mh3 d;

    public q4z(Lifecycle lifecycle, ArrayList arrayList, mh3 mh3Var) {
        this.b = lifecycle;
        this.c = arrayList;
        this.d = mh3Var;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        this.c.remove(this.d);
        this.b.removeObserver(this);
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
