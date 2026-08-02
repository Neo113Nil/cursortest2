package com.yandex.go.payments.cards.data;

import defpackage.ny61;
import defpackage.ql3;
import defpackage.to90;
import defpackage.tx90;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final h a;
    public final ql3 b;
    public final com.yandex.go.payments.di.a c;

    public a(h hVar, ql3 ql3Var, com.yandex.go.payments.di.a aVar) {
        this.a = hVar;
        this.b = ql3Var;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r10 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, tx90 tx90Var, ContinuationImpl continuationImpl) {
        BinInfoInteractor$getBinInfo$1 binInfoInteractor$getBinInfo$1;
        int i;
        List list;
        if (continuationImpl instanceof BinInfoInteractor$getBinInfo$1) {
            binInfoInteractor$getBinInfo$1 = (BinInfoInteractor$getBinInfo$1) continuationImpl;
            int i2 = binInfoInteractor$getBinInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                binInfoInteractor$getBinInfo$1.label = i2 - Integer.MIN_VALUE;
                BinInfoInteractor$getBinInfo$1 binInfoInteractor$getBinInfo$12 = binInfoInteractor$getBinInfo$1;
                Object obj = binInfoInteractor$getBinInfo$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = binInfoInteractor$getBinInfo$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    binInfoInteractor$getBinInfo$12.L$0 = str;
                    binInfoInteractor$getBinInfo$12.L$1 = tx90Var;
                    binInfoInteractor$getBinInfo$12.label = 1;
                    obj = this.b.a.a(binInfoInteractor$getBinInfo$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    tx90Var = (tx90) binInfoInteractor$getBinInfo$12.L$1;
                    str = (String) binInfoInteractor$getBinInfo$12.L$0;
                    kotlin.b.b(obj);
                }
                tx90 tx90Var2 = tx90Var;
                String str2 = (String) obj;
                to90 to90Var = this.c.c;
                list = (List) to90Var.e.get();
                if (list == null) {
                    list = to90Var.a();
                }
                binInfoInteractor$getBinInfo$12.L$0 = null;
                binInfoInteractor$getBinInfo$12.L$1 = null;
                binInfoInteractor$getBinInfo$12.L$2 = null;
                binInfoInteractor$getBinInfo$12.label = 2;
                Object a = this.a.a(str, tx90Var2, str2, list, binInfoInteractor$getBinInfo$12);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        binInfoInteractor$getBinInfo$1 = new BinInfoInteractor$getBinInfo$1(this, continuationImpl);
        BinInfoInteractor$getBinInfo$1 binInfoInteractor$getBinInfo$122 = binInfoInteractor$getBinInfo$1;
        Object obj2 = binInfoInteractor$getBinInfo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = binInfoInteractor$getBinInfo$122.label;
        if (i != 0) {
        }
        tx90 tx90Var22 = tx90Var;
        String str22 = (String) obj2;
        to90 to90Var2 = this.c.c;
        list = (List) to90Var2.e.get();
        if (list == null) {
        }
        binInfoInteractor$getBinInfo$122.L$0 = null;
        binInfoInteractor$getBinInfo$122.L$1 = null;
        binInfoInteractor$getBinInfo$122.L$2 = null;
        binInfoInteractor$getBinInfo$122.label = 2;
        Object a2 = this.a.a(str, tx90Var22, str22, list, binInfoInteractor$getBinInfo$122);
        if (a2 != coroutineSingletons2) {
        }
    }
}
