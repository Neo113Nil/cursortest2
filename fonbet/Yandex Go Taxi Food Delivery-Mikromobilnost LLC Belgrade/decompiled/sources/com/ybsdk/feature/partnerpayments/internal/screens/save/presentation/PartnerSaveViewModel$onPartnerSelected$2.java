package com.ybsdk.feature.partnerpayments.internal.screens.save.presentation;

import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.di.modules.features.j;
import com.ybsdk.feature.partnerpayments.api.PartnerPaymentsFeature$BindingStatus;
import defpackage.b64;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.d7j0;
import defpackage.dqg;
import defpackage.f42;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ph90;
import defpackage.pz40;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.PartnerSaveViewModel$onPartnerSelected$2", f = "PartnerSaveViewModel.kt", l = {71, 72, 91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PartnerSaveViewModel$onPartnerSelected$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $memberId;
    final /* synthetic */ PartnerPaymentsFeature$BindingStatus $status;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerSaveViewModel$onPartnerSelected$2(a aVar, String str, PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$memberId = str;
        this.$status = partnerPaymentsFeature$BindingStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PartnerSaveViewModel$onPartnerSelected$2(this.this$0, this.$memberId, this.$status, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PartnerSaveViewModel$onPartnerSelected$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x012b, code lost:
    
        if (com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.a.b0(r2, r4, r20) == r7) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0066, code lost:
    
        if (r0 == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        lrp0 lrp0Var;
        String str;
        Object b;
        a aVar;
        PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus;
        Object obj3;
        r0 r0Var;
        Object value;
        Object obj4;
        Throwable a2;
        r0 r0Var2;
        Object value2;
        Throwable a3;
        r0 r0Var3;
        Object value3;
        lrp0 lrp0Var2 = lrp0.s;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str2 = "";
        if (i == 0) {
            b.b(obj);
            j jVar = this.this$0.C;
            this.label = 1;
            a = jVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b = this.L$3;
                    partnerPaymentsFeature$BindingStatus = (PartnerPaymentsFeature$BindingStatus) this.L$2;
                    aVar = (a) this.L$1;
                    obj3 = this.L$0;
                    b.b(obj);
                    lrp0Var = lrp0Var2;
                    str = "";
                    obj2 = obj3;
                    a3 = Result.a(b);
                    if (a3 != null) {
                        f42 f42Var = aVar.I;
                        String message = a3.getMessage();
                        if (message == null) {
                            message = str;
                        }
                        f42Var.O(message, partnerPaymentsFeature$BindingStatus);
                        pz40 Y = aVar.Y();
                        do {
                            r0Var3 = (r0) Y;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, ph90.a((ph90) value3, null, null, new Result(new Result.Failure(a3)), 3)));
                        x4c.g("Failed to save partner", null, a3.getMessage(), Collections.singletonList(lrp0Var), 2);
                    }
                    a aVar2 = this.this$0;
                    PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus2 = this.$status;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                        pz40 Y2 = aVar2.Y();
                        do {
                            r0Var2 = (r0) Y2;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, ph90.a((ph90) value2, null, null, new Result(new Result.Failure(a2)), 3)));
                        f42 f42Var2 = aVar2.I;
                        String message2 = a2.getMessage();
                        f42Var2.O(message2 == null ? str : message2, partnerPaymentsFeature$BindingStatus2);
                        x4c.g("Failed to get agreementId", null, a2.getMessage(), Collections.singletonList(lrp0Var), 2);
                    }
                    return zy11.a;
                }
                PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus3 = (PartnerPaymentsFeature$BindingStatus) this.L$2;
                a aVar3 = (a) this.L$1;
                Object obj5 = this.L$0;
                b.b(obj);
                partnerPaymentsFeature$BindingStatus = partnerPaymentsFeature$BindingStatus3;
                b = ((Result) obj).getValue();
                obj3 = obj5;
                aVar = aVar3;
                if (!(b instanceof Result.Failure)) {
                    Object obj6 = (dqg) b;
                    if (obj6 instanceof bqg) {
                        f42 f42Var3 = aVar.I;
                        bqg bqgVar = (bqg) obj6;
                        String str3 = bqgVar.a;
                        f42Var3.O(str3, partnerPaymentsFeature$BindingStatus);
                        pz40 Y3 = aVar.Y();
                        while (true) {
                            r0 r0Var4 = (r0) Y3;
                            Object value4 = r0Var4.getValue();
                            lrp0Var = lrp0Var2;
                            str = str2;
                            if (r0Var4.k(value4, ph90.a((ph90) value4, null, null, new Result(new Result.Failure(new FailDataException((ct11) obj6))), 3))) {
                                break;
                            }
                            lrp0Var2 = lrp0Var;
                            str2 = str;
                        }
                        x4c.g("Failed to save partner", null, b64.l("error=", str3, ", description=", bqgVar.b), Collections.singletonList(lrp0Var), 2);
                    } else {
                        lrp0Var = lrp0Var2;
                        str = "";
                        if (!(obj6 instanceof cqg)) {
                            w511.b();
                            return null;
                        }
                        pz40 Y4 = aVar.Y();
                        do {
                            r0Var = (r0) Y4;
                            value = r0Var.getValue();
                            obj4 = ((cqg) obj6).a;
                        } while (!r0Var.k(value, ph90.a((ph90) value, null, ((d7j0) obj4).a, null, 5)));
                        String str4 = ((d7j0) obj4).a;
                        this.L$0 = obj3;
                        this.L$1 = aVar;
                        this.L$2 = partnerPaymentsFeature$BindingStatus;
                        this.L$3 = b;
                        this.label = 3;
                    }
                    obj2 = obj3;
                    a3 = Result.a(b);
                    if (a3 != null) {
                    }
                    a aVar22 = this.this$0;
                    PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus22 = this.$status;
                    a2 = Result.a(obj2);
                    if (a2 != null) {
                    }
                    return zy11.a;
                }
                lrp0Var = lrp0Var2;
                str = "";
                obj2 = obj3;
                a3 = Result.a(b);
                if (a3 != null) {
                }
                a aVar222 = this.this$0;
                PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus222 = this.$status;
                a2 = Result.a(obj2);
                if (a2 != null) {
                }
                return zy11.a;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        obj2 = a;
        a aVar4 = this.this$0;
        String str5 = this.$memberId;
        PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus4 = this.$status;
        if (obj2 instanceof Result.Failure) {
            lrp0Var = lrp0Var2;
            str = "";
            a aVar2222 = this.this$0;
            PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus2222 = this.$status;
            a2 = Result.a(obj2);
            if (a2 != null) {
            }
            return zy11.a;
        }
        com.ybsdk.feature.partnerpayments.internal.domain.a aVar5 = aVar4.B;
        this.L$0 = obj2;
        this.L$1 = aVar4;
        this.L$2 = partnerPaymentsFeature$BindingStatus4;
        this.label = 2;
        b = aVar5.b(str5, (String) obj2, aVar4, partnerPaymentsFeature$BindingStatus4, this);
        if (b != coroutineSingletons) {
            aVar = aVar4;
            partnerPaymentsFeature$BindingStatus = partnerPaymentsFeature$BindingStatus4;
            obj3 = obj2;
            if (!(b instanceof Result.Failure)) {
            }
            lrp0Var = lrp0Var2;
            str = "";
            obj2 = obj3;
            a3 = Result.a(b);
            if (a3 != null) {
            }
            a aVar22222 = this.this$0;
            PartnerPaymentsFeature$BindingStatus partnerPaymentsFeature$BindingStatus22222 = this.$status;
            a2 = Result.a(obj2);
            if (a2 != null) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
