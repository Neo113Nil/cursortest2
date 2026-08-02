package com.yandex.plus.home.common.utils;

import android.os.Parcelable;
import defpackage.c60;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.s7s0;
import defpackage.x40;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d extends c60 {
    public static final i3y a = kotlin.a.a(new s7s0(27));

    @Override // defpackage.c60
    public final Object a(String str, Continuation continuation) {
        return com.yandex.plus.core.activity.result.internal.c.d.a("*/*", continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.c60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(x40 x40Var, Object obj, ContinuationImpl continuationImpl) {
        StartForResultHelper$launch$1 startForResultHelper$launch$1;
        int i;
        if (continuationImpl instanceof StartForResultHelper$launch$1) {
            startForResultHelper$launch$1 = (StartForResultHelper$launch$1) continuationImpl;
            int i2 = startForResultHelper$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startForResultHelper$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = startForResultHelper$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startForResultHelper$launch$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return ((Result) obj2).getValue();
                }
                kotlin.b.b(obj2);
                com.yandex.plus.core.activity.result.internal.c cVar = com.yandex.plus.core.activity.result.internal.c.d;
                startForResultHelper$launch$1.L$0 = null;
                startForResultHelper$launch$1.L$1 = null;
                startForResultHelper$launch$1.label = 1;
                Object b = cVar.b(x40Var, obj, startForResultHelper$launch$1);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        startForResultHelper$launch$1 = new StartForResultHelper$launch$1(this, continuationImpl);
        Object obj22 = startForResultHelper$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startForResultHelper$launch$1.label;
        if (i == 0) {
        }
    }

    @Override // defpackage.c60
    public final Object c(String[] strArr, Continuation continuation) {
        return com.yandex.plus.core.activity.result.internal.c.d.c(strArr, continuation);
    }

    public final rol0 d(x40 x40Var, Parcelable parcelable) {
        return new rol0(new StartForResultHelper$startActivityForResult$1(this, x40Var, parcelable, null));
    }
}
