package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4999m implements ActivityLifecycleListener {
    public final HashSet a = new HashSet();

    public C4999m(@NonNull C5051o c5051o) {
        c5051o.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(@NonNull InterfaceC4973l interfaceC4973l) {
        this.a.add(interfaceC4973l);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        C5030n4.l().c.a().execute(new RunnableC4947k(this, activity));
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C4993lj) ((InterfaceC4973l) it.next())).a(activity);
        }
    }
}
