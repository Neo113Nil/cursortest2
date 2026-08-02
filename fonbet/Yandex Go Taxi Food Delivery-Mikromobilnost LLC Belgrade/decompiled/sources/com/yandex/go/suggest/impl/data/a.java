package com.yandex.go.suggest.impl.data;

import defpackage.bvf0;
import defpackage.bwp0;
import defpackage.dfw0;
import defpackage.eci0;
import defpackage.f8v0;
import defpackage.ffx;
import defpackage.gfw0;
import defpackage.jst;
import defpackage.mth;
import defpackage.swp0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u7r;
import defpackage.y9y0;
import defpackage.z131;
import defpackage.zvv;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final y9y0 a;
    public final com.yandex.div.core.expression.variables.a b;
    public final gfw0 c;
    public final u7r d;
    public final tse e;
    public final zvv f;
    public final dfw0 g;
    public final f8v0 h;
    public final String i;
    public final r0 j;
    public final tpr k;
    public final n0 l;
    public final eci0 m;

    public a(y9y0 y9y0Var, com.yandex.div.core.expression.variables.a aVar, gfw0 gfw0Var, u7r u7rVar, tse tseVar, zvv zvvVar, dfw0 dfw0Var, f8v0 f8v0Var, swp0 swp0Var) {
        this.a = y9y0Var;
        this.b = aVar;
        this.c = gfw0Var;
        this.d = u7rVar;
        this.e = tseVar;
        this.f = zvvVar;
        this.g = dfw0Var;
        this.h = f8v0Var;
        this.i = swp0Var.a();
        r0 c = bvf0.c(null);
        this.j = c;
        this.k = e.t(new mth(e.c(c), 6));
        n0 c2 = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.l = c2;
        this.m = e.c(c2);
    }

    public final void a(String str, String str2, boolean z) {
        tje.N(this.e, null, null, new SuperappSuggestTextInputRepository$forceQuery$1(this, str, str2, z, null), 3);
    }

    public final bwp0 b() {
        bwp0 bwp0Var = (bwp0) this.j.getValue();
        if (bwp0Var != null) {
            return bwp0Var;
        }
        jst.e.m("SUPERAPP_CORE:SEARCH").a(20, "SuperappSuggestTextInputRepository", null, "Current Search Query is null, but it should not");
        return new bwp0("");
    }

    public final void c(String str) {
        tje.N(this.e, null, null, new SuperappSuggestTextInputRepository$updateText$1(this, str, null), 3);
    }

    public final void d(String str) {
        this.b.i(new z131("superapp.search.query", str));
    }
}
