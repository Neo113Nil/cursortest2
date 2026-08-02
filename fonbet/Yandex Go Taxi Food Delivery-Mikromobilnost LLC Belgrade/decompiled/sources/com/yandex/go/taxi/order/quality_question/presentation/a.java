package com.yandex.go.taxi.order.quality_question.presentation;

import com.yandex.go.taxi.order.quality_question.interactor.b;
import defpackage.ad5;
import defpackage.jqr;
import defpackage.o2y0;
import defpackage.ogg0;
import defpackage.q6c0;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.c;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final q6c0 x;
    public c y;

    public a(q6c0 q6c0Var) {
        super(ogg0.class);
        this.x = q6c0Var;
        this.y = kotlinx.coroutines.a.a();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.y.a(null);
    }

    public final void Kg(ogg0 ogg0Var) {
        Bg(ogg0Var);
        q6c0 q6c0Var = this.x;
        b bVar = new b(((com.yandex.go.taxi.order.repositories.c) q6c0Var.c).b((o2y0) q6c0Var.b), q6c0Var);
        ((tt2) q6c0Var.w).getClass();
        this.y = e.H(Jg(), new o(new jqr(e.t(e.F(bVar, uyj.a)), new QualityQuestionButtonPresenter$attachView$1(this, null), 3), new QualityQuestionButtonPresenter$attachView$2(3, null)));
    }
}
