package com.yandex.plus.home.graphql.analytics;

import defpackage.b64;
import defpackage.jqr;
import defpackage.kdh;
import defpackage.so2;
import defpackage.to2;
import defpackage.tpr;
import kotlinx.coroutines.flow.o;

/* loaded from: classes8.dex */
public final class a implements so2 {
    public static String b(String str, String str2, String str3) {
        StringBuilder v = b64.v("error while fetching operation = ", str, ", error message = ", str2, ", requestId=");
        v.append(str3);
        return v.toString();
    }

    @Override // defpackage.so2
    public final tpr a(to2 to2Var, kdh kdhVar) {
        return new o(new jqr(kdhVar.b(to2Var), new StatboxApolloInterceptor$intercept$1(this, to2Var, null), 3), new StatboxApolloInterceptor$intercept$2(this, to2Var, null));
    }
}
