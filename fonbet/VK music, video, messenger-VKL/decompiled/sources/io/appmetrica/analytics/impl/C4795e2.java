package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4795e2 implements ActivityLifecycleListener {
    public final ArrayList a = new ArrayList();
    public volatile K7 b = null;

    public final void a(@NonNull K7 k7) {
        ArrayList a;
        synchronized (this) {
            this.b = k7;
            a = a();
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4988le) it.next()).consume(k7);
        }
    }

    public final void b() {
        C5030n4.l().e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C5030n4.l().e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new C4744c2());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        C4770d2 c4770d2 = new C4770d2(dataString);
        synchronized (this) {
            try {
                K7 k7 = this.b;
                if (k7 == null) {
                    this.a.add(c4770d2);
                } else {
                    ((L9) C5030n4.l().c.a()).b.post(new RunnableC4718b2(c4770d2, k7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.a);
        this.a.clear();
        return arrayList;
    }
}
