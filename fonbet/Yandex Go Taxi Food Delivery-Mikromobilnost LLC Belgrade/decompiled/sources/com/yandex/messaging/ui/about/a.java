package com.yandex.messaging.ui.about;

import com.yandex.messaging.internal.v;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.f3c;
import defpackage.gci0;
import defpackage.i6;
import defpackage.k420;
import defpackage.q6v;
import defpackage.rz10;
import defpackage.sc5;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a extends sc5 {
    public final q6v w;
    public final v x;
    public final r0 y;
    public final gci0 z;

    public a(q6v q6vVar, f3c f3cVar, rz10 rz10Var, v vVar, b bVar) {
        this.w = q6vVar;
        this.x = vVar;
        k420 k420Var = rz10Var.i;
        r0 c = bvf0.c(new i6("", "", k420Var.a, false, false));
        this.y = c;
        this.z = e.R(new n(c, new AboutScreenViewModel$uiState$1(this, null)), ds31.a(this), wsr0.a(xsr0.a, 2), new i6("", "", k420Var.a, false, false));
    }
}
