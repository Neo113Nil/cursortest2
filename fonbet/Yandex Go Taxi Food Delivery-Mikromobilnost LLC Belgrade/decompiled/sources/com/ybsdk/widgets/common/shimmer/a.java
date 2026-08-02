package com.ybsdk.widgets.common.shimmer;

import defpackage.hur0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class a implements vpr {
    public final /* synthetic */ long a;
    public final /* synthetic */ vpr b;
    public final /* synthetic */ b c;

    public a(long j, vpr vprVar, b bVar) {
        this.a = j;
        this.b = vprVar;
        this.c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (kotlinx.coroutines.a.i(r6.a, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Continuation continuation) {
        ShimmerHandlerImpl$startShimmerFlow$1$1$emit$1 shimmerHandlerImpl$startShimmerFlow$1$1$emit$1;
        int i;
        if (continuation instanceof ShimmerHandlerImpl$startShimmerFlow$1$1$emit$1) {
            shimmerHandlerImpl$startShimmerFlow$1$1$emit$1 = (ShimmerHandlerImpl$startShimmerFlow$1$1$emit$1) continuation;
            int i2 = shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.label = 1;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                hur0 hur0Var = new hur0(this.c.a);
                shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.label = 2;
                return this.b.emit(hur0Var, shimmerHandlerImpl$startShimmerFlow$1$1$emit$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        shimmerHandlerImpl$startShimmerFlow$1$1$emit$1 = new ShimmerHandlerImpl$startShimmerFlow$1$1$emit$1(this, continuation);
        Object obj2 = shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        hur0 hur0Var2 = new hur0(this.c.a);
        shimmerHandlerImpl$startShimmerFlow$1$1$emit$1.label = 2;
        if (this.b.emit(hur0Var2, shimmerHandlerImpl$startShimmerFlow$1$1$emit$1) != coroutineSingletons2) {
        }
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue(), continuation);
    }
}
