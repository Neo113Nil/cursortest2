package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class i2m0 {
    public final j2m0 a;
    public final csf0 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final h1x0 c = new h1x0();
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public i2m0(j2m0 j2m0Var, csf0 csf0Var) {
        this.a = j2m0Var;
        this.b = csf0Var;
    }

    public final void a() {
        j2m0 j2m0Var = this.a;
        if (j2m0Var.getLifecycle().b() != Lifecycle.State.INITIALIZED) {
            ny61.r("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                ny61.r("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            j2m0Var.getLifecycle().a(new fdy(4, this));
            this.e = true;
        }
    }
}
