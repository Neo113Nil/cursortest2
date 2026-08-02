package com.yandex.passport.internal.sso;

import android.os.Bundle;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.report.reporters.DropPlace;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.sso.announcing.SsoAccountsSyncHelper$Source;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes15.dex */
public final class k {
    public final g a;
    public final com.yandex.passport.internal.sso.announcing.a b;
    public final b1 c;
    public final com.yandex.passport.internal.network.mappers.h d;

    public k(g gVar, com.yandex.passport.internal.sso.announcing.a aVar, b1 b1Var, com.yandex.passport.internal.network.mappers.h hVar) {
        this.a = gVar;
        this.b = aVar;
        this.c = b1Var;
        this.d = hVar;
    }

    public final void a(String str) {
        if (this.a.b(str)) {
            return;
        }
        ny61.z("Unknown application ".concat(str));
    }

    public final Bundle b(String str) {
        ModernAccount b;
        MasterToken masterToken;
        ArrayList a = this.b.a();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            AccountRow accountRow = bVar.b;
            if (accountRow == null || (b = this.d.b(accountRow)) == null || (masterToken = b.getMasterToken()) == null || masterToken.isDropped()) {
                this.c.j(DropPlace.GET_ACCOUNT, bVar.a.a, str);
            }
        }
        Set set = b.c;
        return u.E(a);
    }

    public final Bundle c(String str, ArrayList arrayList) {
        ModernAccount b;
        MasterToken masterToken;
        if (this.a.b(str)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                AccountRow accountRow = bVar.b;
                if (accountRow == null || (b = this.d.b(accountRow)) == null || (masterToken = b.getMasterToken()) == null || masterToken.isDropped()) {
                    this.c.j(DropPlace.INSERT_ACCOUNT, bVar.a.a, str);
                }
            }
            this.b.c(arrayList, str, SsoAccountsSyncHelper$Source.INSERT);
        }
        return new Bundle();
    }
}
