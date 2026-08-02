package com.ybsdk.widgets.common;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.widgets.common.SmsCodeEditText$onAttachedToWindow$1", f = "SmsCodeEditText.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SmsCodeEditText$onAttachedToWindow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ SmsCodeEditText this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsCodeEditText$onAttachedToWindow$1(SmsCodeEditText smsCodeEditText, Continuation continuation) {
        super(2, continuation);
        this.this$0 = smsCodeEditText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SmsCodeEditText$onAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SmsCodeEditText$onAttachedToWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0 && i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        do {
            SmsCodeEditText smsCodeEditText = this.this$0;
            z = smsCodeEditText.cursorVisible;
            smsCodeEditText.cursorVisible = !z;
            this.this$0.invalidate();
            this.label = 1;
        } while (kotlinx.coroutines.a.i(600L, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
