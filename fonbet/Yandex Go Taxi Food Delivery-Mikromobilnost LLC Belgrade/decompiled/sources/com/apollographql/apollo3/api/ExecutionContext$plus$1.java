package com.apollographql.apollo3.api;

import defpackage.ovn;
import defpackage.rko;
import defpackage.tko;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltko;", "acc", "Lrko;", "element", "invoke", "(Ltko;Lrko;)Ltko;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class ExecutionContext$plus$1 extends Lambda implements wls {
    public static final ExecutionContext$plus$1 w = new ExecutionContext$plus$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        rko rkoVar = (rko) obj2;
        tko a = ((tko) obj).a(rkoVar.getKey());
        return a == ovn.a ? rkoVar : new b(a, rkoVar);
    }
}
