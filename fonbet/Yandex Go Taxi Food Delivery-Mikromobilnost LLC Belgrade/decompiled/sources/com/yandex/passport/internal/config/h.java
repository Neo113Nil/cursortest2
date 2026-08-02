package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.k5;
import com.yandex.passport.data.network.l5;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.qv10;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes8.dex */
public final class h {
    public final e a;
    public final com.yandex.passport.common.common.a b;

    public h(e eVar, com.yandex.passport.common.common.a aVar) {
        this.a = eVar;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    public final void a(Environment environment, List list, List list2) {
        ?? r6;
        Object obj;
        SharedPreferences b = this.a.b(environment);
        if (b == null) {
            return;
        }
        Set<String> stringSet = b.getStringSet("location_ids", null);
        if (stringSet != null) {
            r6 = new ArrayList();
            Iterator it = stringSet.iterator();
            while (it.hasNext()) {
                Long m = bvu0.m(10, (String) it.next());
                if (m != null) {
                    r6.add(m);
                }
            }
        } else {
            r6 = EmptySet.a;
        }
        SharedPreferences.Editor edit = b.edit();
        String a = ((com.yandex.passport.internal.common.e) this.b).a();
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((l5) obj).a.contains(a)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        l5 l5Var = (l5) obj;
        List list3 = l5Var != null ? l5Var.b : null;
        if (list3 == null) {
            edit.putBoolean("is_default_config_used", true);
            list3 = list2;
        } else {
            edit.putBoolean("is_default_config_used", false);
        }
        List<k5> list4 = list3;
        ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList.add(Long.valueOf(((k5) it3.next()).a));
        }
        Set N0 = kotlin.collections.a.N0(arrayList);
        Set set = N0;
        Iterator it4 = kotlin.collections.a.k0((Iterable) r6, set).iterator();
        while (it4.hasNext()) {
            long longValue = ((Number) it4.next()).longValue();
            edit.remove("location_backend_host_" + longValue);
            edit.remove("location_webam_host_" + longValue);
            edit.remove("location_webam_yandex_host_" + longValue);
            edit.remove("location_webam_id_yandex_host_" + longValue);
        }
        for (k5 k5Var : list4) {
            long j = k5Var.a;
            edit.putString(qv10.j(j, "location_backend_host_"), k5Var.b);
            edit.putString("location_webam_host_" + j, k5Var.c);
            String str = "location_webam_yandex_host_" + j;
            String str2 = k5Var.d;
            if (str2 == null || evu0.J(str2)) {
                str2 = null;
            }
            edit.putString(str, str2);
            String str3 = "location_webam_id_yandex_host_" + j;
            String str4 = k5Var.e;
            if (str4 == null || evu0.J(str4)) {
                str4 = null;
            }
            edit.putString(str3, str4);
        }
        if (N0.isEmpty()) {
            edit.remove("location_ids");
        } else {
            ArrayList arrayList2 = new ArrayList(tcc.n(set, 10));
            Iterator it5 = set.iterator();
            while (it5.hasNext()) {
                arrayList2.add(String.valueOf(((Number) it5.next()).longValue()));
            }
            edit.putStringSet("location_ids", kotlin.collections.a.N0(arrayList2));
        }
        edit.apply();
    }
}
