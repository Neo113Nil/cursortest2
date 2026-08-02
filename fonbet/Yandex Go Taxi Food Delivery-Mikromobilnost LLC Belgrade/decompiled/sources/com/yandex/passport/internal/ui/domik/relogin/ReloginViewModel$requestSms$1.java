package com.yandex.passport.internal.ui.domik.relogin;

import com.yandex.passport.data.models.PhoneConfirmationResult;
import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$Relogin;
import com.yandex.passport.internal.core.announcing.f;
import com.yandex.passport.internal.ui.base.ShowFragmentInfo$AnimationType;
import com.yandex.passport.internal.ui.base.m;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.smsauth.AuthBySmsFragment;
import com.yandex.passport.internal.ui.n;
import com.yandex.passport.internal.ui.util.l;
import com.yandex.passport.internal.usecase.ui.h0;
import com.yandex.passport.internal.usecase.ui.i0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.relogin.ReloginViewModel$requestSms$1", f = "ReloginViewModel.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReloginViewModel$requestSms$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $authBySms;
    final /* synthetic */ String $country;
    final /* synthetic */ AuthTrack $track;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReloginViewModel$requestSms$1(c cVar, AuthTrack authTrack, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$track = authTrack;
        this.$country = str;
        this.$authBySms = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReloginViewModel$requestSms$1(this.this$0, this.$track, this.$country, this.$authBySms, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReloginViewModel$requestSms$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final c cVar = this.this$0;
            i0 i0Var = cVar.E;
            h0 h0Var = new h0(this.$track, this.$country, this.$authBySms, new wls() { // from class: com.yandex.passport.internal.ui.domik.relogin.a
                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    String str;
                    c cVar2 = c.this;
                    cVar2.D.g(DomikScreenSuccessMessages$Relogin.smsSendingSuccess);
                    l lVar = cVar2.C.a.A;
                    n nVar = new n(2, (AuthTrack) obj2, (PhoneConfirmationResult) obj3);
                    AuthBySmsFragment.Companion.getClass();
                    str = AuthBySmsFragment.FRAGMENT_TAG;
                    lVar.m(new m(nVar, str, false, ShowFragmentInfo$AnimationType.DIALOG));
                    return zy11.a;
                }
            }, new f(18), new b(cVar, 1), new b(cVar, 2));
            this.label = 1;
            if (i0Var.a(h0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
