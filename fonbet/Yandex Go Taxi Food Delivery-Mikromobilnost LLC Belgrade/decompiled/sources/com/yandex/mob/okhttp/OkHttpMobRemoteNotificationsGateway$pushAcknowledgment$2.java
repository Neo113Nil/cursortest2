package com.yandex.mob.okhttp;

import defpackage.au50;
import defpackage.csb1;
import defpackage.dz11;
import defpackage.ep20;
import defpackage.flv;
import defpackage.go20;
import defpackage.kvj0;
import defpackage.ll20;
import defpackage.lub1;
import defpackage.m5j0;
import defpackage.mvg;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.qje;
import defpackage.qr20;
import defpackage.rvj0;
import defpackage.tje;
import defpackage.tl20;
import defpackage.tse;
import defpackage.wg10;
import defpackage.wls;
import defpackage.wms;
import defpackage.wq20;
import defpackage.xl10;
import defpackage.y9b1;
import defpackage.yf7;
import defpackage.zcx;
import defpackage.zp20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lxl20;", "Lzy11;", "<anonymous>", "(Ltse;)Lxl20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.okhttp.OkHttpMobRemoteNotificationsGateway$pushAcknowledgment$2", f = "OkHttpMobRemoteNotificationsGateway.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class OkHttpMobRemoteNotificationsGateway$pushAcknowledgment$2 extends SuspendLambda implements wls {
    final /* synthetic */ wq20 $body;
    final /* synthetic */ go20 $headers;
    final /* synthetic */ pr20 $mobSelectedProxy;
    final /* synthetic */ oq20 $query;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpMobRemoteNotificationsGateway$pushAcknowledgment$2(pr20 pr20Var, oq20 oq20Var, go20 go20Var, wq20 wq20Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$mobSelectedProxy = pr20Var;
        this.$query = oq20Var;
        this.$headers = go20Var;
        this.$body = wq20Var;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OkHttpMobRemoteNotificationsGateway$pushAcknowledgment$2(this.$mobSelectedProxy, this.$query, this.$headers, this.$body, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OkHttpMobRemoteNotificationsGateway$pushAcknowledgment$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object ep20Var;
        wg10 wg10Var;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                pr20 pr20Var = this.$mobSelectedProxy;
                oq20 oq20Var = this.$query;
                go20 go20Var = this.$headers;
                wq20 wq20Var = this.$body;
                zcx zcxVar = qr20.a;
                zcxVar.getClass();
                String c = zcxVar.c(wq20Var, wq20.Companion.serializer());
                Regex regex = wg10.e;
                try {
                    wg10Var = qje.o("application/json; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    wg10Var = null;
                }
                int i2 = m5j0.a;
                yf7 newCall = ((flv) this.this$0.a).a().newCall(tje.P(pr20Var, "/mob/ack", oq20Var, go20Var, wms.a(c, wg10Var)));
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = tje.z((nci0) newCall, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            kvj0 kvj0Var = (kvj0) obj;
            if (!kvj0Var.J) {
                return new ll20(kvj0Var.w, y9b1.c(kvj0Var), new xl10(kvj0Var));
            }
            rvj0 rvj0Var = kvj0Var.z;
            if (rvj0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string = rvj0Var.string();
            if (zy11.class.equals(zy11.class)) {
                b = zy11.a;
            } else {
                zcx zcxVar2 = qr20.a;
                zcxVar2.getClass();
                b = zcxVar2.b(dz11.b, string);
            }
            return new tl20(b, new au50(26, kvj0Var));
        } catch (IllegalArgumentException e) {
            ep20Var = new zp20(e);
            return ep20Var;
        } catch (Throwable th) {
            csb1.h(th);
            ep20Var = new ep20(th, lub1.g(th));
            return ep20Var;
        }
    }
}
