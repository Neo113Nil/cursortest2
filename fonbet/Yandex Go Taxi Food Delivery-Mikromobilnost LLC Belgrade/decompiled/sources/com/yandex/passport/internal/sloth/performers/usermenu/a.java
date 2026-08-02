package com.yandex.passport.internal.sloth.performers.usermenu;

import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.u;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a implements s {
    public final h a;

    public a(h hVar) {
        this.a = hVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final /* bridge */ /* synthetic */ Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        return b((com.yandex.passport.sloth.command.data.i) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.sloth.command.data.i iVar, ContinuationImpl continuationImpl) {
        FinishWithItemCommandPerformer$performCommand$1 finishWithItemCommandPerformer$performCommand$1;
        int i;
        if (continuationImpl instanceof FinishWithItemCommandPerformer$performCommand$1) {
            finishWithItemCommandPerformer$performCommand$1 = (FinishWithItemCommandPerformer$performCommand$1) continuationImpl;
            int i2 = finishWithItemCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                finishWithItemCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = finishWithItemCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = finishWithItemCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(iVar.a, iVar.b);
                    finishWithItemCommandPerformer$performCommand$1.label = 1;
                    Object emit = this.a.a.emit(fVar, finishWithItemCommandPerformer$performCommand$1);
                    if (emit != coroutineSingletons) {
                        emit = zy11.a;
                    }
                    if (emit == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new iqn(u.c);
            }
        }
        finishWithItemCommandPerformer$performCommand$1 = new FinishWithItemCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = finishWithItemCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = finishWithItemCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(u.c);
    }
}
