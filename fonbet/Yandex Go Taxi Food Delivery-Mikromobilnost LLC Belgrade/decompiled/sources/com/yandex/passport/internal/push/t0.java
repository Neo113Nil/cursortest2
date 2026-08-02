package com.yandex.passport.internal.push;

import android.content.Context;
import androidx.core.app.JobIntentService;
import defpackage.hjt;
import defpackage.tje;
import defpackage.w511;

/* loaded from: classes8.dex */
public final class t0 {
    public final Context a;
    public final com.yandex.passport.common.coroutine.e b;
    public final com.yandex.passport.common.coroutine.a c;
    public final y d;

    public t0(Context context, com.yandex.passport.common.coroutine.e eVar, com.yandex.passport.common.coroutine.a aVar, y yVar) {
        this.a = context;
        this.b = eVar;
        this.c = aVar;
        this.d = yVar;
    }

    public final void a(EnqueueType enqueueType, r0 r0Var) {
        int i = s0.a[enqueueType.ordinal()];
        if (i == 1) {
            JobIntentService.enqueueWork(this.a, (Class<?>) PassportPushRegistrationService.class, 542961, r0Var.a());
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            this.b.getClass();
            tje.N(hjt.a, ((com.yandex.passport.common.coroutine.b) this.c).d, null, new SubscriptionEnqueuePerformer$enqueueWithCoroutine$1(this, r0Var, null), 2);
        }
    }
}
