package com.yandex.passport.internal.helper;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.sso.AccountAction$LastAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class a {
    public final DatabaseHelper a;
    public final com.yandex.passport.common.a b;
    public final com.yandex.passport.internal.network.mappers.h c;

    public a(DatabaseHelper databaseHelper, com.yandex.passport.common.a aVar, com.yandex.passport.internal.network.mappers.h hVar) {
        this.a = databaseHelper;
        this.b = aVar;
        this.c = hVar;
    }

    public final com.yandex.passport.internal.sso.a a(ModernAccount modernAccount) {
        com.yandex.passport.internal.sso.a aVar;
        com.yandex.passport.internal.sso.a lastAction = this.a.getLastAction(modernAccount.getUid());
        com.yandex.passport.common.a aVar2 = this.b;
        if (lastAction == null || lastAction.a() == AccountAction$LastAction.DELETE) {
            Uid uid = modernAccount.getUid();
            int xTokenIssuedAt = modernAccount.getXTokenIssuedAt();
            AccountAction$LastAction accountAction$LastAction = AccountAction$LastAction.ADD;
            aVar2.getClass();
            aVar = new com.yandex.passport.internal.sso.a(uid, xTokenIssuedAt, accountAction$LastAction, System.currentTimeMillis());
        } else {
            if (modernAccount.getMasterToken().getValue() == null) {
                return lastAction;
            }
            int xTokenIssuedAt2 = modernAccount.getXTokenIssuedAt();
            if (lastAction.c() == xTokenIssuedAt2) {
                xTokenIssuedAt2 = lastAction.c();
            } else if (lastAction.c() > xTokenIssuedAt2) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Sso: current timestamp > accountTimestamp", 8);
                }
                xTokenIssuedAt2 = lastAction.c();
            } else {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Sso: current timestamp < accountTimestamp # updating timestamp", 8);
                }
            }
            int i = xTokenIssuedAt2;
            Uid uid2 = modernAccount.getUid();
            AccountAction$LastAction accountAction$LastAction2 = AccountAction$LastAction.ADD;
            aVar2.getClass();
            aVar = new com.yandex.passport.internal.sso.a(uid2, i, accountAction$LastAction2, System.currentTimeMillis());
        }
        b(aVar);
        return aVar;
    }

    public final void b(com.yandex.passport.internal.sso.a aVar) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Sso: Write account action: " + aVar, 8);
        }
        this.a.addOrUpdateAccountLastAction(aVar);
    }

    public final void c(com.yandex.passport.internal.a aVar) {
        com.yandex.passport.internal.network.mappers.h hVar;
        List a = aVar.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hVar = this.c;
            if (!hasNext) {
                break;
            }
            ModernAccount b = hVar.b((AccountRow) it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a((ModernAccount) it2.next());
        }
        List b2 = aVar.b();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = b2.iterator();
        while (it3.hasNext()) {
            ModernAccount b3 = hVar.b((AccountRow) it3.next());
            if (b3 != null) {
                arrayList2.add(b3);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ModernAccount modernAccount = (ModernAccount) it4.next();
            Uid uid = modernAccount.getUid();
            com.yandex.passport.internal.sso.a lastAction = this.a.getLastAction(modernAccount.getUid());
            int c = lastAction != null ? lastAction.c() : modernAccount.getXTokenIssuedAt();
            AccountAction$LastAction accountAction$LastAction = AccountAction$LastAction.DELETE;
            this.b.getClass();
            b(new com.yandex.passport.internal.sso.a(uid, c, accountAction$LastAction, System.currentTimeMillis()));
        }
        List d = aVar.d();
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = d.iterator();
        while (it5.hasNext()) {
            ModernAccount b4 = hVar.b((AccountRow) it5.next());
            if (b4 != null) {
                arrayList3.add(b4);
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            a((ModernAccount) it6.next());
        }
    }
}
