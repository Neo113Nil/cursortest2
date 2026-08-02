package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.impl.C4866gl;
import io.appmetrica.analytics.impl.C5193tc;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4866gl {
    public final C5051o a;
    public final C5312y5 b;
    public final ActivityLifecycleListener c;
    public final ActivityLifecycleListener d;
    public final C5103q e;
    public final C4999m f;
    public boolean g;

    public C4866gl(C5051o c5051o, C4999m c4999m) {
        this(c5051o, c4999m, new C5312y5(), new C5103q());
    }

    public final void a(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C5312y5 c5312y5 = this.b;
            InterfaceC4988le interfaceC4988le = new InterfaceC4988le() { // from class: xsna.fyy0
                @Override // io.appmetrica.analytics.impl.InterfaceC4988le
                public final void consume(Object obj) {
                    C4866gl.this.a(activity, (C5193tc) obj);
                }
            };
            c5312y5.getClass();
            C5030n4.l().c.a().execute(new RunnableC5287x5(c5312y5, interfaceC4988le));
        }
    }

    public final void b(final Activity activity, ActivityEvent activityEvent) {
        synchronized (this) {
            C5312y5 c5312y5 = this.b;
            InterfaceC4988le interfaceC4988le = new InterfaceC4988le() { // from class: xsna.cyy0
                @Override // io.appmetrica.analytics.impl.InterfaceC4988le
                public final void consume(Object obj) {
                    C4866gl.this.b(activity, (C5193tc) obj);
                }
            };
            c5312y5.getClass();
            C5030n4.l().c.a().execute(new RunnableC5287x5(c5312y5, interfaceC4988le));
        }
    }

    public C4866gl(C5051o c5051o, C4999m c4999m, C5312y5 c5312y5, C5103q c5103q) {
        this.g = false;
        this.a = c5051o;
        this.f = c4999m;
        this.b = c5312y5;
        this.e = c5103q;
        this.c = new ActivityLifecycleListener() { // from class: xsna.dyy0
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                C4866gl.this.a(activity, activityEvent);
            }
        };
        this.d = new ActivityLifecycleListener() { // from class: xsna.eyy0
            @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
            public final void onEvent(Activity activity, ActivityEvent activityEvent) {
                C4866gl.this.b(activity, activityEvent);
            }
        };
    }

    public final void a(Activity activity, C5193tc c5193tc) {
        if (this.g && this.e.a(activity, EnumC5077p.RESUMED)) {
            c5193tc.a(activity);
        }
    }

    public final void b(Activity activity, C5193tc c5193tc) {
        if (this.g && this.e.a(activity, EnumC5077p.PAUSED)) {
            c5193tc.b(activity);
        }
    }

    public final synchronized EnumC5025n a() {
        try {
            if (!this.g) {
                this.a.registerListener(this.c, ActivityEvent.RESUMED);
                this.a.registerListener(this.d, ActivityEvent.PAUSED);
                this.g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a.b;
    }
}
