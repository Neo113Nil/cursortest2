package com.yandex.passport.sloth.command.performers;

import defpackage.iqn;
import defpackage.ny61;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class p implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;

    public p(com.yandex.passport.sloth.v vVar) {
        this.a = vVar;
    }

    @Override // com.yandex.passport.sloth.command.q
    public final /* bridge */ /* synthetic */ Object a(Object obj, Continuation continuation) {
        return b(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        ShowDebugInfoCommandPerformer$performCommand$1 showDebugInfoCommandPerformer$performCommand$1;
        int i;
        if (continuation instanceof ShowDebugInfoCommandPerformer$performCommand$1) {
            showDebugInfoCommandPerformer$performCommand$1 = (ShowDebugInfoCommandPerformer$performCommand$1) continuation;
            int i2 = showDebugInfoCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showDebugInfoCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = showDebugInfoCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showDebugInfoCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    showDebugInfoCommandPerformer$performCommand$1.label = 1;
                    if (this.a.b(com.yandex.passport.sloth.s.a, showDebugInfoCommandPerformer$performCommand$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new iqn(com.yandex.passport.sloth.command.u.c);
            }
        }
        showDebugInfoCommandPerformer$performCommand$1 = new ShowDebugInfoCommandPerformer$performCommand$1(this, (ContinuationImpl) continuation);
        Object obj2 = showDebugInfoCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showDebugInfoCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
