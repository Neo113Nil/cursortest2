package com.yandex.messaging.internal.storage.contacts;

import android.os.SystemClock;
import defpackage.aae;
import defpackage.at2;
import defpackage.cae;
import defpackage.cvi0;
import defpackage.dvi0;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.l020;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.sr10;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class a {
    public final h3y a;
    public final n0 b;
    public final eci0 c;
    public final dvi0 d;
    public final sr10 e;

    public a(h3y h3yVar, at2 at2Var) {
        this.a = h3yVar;
        n0 c = ffx.c(0, 1, null, 5);
        this.b = c;
        this.c = e.c(c);
        this.d = at2Var.v();
        this.e = at2Var.e0();
    }

    public final aae a(String str) {
        cvi0 e = this.d.e(str);
        if (e == null) {
            return null;
        }
        if (e.d) {
            e = null;
        }
        if (e != null) {
            return new aae(e.b, str, e.e);
        }
        return null;
    }

    public final Object b(String str, SuspendLambda suspendLambda) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ContactsStorage$getContactName$2(this, str, null), suspendLambda);
    }

    public final void c(Set set) {
        if (set.isEmpty()) {
            return;
        }
        cae caeVar = (cae) this.a.get();
        caeVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l020 C = caeVar.a.C();
        try {
            C.U(set);
            C.s();
            C.close();
            caeVar.b.c("tech contacts info updated", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            this.b.g(zy11.a);
        } finally {
        }
    }
}
