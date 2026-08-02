package xsna;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import xsna.v1h0;

/* compiled from: SavedStateRegistryController.android.kt */
/* loaded from: classes.dex */
public final class w1h0 {
    public final y1h0 a;
    public final v1h0 b;

    public w1h0(y1h0 y1h0Var) {
        this.a = y1h0Var;
        this.b = new v1h0(y1h0Var);
    }

    public final void a(Bundle bundle) {
        y1h0 y1h0Var = this.a;
        z1h0 z1h0Var = y1h0Var.a;
        if (!y1h0Var.e) {
            y1h0Var.a();
        }
        if (z1h0Var.getLifecycle().getCurrentState().a(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + z1h0Var.getLifecycle().getCurrentState()).toString());
        }
        if (y1h0Var.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                sd9.m("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        y1h0Var.f = bundle2;
        y1h0Var.g = true;
    }

    public final void b(Bundle bundle) {
        y1h0 y1h0Var = this.a;
        Bundle b = yfb.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = y1h0Var.f;
        if (bundle2 != null) {
            b.putAll(bundle2);
        }
        synchronized (y1h0Var.c) {
            try {
                for (Map.Entry entry : y1h0Var.d.entrySet()) {
                    b.putBundle((String) entry.getKey(), ((v1h0.b) entry.getValue()).r());
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", b);
    }
}
