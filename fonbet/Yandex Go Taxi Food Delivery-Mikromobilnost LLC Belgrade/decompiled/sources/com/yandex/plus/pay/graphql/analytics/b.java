package com.yandex.plus.pay.graphql.analytics;

import defpackage.jqr;
import defpackage.kdh;
import defpackage.so2;
import defpackage.to2;
import defpackage.tpr;
import defpackage.uqx0;

/* loaded from: classes8.dex */
public final class b implements so2 {
    public final uqx0 a;

    public b(uqx0 uqx0Var) {
        this.a = uqx0Var;
    }

    @Override // defpackage.so2
    public final tpr a(to2 to2Var, kdh kdhVar) {
        return new jqr(kdhVar.b(to2Var), new TarifficatorDiagnosticApolloInterceptor$intercept$1(this, to2Var, null), 3);
    }
}
