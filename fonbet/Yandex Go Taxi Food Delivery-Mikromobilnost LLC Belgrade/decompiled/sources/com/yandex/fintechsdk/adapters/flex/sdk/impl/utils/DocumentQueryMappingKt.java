package com.yandex.fintechsdk.adapters.flex.sdk.impl.utils;

import defpackage.u1m;
import defpackage.ug5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lug5;", "Lu1m;", "toFlexQuery", "(Lug5;)Lu1m;", "toBduiQuery", "(Lu1m;)Lug5;", "impl-18-1-0_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentQueryMappingKt {
    public static final ug5 toBduiQuery(u1m u1mVar) {
        return new ug5(2, u1mVar.a, u1mVar.c, u1mVar.b);
    }

    public static final u1m toFlexQuery(ug5 ug5Var) {
        String str = ug5Var.c;
        if (str == null) {
            return null;
        }
        return new u1m(ug5Var.b, str, ug5Var.a);
    }
}
