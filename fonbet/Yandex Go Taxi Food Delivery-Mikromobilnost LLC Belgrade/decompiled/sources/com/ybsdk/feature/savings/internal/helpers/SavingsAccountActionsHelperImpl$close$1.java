package com.ybsdk.feature.savings.internal.helpers;

import com.ybsdk.feature.savings.api.SavingsActionStatus;
import defpackage.fse;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w9m0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.helpers.SavingsAccountActionsHelperImpl$close$1", f = "SavingsAccountActionsHelperImpl.kt", l = {109, 111, 113, HProv.PP_INFO, 120}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountActionsHelperImpl$close$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ lz40 $flow;
    final /* synthetic */ String $idempotencyToken;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountActionsHelperImpl$close$1(lz40 lz40Var, a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$flow = lz40Var;
        this.this$0 = aVar;
        this.$agreementId = str;
        this.$idempotencyToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsAccountActionsHelperImpl$close$1(this.$flow, this.this$0, this.$agreementId, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsAccountActionsHelperImpl$close$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d8, code lost:
    
        if (defpackage.tje.k0(r11, r3, r10) != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r11 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        if (r11.emit(r1, r10) == r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        lz40 lz40Var;
        Object obj2;
        Throwable a2;
        lz40 lz40Var2;
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            lz40 lz40Var3 = this.$flow;
            w9m0 w9m0Var = new w9m0(SavingsActionStatus.IN_PROGRESS, null);
            this.label = 1;
        } else if (i == 1) {
            b.b(obj);
        } else {
            if (i == 2) {
                b.b(obj);
                a = ((Result) obj).getValue();
                lz40Var = this.$flow;
                if (a instanceof Result.Failure) {
                    obj2 = a;
                    String str = this.$agreementId;
                    lz40 lz40Var4 = this.$flow;
                    a aVar2 = this.this$0;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                    }
                    return zy11.a;
                }
                w9m0 w9m0Var2 = new w9m0(SavingsActionStatus.SUCCESS, null);
                this.L$0 = a;
                this.L$1 = lz40Var;
                this.label = 3;
                if (lz40Var.emit(w9m0Var2, this) != coroutineSingletons) {
                    obj2 = a;
                    lz40Var.f();
                    String str2 = this.$agreementId;
                    lz40 lz40Var42 = this.$flow;
                    a aVar22 = this.this$0;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                lz40Var = (lz40) this.L$1;
                obj2 = this.L$0;
                b.b(obj);
                lz40Var.f();
                String str22 = this.$agreementId;
                lz40 lz40Var422 = this.$flow;
                a aVar222 = this.this$0;
                a2 = Result.a(obj2);
                if (a2 != null) {
                    x4c.g("Failed to close account", a2, str22, null, 8);
                    w9m0 w9m0Var3 = new w9m0(SavingsActionStatus.ERROR, a2);
                    this.L$0 = obj2;
                    this.L$1 = lz40Var422;
                    this.L$2 = aVar222;
                    this.label = 4;
                    if (lz40Var422.emit(w9m0Var3, this) != coroutineSingletons) {
                        lz40Var2 = lz40Var422;
                        aVar = aVar222;
                        lz40Var2.f();
                        fse fseVar = aVar.a.a.a;
                        SavingsAccountActionsHelperImpl$close$1$2$1 savingsAccountActionsHelperImpl$close$1$2$1 = new SavingsAccountActionsHelperImpl$close$1$2$1(aVar, null);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
            if (i != 4) {
                if (i == 5) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$2;
            lz40Var2 = (lz40) this.L$1;
            obj2 = this.L$0;
            b.b(obj);
            lz40Var2.f();
            fse fseVar2 = aVar.a.a.a;
            SavingsAccountActionsHelperImpl$close$1$2$1 savingsAccountActionsHelperImpl$close$1$2$12 = new SavingsAccountActionsHelperImpl$close$1$2$1(aVar, null);
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
        }
        com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.b;
        String str3 = this.$agreementId;
        String str4 = this.$idempotencyToken;
        this.label = 2;
        a = bVar.a(str3, str4, this);
    }
}
