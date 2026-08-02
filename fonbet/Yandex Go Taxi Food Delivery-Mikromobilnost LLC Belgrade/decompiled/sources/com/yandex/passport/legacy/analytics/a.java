package com.yandex.passport.legacy.analytics;

import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.core.accounts.j;
import defpackage.w53;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class a {
    public String a = "";
    public final c0 b;
    public final j c;

    public a(j jVar, c0 c0Var) {
        this.c = jVar;
        this.b = c0Var;
    }

    public final void a() {
        ArrayList b = this.c.b();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            AccountRow accountRow = (AccountRow) it.next();
            sb.append(accountRow.uidString);
            arrayList.add(accountRow.uidString);
        }
        String sb2 = sb.toString();
        synchronized (this) {
            if (!sb2.equals(this.a)) {
                c0 c0Var = this.b;
                c0Var.getClass();
                w53 w53Var = new w53();
                w53Var.put("uid", kotlin.collections.a.X(arrayList, null, null, null, null, 63));
                c0Var.a.b("AM_System AM info v4", w53Var);
                this.a = sb2;
            }
        }
    }
}
