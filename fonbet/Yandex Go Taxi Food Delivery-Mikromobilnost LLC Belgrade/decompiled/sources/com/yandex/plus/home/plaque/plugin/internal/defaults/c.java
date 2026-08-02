package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.i4z;
import defpackage.jse;
import defpackage.o060;
import defpackage.pgz;
import defpackage.sbx;
import defpackage.tje;
import defpackage.xgh;
import defpackage.zcx;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c {
    public final pgz a;
    public final jse b;
    public final SharedPreferences c;
    public final zcx d = tje.a(sbx.d, new xgh(12));

    public c(Context context, pgz pgzVar, jse jseVar) {
        this.a = pgzVar;
        this.b = jseVar;
        this.c = context.getSharedPreferences("rest_plaque_data_source", 0);
    }

    public static String g(i4z i4zVar) {
        return i4zVar.a + '|' + i4zVar.b + '|' + i4zVar.c;
    }

    public final Object a(i4z i4zVar, Continuation continuation) {
        return tje.k0(this.b, new DefaultPrefsRestPlaqueDataSource$getFallbackPlaque$2(this, i4zVar, null), continuation);
    }

    public final Object b(i4z i4zVar, Continuation continuation) {
        return tje.k0(this.b, new DefaultPrefsRestPlaqueDataSource$getPrefetchPlaque$2(this, i4zVar, null), continuation);
    }

    public final Object c(i4z i4zVar, Continuation continuation) {
        return tje.k0(this.b, new DefaultPrefsRestPlaqueDataSource$getWidgets$2(this, i4zVar, null), continuation);
    }

    public final Object d(i4z i4zVar, o060 o060Var, Continuation continuation) {
        Object k0 = tje.k0(this.b, new DefaultPrefsRestPlaqueDataSource$putFallbackPlaque$2(this, i4zVar, o060Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object e(i4z i4zVar, o060 o060Var, Continuation continuation) {
        Object k0 = tje.k0(this.b, new DefaultPrefsRestPlaqueDataSource$putPrefetchPlaque$2(this, i4zVar, o060Var, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object f(i4z i4zVar, ArrayList arrayList, Continuation continuation) {
        Object k0 = tje.k0(this.b, new DefaultPrefsRestPlaqueDataSource$putWidgets$2(this, i4zVar, arrayList, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
