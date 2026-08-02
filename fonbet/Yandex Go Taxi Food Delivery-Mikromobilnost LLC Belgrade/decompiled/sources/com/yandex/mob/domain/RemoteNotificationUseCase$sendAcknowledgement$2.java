package com.yandex.mob.domain;

import com.yandex.mob.params.MobRemoteNotificationStatus;
import defpackage.bms;
import defpackage.go20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.pr20;
import defpackage.wq20;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lpr20;", "mobSelectedProxy", "Lgo20;", "mobHeaders", "Loq20;", "mobQueryParams", "Lxl20;", "Lzy11;", "<anonymous>", "(Lpr20;Lgo20;Loq20;)Lxl20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.RemoteNotificationUseCase$sendAcknowledgement$2", f = "RemoteNotificationUseCase.kt", l = {106, 103}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class RemoteNotificationUseCase$sendAcknowledgement$2 extends SuspendLambda implements bms {
    final /* synthetic */ String $pushId;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteNotificationUseCase$sendAcknowledgement$2(r rVar, String str, Continuation continuation) {
        super(4, continuation);
        this.this$0 = rVar;
        this.$pushId = str;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RemoteNotificationUseCase$sendAcknowledgement$2 remoteNotificationUseCase$sendAcknowledgement$2 = new RemoteNotificationUseCase$sendAcknowledgement$2(this.this$0, this.$pushId, (Continuation) obj4);
        remoteNotificationUseCase$sendAcknowledgement$2.L$0 = (pr20) obj;
        remoteNotificationUseCase$sendAcknowledgement$2.L$1 = (go20) obj2;
        remoteNotificationUseCase$sendAcknowledgement$2.L$2 = (oq20) obj3;
        return remoteNotificationUseCase$sendAcknowledgement$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r1 == r6) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.mob.okhttp.d dVar;
        Object a;
        pr20 pr20Var = (pr20) this.L$0;
        go20 go20Var = (go20) this.L$1;
        oq20 oq20Var = (oq20) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r rVar = this.this$0;
            dVar = rVar.g;
            m mVar = rVar.i;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = dVar;
            this.L$4 = pr20Var;
            this.L$5 = oq20Var;
            this.label = 1;
            a = mVar.a(go20Var, kotlin.collections.b.f(), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oq20Var = (oq20) this.L$5;
            pr20Var = (pr20) this.L$4;
            com.yandex.mob.okhttp.d dVar2 = (com.yandex.mob.okhttp.d) this.L$3;
            kotlin.b.b(obj);
            dVar = dVar2;
            a = obj;
        }
        go20 go20Var2 = (go20) a;
        String str = this.$pushId;
        r rVar2 = this.this$0;
        rVar2.getClass();
        Date date = new Date(rVar2.h.a());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        wq20 wq20Var = new wq20(str, simpleDateFormat.format(date), MobRemoteNotificationStatus.Silent);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
        Object a2 = dVar.a(pr20Var, oq20Var, go20Var2, wq20Var, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
