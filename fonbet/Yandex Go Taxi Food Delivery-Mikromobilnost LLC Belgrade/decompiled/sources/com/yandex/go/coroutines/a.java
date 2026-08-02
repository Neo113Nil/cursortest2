package com.yandex.go.coroutines;

import defpackage.g050;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ g050 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ int c;
    public final /* synthetic */ y6f0 w;

    public a(g050 g050Var, ArrayList arrayList, int i, y6f0 y6f0Var) {
        this.a = g050Var;
        this.b = arrayList;
        this.c = i;
        this.w = y6f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r5.a(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1 bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1;
        int i;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        g050 g050Var;
        try {
            if (continuation instanceof BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1) {
                bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1 = (BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1) continuation;
                int i2 = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj3 = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.label;
                    zy11 zy11Var = zy11.a;
                    arrayList = this.b;
                    g050 g050Var2 = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj3);
                        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$0 = obj;
                        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$1 = g050Var2;
                        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$2 = arrayList;
                        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.label = 1;
                        if (g050Var2.a(bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1) != coroutineSingletons) {
                            obj2 = obj;
                            arrayList2 = arrayList;
                            g050Var = g050Var2;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj3);
                                return obj3;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$0 = null;
                        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.label = 3;
                        Object o = ((x6f0) this.w).y.o(zy11Var, bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1);
                        return o == coroutineSingletons ? coroutineSingletons : o;
                    }
                    arrayList2 = (ArrayList) bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$2;
                    g050Var = (g050) bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$1;
                    obj2 = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$0;
                    kotlin.b.b(obj3);
                    arrayList2.add(obj2);
                    g050Var.d(null);
                    if (arrayList.size() == this.c) {
                        return zy11Var;
                    }
                    bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$0 = null;
                    bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$1 = null;
                    bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.L$2 = null;
                    bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.label = 2;
                }
            }
            arrayList2.add(obj2);
            g050Var.d(null);
            if (arrayList.size() == this.c) {
            }
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1 = new BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1(this, continuation);
        Object obj32 = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1$1$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        arrayList = this.b;
        g050 g050Var22 = this.a;
        if (i != 0) {
        }
    }
}
