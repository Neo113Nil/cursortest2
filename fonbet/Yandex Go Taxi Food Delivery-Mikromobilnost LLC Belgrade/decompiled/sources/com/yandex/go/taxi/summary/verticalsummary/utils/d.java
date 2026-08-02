package com.yandex.go.taxi.summary.verticalsummary.utils;

import defpackage.jj2;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ tse a;
    public final /* synthetic */ androidx.compose.animation.core.a b;
    public final /* synthetic */ jj2 c;

    public d(tse tseVar, androidx.compose.animation.core.a aVar, jj2 jj2Var) {
        this.a = tseVar;
        this.b = aVar;
        this.c = jj2Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        float floatValue = ((Number) obj).floatValue();
        tje.N(this.a, null, CoroutineStart.UNDISPATCHED, new StateUtilsKt$asAnimatable$1$1$2$1(this.b, floatValue, this.c, null), 1);
        return zy11.a;
    }
}
