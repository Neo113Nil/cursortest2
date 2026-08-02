package com.yandex.div.evaluable;

import defpackage.jl40;
import defpackage.nms;
import defpackage.qls;
import defpackage.tls;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class d implements nms {
    public final ArrayList a;

    public d(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final c a(tls tlsVar, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            c cVar = (c) obj;
            if (jl40.l(cVar.c(), str) && jl40.l(tlsVar.invoke(cVar), qls.f)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (c) arrayList.get(0);
        }
        throw new EvaluableException("Function " + arrayList.get(0) + " declared multiple times.", null);
    }

    @Override // defpackage.nms
    public final c h(String str, final ArrayList arrayList) {
        c a = a(new tls() { // from class: com.yandex.div.evaluable.LocalFunctionProvider$getMethod$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return ((c) obj).g(arrayList, Function$matchesArguments$1.w);
            }
        }, str);
        if (a != null) {
            return a;
        }
        c a2 = a(new tls() { // from class: com.yandex.div.evaluable.LocalFunctionProvider$getMethod$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return ((c) obj).i(arrayList);
            }
        }, str);
        if (a2 != null) {
            return a2;
        }
        throw new MissingLocalFunctionException(str, arrayList);
    }

    @Override // defpackage.nms
    public final c i(String str, final ArrayList arrayList) {
        c a = a(new tls() { // from class: com.yandex.div.evaluable.LocalFunctionProvider$get$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return ((c) obj).g(arrayList, Function$matchesArguments$1.w);
            }
        }, str);
        if (a != null) {
            return a;
        }
        c a2 = a(new tls() { // from class: com.yandex.div.evaluable.LocalFunctionProvider$get$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                return ((c) obj).i(arrayList);
            }
        }, str);
        if (a2 != null) {
            return a2;
        }
        throw new MissingLocalFunctionException(str, arrayList);
    }
}
