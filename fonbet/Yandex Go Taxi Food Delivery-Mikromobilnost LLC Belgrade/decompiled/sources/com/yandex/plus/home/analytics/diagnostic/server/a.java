package com.yandex.plus.home.analytics.diagnostic.server;

import defpackage.EvgenDiagnostic$NetworkErrorType;
import defpackage.cvu0;
import defpackage.hvu;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kdh;
import defpackage.n1k0;
import defpackage.o1k0;
import defpackage.so2;
import defpackage.to2;
import defpackage.tpr;
import defpackage.uho;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.o;

/* loaded from: classes8.dex */
public final class a implements so2 {
    public final uho a;
    public final o1k0 b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();

    public a(uho uhoVar, o1k0 o1k0Var) {
        this.a = uhoVar;
        this.b = o1k0Var;
    }

    @Override // defpackage.so2
    public final tpr a(to2 to2Var, kdh kdhVar) {
        return new o(new jqr(kdhVar.b(to2Var), new EvgenDiagnosticApolloInterceptor$intercept$1(this, to2Var, null), 3), new EvgenDiagnosticApolloInterceptor$intercept$2(this, to2Var, null));
    }

    public final void b(List list, String str, EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType, String str2, Map map) {
        String str3;
        n1k0 a;
        Object obj = null;
        if (list != null) {
            o1k0 o1k0Var = this.b;
            o1k0Var.getClass();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (cvu0.t(((hvu) next).a, "X-Plus-Retry-Context", true)) {
                    obj = next;
                    break;
                }
            }
            hvu hvuVar = (hvu) obj;
            boolean z = false;
            if (hvuVar != null && (str3 = hvuVar.b) != null && (a = o1k0Var.a(str3)) != null) {
                z = a.a == a.b;
            }
            obj = Boolean.valueOf(z);
        }
        if (jl40.l(obj, Boolean.TRUE)) {
            uho uhoVar = this.a;
            uhoVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("operation_name", str);
            linkedHashMap.put("error_type", evgenDiagnostic$NetworkErrorType.getEventValue());
            linkedHashMap.put(Constants.KEY_MESSAGE, str2);
            linkedHashMap.put("additional_params", map);
            linkedHashMap.put("_meta", uho.b(new HashMap()));
            uhoVar.c("Error.Retries.Exhausted.GraphQL", linkedHashMap);
        }
    }
}
