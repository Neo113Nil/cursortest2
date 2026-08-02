package com.yandex.passport.internal.config.template;

import com.yandex.passport.data.models.q;
import com.yandex.passport.data.network.g6;
import com.yandex.passport.data.network.j6;
import defpackage.evu0;
import defpackage.mdh;
import defpackage.scc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpg;
import defpackage.uyj;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class g {
    public final tpg a;

    public g(tpg tpgVar) {
        this.a = tpgVar;
    }

    public static q b() {
        return new q(Collections.singletonList("passport"), scc.g(new Pair("mode", "embeddedauth"), new Pair("action", "change_default")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static f d(g6 g6Var) {
        ArrayList arrayList;
        List W;
        List W2;
        List W3;
        String a = g6Var.getA();
        ?? r2 = EmptyList.a;
        if (a != null) {
            W3 = evu0.W(a, new String[]{"/"}, (r2 & 4) != 0 ? 0 : 2);
            arrayList = new ArrayList();
            for (Object obj : W3) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = r2;
        }
        String b = g6Var.getB();
        if (b != null) {
            W = evu0.W(b, new String[]{"&"}, (r2 & 4) != 0 ? 0 : 2);
            r2 = new ArrayList();
            Iterator it = W.iterator();
            while (it.hasNext()) {
                W2 = evu0.W((String) it.next(), new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
                if (W2.size() != 2) {
                    W2 = null;
                }
                Pair pair = W2 != null ? new Pair(W2.get(0), W2.get(1)) : null;
                if (pair != null) {
                    r2.add(pair);
                }
            }
        }
        return new f(arrayList, r2);
    }

    public final Object a(Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new UrlTemplateRepository$get$2(this, null), continuation);
    }

    public final Object c(j6 j6Var, Continuation continuation) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new UrlTemplateRepository$onConfigUpdate$2(j6Var, this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
