package com.ybsdk.feature.pin.internal.screens.biometry;

import defpackage.ay5;
import defpackage.frp0;
import defpackage.gqp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.trp0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.biometry.BiometricViewModel$encryptBiometric$1", f = "BiometricViewModel.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BiometricViewModel$encryptBiometric$1 extends SuspendLambda implements wls {
    final /* synthetic */ ay5 $cryptoObject;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricViewModel$encryptBiometric$1(b bVar, ay5 ay5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$cryptoObject = ay5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricViewModel$encryptBiometric$1(this.this$0, this.$cryptoObject, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricViewModel$encryptBiometric$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Cipher cipher;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                com.ybsdk.feature.pin.internal.domain.a aVar = bVar.E;
                String m460getPinCodeZhXAj9Q = bVar.B.m460getPinCodeZhXAj9Q();
                ay5 ay5Var = this.$cryptoObject;
                if (ay5Var == null || (cipher = ay5Var.b) == null) {
                    throw new IllegalStateException("Cipher doesn't exist");
                }
                this.label = 1;
                if (aVar.b(m460getPinCodeZhXAj9Q, cipher, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            trp0 trp0Var = trp0.a;
            trp0.f(new frp0(true, true));
            this.this$0.i0(BiometricViewModel$PinSkipableResult.OK);
        } catch (Exception e) {
            this.this$0.i0(BiometricViewModel$PinSkipableResult.ERROR);
            this.this$0.d0(e);
            gqp0 gqp0Var = new gqp0(e, "Encrypt", true, "encryptBiometric");
            trp0 trp0Var2 = trp0.a;
            trp0.e(gqp0Var);
        }
        this.this$0.G.e();
        return zy11.a;
    }
}
