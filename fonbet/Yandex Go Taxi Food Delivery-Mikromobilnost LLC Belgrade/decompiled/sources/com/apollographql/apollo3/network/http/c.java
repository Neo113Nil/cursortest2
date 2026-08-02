package com.apollographql.apollo3.network.http;

import defpackage.avu;
import defpackage.rol0;
import defpackage.svu;
import defpackage.to2;
import defpackage.tpr;
import defpackage.x160;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements x160 {
    public final com.apollographql.apollo3.api.http.b a;
    public final avu b;
    public final List c;
    public final boolean d;
    public final svu e = new svu(this);

    public c(com.apollographql.apollo3.api.http.b bVar, avu avuVar, List list, boolean z) {
        this.a = bVar;
        this.b = avuVar;
        this.c = list;
        this.d = z;
    }

    public final tpr a(to2 to2Var) {
        return new rol0(new HttpNetworkTransport$execute$1(this, this.a.a(to2Var), to2Var, (com.apollographql.apollo3.api.c) to2Var.c.c(com.apollographql.apollo3.api.c.d), null));
    }

    @Override // defpackage.x160
    public final void dispose() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((svu) it.next()).getClass();
        }
    }
}
