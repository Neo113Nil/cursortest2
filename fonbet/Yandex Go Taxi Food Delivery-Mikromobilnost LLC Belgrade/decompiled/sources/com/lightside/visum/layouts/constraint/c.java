package com.lightside.visum.layouts.constraint;

import android.view.View;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import defpackage.n7e;
import kotlin.Pair;

/* loaded from: classes11.dex */
public class c {
    public final int a;
    public final ConstraintSetBuilder b;

    public c(int i, ConstraintSetBuilder constraintSetBuilder) {
        this.a = i;
        this.b = constraintSetBuilder;
    }

    public final n7e a(Pair pair, int i) {
        ConstraintSetBuilder.Side side = (ConstraintSetBuilder.Side) pair.c();
        this.b.getClass();
        return new n7e(ConstraintSetBuilder.C(side, this.a), ConstraintSetBuilder.C((ConstraintSetBuilder.Side) pair.f(), i));
    }

    public final n7e b(Pair pair, View view) {
        return a(pair, view.getId());
    }

    public final void c(int i) {
        this.b.k(this.a, i);
    }

    public final void d(int i) {
        this.b.l(this.a, i);
    }
}
