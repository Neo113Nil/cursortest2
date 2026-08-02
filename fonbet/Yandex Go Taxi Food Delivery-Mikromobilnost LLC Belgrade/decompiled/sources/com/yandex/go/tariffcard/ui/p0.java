package com.yandex.go.tariffcard.ui;

import defpackage.jl40;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class p0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r0 b;

    public p0(vpr vprVar, r0 r0Var) {
        this.a = vprVar;
        this.b = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1 tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        boolean l;
        if (continuation instanceof TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1) {
            tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1 = (TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    Object obj3 = rsnVar.b;
                    this.b.getClass();
                    kb5 kb5Var = (kb5) rsnVar.a;
                    if (kb5Var == null) {
                        l = false;
                    } else {
                        kb5 kb5Var2 = (kb5) rsnVar.b;
                        l = kb5Var2.a.length() == 0 ? jl40.l(kb5Var.b, kb5Var2.b) : jl40.l(kb5Var.a, kb5Var2.a);
                    }
                    Pair pair = new Pair(obj3, Boolean.valueOf(l));
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1 = new TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
