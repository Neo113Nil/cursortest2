package androidx.view;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g0;
import androidx.lifecycle.t;
import defpackage.a550;
import defpackage.csf0;
import defpackage.g2m0;
import defpackage.gs31;
import defpackage.h2m0;
import defpackage.hs31;
import defpackage.i2m0;
import defpackage.i3y;
import defpackage.j2m0;
import defpackage.jl40;
import defpackage.k2m0;
import defpackage.nx40;
import defpackage.ny61;
import defpackage.pey;
import defpackage.q7u;
import defpackage.qs31;
import defpackage.rs31;
import defpackage.sls;
import defpackage.y8f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class b implements pey, rs31, q7u, j2m0 {
    public final t A = new t(this, true);
    public final h2m0 B = new h2m0(new i2m0(this, new csf0(20, this)));
    public boolean C;
    public Lifecycle.State D;
    public final k2m0 E;
    public final Context a;
    public f b;
    public final Bundle c;
    public Lifecycle.State w;
    public final a550 x;
    public final String y;
    public final Bundle z;

    public b(Context context, f fVar, Bundle bundle, Lifecycle.State state, a550 a550Var, String str, Bundle bundle2) {
        this.a = context;
        this.b = fVar;
        this.c = bundle;
        this.w = state;
        this.x = a550Var;
        this.y = str;
        this.z = bundle2;
        i3y a = a.a(new sls() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Context applicationContext = b.this.a.getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                b bVar = b.this;
                return new k2m0(application, bVar, bVar.a());
            }
        });
        this.D = Lifecycle.State.INITIALIZED;
        this.E = (k2m0) a.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(Lifecycle.State state) {
        this.D = state;
        c();
    }

    public final void c() {
        if (!this.C) {
            h2m0 h2m0Var = this.B;
            h2m0Var.a.a();
            this.C = true;
            if (this.x != null) {
                g0.b(this);
            }
            h2m0Var.a(this.z);
        }
        int ordinal = this.w.ordinal();
        int ordinal2 = this.D.ordinal();
        t tVar = this.A;
        if (ordinal < ordinal2) {
            tVar.i(this.w);
        } else {
            tVar.i(this.D);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            Bundle bundle = bVar.c;
            if (!jl40.l(this.y, bVar.y) || !jl40.l(this.b, bVar.b) || !jl40.l(this.A, bVar.A) || this.B.b != bVar.B.b) {
                return false;
            }
            Bundle bundle2 = this.c;
            if (jl40.l(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                Set<String> set = keySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    if (!jl40.l(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.q7u
    public final y8f getDefaultViewModelCreationExtras() {
        nx40 nx40Var = new nx40(0);
        Context applicationContext = this.a.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            nx40Var.b(gs31.x, application);
        }
        nx40Var.b(g0.a, this);
        nx40Var.b(g0.b, this);
        Bundle a = a();
        if (a != null) {
            nx40Var.b(g0.c, a);
        }
        return nx40Var;
    }

    @Override // defpackage.q7u
    public final hs31 getDefaultViewModelProviderFactory() {
        return this.E;
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.A;
    }

    @Override // defpackage.j2m0
    public final g2m0 getSavedStateRegistry() {
        return this.B.b;
    }

    @Override // defpackage.rs31
    public final qs31 getViewModelStore() {
        if (!this.C) {
            ny61.r("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (this.A.w == Lifecycle.State.DESTROYED) {
            ny61.r("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        a550 a550Var = this.x;
        if (a550Var == null) {
            ny61.r("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        LinkedHashMap linkedHashMap = a550Var.b;
        String str = this.y;
        qs31 qs31Var = (qs31) linkedHashMap.get(str);
        if (qs31Var != null) {
            return qs31Var;
        }
        qs31 qs31Var2 = new qs31();
        linkedHashMap.put(str, qs31Var2);
        return qs31Var2;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.b.hashCode() + (this.y.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.B.b.hashCode() + ((this.A.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b.class.getSimpleName());
        sb.append(Extension.O_BRAKE + this.y + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
