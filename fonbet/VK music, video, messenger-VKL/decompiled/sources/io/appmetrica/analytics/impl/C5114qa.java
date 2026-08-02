package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5114qa {
    public static final C5114qa d = new C5114qa();
    public final Dd a = new Dd();
    public final ServiceComponentsInitializer b = AbstractC4994lk.a();
    public boolean c = false;

    public final void a(Context context) {
        C5013md c5013md;
        C5342za.a(context);
        this.b.onCreate(context);
        this.a.getClass();
        List<String> a = C5342za.I.s.a();
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        for (String str : a) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c5013md = new C5013md(str, false);
            } else {
                C5342za.I.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c5013md = new C5013md(str, true);
            }
            arrayList.add(c5013md);
        }
        new C5302xk(C5342za.I.D().d).a(context);
        Go go = C5342za.I.D().c;
        synchronized (go) {
            go.a.a();
        }
        C5342za.I.q().a();
        new C5039nd(C5342za.I.d.b(), C5342za.I.y(), "service_modules", new SystemTimeProvider()).a(arrayList);
    }

    public final void b(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.c) {
                    a(context);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
