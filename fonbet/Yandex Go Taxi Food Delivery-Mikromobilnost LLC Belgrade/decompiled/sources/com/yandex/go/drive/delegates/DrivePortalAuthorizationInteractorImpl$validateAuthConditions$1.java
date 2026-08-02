package com.yandex.go.drive.delegates;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.h60;
import defpackage.jst;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7h;
import defpackage.qeb1;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.ucm;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.j;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.zalogin.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.delegates.DrivePortalAuthorizationInteractorImpl$validateAuthConditions$1", f = "DrivePortalAuthorizationInteractorImpl.kt", l = {48, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 74}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivePortalAuthorizationInteractorImpl$validateAuthConditions$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onCancel;
    final /* synthetic */ tls $onSuccess;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivePortalAuthorizationInteractorImpl$validateAuthConditions$1(a aVar, tls tlsVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$onSuccess = tlsVar;
        this.$onCancel = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivePortalAuthorizationInteractorImpl$validateAuthConditions$1(this.this$0, this.$onSuccess, this.$onCancel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivePortalAuthorizationInteractorImpl$validateAuthConditions$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (r7 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
    
        if (r7.a(r6) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r7 == r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kj Ig;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Ig = this.this$0.b.a.Ig();
            b bVar = this.this$0.c;
            this.L$0 = Ig;
            this.label = 1;
            obj = bVar.c(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                a aVar = this.this$0;
                tls tlsVar = this.$onSuccess;
                sls slsVar = this.$onCancel;
                if (!(a instanceof Result.Failure)) {
                    aVar.b(slsVar, tlsVar);
                }
                a aVar2 = this.this$0;
                Throwable a2 = Result.a(a);
                if (a2 != null) {
                    aVar2.getClass();
                    jst.e.h(null, "Fail to auth portal account for drive", a2);
                }
                return zy11.a;
            }
            Ig = (kj) this.L$0;
            kotlin.b.b(obj);
        }
        ucm ucmVar = (ucm) obj;
        if (ucmVar != null) {
            this.$onSuccess.invoke(ucmVar);
        } else if (Ig == null) {
            jst.e.n("DRIVE_AUTH: start authorization as portal");
            a aVar3 = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        } else if (Ig.m) {
            jst.e.n("DRIVE_AUTH: link phonish account with portal");
            a aVar4 = this.this$0;
            d dVar = aVar4.a;
            Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = Events$Zalogin$LinkageContext.DRIVE;
            tls tlsVar2 = this.$onSuccess;
            sls slsVar2 = this.$onCancel;
            dVar.b(events$Zalogin$LinkageContext, qeb1.b(dVar.e), new p7h(5, aVar4, tlsVar2, slsVar2), new h60(24, slsVar2));
        } else {
            jst.e.n("DRIVE_AUTH: upgrade lite account to portal");
            j jVar = this.this$0.f;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            a = j.a(jVar, Ig, this);
        }
        return zy11.a;
    }
}
