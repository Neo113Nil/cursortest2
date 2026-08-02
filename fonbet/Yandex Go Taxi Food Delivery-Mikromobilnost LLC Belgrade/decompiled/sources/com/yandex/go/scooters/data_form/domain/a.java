package com.yandex.go.scooters.data_form.domain;

import defpackage.bb1;
import defpackage.d6x;
import defpackage.gw00;
import defpackage.icn0;
import defpackage.j5x;
import defpackage.jcn0;
import defpackage.jx81;
import defpackage.k6x;
import defpackage.mcn0;
import defpackage.ny61;
import defpackage.pcn0;
import defpackage.qro0;
import defpackage.ucn0;
import defpackage.vcn0;
import defpackage.vez0;
import defpackage.w511;
import defpackage.wcn0;
import defpackage.zy11;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.scooters.data_form.data.a a;
    public final qro0 b;
    public final jcn0 c;
    public final pcn0 d;

    static {
        int i = jcn0.b;
    }

    public a(com.yandex.go.scooters.data_form.data.a aVar, qro0 qro0Var, jcn0 jcn0Var, pcn0 pcn0Var) {
        this.a = aVar;
        this.b = qro0Var;
        this.c = jcn0Var;
        this.d = pcn0Var;
    }

    public final Object a(wcn0 wcn0Var, Continuation continuation) {
        if (wcn0Var instanceof ucn0) {
            return this.d.a.emit(mcn0.a, continuation);
        }
        if (!(wcn0Var instanceof vcn0)) {
            w511.b();
            return null;
        }
        List list = ((vcn0) wcn0Var).a;
        k6x k6xVar = this.c.a.a;
        if (k6xVar.a()) {
            d6x d = jason.statham.tools.a.d(k6xVar.b(), icn0.a("invalid_fields"), jx81.M(list), icn0.b);
            if (!d.equals(k6xVar.b())) {
                k6xVar.e(d);
            }
        }
        return this.b.a.emit(zy11.a, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r12.a((defpackage.wcn0) r13, r0) != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersDataFormDocumentsInteractor$performSubmit$1 scootersDataFormDocumentsInteractor$performSubmit$1;
        int i;
        jcn0 jcn0Var;
        try {
            if (continuationImpl instanceof ScootersDataFormDocumentsInteractor$performSubmit$1) {
                scootersDataFormDocumentsInteractor$performSubmit$1 = (ScootersDataFormDocumentsInteractor$performSubmit$1) continuationImpl;
                int i2 = scootersDataFormDocumentsInteractor$performSubmit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersDataFormDocumentsInteractor$performSubmit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersDataFormDocumentsInteractor$performSubmit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersDataFormDocumentsInteractor$performSubmit$1.label;
                    jcn0Var = this.c;
                    if (i != 0) {
                        b.b(obj);
                        jcn0Var.a(true);
                        j5x J = bb1.J(jcn0Var.a.a.b, icn0.a("field_values"));
                        Serializable t = J != null ? vez0.t(J) : null;
                        Map map = t instanceof Map ? (Map) t : null;
                        if (map == null) {
                            map = kotlin.collections.b.f();
                        }
                        com.yandex.go.scooters.data_form.data.a aVar = this.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
                        for (Object obj2 : map.entrySet()) {
                            Object key = ((Map.Entry) obj2).getKey();
                            Object value = ((Map.Entry) obj2).getValue();
                            linkedHashMap.put(key, value instanceof String ? (String) value : null);
                        }
                        scootersDataFormDocumentsInteractor$performSubmit$1.L$0 = null;
                        scootersDataFormDocumentsInteractor$performSubmit$1.L$1 = this;
                        scootersDataFormDocumentsInteractor$performSubmit$1.label = 1;
                        obj = aVar.a(linkedHashMap, scootersDataFormDocumentsInteractor$performSubmit$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            jcn0Var.a(false);
                            return zy11.a;
                        }
                        this = (a) scootersDataFormDocumentsInteractor$performSubmit$1.L$1;
                        b.b(obj);
                    }
                    scootersDataFormDocumentsInteractor$performSubmit$1.L$0 = null;
                    scootersDataFormDocumentsInteractor$performSubmit$1.L$1 = null;
                    scootersDataFormDocumentsInteractor$performSubmit$1.label = 2;
                }
            }
            if (i != 0) {
            }
            scootersDataFormDocumentsInteractor$performSubmit$1.L$0 = null;
            scootersDataFormDocumentsInteractor$performSubmit$1.L$1 = null;
            scootersDataFormDocumentsInteractor$performSubmit$1.label = 2;
        } catch (Throwable th) {
            jcn0Var.a(false);
            throw th;
        }
        scootersDataFormDocumentsInteractor$performSubmit$1 = new ScootersDataFormDocumentsInteractor$performSubmit$1(this, continuationImpl);
        Object obj3 = scootersDataFormDocumentsInteractor$performSubmit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDataFormDocumentsInteractor$performSubmit$1.label;
        jcn0Var = this.c;
    }
}
