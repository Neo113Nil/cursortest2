package com.yandex.passport.internal;

import android.accounts.Account;
import android.text.TextUtils;
import com.yandex.passport.common.core.Uid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class b {
    public final List a;
    public final com.yandex.passport.internal.network.mappers.h b;

    public b(List list, com.yandex.passport.internal.network.mappers.h hVar) {
        this.a = list;
        this.b = hVar;
    }

    public final AccountRow a(Account account) {
        return com.yandex.passport.common.permission.b.a(this.a, account, null, null, this.b);
    }

    public final ArrayList b() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AccountRow) it.next()).toAccount());
        }
        return arrayList;
    }

    public final ModernAccount c(String str) {
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            ModernAccount b = this.b.b((AccountRow) it.next());
            if ((b != null ? b.getMachineReadableLogin() : null) != null && TextUtils.equals(str, b.getMachineReadableLogin())) {
                return b;
            }
        }
    }

    public final ModernAccount d(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ModernAccount b = this.b.b((AccountRow) it.next());
            if (b != null && b.getUid().getValue() == j) {
                return b;
            }
        }
        return null;
    }

    public final ModernAccount e(Uid uid) {
        return com.yandex.passport.common.permission.b.b(this.a, uid, null, this.b);
    }

    public final ArrayList f() {
        List list = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ModernAccount b = this.b.b((AccountRow) it.next());
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
