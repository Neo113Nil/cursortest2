package com.yandex.passport.internal.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.o5;
import com.yandex.passport.internal.report.dc;
import com.yandex.passport.internal.report.reporters.g1;
import defpackage.jl40;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class o {
    public final e a;
    public final com.yandex.passport.common.common.a b;
    public final g1 c;

    public o(e eVar, com.yandex.passport.common.common.a aVar, g1 g1Var) {
        this.a = eVar;
        this.b = aVar;
        this.c = g1Var;
    }

    public final void a(Environment environment, List list, Set set) {
        Long l;
        long longValue;
        boolean z;
        SharedPreferences.Editor edit;
        com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) this.b;
        String a = eVar.a();
        Long l2 = eVar.b.e;
        if (l2 != null) {
            longValue = l2.longValue();
        } else {
            Context context = eVar.a;
            try {
                l = Long.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).getLongVersionCode());
            } catch (PackageManager.NameNotFoundException unused) {
                l = null;
            }
            longValue = l != null ? l.longValue() : 0L;
        }
        List<o5> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (o5 o5Var : list2) {
                if (jl40.l(o5Var.a, a) && longValue >= o5Var.b) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        g1 g1Var = this.c;
        g1Var.getClass();
        g1Var.i(dc.w, new com.yandex.passport.internal.report.f("should_block", String.valueOf(z)));
        SharedPreferences b = this.a.b(environment);
        if (b == null || (edit = b.edit()) == null) {
            return;
        }
        edit.putBoolean("blockVpn", z);
        edit.putStringSet("vpnManualMode", set);
        edit.apply();
    }
}
