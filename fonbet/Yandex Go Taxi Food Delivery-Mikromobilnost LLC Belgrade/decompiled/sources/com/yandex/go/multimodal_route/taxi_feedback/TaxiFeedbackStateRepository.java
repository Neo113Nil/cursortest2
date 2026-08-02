package com.yandex.go.multimodal_route.taxi_feedback;

import com.yandex.go.coroutines.g;
import defpackage.bvf0;
import defpackage.nvx0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class TaxiFeedbackStateRepository {
    public final g a;
    public final r0 b;
    public final m0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public TaxiFeedbackStateRepository() {
        g gVar = new g();
        this.a = gVar;
        r0 c = bvf0.c(new nvx0(true, null, 0 == true ? 1 : 0, 6));
        this.b = c;
        this.c = new m0(kotlinx.coroutines.flow.e.t(new e(new c(gVar.c, this))), kotlinx.coroutines.flow.e.d(c), new TaxiFeedbackStateRepository$taxiFeedbackStateFlow$1(3, null));
    }
}
