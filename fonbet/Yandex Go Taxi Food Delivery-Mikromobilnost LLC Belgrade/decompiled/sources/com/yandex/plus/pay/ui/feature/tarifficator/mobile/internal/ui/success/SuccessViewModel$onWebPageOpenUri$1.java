package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessViewModel$onWebPageOpenUri$1", f = "SuccessViewModel.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SuccessViewModel$onWebPageOpenUri$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $requireAuthorization;
    final /* synthetic */ String $uri;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessViewModel$onWebPageOpenUri$1(boolean z, b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$requireAuthorization = z;
        this.this$0 = bVar;
        this.$uri = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuccessViewModel$onWebPageOpenUri$1(this.$requireAuthorization, this.this$0, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuccessViewModel$onWebPageOpenUri$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.$requireAuthorization) {
                str = this.$uri;
                this.this$0.B.k(str);
                return zy11.a;
            }
            com.yandex.plus.pay.ui.core.api.domain.a aVar = this.this$0.x;
            String str2 = this.$uri;
            this.label = 1;
            obj = aVar.a(str2, this);
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
        str = (String) obj;
        this.this$0.B.k(str);
        return zy11.a;
    }
}
