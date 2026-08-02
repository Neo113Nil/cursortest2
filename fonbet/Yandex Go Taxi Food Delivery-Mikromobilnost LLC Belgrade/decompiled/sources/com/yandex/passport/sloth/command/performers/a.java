package com.yandex.passport.sloth.command.performers;

import defpackage.iqn;
import defpackage.ny61;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements com.yandex.passport.sloth.command.q {
    public final com.yandex.passport.sloth.v a;

    public a(com.yandex.passport.sloth.v vVar) {
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
        ChooseAccountCommandPerformer$performCommand$1 chooseAccountCommandPerformer$performCommand$1;
        int i;
        if (continuation instanceof ChooseAccountCommandPerformer$performCommand$1) {
            chooseAccountCommandPerformer$performCommand$1 = (ChooseAccountCommandPerformer$performCommand$1) continuation;
            int i2 = chooseAccountCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chooseAccountCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chooseAccountCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chooseAccountCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chooseAccountCommandPerformer$performCommand$1.label = 1;
                    if (this.a.c(com.yandex.passport.sloth.x.a, chooseAccountCommandPerformer$performCommand$1) == coroutineSingletons) {
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
        chooseAccountCommandPerformer$performCommand$1 = new ChooseAccountCommandPerformer$performCommand$1(this, (ContinuationImpl) continuation);
        Object obj2 = chooseAccountCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chooseAccountCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(com.yandex.passport.sloth.command.u.c);
    }
}
