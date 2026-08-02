package com.yandex.plus.pay.internal.feature.experiments.listener;

import defpackage.ero;
import defpackage.k2d0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements ero {
    public final /* synthetic */ ero[] a;

    public a(ero[] eroVarArr) {
        this.a = eroVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006b -> B:10:0x006e). Please report as a decompilation issue!!! */
    @Override // defpackage.wls
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(k2d0 k2d0Var, Continuation continuation) {
        ExperimentsListener$Companion$composite$1$invoke$1 experimentsListener$Companion$composite$1$invoke$1;
        int i;
        ero[] eroVarArr;
        int length;
        int i2;
        k2d0 k2d0Var2;
        int i3;
        if (continuation instanceof ExperimentsListener$Companion$composite$1$invoke$1) {
            experimentsListener$Companion$composite$1$invoke$1 = (ExperimentsListener$Companion$composite$1$invoke$1) continuation;
            int i4 = experimentsListener$Companion$composite$1$invoke$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                experimentsListener$Companion$composite$1$invoke$1.label = i4 - Integer.MIN_VALUE;
                Object obj = experimentsListener$Companion$composite$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentsListener$Companion$composite$1$invoke$1.label;
                if (i != 0) {
                    b.b(obj);
                    ero[] eroVarArr2 = this.a;
                    eroVarArr = eroVarArr2;
                    length = eroVarArr2.length;
                    i2 = 0;
                    k2d0Var2 = k2d0Var;
                    i3 = 0;
                    if (i3 < length) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = experimentsListener$Companion$composite$1$invoke$1.I$2;
                    i3 = experimentsListener$Companion$composite$1$invoke$1.I$1;
                    i2 = experimentsListener$Companion$composite$1$invoke$1.I$0;
                    eroVarArr = (ero[]) experimentsListener$Companion$composite$1$invoke$1.L$1;
                    k2d0 k2d0Var3 = (k2d0) experimentsListener$Companion$composite$1$invoke$1.L$0;
                    b.b(obj);
                    k2d0Var2 = k2d0Var3;
                    i3++;
                    if (i3 < length) {
                        ero eroVar = eroVarArr[i3];
                        experimentsListener$Companion$composite$1$invoke$1.L$0 = k2d0Var2;
                        experimentsListener$Companion$composite$1$invoke$1.L$1 = eroVarArr;
                        experimentsListener$Companion$composite$1$invoke$1.L$2 = null;
                        experimentsListener$Companion$composite$1$invoke$1.L$3 = null;
                        experimentsListener$Companion$composite$1$invoke$1.I$0 = i2;
                        experimentsListener$Companion$composite$1$invoke$1.I$1 = i3;
                        experimentsListener$Companion$composite$1$invoke$1.I$2 = length;
                        experimentsListener$Companion$composite$1$invoke$1.I$3 = 0;
                        experimentsListener$Companion$composite$1$invoke$1.label = 1;
                        if (eroVar.invoke(k2d0Var2, experimentsListener$Companion$composite$1$invoke$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i3++;
                        if (i3 < length) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        experimentsListener$Companion$composite$1$invoke$1 = new ExperimentsListener$Companion$composite$1$invoke$1(this, continuation);
        Object obj2 = experimentsListener$Companion$composite$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsListener$Companion$composite$1$invoke$1.label;
        if (i != 0) {
        }
    }
}
