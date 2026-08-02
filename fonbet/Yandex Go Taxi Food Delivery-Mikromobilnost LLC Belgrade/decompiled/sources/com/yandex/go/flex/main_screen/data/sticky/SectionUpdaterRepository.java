package com.yandex.go.flex.main_screen.data.sticky;

import defpackage.b5q0;
import defpackage.bvf0;
import defpackage.hst;
import defpackage.iir;
import defpackage.jqr;
import defpackage.jst;
import defpackage.v4r0;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class SectionUpdaterRepository implements iir {
    public final r0 a;
    public final jqr b;

    public SectionUpdaterRepository() {
        r0 c = bvf0.c(EmptySet.a);
        this.a = c;
        this.b = new jqr(e.N(e.d(c), 500L), new SectionUpdaterRepository$triggersFlow$1(2, null), 3);
    }

    public final void a(b5q0 b5q0Var) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, v4r0.i((Set) value, b5q0Var)));
        hst hstVar = jst.e;
        Objects.toString(b5q0Var);
        hstVar.getClass();
    }
}
