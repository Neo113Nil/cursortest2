package com.yandex.messaging.internal.authorized.chat.refresher;

import com.yandex.messaging.internal.entities.ReducedMessage;
import defpackage.fse;
import defpackage.rmi0;
import defpackage.tje;
import defpackage.v9s;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class d implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ fse b;
    public final /* synthetic */ e c;

    public /* synthetic */ d(fse fseVar, e eVar, int i) {
        this.a = i;
        this.b = fseVar;
        this.c = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        e eVar = this.c;
        fse fseVar = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                v9s v9sVar = (v9s) pair.getFirst();
                ReducedMessage reducedMessage = (ReducedMessage) pair.getSecond();
                kotlinx.coroutines.a.k(fseVar);
                eVar.j.add(v9sVar);
                rmi0 rmi0Var = eVar.e;
                Object k0 = tje.k0(rmi0Var.c.b, new ReducedMessageConsumer$consumeForward$2(rmi0Var, v9sVar, reducedMessage, null), continuation);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (k0 != coroutineSingletons) {
                    k0 = zy11Var;
                }
                return k0 == coroutineSingletons ? k0 : zy11Var;
            default:
                ReducedMessage reducedMessage2 = (ReducedMessage) obj;
                kotlinx.coroutines.a.k(fseVar);
                eVar.i.add(new Long(reducedMessage2.b));
                rmi0 rmi0Var2 = eVar.e;
                Object k02 = tje.k0(rmi0Var2.c.b, new ReducedMessageConsumer$consumeMessage$2(rmi0Var2, reducedMessage2, null), continuation);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (k02 != coroutineSingletons2) {
                    k02 = zy11Var;
                }
                return k02 == coroutineSingletons2 ? k02 : zy11Var;
        }
    }
}
