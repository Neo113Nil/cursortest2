package com.yandex.go.notifications.acknowledge.domain;

import com.yandex.go.notifications.acknowledge.data.model.PushAckParam;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import defpackage.b64;
import defpackage.cne0;
import defpackage.evu0;
import defpackage.i4u;
import defpackage.jst;
import defpackage.m0g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8x;
import defpackage.tse;
import defpackage.w4j0;
import defpackage.w8x;
import defpackage.wls;
import defpackage.x8x;
import defpackage.y8x;
import defpackage.z8x;
import defpackage.zy11;
import java.util.Calendar;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.NGate.tools.Constants;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.jobs.push.j;
import ru.yandex.taxi.jobs.request.RetryPolicy;
import ru.yandex.taxi.startup.launch.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.notifications.acknowledge.domain.PushAckInteractor$ack$1", f = "PushAckInteractor.kt", l = {46, 70, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PushAckInteractor$ack$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $pushId;
    final /* synthetic */ PushAckStatus $status;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushAckInteractor$ack$1(a aVar, String str, PushAckStatus pushAckStatus, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pushId = str;
        this.$status = pushAckStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushAckInteractor$ack$1(this.this$0, this.$pushId, this.$status, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushAckInteractor$ack$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0057, code lost:
    
        if (r2 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        UUID uuid;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            m0g0 m0g0Var = this.this$0.e;
            this.label = 1;
            d = ((j) m0g0Var).d(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
            d = obj;
        }
        z8x z8xVar = (z8x) d;
        if (z8xVar instanceof w8x) {
            jst.e.n("Push ack state: " + z8xVar);
            return zy11Var;
        }
        String str = this.$pushId;
        if (str == null || evu0.J(str)) {
            jst.e.n("Push ack: Missing pushId");
            return zy11Var;
        }
        String Hg = ((h) this.this$0.a).Hg();
        if (Hg == null || evu0.J(Hg)) {
            jst.e.n("Push ack: Missing launchId");
            return zy11Var;
        }
        String str2 = this.$pushId;
        PushAckStatus pushAckStatus = this.$status;
        String l = ((cne0) ((h) this.this$0.b).b).l(MetaDataField.DEVICE_ID_FIELD, null);
        Calendar calendar = Calendar.getInstance();
        PushAckParam pushAckParam = new PushAckParam(Hg, str2, pushAckStatus, l, calendar);
        boolean z = z8xVar instanceof y8x;
        if (z) {
            a aVar = this.this$0;
            aVar.getClass();
            r8x r8xVar = new r8x();
            r8xVar.f("KEY_PUSH_ID", str2);
            r8xVar.f("KEY_LAUNCH_ID", Hg);
            r8xVar.f("KEY_STATUS", pushAckStatus.getWireName());
            r8xVar.f("KEY_DEVICEID", l);
            r8xVar.e("KEY_DATETIME", Long.valueOf(calendar.getTimeInMillis()));
            uuid = aVar.d.e(new w4j0("send_push_ack", 10000L, r8xVar, new i4u(RetryPolicy.LINEAR), null, false, false, 0L, b64.l("SEND_PUSH_ACK:", str2, ":", pushAckStatus.getWireName()), Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND)).a;
        } else {
            uuid = null;
        }
        if (z8xVar instanceof x8x) {
            com.yandex.go.notifications.acknowledge.data.local.a aVar2 = (com.yandex.go.notifications.acknowledge.data.local.a) this.this$0.g.get();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            return aVar2.a(pushAckParam, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (z) {
            a aVar3 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            if (a.a(aVar3, pushAckParam, uuid, this) == coroutineSingletons) {
            }
        }
    }
}
