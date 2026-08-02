package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents;

import defpackage.eja1;
import defpackage.hoy0;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents.MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1", f = "MosmetroOtpCodeField.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ m3u0 $currentValue$delegate;
    final /* synthetic */ boolean $isExchangeLoading;
    final /* synthetic */ oz40 $textFieldValue$delegate;
    final /* synthetic */ oz40 $wasExchangeLoading$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1(boolean z, oz40 oz40Var, m3u0 m3u0Var, oz40 oz40Var2, Continuation continuation) {
        super(2, continuation);
        this.$isExchangeLoading = z;
        this.$wasExchangeLoading$delegate = oz40Var;
        this.$currentValue$delegate = m3u0Var;
        this.$textFieldValue$delegate = oz40Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1(this.$isExchangeLoading, this.$wasExchangeLoading$delegate, this.$currentValue$delegate, this.$textFieldValue$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1 mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1 = (MosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mosmetroOtpCodeFieldKt$MosmetroOtpCodeField$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (((Boolean) this.$wasExchangeLoading$delegate.getValue()).booleanValue() && !this.$isExchangeLoading) {
            oz40 oz40Var = this.$textFieldValue$delegate;
            String str = (String) this.$currentValue$delegate.getValue();
            int length = ((String) this.$currentValue$delegate.getValue()).length();
            oz40Var.setValue(new hoy0(str, eja1.c(length, length), 4));
        }
        this.$wasExchangeLoading$delegate.setValue(Boolean.valueOf(this.$isExchangeLoading));
        return zy11.a;
    }
}
