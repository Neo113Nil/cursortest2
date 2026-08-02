package com.yandex.delivery.utils.push.impl;

import com.squareup.moshi.JsonAdapter;
import defpackage.huh;
import defpackage.jgz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2g0;
import defpackage.q2g0;
import defpackage.r2g0;
import defpackage.s2g0;
import defpackage.tse;
import defpackage.u2g0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.utils.push.impl.DeliveryPushListenerImpl$onPush$1", f = "DeliveryPushListenerImpl.kt", l = {40, 43, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPushListenerImpl$onPush$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $pushPayloadJson;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPushListenerImpl$onPush$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pushPayloadJson = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryPushListenerImpl$onPush$1(this.this$0, this.$pushPayloadJson, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryPushListenerImpl$onPush$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0038, B:15:0x00a1, B:17:0x00a7, B:19:0x00c3, B:30:0x00d0, B:32:0x00d7, B:35:0x0047, B:36:0x0093, B:38:0x004e, B:40:0x0069, B:41:0x0080, B:45:0x007a, B:47:0x007e, B:48:0x0101, B:49:0x0106), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[LOOP:0: B:15:0x00a1->B:27:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s2g0 s2g0Var;
        u2g0 u2g0Var;
        s2g0 s2g0Var2;
        u2g0 u2g0Var2;
        int i;
        Iterator it;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (Throwable th) {
            jgz jgzVar = jgz.a;
            jgz.c(th);
            n0 n0Var = this.this$0.y;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
            if (n0Var.emit(r2g0.a, this) == coroutineSingletons) {
            }
        }
        if (i2 == 0) {
            b.b(obj);
            u2g0 u2g0Var3 = (u2g0) ((JsonAdapter) this.this$0.x.getValue()).fromJson(this.$pushPayloadJson);
            this.this$0.getClass();
            if (u2g0Var3 instanceof PushPayloadDto$DeliveryStateChanged) {
                PushPayloadDto$DeliveryStateChanged pushPayloadDto$DeliveryStateChanged = (PushPayloadDto$DeliveryStateChanged) u2g0Var3;
                s2g0Var = new p2g0(pushPayloadDto$DeliveryStateChanged.getDeliveryId(), pushPayloadDto$DeliveryStateChanged.getMeta());
            } else {
                if (!(u2g0Var3 instanceof PushPayloadDto$JournalUpdated)) {
                    throw new NoWhenBranchMatchedException();
                }
                s2g0Var = q2g0.a;
            }
            n0 n0Var2 = this.this$0.y;
            this.L$0 = u2g0Var3;
            this.L$1 = s2g0Var;
            this.label = 1;
            if (n0Var2.emit(s2g0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            u2g0Var = u2g0Var3;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                i = this.I$0;
                it = (Iterator) this.L$3;
                s2g0Var2 = (s2g0) this.L$1;
                u2g0Var2 = (u2g0) this.L$0;
                b.b(obj);
                while (it.hasNext()) {
                    huh huhVar = (huh) it.next();
                    this.L$0 = u2g0Var2;
                    this.L$1 = s2g0Var2;
                    this.L$2 = null;
                    this.L$3 = it;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.I$0 = i;
                    this.I$1 = 0;
                    this.label = 2;
                    if (s2g0Var2 instanceof p2g0) {
                        obj2 = huhVar.a.a(this);
                        if (obj2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            if (obj2 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        huhVar.getClass();
                    }
                    obj2 = zy11Var;
                    if (obj2 != coroutineSingletons) {
                    }
                }
                jgz.a.h("LogisticsPushListener");
                jgz.a("Push received, type = " + u2g0Var2.getType() + ", values: " + u2g0Var2, new Object[0]);
                return zy11Var;
            }
            s2g0Var = (s2g0) this.L$1;
            u2g0Var = (u2g0) this.L$0;
            b.b(obj);
        }
        s2g0Var2 = s2g0Var;
        u2g0Var2 = u2g0Var;
        i = 0;
        it = this.this$0.b.iterator();
        while (it.hasNext()) {
        }
        jgz.a.h("LogisticsPushListener");
        jgz.a("Push received, type = " + u2g0Var2.getType() + ", values: " + u2g0Var2, new Object[0]);
        return zy11Var;
    }
}
