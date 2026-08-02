package com.yandex.passport.internal.sso;

import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.properties.p;

/* loaded from: classes8.dex */
public final class l {
    public final p a;
    public final com.yandex.passport.internal.flags.j b;

    public l(p pVar, com.yandex.passport.internal.flags.j jVar) {
        this.a = pVar;
        this.b = jVar;
    }

    public final boolean a() {
        Boolean bool = this.a.n;
        if (bool != null) {
            return !bool.booleanValue();
        }
        com.yandex.passport.internal.flags.a aVar = q.a;
        return ((Boolean) this.b.b(q.i)).booleanValue();
    }
}
