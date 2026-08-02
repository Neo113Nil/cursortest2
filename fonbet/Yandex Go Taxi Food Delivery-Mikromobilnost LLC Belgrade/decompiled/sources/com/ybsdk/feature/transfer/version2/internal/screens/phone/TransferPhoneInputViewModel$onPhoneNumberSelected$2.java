package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import defpackage.evu0;
import defpackage.in01;
import defpackage.jfb0;
import defpackage.kfb0;
import defpackage.mvg;
import defpackage.nn01;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xi01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputViewModel$onPhoneNumberSelected$2", f = "TransferPhoneInputViewModel.kt", l = {514}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferPhoneInputViewModel$onPhoneNumberSelected$2 extends SuspendLambda implements wls {
    final /* synthetic */ Integer $index;
    final /* synthetic */ xi01 $kind;
    final /* synthetic */ jfb0 $phoneNumber;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Ldqg;", "Lbbv0;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/phone/domain/entities/SuggestedPartnersWithAction;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputViewModel$onPhoneNumberSelected$2$2", f = "TransferPhoneInputViewModel.kt", l = {515}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputViewModel$onPhoneNumberSelected$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ jfb0 $phoneNumber;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, jfb0 jfb0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$phoneNumber = jfb0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$phoneNumber, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                c cVar = this.this$0;
                jfb0 jfb0Var = this.$phoneNumber;
                this.label = 1;
                d0 = c.d0(cVar, jfb0Var, str, this);
                if (d0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                d0 = ((Result) obj).getValue();
            }
            return new Result(d0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferPhoneInputViewModel$onPhoneNumberSelected$2(c cVar, xi01 xi01Var, Integer num, jfb0 jfb0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$kind = xi01Var;
        this.$index = num;
        this.$phoneNumber = jfb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferPhoneInputViewModel$onPhoneNumberSelected$2(this.this$0, this.$kind, this.$index, this.$phoneNumber, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferPhoneInputViewModel$onPhoneNumberSelected$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String Q;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.i0().b(c.f0(this.this$0, this.$kind), this.$index);
            int i2 = nn01.a[((in01) this.this$0.X()).k.ordinal()];
            if (i2 == 1) {
                Q = evu0.Q("+", this.$phoneNumber.b());
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                Regex regex = kfb0.a;
                Q = kfb0.b(kfb0.e(this.$phoneNumber.a()));
            }
            String str = Q;
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, in01.a((in01) value, null, null, new t8j0(), null, null, str, null, null, null, null, 8155)));
            c cVar = this.this$0;
            String a = this.$phoneNumber.a();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$phoneNumber, null);
            this.label = 1;
            if (cVar.O(anonymousClass2, a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
        }
        return zy11.a;
    }
}
