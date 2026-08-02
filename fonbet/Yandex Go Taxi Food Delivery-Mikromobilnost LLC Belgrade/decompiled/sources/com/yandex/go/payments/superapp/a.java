package com.yandex.go.payments.superapp;

import com.yandex.go.payments.data.g;
import defpackage.mdh;
import defpackage.nfa0;
import defpackage.ny61;
import defpackage.ryz;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a {
    public final tse a;
    public final tt2 b;
    public final ryz c;
    public final nfa0 d;

    public a(tse tseVar, tt2 tt2Var, ryz ryzVar, nfa0 nfa0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = ryzVar;
        this.d = nfa0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Continuation continuation) {
        LpmPaymentChangesListener$handlePaymentChanges$1 lpmPaymentChangesListener$handlePaymentChanges$1;
        int i;
        Iterator it;
        aVar.getClass();
        if (continuation instanceof LpmPaymentChangesListener$handlePaymentChanges$1) {
            lpmPaymentChangesListener$handlePaymentChanges$1 = (LpmPaymentChangesListener$handlePaymentChanges$1) continuation;
            int i2 = lpmPaymentChangesListener$handlePaymentChanges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lpmPaymentChangesListener$handlePaymentChanges$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lpmPaymentChangesListener$handlePaymentChanges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lpmPaymentChangesListener$handlePaymentChanges$1.label;
                if (i != 0) {
                    b.b(obj);
                    it = kotlin.collections.a.N0(aVar.d.a.values()).iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) lpmPaymentChangesListener$handlePaymentChanges$1.L$2;
                    b.b(obj);
                }
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    lpmPaymentChangesListener$handlePaymentChanges$1.L$0 = null;
                    lpmPaymentChangesListener$handlePaymentChanges$1.L$1 = null;
                    lpmPaymentChangesListener$handlePaymentChanges$1.L$2 = it;
                    lpmPaymentChangesListener$handlePaymentChanges$1.L$3 = null;
                    lpmPaymentChangesListener$handlePaymentChanges$1.L$4 = null;
                    lpmPaymentChangesListener$handlePaymentChanges$1.label = 1;
                    if (gVar.b(lpmPaymentChangesListener$handlePaymentChanges$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        lpmPaymentChangesListener$handlePaymentChanges$1 = new LpmPaymentChangesListener$handlePaymentChanges$1(aVar, continuation);
        Object obj2 = lpmPaymentChangesListener$handlePaymentChanges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lpmPaymentChangesListener$handlePaymentChanges$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    public final void b() {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.a, mdh.b, null, new LpmPaymentChangesListener$init$1(this, null), 2);
    }
}
