package com.yandex.dsl.views.layouts.constraint;

import android.view.View;
import com.yandex.dsl.views.layouts.constraint.ConstraintSetBuilder;
import defpackage.m7e;
import kotlin.Pair;

/* loaded from: classes11.dex */
public class d {
    public final int a;
    public final ConstraintSetBuilder b;

    public d(int i, ConstraintSetBuilder constraintSetBuilder) {
        this.a = i;
        this.b = constraintSetBuilder;
    }

    public final m7e a(Pair pair, int i) {
        ConstraintSetBuilder.Side side = (ConstraintSetBuilder.Side) pair.c();
        this.b.getClass();
        return new m7e(ConstraintSetBuilder.D(side, this.a), ConstraintSetBuilder.D((ConstraintSetBuilder.Side) pair.f(), i));
    }

    public final m7e b(Pair pair, View view) {
        return a(pair, view.getId());
    }

    public final m7e c(Pair pair, com.yandex.bricks.c cVar) {
        return a(pair, cVar.a.getId());
    }

    public final void d(int i) {
        this.b.k(this.a, i);
    }

    public final void e(int i) {
        this.b.l(this.a, i);
    }
}
