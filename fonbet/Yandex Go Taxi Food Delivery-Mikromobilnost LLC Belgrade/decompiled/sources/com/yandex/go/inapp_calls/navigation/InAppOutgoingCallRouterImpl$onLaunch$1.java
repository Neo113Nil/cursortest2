package com.yandex.go.inapp_calls.navigation;

import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import com.yandex.go.inapp_calls.api.navigation.ResumeInAppCallSource;
import com.yandex.go.proxyprovision.j;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.fkv;
import defpackage.hkv;
import defpackage.jiu;
import defpackage.m950;
import defpackage.mgu;
import defpackage.mvg;
import defpackage.njv;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vkv;
import defpackage.wkv;
import defpackage.wls;
import defpackage.ynn;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.navigation.InAppOutgoingCallRouterImpl$onLaunch$1", f = "InAppOutgoingCallRouterImpl.kt", l = {61, HProv.ALG_SID_GR3410_12_256, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppOutgoingCallRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ hkv $payload;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppOutgoingCallRouterImpl$onLaunch$1(f fVar, hkv hkvVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$payload = hkvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppOutgoingCallRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppOutgoingCallRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0058, code lost:
    
        if (r14 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0035, code lost:
    
        if (r14 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0.P;
            this.label = 1;
            obj = jVar.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    InAppCallsAnalytics$PhoneCallFallbackReason inAppCallsAnalytics$PhoneCallFallbackReason2 = (InAppCallsAnalytics$PhoneCallFallbackReason) obj;
                    com.yandex.go.inapp_calls.repository.c cVar = this.this$0.M;
                    this.L$0 = inAppCallsAnalytics$PhoneCallFallbackReason2;
                    this.label = 3;
                    Object e = cVar.e(this);
                    if (e != coroutineSingletons) {
                        inAppCallsAnalytics$PhoneCallFallbackReason = inAppCallsAnalytics$PhoneCallFallbackReason2;
                        obj = e;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                inAppCallsAnalytics$PhoneCallFallbackReason = (InAppCallsAnalytics$PhoneCallFallbackReason) this.L$0;
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    f fVar = this.this$0;
                    fVar.A((m950) fVar.L.get(), ResumeInAppCallSource.CALLS_ROUTER, new wkv(fVar, this.$payload));
                    return zy11Var;
                }
                if (inAppCallsAnalytics$PhoneCallFallbackReason != null) {
                    f fVar2 = this.this$0;
                    fVar2.r(new ynn(10, fVar2, this.$payload, inAppCallsAnalytics$PhoneCallFallbackReason));
                    return zy11Var;
                }
                String str = this.$payload.c;
                int i2 = vkv.a[((DefaultOutgoingCallType) this.this$0.O.d.getValue()).ordinal()];
                if (i2 == 1) {
                    f fVar3 = this.this$0;
                    hkv hkvVar = this.$payload;
                    njv njvVar = fVar3.K;
                    boolean a = ((com.yandex.go.permission.b) fVar3.I.a).a(14);
                    fkv fkvVar = hkvVar.a;
                    njvVar.c(fkvVar != null ? fkvVar.a : null, hkvVar.d.b, true, false, a, true);
                    f.P(this.this$0, this.$payload);
                    return zy11Var;
                }
                if (i2 != 2 || str.length() <= 0) {
                    if (i2 != 3 || str.length() <= 0) {
                        f.P(this.this$0, this.$payload);
                        return zy11Var;
                    }
                    this.this$0.S(this.$payload);
                    return zy11Var;
                }
                f fVar4 = this.this$0;
                hkv hkvVar2 = this.$payload;
                njv njvVar2 = fVar4.K;
                boolean a2 = ((com.yandex.go.permission.b) fVar4.I.a).a(14);
                fkv fkvVar2 = hkvVar2.a;
                njvVar2.c(fkvVar2 != null ? fkvVar2.a : null, hkvVar2.d.b, true, false, a2, false);
                this.this$0.r(new jiu(24));
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        f fVar5 = this.this$0;
        if (booleanValue) {
            fVar5.r(new mgu(5, fVar5, this.$payload));
            return zy11Var;
        }
        d dVar = fVar5.F;
        hkv hkvVar3 = this.$payload;
        this.label = 2;
        obj = dVar.a(hkvVar3, this);
    }
}
