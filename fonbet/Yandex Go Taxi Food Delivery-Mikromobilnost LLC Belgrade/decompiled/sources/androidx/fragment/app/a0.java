package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g0;
import defpackage.b7;
import defpackage.csf0;
import defpackage.g2m0;
import defpackage.gs31;
import defpackage.h2m0;
import defpackage.hs31;
import defpackage.i2m0;
import defpackage.j2m0;
import defpackage.k2m0;
import defpackage.nx40;
import defpackage.q7u;
import defpackage.qs31;
import defpackage.rs31;
import defpackage.y8f;

/* loaded from: classes.dex */
public final class a0 implements q7u, j2m0, rs31 {
    public final Fragment a;
    public final qs31 b;
    public final b7 c;
    public hs31 w;
    public androidx.lifecycle.t x = null;
    public h2m0 y = null;

    public a0(Fragment fragment, qs31 qs31Var, b7 b7Var) {
        this.a = fragment;
        this.b = qs31Var;
        this.c = b7Var;
    }

    public final void a(Lifecycle.Event event) {
        this.x.g(event);
    }

    public final void b() {
        if (this.x == null) {
            this.x = new androidx.lifecycle.t(this, true);
            i2m0 i2m0Var = new i2m0(this, new csf0(20, this));
            this.y = new h2m0(i2m0Var);
            i2m0Var.a();
            this.c.run();
        }
    }

    @Override // defpackage.q7u
    public final y8f getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        nx40 nx40Var = new nx40();
        if (application != null) {
            nx40Var.b(gs31.x, application);
        }
        nx40Var.b(g0.a, fragment);
        nx40Var.b(g0.b, this);
        if (fragment.getArguments() != null) {
            nx40Var.b(g0.c, fragment.getArguments());
        }
        return nx40Var;
    }

    @Override // defpackage.q7u
    public final hs31 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.a;
        hs31 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.w = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.w == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.w = new k2m0(application, fragment, fragment.getArguments());
        }
        return this.w;
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        b();
        return this.x;
    }

    @Override // defpackage.j2m0
    public final g2m0 getSavedStateRegistry() {
        b();
        return this.y.b;
    }

    @Override // defpackage.rs31
    public final qs31 getViewModelStore() {
        b();
        return this.b;
    }
}
