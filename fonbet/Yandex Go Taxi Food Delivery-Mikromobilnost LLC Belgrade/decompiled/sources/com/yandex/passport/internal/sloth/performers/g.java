package com.yandex.passport.internal.sloth.performers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.tasks.zzw;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.sloth.command.r;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.v;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.e491;
import defpackage.fyc;
import defpackage.i3y;
import defpackage.iqn;
import defpackage.kgx;
import defpackage.kqn;
import defpackage.l8x;
import defpackage.mm2;
import defpackage.seu;
import defpackage.sls;
import defpackage.sst;
import defpackage.uo2;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class g implements s {
    public final Context a;
    public final com.yandex.passport.internal.smsretriever.a b;
    public final b0 c;
    public final com.yandex.passport.common.coroutine.e d;
    public final i3y e = kotlin.a.a(new com.yandex.passport.internal.flags.experiments.h(3, this));

    public g(Context context, com.yandex.passport.internal.smsretriever.a aVar, b0 b0Var, com.yandex.passport.common.coroutine.e eVar) {
        this.a = context;
        this.b = aVar;
        this.c = b0Var;
        this.d = eVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        final fyc fycVar = new fyc((l8x) continuation.get_context().get(seu.C));
        final sls slsVar = new sls() { // from class: com.yandex.passport.internal.sloth.performers.e
            @Override // defpackage.sls
            public final Object invoke() {
                g gVar = g.this;
                b0 b0Var = gVar.c;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Internal broadcast about SMS received", 8);
                }
                com.yandex.passport.internal.smsretriever.a aVar = gVar.b;
                b0Var.getClass();
                b0Var.c(DomikStatefulReporter$Screen.SMS_CODE_ENTRY, DomikStatefulReporter$Event.SMS_RETRIEVER_TRIGGERED);
                com.yandex.passport.internal.storage.i iVar = aVar.b;
                uo2 uo2Var = iVar.f;
                kgx[] kgxVarArr = com.yandex.passport.internal.storage.i.m;
                String str = (String) uo2Var.getValue(iVar, kgxVarArr[4]);
                DomikStatefulReporter$Screen domikStatefulReporter$Screen = DomikStatefulReporter$Screen.NONE;
                DomikStatefulReporter$Event domikStatefulReporter$Event = DomikStatefulReporter$Event.WEBAM_SMS_RECEIVED;
                com.yandex.passport.internal.storage.i iVar2 = aVar.b;
                b0Var.d(domikStatefulReporter$Screen, domikStatefulReporter$Event, kotlin.collections.b.i(new Pair("code_from", String.valueOf((String) iVar2.g.getValue(iVar2, kgxVarArr[5]))), new Pair("have_code", String.valueOf(str != null))));
                fyc fycVar2 = fycVar;
                if (str != null) {
                    fycVar2.T(new iqn(new v(str)));
                } else {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "We received SMS meant for us, but there was no code in it", 8);
                    }
                    com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.e;
                    fycVar2.T(dVar instanceof r ? new iqn(dVar) : new kqn(dVar));
                }
                return zy11.a;
            }
        };
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver(slsVar) { // from class: com.yandex.passport.internal.sloth.performers.GetSmsCommandPerformer$SmsCodeLocalReceiver
            private final sls callback;

            {
                this.callback = slsVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.callback.invoke();
            }
        };
        ((androidx.localbroadcastmanager.content.a) this.e.getValue()).b(broadcastReceiver, new IntentFilter("com.yandex.passport.internal.SMS_CODE_RECEIVED"));
        zzw e = new e491(this.b.a, null, e491.k, mm2.V0, sst.c).e();
        e.d(new com.yandex.passport.common.util.b(2));
        e.f(new com.yandex.passport.common.util.b(3));
        fycVar.w(new f(0, this, broadcastReceiver));
        Object s = fycVar.s(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
