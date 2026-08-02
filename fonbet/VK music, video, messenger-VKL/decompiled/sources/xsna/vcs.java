package xsna;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes12.dex */
public final class vcs implements androidx.lifecycle.l {
    public final /* synthetic */ Handler b;
    public final /* synthetic */ ucs c;

    public vcs(Handler handler, ucs ucsVar) {
        this.b = handler;
        this.c = ucsVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(@NonNull f5z f5zVar, @NonNull Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.b.removeCallbacks(this.c);
            f5zVar.getLifecycle().removeObserver(this);
        }
    }
}
