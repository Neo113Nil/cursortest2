package com.yandex.passport.internal.push;

import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.kgx;
import defpackage.qoi0;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes8.dex */
public final class m0 {
    public final com.yandex.passport.common.a a;
    public final long b;
    public final com.yandex.passport.internal.util.storage.b c;
    public final com.yandex.passport.internal.util.storage.b d;
    public final com.yandex.passport.internal.util.storage.b e;
    public static final /* synthetic */ kgx[] g = {new PropertyReference1Impl("lastSubscriptionsMap", 0, "getLastSubscriptionsMap()Lcom/yandex/passport/internal/util/storage/PersistableMap;", m0.class), b64.x(qoi0.a, m0.class, "notificationsEnabled", "getNotificationsEnabled()Lcom/yandex/passport/internal/util/storage/PersistableMap;", 0), new PropertyReference1Impl("locationsMap", 0, "getLocationsMap()Lcom/yandex/passport/internal/util/storage/PersistableMap;", m0.class)};
    public static final com.yandex.passport.common.permission.b f = new com.yandex.passport.common.permission.b();

    public m0(com.yandex.passport.common.a aVar, com.yandex.passport.internal.flags.j jVar) {
        long c = com.yandex.passport.common.time.a.c(0, 0, ((Number) jVar.b(com.yandex.passport.internal.flags.q.q)).intValue(), 7);
        this.a = aVar;
        this.b = c;
        this.c = new com.yandex.passport.internal.util.storage.b(null, new com.yandex.passport.internal.flags.c(4), new com.yandex.passport.internal.flags.c(5));
        this.d = new com.yandex.passport.internal.util.storage.b(null, new com.yandex.passport.internal.flags.c(6), new com.yandex.passport.internal.flags.c(7));
        this.e = new com.yandex.passport.internal.util.storage.b(null, new com.yandex.passport.internal.flags.c(8), new com.yandex.passport.internal.flags.c(9));
    }

    public final com.yandex.passport.internal.util.storage.a a() {
        return (com.yandex.passport.internal.util.storage.a) this.c.getValue(this, g[0]);
    }

    public final void b(Uid uid, PushPlatform pushPlatform, boolean z, long j) {
        f.getClass();
        String d = com.yandex.passport.common.permission.b.d(uid, pushPlatform);
        com.yandex.passport.internal.util.storage.a a = a();
        this.a.getClass();
        a.put(d, Long.valueOf(com.yandex.passport.common.a.a()));
        Boolean valueOf = Boolean.valueOf(z);
        kgx[] kgxVarArr = g;
        ((com.yandex.passport.internal.util.storage.a) this.d.getValue(this, kgxVarArr[1])).put(d, valueOf);
        Long valueOf2 = Long.valueOf(j);
        com.yandex.passport.internal.util.storage.a aVar = (com.yandex.passport.internal.util.storage.a) this.e.getValue(this, kgxVarArr[2]);
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        aVar.put(sb.toString(), valueOf2);
    }
}
