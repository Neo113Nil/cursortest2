package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class d1 implements vpr {
    public final /* synthetic */ f1 a;

    public d1(f1 f1Var) {
        this.a = f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeleteForeverViewModel$bind$$inlined$collectOn$1$1$1 deleteForeverViewModel$bind$$inlined$collectOn$1$1$1;
        int i;
        if (continuation instanceof DeleteForeverViewModel$bind$$inlined$collectOn$1$1$1) {
            deleteForeverViewModel$bind$$inlined$collectOn$1$1$1 = (DeleteForeverViewModel$bind$$inlined$collectOn$1$1$1) continuation;
            int i2 = deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.sloth.u uVar = (com.yandex.passport.sloth.u) obj;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth event: " + uVar, 8);
                    }
                    if (uVar instanceof com.yandex.passport.sloth.p) {
                        y0 y0Var = this.a.c;
                        y0 y0Var2 = y0Var != null ? y0Var : null;
                        deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.L$0 = this;
                        deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.label = 1;
                        Object emit = y0Var2.i.emit(s0.a, deleteForeverViewModel$bind$$inlined$collectOn$1$1$1);
                        if (emit != coroutineSingletons) {
                            emit = zy11Var;
                        }
                        if (emit == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (d1) deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.L$0;
                    kotlin.b.b(obj2);
                }
                ((com.yandex.passport.internal.ui.lang.a) this.a.w.getUiLanguageProvider()).b();
                return zy11Var;
            }
        }
        deleteForeverViewModel$bind$$inlined$collectOn$1$1$1 = new DeleteForeverViewModel$bind$$inlined$collectOn$1$1$1(this, continuation);
        Object obj22 = deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteForeverViewModel$bind$$inlined$collectOn$1$1$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        ((com.yandex.passport.internal.ui.lang.a) this.a.w.getUiLanguageProvider()).b();
        return zy11Var2;
    }
}
