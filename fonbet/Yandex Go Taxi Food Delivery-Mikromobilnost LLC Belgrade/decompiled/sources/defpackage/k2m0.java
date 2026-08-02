package defpackage;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.j;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class k2m0 extends js31 implements hs31 {
    public final Application a;
    public final gs31 b;
    public final Bundle c;
    public final Lifecycle w;
    public final g2m0 x;

    public k2m0(Application application, j2m0 j2m0Var, Bundle bundle) {
        gs31 gs31Var;
        this.x = j2m0Var.getSavedStateRegistry();
        this.w = j2m0Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (gs31.w == null) {
                gs31.w = new gs31(application);
            }
            gs31Var = gs31.w;
        } else {
            gs31Var = new gs31();
        }
        this.b = gs31Var;
    }

    @Override // defpackage.js31
    public final void a(yr31 yr31Var) {
        Lifecycle lifecycle = this.w;
        if (lifecycle != null) {
            j.a(yr31Var, this.x, lifecycle);
        }
    }

    public final yr31 b(Class cls, String str) {
        Lifecycle lifecycle = this.w;
        if (lifecycle == null) {
            w511.x("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = hd2.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? l2m0.a(cls, l2m0.b) : l2m0.a(cls, l2m0.a);
        if (a != null) {
            f0 b = j.b(this.x, lifecycle, str, this.c);
            yr31 b2 = (!isAssignableFrom || application == null) ? l2m0.b(cls, a, b.c()) : l2m0.b(cls, a, application, b.c());
            b2.S("androidx.lifecycle.savedstate.vm.tag", b);
            return b2;
        }
        if (application != null) {
            return this.b.create(cls);
        }
        if (is31.a == null) {
            is31.a = new is31();
        }
        is31 is31Var = is31.a;
        return q5z.n(cls);
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        String str = (String) y8fVar.a(ls31.b);
        if (str == null) {
            ny61.r("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (y8fVar.a(g0.a) == null || y8fVar.a(g0.b) == null) {
            if (this.w != null) {
                return b(cls, str);
            }
            ny61.r("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) y8fVar.a(gs31.x);
        boolean isAssignableFrom = hd2.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? l2m0.a(cls, l2m0.b) : l2m0.a(cls, l2m0.a);
        return a == null ? this.b.create(cls, y8fVar) : (!isAssignableFrom || application == null) ? l2m0.b(cls, a, g0.a(y8fVar)) : l2m0.b(cls, a, application, g0.a(y8fVar));
    }

    public k2m0() {
        this.b = new gs31();
    }

    @Override // defpackage.hs31
    public final yr31 create(lfx lfxVar, y8f y8fVar) {
        return create(((zzb) lfxVar).a(), y8fVar);
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, canonicalName);
        }
        ny61.g("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
