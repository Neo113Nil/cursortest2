package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.compose.ui.platform.v;
import androidx.fragment.app.d0;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.styling.interactor.b;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.sso.announcing.SsoAnnouncer$Source;
import com.yandex.passport.internal.sso.announcing.a;
import com.yandex.passport.internal.sso.announcing.c;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.impl.C0398hl;
import io.appmetrica.analytics.impl.Tl;
import io.appmetrica.analytics.impl.Xe;
import io.appmetrica.analytics.locationinternal.impl.C0933c;
import io.appmetrica.analytics.locationinternal.impl.C0973o0;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.networkquality.impl.n;
import io.appmetrica.analytics.networkquality.internal.NetworkQualityConfigWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes8.dex */
public final /* synthetic */ class bsq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bsq0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Runnable runnable = (Runnable) obj2;
                csq0 csq0Var = (csq0) obj;
                try {
                    Process.setThreadPriority(10);
                    runnable.run();
                    Binder.flushPendingCommands();
                    return;
                } finally {
                    csq0Var.a();
                }
            case 1:
                g gVar = (g) obj2;
                d0 d0Var = (d0) obj;
                gVar.b.remove(d0Var);
                gVar.c.remove(d0Var);
                return;
            case 2:
                ((hrt0) obj2).f = null;
                ((ymp0) obj).run();
                return;
            case 3:
                ((b) obj2).a.removeOnConfigurationChangedListener((qbs) obj);
                return;
            case 4:
                r951 r951Var = (r951) ((ofa0) obj2).b;
                btx0 btx0Var = r951Var.b;
                z52 z52Var = new z52(r951Var.a, (h2u0) obj, false, 3);
                btx0Var.getClass();
                ((t951) btx0Var).a.execute(z52Var);
                return;
            case 5:
                Tl.a((Tl) obj2, (Bundle) obj);
                return;
            case 6:
                v vVar = (v) obj2;
                Lifecycle lifecycle = (Lifecycle) obj;
                if (vVar.c) {
                    return;
                }
                vVar.w = lifecycle;
                lifecycle.a(vVar);
                return;
            case 7:
                Xe.a((Xe) obj2, (List) obj);
                return;
            case 8:
                c cVar = (c) obj2;
                c0 c0Var = cVar.d;
                SsoAnnouncer$Source ssoAnnouncer$Source = (SsoAnnouncer$Source) obj;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    String uuid = UUID.randomUUID().toString();
                    ArrayList a = ((a) cVar.f.get()).a();
                    ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        Uid d = ((com.yandex.passport.internal.sso.b) it.next()).a().d();
                        StringBuilder sb = new StringBuilder();
                        sb.append(d.getEnvironment().getInteger());
                        sb.append(':');
                        sb.append(d.getValue());
                        arrayList.add(sb.toString());
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(a, 10));
                    Iterator it2 = a.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(u.T(((com.yandex.passport.internal.sso.b) it2.next()).a().a()));
                    }
                    c0Var.j(a.size(), uuid, arrayList, arrayList2);
                    cVar.c(ssoAnnouncer$Source, a);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    w53 w53Var = new w53();
                    w53Var.put("duration", Long.toString(elapsedRealtime2));
                    w53Var.put("session_hash", uuid);
                    c0Var.a.a(p.n, w53Var);
                    return;
                } catch (Exception e) {
                    c0Var.getClass();
                    w53 w53Var2 = new w53();
                    w53Var2.put("error", Log.getStackTraceString(e));
                    c0Var.a.a(p.p, w53Var2);
                    return;
                }
            case 9:
                C0398hl.a((C0398hl) obj2, (RtmConfig) obj);
                return;
            case 10:
                C0398hl.a((C0398hl) obj2, (RtmErrorEvent) obj);
                return;
            case 11:
                n.a((NetworkQualityConfigWrapper) obj2, (n) obj);
                return;
            case 12:
                C0973o0.a((C0973o0) obj2, (C0933c) obj);
                return;
            default:
                C0973o0.a((C0973o0) obj2, (ModuleRemoteConfig) obj);
                return;
        }
    }
}
