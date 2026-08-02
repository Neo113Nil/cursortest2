package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.dsg;
import defpackage.jse;
import defpackage.llc0;
import defpackage.pgz;
import defpackage.plc0;
import defpackage.sbx;
import defpackage.tje;
import defpackage.zcx;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b {
    public final pgz a;
    public final jse b;
    public final SharedPreferences c;
    public final zcx d = tje.a(sbx.d, new dsg(9));

    public b(Context context, pgz pgzVar, jse jseVar) {
        this.a = pgzVar;
        this.b = jseVar;
        this.c = context.getSharedPreferences("plaque_definition_preferences", 0);
    }

    public static final String a(b bVar, llc0 llc0Var) {
        bVar.getClass();
        return llc0Var.a + '|' + llc0Var.b + '|' + llc0Var.c;
    }

    public final Object b(llc0 llc0Var, Continuation continuation) {
        return tje.k0(this.b, new DefaultPrefsGraphQlPlaqueDataSource$get$2(this, llc0Var, null), continuation);
    }

    public final Object c(llc0 llc0Var, plc0 plc0Var, Continuation continuation) {
        Object k0 = tje.k0(this.b, new DefaultPrefsGraphQlPlaqueDataSource$put$2(this, llc0Var, plc0Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
