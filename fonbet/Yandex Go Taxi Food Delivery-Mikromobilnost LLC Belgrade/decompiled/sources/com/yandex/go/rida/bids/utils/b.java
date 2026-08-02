package com.yandex.go.rida.bids.utils;

import defpackage.jj2;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ androidx.compose.animation.core.a c;
    public final /* synthetic */ jj2 w;

    public /* synthetic */ b(tse tseVar, androidx.compose.animation.core.a aVar, jj2 jj2Var, int i) {
        this.a = i;
        this.b = tseVar;
        this.c = aVar;
        this.w = jj2Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tse tseVar = this.b;
        switch (i) {
            case 0:
                tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new StateUtilsKt$asAnimatable$1$1$2$1(this.c, ((Number) obj).floatValue(), this.w, null), 1);
                break;
            default:
                long j = ((wu60) obj).a;
                tje.N(tseVar, null, CoroutineStart.UNDISPATCHED, new StateUtilsKt$asAnimatable$2$1$2$1(this.c, j, this.w, null), 1);
                break;
        }
        return zy11Var;
    }
}
