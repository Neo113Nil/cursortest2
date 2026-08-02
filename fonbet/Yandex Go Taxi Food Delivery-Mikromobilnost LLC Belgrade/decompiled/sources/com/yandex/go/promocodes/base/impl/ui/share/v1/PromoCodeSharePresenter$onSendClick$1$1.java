package com.yandex.go.promocodes.base.impl.ui.share.v1;

import android.app.Activity;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.vjr0;
import defpackage.wls;
import defpackage.wmf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.ui.share.v1.PromoCodeSharePresenter$onSendClick$1$1", f = "PromoCodeSharePresenter.kt", l = {192}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PromoCodeSharePresenter$onSendClick$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $formatCurrencyWithText;
    int label;
    final /* synthetic */ wmf0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodeSharePresenter$onSendClick$1$1(wmf0 wmf0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wmf0Var;
        this.$formatCurrencyWithText = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromoCodeSharePresenter$onSendClick$1$1(this.this$0, this.$formatCurrencyWithText, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromoCodeSharePresenter$onSendClick$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vjr0 vjr0Var = this.this$0.z;
            int i2 = kyh0.referral_share_title;
            String str = this.$formatCurrencyWithText;
            this.label = 1;
            Activity activity = vjr0Var.a;
            q5z.c0(str, activity.getString(i2), activity, 122);
            if (vjr0Var.b.d(122, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
