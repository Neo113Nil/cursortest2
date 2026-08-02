package com.ybsdk.core.utils;

import android.widget.ImageView;
import defpackage.jh91;
import defpackage.lkj;
import defpackage.ny61;
import defpackage.qdi0;
import defpackage.rjs0;
import defpackage.tev;
import defpackage.wis0;
import defpackage.xga1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class a implements rjs0 {
    public final qdi0 a;
    public final tev b;

    public a(ImageView imageView, tev tevVar) {
        this.a = new qdi0(imageView);
        this.b = (tevVar.a <= 0 || tevVar.b <= 0) ? null : tevVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.rjs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        AspectViewSizeResolver$size$1 aspectViewSizeResolver$size$1;
        int i;
        tev tevVar;
        if (continuation instanceof AspectViewSizeResolver$size$1) {
            aspectViewSizeResolver$size$1 = (AspectViewSizeResolver$size$1) continuation;
            int i2 = aspectViewSizeResolver$size$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aspectViewSizeResolver$size$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aspectViewSizeResolver$size$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aspectViewSizeResolver$size$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aspectViewSizeResolver$size$1.label = 1;
                    obj = this.a.a(aspectViewSizeResolver$size$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                wis0 wis0Var = (wis0) obj;
                tevVar = this.b;
                if (tevVar != null) {
                    jh91 jh91Var = wis0Var.a;
                    int i3 = jh91Var instanceof lkj ? ((lkj) jh91Var).a : 0;
                    jh91 jh91Var2 = wis0Var.b;
                    int i4 = jh91Var2 instanceof lkj ? ((lkj) jh91Var2).a : 0;
                    if (i3 != 0 && i4 != 0) {
                        int i5 = tevVar.a;
                        int i6 = i5 * i4;
                        int i7 = tevVar.b;
                        int i8 = i7 * i3;
                        if (i6 > i8) {
                            return xga1.a(i3, i8 / i5);
                        }
                        if (i6 < i8) {
                            return xga1.a(i6 / i7, i4);
                        }
                    }
                }
                return wis0Var;
            }
        }
        aspectViewSizeResolver$size$1 = new AspectViewSizeResolver$size$1(this, (ContinuationImpl) continuation);
        Object obj2 = aspectViewSizeResolver$size$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aspectViewSizeResolver$size$1.label;
        if (i != 0) {
        }
        wis0 wis0Var2 = (wis0) obj2;
        tevVar = this.b;
        if (tevVar != null) {
        }
        return wis0Var2;
    }
}
