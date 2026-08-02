package xsna;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import xsna.scs;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes12.dex */
public final class ycs implements androidx.lifecycle.l {
    public final /* synthetic */ scs.d b;

    public ycs(scs.d dVar) {
        this.b = dVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(@NonNull f5z f5zVar, @NonNull Lifecycle.Event event) {
        this.b.b(false);
    }
}
