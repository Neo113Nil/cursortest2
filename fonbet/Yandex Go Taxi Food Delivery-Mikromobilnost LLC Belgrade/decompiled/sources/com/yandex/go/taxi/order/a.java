package com.yandex.go.taxi.order;

import defpackage.a20;
import defpackage.a3y0;
import defpackage.b20;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.jst;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.uyj;
import defpackage.uz;
import java.util.NoSuchElementException;

/* loaded from: classes14.dex */
public final class a {
    public final String a;
    public final a20 b;
    public pzt0 c;
    public final uz d = new uz(1, this);
    public final /* synthetic */ b20 e;

    public a(b20 b20Var, String str, a20 a20Var) {
        this.e = b20Var;
        this.a = str;
        this.b = a20Var;
    }

    public final void a(Object obj) {
        synchronized (this.a) {
            try {
                this.b.b = obj;
                pzt0 pzt0Var = this.c;
                if (pzt0Var == null || !pzt0Var.isActive()) {
                    a20 a20Var = this.b;
                    Object obj2 = a20Var.b;
                    if (obj2 == null) {
                        throw new NoSuchElementException();
                    }
                    a20Var.b = null;
                    b(obj2, this.d);
                }
            } finally {
            }
        }
    }

    public final void b(Object obj, Runnable runnable) {
        b20 b20Var = this.e;
        b20Var.b.getClass();
        a3y0.h(new String[]{"makeRequest"});
        hst hstVar = jst.e;
        hbp0 hbp0Var = b20Var.c;
        b20Var.a.getClass();
        sjh sjhVar = uyj.a;
        this.c = hbp0.e(hbp0Var, o400.a, null, new ActiveOrderRemoteSettingsSender$Worker$makeRequest$2(this.e, this, obj, runnable, null), 2);
    }
}
