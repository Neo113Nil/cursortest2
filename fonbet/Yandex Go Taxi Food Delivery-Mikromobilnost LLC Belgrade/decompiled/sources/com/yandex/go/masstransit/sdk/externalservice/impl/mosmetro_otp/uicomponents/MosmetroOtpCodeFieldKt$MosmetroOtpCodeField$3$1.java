package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents;

import defpackage.bb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u5t0;
import defpackage.wls;
import defpackage.wqh;
import defpackage.yur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents.MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1", f = "MosmetroOtpCodeField.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ yur $focusRequester;
    final /* synthetic */ boolean $isExchangeLoading;
    final /* synthetic */ boolean $keepFocused;
    final /* synthetic */ u5t0 $keyboardController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1(boolean z, boolean z2, yur yurVar, u5t0 u5t0Var, Continuation continuation) {
        super(2, continuation);
        this.$keepFocused = z;
        this.$isExchangeLoading = z2;
        this.$focusRequester = yurVar;
        this.$keyboardController = u5t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1(this.$keepFocused, this.$isExchangeLoading, this.$focusRequester, this.$keyboardController, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:4)(2:14|15))(4:16|(2:20|(1:22))|10|11)|5|6|(1:8)|10|11) */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (this.$keepFocused && !this.$isExchangeLoading) {
                this.label = 1;
                if (bb1.l0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        yur.b(this.$focusRequester);
        u5t0 u5t0Var = this.$keyboardController;
        if (u5t0Var != null) {
            ((wqh) u5t0Var).b();
        }
        return zy11.a;
    }
}
