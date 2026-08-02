package com.yandex.plus.pay.internal.feature.user.listener;

import defpackage.lj;
import defpackage.ny61;
import defpackage.ol;
import defpackage.tse;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements ol {
    public final /* synthetic */ ol[] a;

    public a(ol[] olVarArr) {
        this.a = olVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0077 -> B:10:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.zls
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(tse tseVar, lj ljVar, Continuation continuation) {
        AccountListener$Companion$composite$1$invoke$1 accountListener$Companion$composite$1$invoke$1;
        int i;
        ol[] olVarArr;
        int length;
        AccountListener$Companion$composite$1$invoke$1 accountListener$Companion$composite$1$invoke$12;
        int i2;
        lj ljVar2;
        tse tseVar2;
        int i3;
        if (continuation instanceof AccountListener$Companion$composite$1$invoke$1) {
            accountListener$Companion$composite$1$invoke$1 = (AccountListener$Companion$composite$1$invoke$1) continuation;
            int i4 = accountListener$Companion$composite$1$invoke$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                accountListener$Companion$composite$1$invoke$1.label = i4 - Integer.MIN_VALUE;
                Object obj = accountListener$Companion$composite$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountListener$Companion$composite$1$invoke$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ol[] olVarArr2 = this.a;
                    olVarArr = olVarArr2;
                    length = olVarArr2.length;
                    accountListener$Companion$composite$1$invoke$12 = accountListener$Companion$composite$1$invoke$1;
                    i2 = 0;
                    ljVar2 = ljVar;
                    tseVar2 = tseVar;
                    i3 = 0;
                    if (i3 < length) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = accountListener$Companion$composite$1$invoke$1.I$2;
                    i3 = accountListener$Companion$composite$1$invoke$1.I$1;
                    int i5 = accountListener$Companion$composite$1$invoke$1.I$0;
                    ol[] olVarArr3 = (ol[]) accountListener$Companion$composite$1$invoke$1.L$2;
                    lj ljVar3 = (lj) accountListener$Companion$composite$1$invoke$1.L$1;
                    tse tseVar3 = (tse) accountListener$Companion$composite$1$invoke$1.L$0;
                    kotlin.b.b(obj);
                    ljVar2 = ljVar3;
                    olVarArr = olVarArr3;
                    accountListener$Companion$composite$1$invoke$12 = accountListener$Companion$composite$1$invoke$1;
                    i2 = i5;
                    tseVar2 = tseVar3;
                    i3++;
                    if (i3 < length) {
                        ol olVar = olVarArr[i3];
                        accountListener$Companion$composite$1$invoke$12.L$0 = tseVar2;
                        accountListener$Companion$composite$1$invoke$12.L$1 = ljVar2;
                        accountListener$Companion$composite$1$invoke$12.L$2 = olVarArr;
                        accountListener$Companion$composite$1$invoke$12.L$3 = null;
                        accountListener$Companion$composite$1$invoke$12.L$4 = null;
                        accountListener$Companion$composite$1$invoke$12.I$0 = i2;
                        accountListener$Companion$composite$1$invoke$12.I$1 = i3;
                        accountListener$Companion$composite$1$invoke$12.I$2 = length;
                        accountListener$Companion$composite$1$invoke$12.I$3 = 0;
                        accountListener$Companion$composite$1$invoke$12.label = 1;
                        if (olVar.invoke(tseVar2, ljVar2, accountListener$Companion$composite$1$invoke$12) == coroutineSingletons) {
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
        accountListener$Companion$composite$1$invoke$1 = new AccountListener$Companion$composite$1$invoke$1(this, continuation);
        Object obj2 = accountListener$Companion$composite$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountListener$Companion$composite$1$invoke$1.label;
        if (i != 0) {
        }
    }
}
