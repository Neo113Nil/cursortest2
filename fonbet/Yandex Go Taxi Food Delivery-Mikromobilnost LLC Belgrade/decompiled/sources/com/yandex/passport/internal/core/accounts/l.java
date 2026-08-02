package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class l {
    public final DatabaseHelper a;
    public final com.yandex.passport.internal.network.mappers.h b;

    public l(DatabaseHelper databaseHelper, com.yandex.passport.internal.network.mappers.h hVar) {
        this.a = databaseHelper;
        this.b = hVar;
    }

    public final ArrayList a(ArrayList arrayList) {
        DatabaseHelper databaseHelper = this.a;
        List<Uid> allDelayedUids = databaseHelper.getAllDelayedUids();
        ArrayList arrayList2 = new ArrayList(tcc.n(allDelayedUids, 10));
        for (Uid uid : allDelayedUids) {
            StringBuilder sb = new StringBuilder();
            sb.append(uid.getEnvironment().getInteger());
            sb.append(':');
            sb.append(uid.getValue());
            arrayList2.add(sb.toString());
        }
        List<AccountRow> accountRows = databaseHelper.getAccountRows();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : accountRows) {
            if (kotlin.collections.a.G(arrayList2, ((AccountRow) obj).uidString)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AccountRow accountRow = (AccountRow) next;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (jl40.l(accountRow.uidString, ((AccountRow) it2.next()).uidString)) {
                        break;
                    }
                }
            }
            arrayList4.add(next);
        }
        return arrayList4;
    }

    public final ArrayList b(ArrayList arrayList) {
        Environment environment;
        DatabaseHelper databaseHelper = this.a;
        List<Uid> allDelayedUids = databaseHelper.getAllDelayedUids();
        ArrayList arrayList2 = new ArrayList(tcc.n(allDelayedUids, 10));
        for (Uid uid : allDelayedUids) {
            StringBuilder sb = new StringBuilder();
            sb.append(uid.getEnvironment().getInteger());
            sb.append(':');
            sb.append(uid.getValue());
            arrayList2.add(sb.toString());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = (String) next;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (jl40.l(str, ((AccountRow) it2.next()).uidString)) {
                        int D = evu0.D(str, ':', 0, false);
                        Uid uid2 = null;
                        if (D >= 1 && D != str.length() - 1) {
                            String substring = str.substring(0, D);
                            try {
                                long parseLong = Long.parseLong(str.substring(D + 1));
                                if (parseLong > 0) {
                                    try {
                                        com.yandex.passport.common.core.a aVar = Environment.Companion;
                                        int parseInt = Integer.parseInt(substring);
                                        aVar.getClass();
                                        environment = com.yandex.passport.common.core.a.a(parseInt);
                                    } catch (Exception unused) {
                                        environment = Environment.PRODUCTION;
                                    }
                                    uid2 = a0.b(environment, parseLong);
                                }
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        if (uid2 != null) {
                            arrayList3.add(uid2);
                        }
                    }
                }
            }
            arrayList4.add(next);
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            databaseHelper.deleteDelayedUid((Uid) it3.next());
        }
        List<AccountRow> accountRows = databaseHelper.getAccountRows();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : accountRows) {
            if (kotlin.collections.a.G(arrayList4, ((AccountRow) obj).uidString)) {
                arrayList5.add(obj);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ModernAccount b = this.b.b((AccountRow) it4.next());
            if (b != null) {
                arrayList6.add(b);
            }
        }
        return arrayList6;
    }
}
