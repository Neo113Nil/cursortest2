package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.network.t;
import com.yandex.passport.data.network.c5;
import com.yandex.passport.data.network.f5;
import defpackage.auu0;
import defpackage.gw00;
import defpackage.iw00;
import defpackage.k8u;
import defpackage.p53;
import defpackage.sbx;
import defpackage.ta90;
import defpackage.tcc;
import defpackage.tje;
import defpackage.z96;
import defpackage.zcx;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class b {
    public static final zcx b = tje.a(sbx.d, new t(5));
    public static final k8u c;
    public final e a;

    static {
        auu0 auu0Var = auu0.a;
        c = new k8u(auu0Var, new p53(new ta90(auu0Var, z96.a), 0), 1);
    }

    public b(e eVar) {
        this.a = eVar;
    }

    public final Map a(String str, Environment environment) {
        String string;
        SharedPreferences b2 = this.a.b(environment);
        if (b2 == null || (string = b2.getString(str, null)) == null) {
            return kotlin.collections.b.f();
        }
        try {
            return (Map) b.b(c, string);
        } catch (Exception unused) {
            return kotlin.collections.b.f();
        }
    }

    public final void b(Environment environment, List list, List list2) {
        SharedPreferences b2 = this.a.b(environment);
        if (b2 == null) {
            return;
        }
        List<c5> list3 = list;
        int d = gw00.d(tcc.n(list3, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (c5 c5Var : list3) {
            Pair pair = new Pair(c5Var.a(), iw00.x(c5Var.b()));
            linkedHashMap.put(pair.c(), pair.f());
        }
        List<f5> list4 = list2;
        int d2 = gw00.d(tcc.n(list4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
        for (f5 f5Var : list4) {
            Pair pair2 = new Pair(f5Var.a(), iw00.x(f5Var.b()));
            linkedHashMap2.put(pair2.c(), pair2.f());
        }
        SharedPreferences.Editor edit = b2.edit();
        zcx zcxVar = b;
        k8u k8uVar = c;
        edit.putString("autologin_app_parameters", zcxVar.c(linkedHashMap, k8uVar));
        edit.putString("autologin_client_id_parameters", zcxVar.c(linkedHashMap2, k8uVar));
        edit.apply();
    }
}
