package com.yandex.passport.internal.rotation;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.internal.report.i;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.k8;
import com.yandex.passport.internal.report.l8;
import com.yandex.passport.internal.report.reporters.i0;
import defpackage.i3y;
import defpackage.z8u0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class g {
    public final i0 a;
    public final i3y b = kotlin.a.a(new com.yandex.passport.common.network.a(8));
    public final i3y c;

    public g(Context context, i0 i0Var) {
        this.a = i0Var;
        this.c = kotlin.a.a(new z8u0(5, this, context));
    }

    public final List a() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c.getValue();
        EmptyList emptyList = EmptyList.a;
        if (sharedPreferences == null) {
            i0 i0Var = this.a;
            i0Var.getClass();
            i0Var.h(l8.w);
            return emptyList;
        }
        String string = sharedPreferences.getString("quarantine_master_token_list_key", null);
        if (string == null) {
            return emptyList;
        }
        f.Companion.getClass();
        return e.a(string);
    }

    public final void b(f fVar) {
        ArrayList arrayList = new ArrayList(a());
        arrayList.remove(fVar);
        c(arrayList);
        i0 i0Var = this.a;
        i0Var.getClass();
        i0Var.f(k8.w, new jd(Long.valueOf(fVar.c().getValue())), new i(fVar.b(), 26));
    }

    public final void c(ArrayList arrayList) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        SharedPreferences sharedPreferences = (SharedPreferences) this.c.getValue();
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putString = edit.putString("quarantine_master_token_list_key", f.Companion.b(arrayList))) != null) {
            putString.apply();
            return;
        }
        i0 i0Var = this.a;
        i0Var.getClass();
        i0Var.h(l8.w);
    }
}
