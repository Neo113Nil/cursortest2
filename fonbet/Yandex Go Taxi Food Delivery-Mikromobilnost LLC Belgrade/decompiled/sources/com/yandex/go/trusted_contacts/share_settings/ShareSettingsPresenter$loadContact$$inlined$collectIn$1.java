package com.yandex.go.trusted_contacts.share_settings;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpo0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.share_settings.ShareSettingsPresenter$loadContact$$inlined$collectIn$1", f = "ShareSettingsPresenter.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class ShareSettingsPresenter$loadContact$$inlined$collectIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectIn;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareSettingsPresenter$loadContact$$inlined$collectIn$1(tpr tprVar, Continuation continuation, a aVar) {
        super(2, continuation);
        this.$this_collectIn = tprVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShareSettingsPresenter$loadContact$$inlined$collectIn$1(this.$this_collectIn, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShareSettingsPresenter$loadContact$$inlined$collectIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$this_collectIn;
            tpo0 tpo0Var = new tpo0(11, this.this$0);
            this.label = 1;
            if (tprVar.collect(tpo0Var, this) == coroutineSingletons) {
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
