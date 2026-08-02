package com.yandex.go.requirements.comment.summary.ui.v3.ui.utils;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;

    public b(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1 rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1) {
            rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1 = (RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1 = new RememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rememberKeyboardClosingBottomSheetStateKt$rememberKeyboardClosingBottomSheetState$2$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
