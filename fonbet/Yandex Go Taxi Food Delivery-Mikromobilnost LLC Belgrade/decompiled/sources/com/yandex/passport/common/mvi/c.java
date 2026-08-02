package com.yandex.passport.common.mvi;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.filter.l;
import com.yandex.passport.internal.ui.bouncer.model.b1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.c0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.c1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.d0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.h0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.i0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.k1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.l1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.n;
import com.yandex.passport.internal.ui.bouncer.model.middleware.n1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.p1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.v;
import com.yandex.passport.internal.ui.bouncer.model.middleware.v0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.w;
import com.yandex.passport.internal.ui.bouncer.model.middleware.w0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.y0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.z0;
import com.yandex.passport.internal.upgrader.q;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c implements tpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(tpr tprVar, Object obj, int i) {
        this.a = i;
        this.b = tprVar;
        this.c = obj;
    }

    @Override // defpackage.tpr
    public final Object collect(vpr vprVar, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        tpr tprVar = this.b;
        switch (i) {
            case 0:
                Object collect = tprVar.collect(new b(vprVar, (b1) obj), continuation);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11Var;
            case 1:
                Object collect2 = tprVar.collect(new com.yandex.passport.internal.filter.k(vprVar, (l) obj), continuation);
                return collect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect2 : zy11Var;
            case 2:
                Object collect3 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new com.yandex.passport.internal.ui.bouncer.model.middleware.d(vprVar, (com.yandex.passport.internal.ui.bouncer.model.middleware.e) obj), continuation);
                return collect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect3 : zy11Var;
            case 3:
                Object collect4 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new com.yandex.passport.internal.ui.bouncer.model.middleware.i(vprVar, (com.yandex.passport.internal.ui.bouncer.model.middleware.j) obj), continuation);
                return collect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect4 : zy11Var;
            case 4:
                Object collect5 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new com.yandex.passport.internal.ui.bouncer.model.middleware.l(vprVar, (n) obj), continuation);
                return collect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect5 : zy11Var;
            case 5:
                Object collect6 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new v(vprVar, (w) obj), continuation);
                return collect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect6 : zy11Var;
            case 6:
                Object collect7 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new c0(vprVar, (d0) obj), continuation);
                return collect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect7 : zy11Var;
            case 7:
                Object collect8 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new h0(vprVar, (i0) obj), continuation);
                return collect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect8 : zy11Var;
            case 8:
                Object collect9 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new v0(vprVar, (w0) obj), continuation);
                return collect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect9 : zy11Var;
            case 9:
                Object collect10 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new y0(vprVar, (z0) obj), continuation);
                return collect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect10 : zy11Var;
            case 10:
                Object collect11 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new com.yandex.passport.internal.ui.bouncer.model.middleware.b1(vprVar, (c1) obj), continuation);
                return collect11 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect11 : zy11Var;
            case 11:
                Object collect12 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new k1(vprVar, (l1) obj), continuation);
                return collect12 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect12 : zy11Var;
            case 12:
                Object collect13 = ((com.yandex.passport.internal.impl.d) tprVar).collect(new n1(vprVar, (p1) obj), continuation);
                return collect13 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect13 : zy11Var;
            case 13:
                Object collect14 = tprVar.collect(new q(vprVar, (Uid) obj), continuation);
                return collect14 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect14 : zy11Var;
            default:
                Object collect15 = ((com.arkivanov.mvikotlin.extensions.coroutines.a) tprVar).collect(new com.yandex.passport.user_id.v(vprVar, (com.arkivanov.mvikotlin.extensions.coroutines.a) obj), continuation);
                return collect15 == CoroutineSingletons.COROUTINE_SUSPENDED ? collect15 : zy11Var;
        }
    }
}
