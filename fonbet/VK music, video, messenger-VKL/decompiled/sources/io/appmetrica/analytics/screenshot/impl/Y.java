package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class Y implements Converter {
    public final C5362g a;
    public final c0 b;
    public final r c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(W w) {
        Q q = new Q();
        C5360e c5360e = w.a;
        q.a = c5360e != null ? this.a.fromModel(c5360e) : null;
        a0 a0Var = w.b;
        q.b = a0Var != null ? this.b.fromModel(a0Var) : null;
        C5371p c5371p = w.c;
        q.c = c5371p != null ? this.c.fromModel(c5371p) : null;
        return q;
    }

    public Y(C5362g c5362g, c0 c0Var, r rVar) {
        this.a = c5362g;
        this.b = c0Var;
        this.c = rVar;
    }

    public /* synthetic */ Y(C5362g c5362g, c0 c0Var, r rVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? new C5362g() : c5362g, (i & 2) != 0 ? new c0() : c0Var, (i & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(Q q) {
        C5360e c5360e;
        a0 a0Var;
        N n = q.a;
        if (n != null) {
            this.a.getClass();
            c5360e = new C5360e(n.a);
        } else {
            c5360e = null;
        }
        P p = q.b;
        if (p != null) {
            this.b.getClass();
            a0Var = new a0(p.a, p.b);
        } else {
            a0Var = null;
        }
        O o = q.c;
        return new W(c5360e, a0Var, o != null ? this.c.toModel(o) : null);
    }
}
