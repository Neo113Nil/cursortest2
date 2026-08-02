package com.ybsdk.feature.pin.internal.screens.createpin;

import com.ybsdk.feature.pin.api.entities.StartSessionState;
import com.ybsdk.feature.pin.internal.entities.PinCode;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import defpackage.c7f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.y6f;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.createpin.CreatePinViewModel$sendCode$2$1", f = "CreatePinViewModel.kt", l = {208, 213}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreatePinViewModel$sendCode$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ PinTokenEntity $pinTokenEntity;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePinViewModel$sendCode$2$1(a aVar, PinTokenEntity pinTokenEntity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pinTokenEntity = pinTokenEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreatePinViewModel$sendCode$2$1(this.this$0, this.$pinTokenEntity, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreatePinViewModel$sendCode$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r10 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object obj2;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.pin.internal.domain.b bVar = aVar.C;
            String m448constructorimpl = PinCode.m448constructorimpl(((c7f) aVar.X()).a);
            PinTokenEntity pinTokenEntity = this.$pinTokenEntity;
            String verificationToken = this.this$0.B.getVerificationToken();
            this.label = 1;
            d = bVar.d(pinTokenEntity, m448constructorimpl, verificationToken, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.L$0;
                b.b(obj);
                d = obj2;
                a aVar2 = this.this$0;
                if (Result.a(d) != null) {
                    aVar2.M.k(false);
                    pz40 Y = aVar2.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, c7f.a((c7f) value, null, null, y6f.b, null, null, null, 251)));
                }
                return zy11.a;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        if (!(d instanceof Result.Failure)) {
            this.L$0 = d;
            this.label = 2;
            if (a.b0(aVar3, (StartSessionState) d, this) != coroutineSingletons) {
                obj2 = d;
                d = obj2;
            }
            return coroutineSingletons;
        }
        a aVar22 = this.this$0;
        if (Result.a(d) != null) {
        }
        return zy11.a;
    }
}
