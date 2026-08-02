package com.arkivanov.mvikotlin.core.rx.internal;

import defpackage.n1k;
import defpackage.oq60;
import defpackage.rq60;
import defpackage.ta5;
import defpackage.tls;
import defpackage.ua5;
import defpackage.va5;
import defpackage.w511;
import defpackage.wa5;
import defpackage.xa5;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class BaseSubject$serializer$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Collection values;
        xa5 xa5Var = (xa5) obj;
        BaseSubject baseSubject = (BaseSubject) this.receiver;
        if (xa5Var instanceof wa5) {
            wa5 wa5Var = (wa5) xa5Var;
            rq60 rq60Var = wa5Var.a;
            n1k n1kVar = wa5Var.b;
            LinkedHashMap linkedHashMap = baseSubject.b;
            if (linkedHashMap == null) {
                rq60Var.onComplete();
                ((BaseSubject$subscribe$disposable$1) n1kVar.a).invoke(n1kVar);
            } else {
                linkedHashMap.put(n1kVar, rq60Var);
                baseSubject.b(rq60Var);
            }
        } else if (xa5Var instanceof va5) {
            Object obj2 = ((va5) xa5Var).a;
            baseSubject.c(obj2);
            LinkedHashMap linkedHashMap2 = baseSubject.b;
            if (linkedHashMap2 != null && (values = linkedHashMap2.values()) != null) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    ((oq60) it.next()).a(obj2);
                }
            }
        } else if (xa5Var instanceof ta5) {
            LinkedHashMap linkedHashMap3 = baseSubject.b;
            if (linkedHashMap3 != null) {
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    n1k n1kVar2 = (n1k) entry.getKey();
                    ((oq60) entry.getValue()).onComplete();
                    ((BaseSubject$subscribe$disposable$1) n1kVar2.a).invoke(n1kVar2);
                }
            }
            baseSubject.b = null;
        } else {
            if (!(xa5Var instanceof ua5)) {
                baseSubject.getClass();
                w511.b();
                return null;
            }
            n1k n1kVar3 = ((ua5) xa5Var).a;
            LinkedHashMap linkedHashMap4 = baseSubject.b;
            if (linkedHashMap4 != null) {
            }
        }
        return zy11.a;
    }
}
