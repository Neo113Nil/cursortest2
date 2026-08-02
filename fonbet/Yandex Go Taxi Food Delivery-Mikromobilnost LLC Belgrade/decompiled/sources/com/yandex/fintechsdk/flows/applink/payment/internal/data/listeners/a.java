package com.yandex.fintechsdk.flows.applink.payment.internal.data.listeners;

import defpackage.i8b0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qk3;
import defpackage.sk3;
import defpackage.tk3;
import defpackage.vk3;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xk3;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Pair pair, Continuation continuation) {
        AuthRepositoryListener$startListening$3$emit$1 authRepositoryListener$startListening$3$emit$1;
        int i;
        zy11 zy11Var = zy11.a;
        b bVar = this.a;
        if (continuation instanceof AuthRepositoryListener$startListening$3$emit$1) {
            authRepositoryListener$startListening$3$emit$1 = (AuthRepositoryListener$startListening$3$emit$1) continuation;
            int i2 = authRepositoryListener$startListening$3$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authRepositoryListener$startListening$3$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authRepositoryListener$startListening$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authRepositoryListener$startListening$3$emit$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((Result) obj).getClass();
                    return zy11Var;
                }
                kotlin.b.b(obj);
                xk3 xk3Var = (xk3) pair.getFirst();
                String str = (String) pair.getSecond();
                if (xk3Var instanceof qk3) {
                    if (str != null && str.length() != 0) {
                        com.yandex.fintechsdk.data.personalization.impl.internal.a aVar = bVar.b;
                        authRepositoryListener$startListening$3$emit$1.label = 1;
                        if (aVar.a(str, authRepositoryListener$startListening$3$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (!(xk3Var instanceof sk3) && !jl40.l(xk3Var, tk3.a) && !jl40.l(xk3Var, vk3.a)) {
                        w511.b();
                        return null;
                    }
                    if (str != null && str.length() != 0) {
                        i8b0 i8b0Var = bVar.b.a;
                        synchronized (i8b0Var) {
                            i8b0Var.a.remove(str);
                        }
                        return zy11Var;
                    }
                }
                return zy11Var;
            }
        }
        authRepositoryListener$startListening$3$emit$1 = new AuthRepositoryListener$startListening$3$emit$1(this, continuation);
        Object obj2 = authRepositoryListener$startListening$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authRepositoryListener$startListening$3$emit$1.label;
        if (i == 0) {
        }
    }
}
