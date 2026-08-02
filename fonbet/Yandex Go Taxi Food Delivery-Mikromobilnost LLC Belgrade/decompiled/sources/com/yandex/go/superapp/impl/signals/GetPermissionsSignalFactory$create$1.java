package com.yandex.go.superapp.impl.signals;

import defpackage.ck7;
import defpackage.gcn;
import defpackage.gw00;
import defpackage.k4o;
import defpackage.tcc;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class GetPermissionsSignalFactory$create$1 extends FunctionReferenceImpl implements wls {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [k4o] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public final void i(GetPermissionsSignalFactory$Params getPermissionsSignalFactory$Params, gcn gcnVar) {
        ?? a;
        String str;
        v7j0 v7j0Var = (v7j0) ((e) this.receiver).b.get();
        List list = getPermissionsSignalFactory$Params.a;
        if (list != null) {
            Set N0 = kotlin.collections.a.N0(list);
            k4o a2 = GetPermissionsSignalFactory$Permission.a();
            a = new ArrayList();
            for (Object obj : a2) {
                if (N0.contains(((GetPermissionsSignalFactory$Permission) obj).getKey())) {
                    a.add(obj);
                }
            }
        } else {
            a = GetPermissionsSignalFactory$Permission.a();
        }
        Iterable<GetPermissionsSignalFactory$Permission> iterable = (Iterable) a;
        int d = gw00.d(tcc.n(iterable, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (GetPermissionsSignalFactory$Permission getPermissionsSignalFactory$Permission : iterable) {
            if (!getPermissionsSignalFactory$Permission.getIsAutoGranted()) {
                if (!((com.yandex.go.permission.b) v7j0Var).a(getPermissionsSignalFactory$Permission.getRequestId())) {
                    str = "denied";
                    Pair pair = new Pair(getPermissionsSignalFactory$Permission.getKey(), str);
                    linkedHashMap.put(pair.c(), pair.f());
                }
            }
            str = "granted";
            Pair pair2 = new Pair(getPermissionsSignalFactory$Permission.getKey(), str);
            linkedHashMap.put(pair2.c(), pair2.f());
        }
        gcnVar.a(new ck7(new GetPermissionsSignalFactory$Result(linkedHashMap), null));
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        i((GetPermissionsSignalFactory$Params) obj, (gcn) obj2);
        return zy11.a;
    }
}
