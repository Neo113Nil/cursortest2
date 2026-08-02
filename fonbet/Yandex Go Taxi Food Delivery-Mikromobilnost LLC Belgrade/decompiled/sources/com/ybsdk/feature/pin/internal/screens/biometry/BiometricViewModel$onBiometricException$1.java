package com.ybsdk.feature.pin.internal.screens.biometry;

import com.ybsdk.core.utils.text.Text;
import defpackage.b9s0;
import defpackage.dzh0;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.p6s0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.biometry.BiometricViewModel$onBiometricException$1", f = "BiometricViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BiometricViewModel$onBiometricException$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $biometricError;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricViewModel$onBiometricException$1(b bVar, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$biometricError = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BiometricViewModel$onBiometricException$1(this.this$0, this.$biometricError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BiometricViewModel$onBiometricException$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.pin.internal.domain.b bVar = this.this$0.F;
            Throwable th = this.$biometricError;
            this.label = 1;
            obj = bVar.e(th, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            b bVar2 = this.this$0;
            bVar2.Z(new p6s0(bVar2.D));
        } else {
            x4c.g("Biometry error", this.$biometricError, null, Collections.singletonList(lrp0.e), 4);
            this.this$0.Z(new b9s0(new n0t0(new Text.Resource(dzh0.ybsdk_nfc_payments_tokenization_fail_snackbar_title), new Text.Resource(dzh0.ybsdk_pin_biometric_failed_to_init))));
        }
        return zy11.a;
    }
}
