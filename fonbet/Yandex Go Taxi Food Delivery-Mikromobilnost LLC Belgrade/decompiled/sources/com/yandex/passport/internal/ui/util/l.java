package com.yandex.passport.internal.ui.util;

import defpackage.dy40;
import defpackage.pey;
import defpackage.pq60;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class l extends dy40 {
    public final AtomicBoolean l = new AtomicBoolean(false);

    @Override // androidx.lifecycle.v
    public final void l(Object obj) {
        if (obj != null) {
            this.l.set(true);
            super.l(obj);
        }
    }

    public final void n(pey peyVar, final j jVar) {
        if (e()) {
            com.yandex.passport.legacy.a.b("Multiple observers registered but only one will be notified of changes.");
        }
        f(peyVar, new pq60() { // from class: com.yandex.passport.internal.ui.util.k
            @Override // defpackage.pq60
            public final void a(Object obj) {
                if (l.this.l.compareAndSet(true, false)) {
                    obj.getClass();
                    jVar.a(obj);
                }
            }
        });
    }
}
