package com.yandex.passport.internal.account;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.storage.i;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final b b;

    public a(com.yandex.passport.internal.core.accounts.d dVar, b bVar) {
        this.a = dVar;
        this.b = bVar;
    }

    public final ModernAccount a() {
        return b(this.a.a());
    }

    public final ModernAccount b(com.yandex.passport.internal.b bVar) {
        ModernAccount e;
        b bVar2 = this.b;
        Uid b = bVar2.a.b();
        if (b != null && (e = bVar.e(b)) != null) {
            return e;
        }
        i iVar = bVar2.a;
        String str = (String) iVar.c.getValue(iVar, i.m[1]);
        if (str != null) {
            return com.yandex.passport.common.permission.b.b(bVar.a, null, str, bVar.b);
        }
        return null;
    }
}
