package com.yandex.messaging.domain.contacts;

import android.os.Looper;
import defpackage.iwk0;
import defpackage.k020;
import defpackage.kse;
import defpackage.lqo;
import defpackage.mv21;
import defpackage.o4b;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.udq0;
import defpackage.vds0;
import defpackage.w5t;
import defpackage.z83;
import defpackage.zy11;
import java.util.TreeMap;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class c extends vds0 {
    public final w5t b;
    public final k020 c;
    public final sb7 d;
    public final kse e;
    public final lqo f;

    public c(w5t w5tVar, k020 k020Var, sb7 sb7Var, kse kseVar, lqo lqoVar) {
        super(kseVar.b);
        this.b = w5tVar;
        this.c = k020Var;
        this.d = sb7Var;
        this.e = kseVar;
        this.f = lqoVar;
    }

    public static final o4b d(c cVar, Long l, String str) {
        k020 k020Var = cVar.c;
        int i = 1;
        if (l != null && str == null) {
            if (l.longValue() == 0) {
                mv21 d = k020Var.b.d();
                d.getClass();
                TreeMap treeMap = iwk0.B;
                return new o4b(d.a.O0(udq0.e(0, "SELECT user_id, shown_name FROM users_to_talk\n        LEFT JOIN organizations ON organizations.organization_id=users_to_talk.org_id\n        WHERE (org_id = 0 OR organizations.is_public = 1) GROUP BY user_id ORDER BY shown_name")), i);
            }
            long longValue = l.longValue();
            mv21 d2 = k020Var.b.d();
            d2.getClass();
            TreeMap treeMap2 = iwk0.B;
            iwk0 e = udq0.e(1, "SELECT user_id, shown_name FROM users_to_talk WHERE org_id = ? ORDER BY shown_name");
            e.b(1, longValue);
            return new o4b(d2.a.O0(e), i);
        }
        if (l == null || str == null) {
            if (l != null || str == null) {
                mv21 d3 = k020Var.b.d();
                d3.getClass();
                TreeMap treeMap3 = iwk0.B;
                return new o4b(d3.a.O0(udq0.e(0, "SELECT user_id, shown_name FROM users_to_talk GROUP BY user_id ORDER BY shown_name ")), i);
            }
            k020Var.c.get();
            Looper.myLooper();
            z83.i();
            mv21 d4 = k020Var.b.d();
            d4.getClass();
            TreeMap treeMap4 = iwk0.B;
            iwk0 e2 = udq0.e(1, "SELECT user_id, shown_name FROM users_to_talk WHERE user_search_key LIKE '%' || ? || '%' GROUP BY user_id ORDER BY shown_name");
            e2.m0(1, str);
            return new o4b(d4.a.O0(e2), i);
        }
        if (l.longValue() == 0) {
            k020Var.c.get();
            Looper.myLooper();
            z83.i();
            mv21 d5 = k020Var.b.d();
            d5.getClass();
            TreeMap treeMap5 = iwk0.B;
            iwk0 e3 = udq0.e(1, "SELECT user_id, shown_name FROM users_to_talk\n        LEFT JOIN organizations ON organizations.organization_id=users_to_talk.org_id\n        WHERE (org_id = 0 OR organizations.is_public = 1)\n        AND user_search_key LIKE '%' || ? || '%'  GROUP BY user_id ORDER BY shown_name");
            e3.m0(1, str);
            return new o4b(d5.a.O0(e3), i);
        }
        long longValue2 = l.longValue();
        k020Var.c.get();
        Looper.myLooper();
        z83.i();
        mv21 d6 = k020Var.b.d();
        d6.getClass();
        TreeMap treeMap6 = iwk0.B;
        iwk0 e4 = udq0.e(2, "SELECT user_id, shown_name FROM users_to_talk\n        WHERE org_id = ? AND user_search_key LIKE '%' || ? || '%'  ORDER BY shown_name");
        e4.b(1, longValue2);
        e4.m0(2, str);
        return new o4b(d6.a.O0(e4), i);
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        String str = (String) obj;
        return this.f.a(tz10.j) ? e.X(this.b.a(zy11.a), new GetContactListCursorUseCase$run$$inlined$flatMapLatest$1(null, this, str)) : new rol0(new GetContactListCursorUseCase$contactsFlow$1(this, str, null, null));
    }
}
