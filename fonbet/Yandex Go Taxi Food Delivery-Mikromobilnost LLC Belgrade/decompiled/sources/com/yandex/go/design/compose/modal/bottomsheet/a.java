package com.yandex.go.design.compose.modal.bottomsheet;

import defpackage.dtr0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.sz20;
import defpackage.twt0;
import defpackage.tz20;
import defpackage.uz20;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wg6;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ wg6 a;
    public final /* synthetic */ sls b;
    public final /* synthetic */ sls c;

    public a(wg6 wg6Var, sls slsVar, sls slsVar2) {
        this.a = wg6Var;
        this.b = slsVar;
        this.c = slsVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (com.yandex.go.design.compose.modal.bottomsheet.b.b(r2, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r9 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(uz20 uz20Var, Continuation continuation) {
        BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1 bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1;
        int i;
        Object u0;
        if (continuation instanceof BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1) {
            bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1 = (BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1) continuation;
            int i2 = bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean l = jl40.l(uz20Var, tz20.a);
                    wg6 wg6Var = this.a;
                    if (l) {
                        bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.L$0 = null;
                        bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.label = 1;
                    } else {
                        if (!(uz20Var instanceof sz20)) {
                            w511.b();
                            return null;
                        }
                        bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.L$0 = uz20Var;
                        bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.label = 2;
                        twt0 twt0Var = b.a;
                        if (wg6Var.e) {
                            wg6Var.e = false;
                            wg6Var.g.setValue(new dtr0(-1));
                            c.c(wg6Var, 0.0f, 3);
                            pzt0 pzt0Var = wg6Var.r;
                            if (pzt0Var != null) {
                                u0 = pzt0Var.u0(bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1);
                            }
                        }
                        u0 = zy11Var;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    sls slsVar = this.b;
                    if (slsVar != null) {
                        slsVar.invoke();
                        return zy11Var;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uz20Var = (uz20) bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                    ((sz20) uz20Var).a.invoke();
                    sls slsVar2 = this.c;
                    if (slsVar2 != null) {
                        slsVar2.invoke();
                    }
                }
                return zy11Var;
            }
        }
        bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1 = new BottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1(this, continuation);
        Object obj2 = bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomSheetStateExtensionsKt$rememberBottomSheetState$1$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        return zy11Var2;
    }
}
