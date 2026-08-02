package com.ybsdk.feature.savings.internal.screens.create;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsRegistrationResultResult;
import com.ybsdk.feature.savings.internal.entities.SavingsAccountCreationStatusEntity$Status;
import com.ybsdk.feature.savings.internal.interactors.c;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4m0;
import defpackage.p4m0;
import defpackage.pz40;
import defpackage.q7m0;
import defpackage.rt1;
import defpackage.t4m0;
import defpackage.tls;
import defpackage.tse;
import defpackage.u4m0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.y4m0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationViewModel$startStatusPolling$1", f = "SavingsAccountCreationViewModel.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountCreationViewModel$startStatusPolling$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationViewModel$startStatusPolling$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            r0 r0Var;
            Object value;
            u4m0 u4m0Var = (u4m0) obj;
            pz40 Y = ((a) this.receiver).Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new t4m0(null, new q7m0(u4m0Var != null ? u4m0Var.f : null, u4m0Var != null ? u4m0Var.g : null))));
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountCreationViewModel$startStatusPolling$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsAccountCreationViewModel$startStatusPolling$1(this.this$0, this.$requestId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsAccountCreationViewModel$startStatusPolling$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = this.this$0.F;
            String str = this.$requestId;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this.this$0, a.class, "updateProgressState", "updateProgressState(Lcom/ybsdk/feature/savings/internal/entities/SavingsAccountCreationStatusEntity;)V", 0);
            this.label = 1;
            b = cVar.b(str, anonymousClass1, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        String str2 = this.$requestId;
        if (!(b instanceof Result.Failure)) {
            u4m0 u4m0Var = (u4m0) b;
            SavingsAccountCreationStatusEntity$Status savingsAccountCreationStatusEntity$Status = u4m0Var.b;
            String str3 = u4m0Var.i;
            int i2 = y4m0.a[savingsAccountCreationStatusEntity$Status.ordinal()];
            if (i2 == 1) {
                rt1.O(aVar.E.f0, SavingsEvents$SavingsRegistrationResultResult.ERROR);
                x4c.g("Savings account opening status polling failed", null, "request_id: " + str2, null, 10);
                pz40 Y = aVar.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, t4m0.a((t4m0) value2, a.b0(aVar, u4m0Var))));
            } else if (i2 == 2) {
                rt1.O(aVar.E.f0, SavingsEvents$SavingsRegistrationResultResult.PENDING);
                pz40 Y2 = aVar.Y();
                do {
                    r0Var3 = (r0) Y2;
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, t4m0.a((t4m0) value3, a.b0(aVar, u4m0Var))));
            } else if (i2 != 3) {
                if (i2 != 4) {
                    w511.b();
                    return null;
                }
            } else if (str3 == null || evu0.J(str3)) {
                rt1.O(aVar.E.f0, SavingsEvents$SavingsRegistrationResultResult.ERROR);
                x4c.g("Savings account creation success, but agreement_id is missing", null, null, null, 14);
                pz40 Y3 = aVar.Y();
                do {
                    r0Var4 = (r0) Y3;
                    value4 = r0Var4.getValue();
                } while (!r0Var4.k(value4, t4m0.a((t4m0) value4, new o4m0(null))));
            } else {
                rt1.O(aVar.E.f0, SavingsEvents$SavingsRegistrationResultResult.OK);
                aVar.C.l(aVar.D.b(str3, null));
            }
        }
        a aVar2 = this.this$0;
        String str4 = this.$requestId;
        Throwable a = Result.a(b);
        if (a != null) {
            x4c.g("Failed to fetch savings account creation status", a, null, null, 12);
            pz40 Y4 = aVar2.Y();
            do {
                r0Var = (r0) Y4;
                value = r0Var.getValue();
            } while (!r0Var.k(value, t4m0.a((t4m0) value, new p4m0(a, str4))));
        }
        return zy11.a;
    }
}
