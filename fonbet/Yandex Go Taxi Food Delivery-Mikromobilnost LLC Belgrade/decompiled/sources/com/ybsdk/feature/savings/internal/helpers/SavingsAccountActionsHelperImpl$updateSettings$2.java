package com.ybsdk.feature.savings.internal.helpers;

import com.ybsdk.feature.savings.api.SavingsActionStatus;
import defpackage.fse;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.helpers.SavingsAccountActionsHelperImpl$updateSettings$2", f = "SavingsAccountActionsHelperImpl.kt", l = {224, 225, 227, 229, MSException.ERROR_MORE_DATA, 236}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountActionsHelperImpl$updateSettings$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $actionMapper;
    final /* synthetic */ lz40 $flow;
    final /* synthetic */ tls $onError;
    final /* synthetic */ sls $onSuccess;
    final /* synthetic */ tls $settingsCall;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountActionsHelperImpl$updateSettings$2(lz40 lz40Var, wls wlsVar, tls tlsVar, a aVar, sls slsVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$flow = lz40Var;
        this.$actionMapper = wlsVar;
        this.$settingsCall = tlsVar;
        this.this$0 = aVar;
        this.$onSuccess = slsVar;
        this.$onError = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsAccountActionsHelperImpl$updateSettings$2(this.$flow, this.$actionMapper, this.$settingsCall, this.this$0, this.$onSuccess, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsAccountActionsHelperImpl$updateSettings$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x010b, code lost:
    
        if (defpackage.tje.k0(r9, r4, r8) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e9, code lost:
    
        if (r5.emit(r9, r8) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (r9 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        lz40 lz40Var;
        a aVar;
        Object obj2;
        sls slsVar;
        fse fseVar;
        SavingsAccountActionsHelperImpl$updateSettings$2$1$1 savingsAccountActionsHelperImpl$updateSettings$2$1$1;
        Object obj3;
        lz40 lz40Var2;
        a aVar2;
        tls tlsVar;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                b.b(obj);
                lz40 lz40Var3 = this.$flow;
                Object invoke = this.$actionMapper.invoke(SavingsActionStatus.IN_PROGRESS, null);
                this.label = 1;
                break;
            case 1:
                b.b(obj);
                tls tlsVar2 = this.$settingsCall;
                this.label = 2;
                obj = tlsVar2.invoke(this);
                break;
            case 2:
                b.b(obj);
                value = ((Result) obj).getValue();
                lz40Var = this.$flow;
                wls wlsVar = this.$actionMapper;
                aVar = this.this$0;
                sls slsVar2 = this.$onSuccess;
                if (value instanceof Result.Failure) {
                    obj2 = value;
                    lz40Var2 = this.$flow;
                    wls wlsVar2 = this.$actionMapper;
                    aVar2 = this.this$0;
                    tlsVar = this.$onError;
                    a = Result.a(obj2);
                    if (a != null) {
                    }
                    return zy11.a;
                }
                Object invoke2 = wlsVar.invoke(SavingsActionStatus.SUCCESS, null);
                this.L$0 = value;
                this.L$1 = lz40Var;
                this.L$2 = aVar;
                this.L$3 = slsVar2;
                this.label = 3;
                if (lz40Var.emit(invoke2, this) != coroutineSingletons) {
                    slsVar = slsVar2;
                    lz40Var.f();
                    fseVar = aVar.a.a.a;
                    savingsAccountActionsHelperImpl$updateSettings$2$1$1 = new SavingsAccountActionsHelperImpl$updateSettings$2$1$1(slsVar, null);
                    this.L$0 = value;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    if (tje.k0(fseVar, savingsAccountActionsHelperImpl$updateSettings$2$1$1, this) != coroutineSingletons) {
                        obj3 = value;
                        obj2 = obj3;
                        lz40Var2 = this.$flow;
                        wls wlsVar22 = this.$actionMapper;
                        aVar2 = this.this$0;
                        tlsVar = this.$onError;
                        a = Result.a(obj2);
                        if (a != null) {
                            Object invoke3 = wlsVar22.invoke(SavingsActionStatus.ERROR, a);
                            this.L$0 = obj2;
                            this.L$1 = lz40Var2;
                            this.L$2 = aVar2;
                            this.L$3 = tlsVar;
                            this.L$4 = a;
                            this.label = 5;
                            break;
                        }
                        return zy11.a;
                    }
                }
                return coroutineSingletons;
            case 3:
                slsVar = (sls) this.L$3;
                aVar = (a) this.L$2;
                lz40Var = (lz40) this.L$1;
                Object obj4 = this.L$0;
                b.b(obj);
                value = obj4;
                lz40Var.f();
                fseVar = aVar.a.a.a;
                savingsAccountActionsHelperImpl$updateSettings$2$1$1 = new SavingsAccountActionsHelperImpl$updateSettings$2$1$1(slsVar, null);
                this.L$0 = value;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                if (tje.k0(fseVar, savingsAccountActionsHelperImpl$updateSettings$2$1$1, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                obj3 = this.L$0;
                b.b(obj);
                obj2 = obj3;
                lz40Var2 = this.$flow;
                wls wlsVar222 = this.$actionMapper;
                aVar2 = this.this$0;
                tlsVar = this.$onError;
                a = Result.a(obj2);
                if (a != null) {
                }
                return zy11.a;
            case 5:
                a = (Throwable) this.L$4;
                tlsVar = (tls) this.L$3;
                aVar2 = (a) this.L$2;
                lz40Var2 = (lz40) this.L$1;
                obj2 = this.L$0;
                b.b(obj);
                lz40Var2.f();
                fse fseVar2 = aVar2.a.a.a;
                SavingsAccountActionsHelperImpl$updateSettings$2$2$1 savingsAccountActionsHelperImpl$updateSettings$2$2$1 = new SavingsAccountActionsHelperImpl$updateSettings$2$2$1(tlsVar, a, null);
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 6;
                break;
            case 6:
                b.b(obj);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
