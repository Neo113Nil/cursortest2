package com.yandex.passport.internal.ui.domik.extaction;

import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$ExternalAction;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.DomikResult;
import com.yandex.passport.internal.ui.domik.DomikResultImpl;
import com.yandex.passport.internal.ui.domik.FinishRegistrationActivities;
import com.yandex.passport.internal.ui.domik.o;
import com.yandex.passport.internal.ui.domik.q;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.extaction.ExternalActionViewModel$authorizeByCookie$1", f = "ExternalActionViewModel.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExternalActionViewModel$authorizeByCookie$1 extends SuspendLambda implements wls {
    final /* synthetic */ Cookie $cookie;
    final /* synthetic */ AuthTrack $track;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalActionViewModel$authorizeByCookie$1(b bVar, Cookie cookie, AuthTrack authTrack, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$cookie = cookie;
        this.$track = authTrack;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExternalActionViewModel$authorizeByCookie$1(this.this$0, this.$cookie, this.$track, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExternalActionViewModel$authorizeByCookie$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsFromValue analyticsFromValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.usecase.authorize.b bVar = this.this$0.B;
            Cookie cookie = this.$cookie;
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.COOKIE_EXTERNAL_ACTION;
            AuthTrack authTrack = this.$track;
            com.yandex.passport.internal.usecase.authorize.a aVar = new com.yandex.passport.internal.usecase.authorize.a(cookie, analyticsFromValue, authTrack != null ? authTrack.getTrackId() : null, 0L);
            this.label = 1;
            obj = bVar.a(aVar, this);
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
        Object value = ((Result) obj).getValue();
        b bVar2 = this.this$0;
        AuthTrack authTrack2 = this.$track;
        if (!(value instanceof Result.Failure)) {
            bVar2.F.g(DomikScreenSuccessMessages$ExternalAction.authSuccess);
            q qVar = bVar2.D;
            o oVar = DomikResult.Companion;
            PassportLoginAction passportLoginAction = PassportLoginAction.PASSWORD;
            EnumSet noneOf = EnumSet.noneOf(FinishRegistrationActivities.class);
            oVar.getClass();
            qVar.b(authTrack2, new DomikResultImpl((ModernAccount) value, null, passportLoginAction, null, noneOf, 8, null));
        }
        b bVar3 = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            bVar3.c.m(Boolean.FALSE);
            EventError a2 = bVar3.A.a(a);
            bVar3.b.m(a2);
            bVar3.C.b(a2);
        }
        return zy11.a;
    }
}
