package com.yandex.go.scooters.qr.preview.domain;

import defpackage.jro0;
import defpackage.lmo0;
import defpackage.lqo0;
import defpackage.mth;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uoo0;
import defpackage.uyj;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b {
    public final tt2 a;
    public final jro0 b;
    public final lmo0 c;
    public final uoo0 d;
    public final lqo0 e;

    public b(tt2 tt2Var, jro0 jro0Var, lmo0 lmo0Var, uoo0 uoo0Var, lqo0 lqo0Var) {
        this.a = tt2Var;
        this.b = jro0Var;
        this.c = lmo0Var;
        this.d = uoo0Var;
        this.e = lqo0Var;
    }

    public final tpr a() {
        mth mthVar = new mth(e.n(new m0(e.d((r0) this.b.b), e.d((r0) this.d.b), new ScootersPreviewPositionInteractor$listenAvailableAreaRect$1(3, null)), e.c(this.c.a), e.c(this.e.a), new ScootersPreviewPositionInteractor$listenToPosition$1(4, this, b.class, "calculatePreviewPosition", "calculatePreviewPosition(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/graphics/PointF;", 4)), 6);
        this.a.getClass();
        return e.F(mthVar, uyj.a);
    }
}
