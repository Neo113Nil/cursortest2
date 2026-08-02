package com.yandex.go.analytics.rythm.repository;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.ell0;
import defpackage.evu0;
import defpackage.gtq0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a {
    public final wnt a;
    public final tt2 b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();
    public final cne0 d;

    public a(tt2 tt2Var, wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = tt2Var;
        this.d = dne0Var.a("rythm_events");
    }

    public static final String a(a aVar, String str) {
        aVar.getClass();
        return "analytics.rythm.events." + str;
    }

    public static final ArrayList b(a aVar, String str) {
        List m = aVar.d.m(str, ";");
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            if (!evu0.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Object c(ell0 ell0Var, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new RythmEventsRepository$add$2(this, ell0Var, null), continuation);
    }

    public final Object d(String str, int i, Continuation continuation) {
        if (i <= 0) {
            return EmptyList.a;
        }
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new RythmEventsRepository$getEvents$2(this, str, i, null), continuation);
    }

    public final Object e(String str, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new RythmEventsRepository$isNotEmpty$2(this, str, null), continuation);
    }

    public final Object f(String str, int i, Continuation continuation) {
        if (i > 0) {
            this.b.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new RythmEventsRepository$removeEvents$2(this, str, i, null), continuation);
            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k0;
            }
        }
        return zy11.a;
    }
}
