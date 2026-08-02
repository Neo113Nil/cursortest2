package com.yandex.messaging.internal.authorized.online;

import defpackage.g370;
import defpackage.h370;
import defpackage.kse;
import defpackage.tje;
import defpackage.x22;
import defpackage.xdf0;
import java.util.HashMap;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class b implements g370 {
    public final x22 a;
    public final kse b;
    public final HashMap c = new HashMap();

    public b(x22 x22Var, xdf0 xdf0Var, kse kseVar) {
        this.a = x22Var;
        this.b = kseVar;
        tje.N(xdf0Var, null, null, new OnlineStatusReporterImpl$1(this, null), 3);
    }

    @Override // defpackage.g370
    public final void a(long j, String str, String str2) {
        kse.a(this.b);
        this.a.reportEvent("online_info_ignored", kotlin.collections.b.i(new Pair("guid", str), new Pair("lastSeenMs", Long.valueOf(j)), new Pair(CRLReasonCodeExtension.REASON, str2)));
    }

    @Override // defpackage.g370
    public final void b(long j, long j2, String str) {
        kse.a(this.b);
        this.a.reportEvent("online_heartbeat_received", kotlin.collections.b.i(new Pair("guid", str), new Pair("lastSeenMs", Long.valueOf(j)), new Pair("onlineUntil", Long.valueOf(j2))));
    }

    @Override // defpackage.g370
    public final void c(String str, int i, long j, boolean z) {
        kse.a(this.b);
        this.c.put(str, new h370(z, j));
        this.a.reportEvent("online_status_refreshed", kotlin.collections.b.i(new Pair("guid", str), new Pair("isOnline", Boolean.valueOf(z)), new Pair("lastSeenMs", Long.valueOf(j)), new Pair("listenersCount", Integer.valueOf(i))));
    }

    @Override // defpackage.g370
    public final void d(int i, String str) {
        kse.a(this.b);
        this.a.reportEvent("online_subscribe", kotlin.collections.b.i(new Pair("guid", str), new Pair("subscriptionsCount", Integer.valueOf(i))));
    }

    @Override // defpackage.g370
    public final void e(int i, String str) {
        kse.a(this.b);
        this.a.reportEvent("online_unsubscribe", kotlin.collections.b.i(new Pair("guid", str), new Pair("subscriptionsCount", Integer.valueOf(i))));
        if (i == 0) {
            this.c.remove(str);
        }
    }

    @Override // defpackage.g370
    public final void f(long j, String str) {
        kse.a(this.b);
        this.a.reportEvent("online_typing_received", kotlin.collections.b.i(new Pair("guid", str), new Pair("lastSeenMs", Long.valueOf(j))));
    }
}
