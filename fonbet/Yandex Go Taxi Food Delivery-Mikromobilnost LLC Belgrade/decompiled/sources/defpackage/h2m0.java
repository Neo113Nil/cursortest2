package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class h2m0 {
    public final i2m0 a;
    public final g2m0 b;

    public h2m0(i2m0 i2m0Var) {
        this.a = i2m0Var;
        this.b = new g2m0(i2m0Var);
    }

    public final void a(Bundle bundle) {
        i2m0 i2m0Var = this.a;
        j2m0 j2m0Var = i2m0Var.a;
        if (!i2m0Var.e) {
            i2m0Var.a();
        }
        if (j2m0Var.getLifecycle().b().a(Lifecycle.State.STARTED)) {
            vg10.o(j2m0Var.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (i2m0Var.g) {
            ny61.r("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                qxa1.b("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        i2m0Var.f = bundle2;
        i2m0Var.g = true;
    }

    public final void b(Bundle bundle) {
        i2m0 i2m0Var = this.a;
        Bundle g = wwg.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = i2m0Var.f;
        if (bundle2 != null) {
            g.putAll(bundle2);
        }
        synchronized (i2m0Var.c) {
            for (Map.Entry entry : i2m0Var.d.entrySet()) {
                g.putBundle((String) entry.getKey(), ((f2m0) entry.getValue()).a());
            }
        }
        if (g.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", g);
    }
}
