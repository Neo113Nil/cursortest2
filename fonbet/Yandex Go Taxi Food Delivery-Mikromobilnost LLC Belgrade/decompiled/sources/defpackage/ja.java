package defpackage;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.j;

/* loaded from: classes10.dex */
public abstract class ja extends js31 implements hs31 {
    public final g2m0 a;
    public final Lifecycle b;
    public final Bundle c;

    public ja(j2m0 j2m0Var, Bundle bundle) {
        this.a = j2m0Var.getSavedStateRegistry();
        this.b = j2m0Var.getLifecycle();
        this.c = bundle;
    }

    @Override // defpackage.js31
    public final void a(yr31 yr31Var) {
        g2m0 g2m0Var = this.a;
        if (g2m0Var != null) {
            j.a(yr31Var, g2m0Var, this.b);
        }
    }

    public abstract yr31 b(v1m0 v1m0Var);

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        String str = (String) y8fVar.a(is31.b);
        if (str == null) {
            ny61.r("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        g2m0 g2m0Var = this.a;
        if (g2m0Var == null) {
            return b(g0.a(y8fVar));
        }
        f0 b = j.b(g2m0Var, this.b, str, this.c);
        yr31 b2 = b(b.b);
        b2.S("androidx.lifecycle.savedstate.vm.tag", b);
        return b2;
    }

    public ja() {
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            Lifecycle lifecycle = this.b;
            if (lifecycle != null) {
                f0 b = j.b(this.a, lifecycle, canonicalName, this.c);
                yr31 b2 = b(b.b);
                b2.S("androidx.lifecycle.savedstate.vm.tag", b);
                return b2;
            }
            w511.x("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        ny61.g("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
