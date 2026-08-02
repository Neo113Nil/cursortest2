package com.yandex.go.sdk_registry.wrappers.mob;

import com.yandex.go.sdk_registry.api.SdkLifecycleStage;
import com.yandex.go.sdk_registry.api.exceptions.SdkInitializationException;
import defpackage.fyc;
import defpackage.gnp0;
import defpackage.gwk0;
import defpackage.hnp0;
import defpackage.inp0;
import defpackage.kr20;
import defpackage.p0;
import defpackage.pxf0;
import defpackage.qnp0;
import defpackage.sed;
import defpackage.tls;
import defpackage.wls;
import defpackage.zls;
import java.util.concurrent.CancellationException;
import kotlin.Pair;

/* loaded from: classes13.dex */
public final class a {
    public final inp0 a;
    public final qnp0 b;
    public final wls c;
    public final tls d;
    public final tls e;
    public final zls f;
    public final zls g;
    public final Object h;
    public final fyc i;
    public Object j;
    public hnp0 k;
    public volatile boolean l;
    public SdkInitializationException m;

    public a(inp0 inp0Var, qnp0 qnp0Var, wls wlsVar, tls tlsVar, int i) {
        tls tlsVar2 = MobSdkComponentHolderKt$mobChildSdkComponentHolder$3.b;
        zls zlsVar = MobSdkComponentHolderKt$mobMainSdkComponentHolder$3.b;
        zls zlsVar2 = MobSdkComponentHolderKt$mobMainSdkComponentHolder$4.b;
        tlsVar2 = (i & 16) != 0 ? new p0(25) : tlsVar2;
        int i2 = 27;
        zlsVar = (i & 32) != 0 ? new sed(i2) : zlsVar;
        zlsVar2 = (i & 64) != 0 ? new sed(i2) : zlsVar2;
        this.a = inp0Var;
        this.b = qnp0Var;
        this.c = wlsVar;
        this.d = tlsVar;
        this.e = tlsVar2;
        this.f = zlsVar;
        this.g = zlsVar2;
        this.h = new Object();
        this.i = gwk0.b();
    }

    public final Object a(gnp0 gnp0Var) {
        Object obj = this.j;
        if (obj != null) {
            return obj;
        }
        hnp0 a = gnp0Var.a(this.a);
        if (a == null) {
            throw new SdkInitializationException(this.b.a, new IllegalStateException("Mob SDK Registry dependencies are missing"));
        }
        Object invoke = this.c.invoke(gnp0Var, a);
        this.d.invoke(invoke);
        this.j = invoke;
        this.k = a;
        return invoke;
    }

    public final void b(gnp0 gnp0Var) {
        synchronized (this.h) {
            try {
                SdkInitializationException sdkInitializationException = this.m;
                if (sdkInitializationException != null) {
                    throw sdkInitializationException;
                }
                if (this.l) {
                    return;
                }
                try {
                    Object a = a(gnp0Var);
                    this.e.invoke(a);
                    this.l = true;
                    this.i.T(a);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    SdkInitializationException sdkInitializationException2 = th instanceof SdkInitializationException ? th : new SdkInitializationException(this.b.a, th);
                    this.m = sdkInitializationException2;
                    this.i.j0(sdkInitializationException2);
                    throw sdkInitializationException2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(gnp0 gnp0Var) {
        synchronized (this.h) {
            try {
                SdkInitializationException sdkInitializationException = this.m;
                if (sdkInitializationException != null) {
                    throw sdkInitializationException;
                }
                try {
                    try {
                        a(gnp0Var);
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    SdkInitializationException sdkInitializationException2 = th instanceof SdkInitializationException ? th : new SdkInitializationException(this.b.a, th);
                    this.m = sdkInitializationException2;
                    this.i.j0(sdkInitializationException2);
                    throw sdkInitializationException2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(SdkLifecycleStage sdkLifecycleStage, pxf0 pxf0Var) {
        zls zlsVar;
        Pair pair;
        int i = kr20.a[sdkLifecycleStage.ordinal()];
        if (i == 1) {
            zlsVar = this.f;
        } else if (i != 2) {
            return;
        } else {
            zlsVar = this.g;
        }
        synchronized (this.h) {
            Object obj = this.j;
            hnp0 hnp0Var = this.k;
            pair = (obj == null || hnp0Var == null) ? null : new Pair(obj, hnp0Var);
        }
        if (pair == null) {
            return;
        }
        zlsVar.invoke(pxf0Var, pair.c(), pair.f());
    }
}
