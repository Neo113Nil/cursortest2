package xsna;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import xsna.mdx0;
import xsna.qbk;
import xsna.wrk;

/* compiled from: DiContext.kt */
/* loaded from: classes.dex */
public final class m7m {
    /* JADX WARN: Multi-variable type inference failed */
    public static final l7m a(Activity activity) {
        wrk.a aVar = wrk.a;
        mkb mkbVar = (aVar == null ? null : aVar).a;
        if (!(activity instanceof ComponentActivity)) {
            if (aVar == null) {
                aVar = null;
            }
            return aVar.d.a(activity);
        }
        xyt0 xyt0Var = (xyt0) activity;
        vyt0 vyt0Var = new vyt0(xyt0Var.getViewModelStore(), q7m.a, xyt0Var instanceof androidx.lifecycle.f ? ((androidx.lifecycle.f) xyt0Var).getDefaultViewModelCreationExtras() : qbk.a.b);
        rfc a = fpf0.a(p7m.class);
        String h = a.h();
        if (h == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        p7m p7mVar = (p7m) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a);
        if (p7mVar.b == null) {
            p7mVar.b = new k7m((fmg0) mkbVar.a);
            p7mVar.c = new j90(p7mVar, 0);
        }
        return p7mVar.b;
    }

    public static final l7m b(Service service) {
        wrk.a aVar = wrk.a;
        if (aVar == null) {
            aVar = null;
        }
        return f370.m(service, aVar.d);
    }

    public static final l7m c(View view) {
        wrk.a aVar = wrk.a;
        if (aVar == null) {
            aVar = null;
        }
        return bkt0.b(view, aVar.d);
    }

    public static final l7m d(Fragment fragment) {
        wrk.a aVar = wrk.a;
        k7m k7mVar = null;
        if (aVar == null) {
            aVar = null;
        }
        mkb mkbVar = aVar.a;
        if (!fragment.isAdded() || fragment.getLifecycle().getCurrentState() == Lifecycle.State.INITIALIZED) {
            wrk.a aVar2 = wrk.a;
            return (aVar2 != null ? aVar2 : null).d.a(fragment);
        }
        vyt0 vyt0Var = new vyt0(fragment.getViewModelStore(), q7m.a, fragment.getDefaultViewModelCreationExtras());
        rfc a = fpf0.a(p7m.class);
        String h = a.h();
        if (h == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        p7m p7mVar = (p7m) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a);
        if (p7mVar.b == null) {
            wrk.a aVar3 = wrk.a;
            if (aVar3 == null) {
                aVar3 = null;
            }
            mdx0 mdx0Var = aVar3.d;
            synchronized (wrk.b) {
                mdx0.a remove = mdx0Var.b.remove(fragment);
                if (remove != null) {
                    remove.b = true;
                    k7mVar = remove.a;
                }
            }
            if (k7mVar == null) {
                k7mVar = new k7m((fmg0) mkbVar.a);
            }
            p7mVar.b = k7mVar;
            p7mVar.c = new np(p7mVar, 5);
        }
        return p7mVar.b;
    }

    public static final nmg0 e() {
        wrk.a aVar = wrk.a;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.c;
    }

    public static final l7m f(w8i w8iVar) {
        wrk.a aVar = wrk.a;
        if (aVar == null) {
            aVar = null;
        }
        return aVar.d.a(w8iVar);
    }
}
