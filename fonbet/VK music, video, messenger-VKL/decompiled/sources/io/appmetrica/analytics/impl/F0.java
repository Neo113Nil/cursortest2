package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.e43;
import xsna.go9;
import xsna.pn00;
import xsna.ugq;
import xsna.xe9;

/* loaded from: classes8.dex */
public final class F0 {
    public final Nb a = new Nb(C5030n4.l().d());
    public final Ob b = new Ob();
    public final Qb c = new Qb();

    public final void a(String str, String str2, String str3) {
        Nb nb = this.a;
        if (nb.c.a((Void) null).a && nb.d.a(str).a && nb.e.a(str2).a && nb.f.a(str3).a) {
            this.b.getClass();
            IHandlerExecutor a = C5030n4.l().c.a();
            ((L9) a).b.post(new ugq(this, str, str2, str3));
            return;
        }
        StringBuilder a2 = xe9.a("Failed report event from sender: ", str, " with name = ", str2, " and payload = ");
        a2.append(str3);
        PublicLogger.Companion.getAnonymousInstance().warning(go9.b("[AppMetricaLibraryAdapterProxy]", a2.toString()), new Object[0]);
    }

    public static final void a(F0 f0, String str, String str2, String str3) {
        List list;
        Context a;
        Qb qb = f0.c;
        qb.getClass();
        if (str == null) {
            str = "null";
        }
        Pair pair = new Pair("sender", str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pair2 = new Pair(NotificationCompat.CATEGORY_EVENT, str2);
        if (str3 == null) {
            str3 = "null";
        }
        LinkedHashMap m = pn00.m(pair, pair2, new Pair("payload", str3));
        ModuleEvent.Builder withName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        synchronized (qb) {
            try {
                if (qb.a == null && (a = C5030n4.l().g.a()) != null) {
                    qb.a = e43.l(new C4704ae(), new C5101pn(a), new To());
                }
                list = qb.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC5180t) it.next()).a(m);
            }
        }
        ModulesFacade.reportEvent(withName.withAttributes(m).build());
    }
}
