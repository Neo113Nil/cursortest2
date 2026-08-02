package com.yandex.passport.sloth.ui;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a1 {
    public final com.yandex.passport.sloth.z0 a;
    public final com.yandex.passport.sloth.v b;
    public final SlothParams c;

    public a1(com.yandex.passport.sloth.z0 z0Var, com.yandex.passport.sloth.v vVar, SlothParams slothParams) {
        this.a = z0Var;
        this.b = vVar;
        this.c = slothParams;
    }

    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onFail " + z, 8);
        }
        com.yandex.passport.sloth.v vVar = this.b;
        if (z) {
            Object d = vVar.d(com.yandex.passport.sloth.b.a, continuationImpl);
            if (d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return d;
            }
        } else {
            Object b = vVar.b(new com.yandex.passport.sloth.o(true, z), continuationImpl);
            if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return b;
            }
        }
        return zy11.a;
    }
}
