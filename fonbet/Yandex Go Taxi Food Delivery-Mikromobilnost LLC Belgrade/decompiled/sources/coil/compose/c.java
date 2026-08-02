package coil.compose;

import defpackage.cjs0;
import defpackage.jdi0;
import defpackage.jh91;
import defpackage.lkj;
import defpackage.m810;
import defpackage.nkj;
import defpackage.ny61;
import defpackage.sx21;
import defpackage.vpr;
import defpackage.wis0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1) {
            asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 = (AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label;
                wis0 wis0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long j = ((cjs0) obj).a;
                    if (j == 9205357640488583168L) {
                        wis0Var = wis0.c;
                    } else {
                        jdi0 jdi0Var = sx21.b;
                        if (cjs0.d(j) >= 0.5d && cjs0.b(j) >= 0.5d) {
                            float d = cjs0.d(j);
                            boolean isInfinite = Float.isInfinite(d);
                            jh91 jh91Var = nkj.a;
                            jh91 lkjVar = (isInfinite || Float.isNaN(d)) ? jh91Var : new lkj(m810.b(cjs0.d(j)));
                            float b = cjs0.b(j);
                            if (!Float.isInfinite(b) && !Float.isNaN(b)) {
                                jh91Var = new lkj(m810.b(cjs0.b(j)));
                            }
                            wis0Var = new wis0(lkjVar, jh91Var);
                        }
                    }
                    if (wis0Var != null) {
                        asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(wis0Var, asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1 = new AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1.label;
        wis0 wis0Var2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
