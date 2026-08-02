package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import xsna.c63;

/* compiled from: LifecycleAwareServiceManager.kt */
/* loaded from: classes17.dex */
public final class b4z extends c63.b {
    public static final b4z b;
    public static final Collection<Intent> c;

    static {
        b4z b4zVar = new b4z();
        b = b4zVar;
        c = Collections.synchronizedCollection(new ArrayList());
        c63 c63Var = c63.a;
        c63.a(b4zVar);
    }

    public static void D(Intent intent) {
        try {
            L.e("start service " + intent);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("start_service");
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            aVar.c("action", action);
            aVar.f();
            bVar.k(aVar.e());
            context.startService(intent);
        } catch (Throwable th) {
            L.G("can't start service " + intent);
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }

    public static final void E(Intent intent, boolean z) {
        if (!z) {
            c63 c63Var = c63.a;
            if (!c63.f) {
                L.l("Error! permitted to create background services!");
                L.e("add pending service " + intent);
                c.add(intent);
                return;
            }
        }
        b.getClass();
        D(intent);
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        Collection<Intent> collection = c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            D((Intent) it.next());
        }
        collection.clear();
    }
}
