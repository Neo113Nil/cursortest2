package xsna;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.LinkedHashMap;

/* compiled from: SavedStateRegistryImpl.kt */
/* loaded from: classes.dex */
public final class y1h0 {
    public final z1h0 a;
    public final gat b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final qjg c = new qjg();
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public y1h0(z1h0 z1h0Var, gat gatVar) {
        this.a = z1h0Var;
        this.b = gatVar;
    }

    public final void a() {
        z1h0 z1h0Var = this.a;
        if (z1h0Var.getLifecycle().getCurrentState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.b.invoke();
        z1h0Var.getLifecycle().addObserver(new androidx.lifecycle.l() { // from class: xsna.x1h0
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                Lifecycle.Event event2 = Lifecycle.Event.ON_START;
                y1h0 y1h0Var = y1h0.this;
                if (event == event2) {
                    y1h0Var.h = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    y1h0Var.h = false;
                }
            }
        });
        this.e = true;
    }
}
