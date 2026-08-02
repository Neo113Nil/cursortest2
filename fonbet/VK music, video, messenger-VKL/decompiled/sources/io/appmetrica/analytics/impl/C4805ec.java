package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.C4805ec;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.izs;

/* renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4805ec implements InterfaceC4728bc, ToggleObserver {
    public final ArrayList a = new ArrayList();
    public final IHandlerExecutor b = C5342za.k().w().c();
    public Un c;
    public boolean d;

    public final void a(Toggle toggle) {
        Un un = new Un(toggle);
        this.c = un;
        un.c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Un un = this.c;
        if (un == null) {
            un = null;
        }
        un.b.b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z) {
        this.b.execute(new Runnable() { // from class: xsna.iuy0
            @Override // java.lang.Runnable
            public final void run() {
                C4805ec.a(C4805ec.this, z);
            }
        });
    }

    public final void a(final LocationControllerObserver locationControllerObserver, final boolean z) {
        this.b.execute(new Runnable() { // from class: xsna.juy0
            @Override // java.lang.Runnable
            public final void run() {
                C4805ec.a(C4805ec.this, locationControllerObserver, z);
            }
        });
    }

    public static final void a(C4805ec c4805ec, LocationControllerObserver locationControllerObserver, boolean z) {
        c4805ec.a.add(locationControllerObserver);
        if (z) {
            if (c4805ec.d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(C4805ec c4805ec, boolean z) {
        if (c4805ec.d != z) {
            c4805ec.d = z;
            izs izsVar = z ? C4754cc.a : C4780dc.a;
            Iterator it = c4805ec.a.iterator();
            while (it.hasNext()) {
                izsVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        Un un = this.c;
        if (un == null) {
            un = null;
        }
        un.b.a(obj);
    }

    public final void a(boolean z) {
        Un un = this.c;
        if (un == null) {
            un = null;
        }
        un.a.a(z);
    }
}
