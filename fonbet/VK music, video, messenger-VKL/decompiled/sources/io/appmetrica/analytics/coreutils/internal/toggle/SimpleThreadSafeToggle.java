package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.zcl;

/* loaded from: classes8.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {
    private final String a;
    private boolean b;
    private final ArrayList c;

    public SimpleThreadSafeToggle(boolean z, String str) {
        this.a = str;
        this.b = z;
        this.c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.b;
    }

    public final String getTag() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean z) {
        this.c.add(toggleObserver);
        if (z) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z) {
        if (z != getActualState()) {
            this.b = z;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, str);
    }
}
