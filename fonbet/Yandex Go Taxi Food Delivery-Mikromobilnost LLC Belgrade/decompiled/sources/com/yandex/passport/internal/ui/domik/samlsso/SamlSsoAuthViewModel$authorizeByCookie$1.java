package com.yandex.passport.internal.ui.domik.samlsso;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.samlsso.SamlSsoAuthViewModel$authorizeByCookie$1", f = "SamlSsoAuthViewModel.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SamlSsoAuthViewModel$authorizeByCookie$1 extends SuspendLambda implements wls {
    final /* synthetic */ Cookie $cookie;
    final /* synthetic */ AuthTrack $track;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SamlSsoAuthViewModel$authorizeByCookie$1(g gVar, Cookie cookie, AuthTrack authTrack, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$cookie = cookie;
        this.$track = authTrack;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SamlSsoAuthViewModel$authorizeByCookie$1(this.this$0, this.$cookie, this.$track, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SamlSsoAuthViewModel$authorizeByCookie$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsFromValue analyticsFromValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.usecase.authorize.b bVar = this.this$0.D;
            Cookie cookie = this.$cookie;
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.COOKIE_QR_ON_TV;
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
        g gVar = this.this$0;
        AuthTrack authTrack2 = this.$track;
        if (!(value instanceof Result.Failure)) {
            gVar.E.onSamlSsoAuthSuccess(authTrack2, (ModernAccount) value);
        }
        g gVar2 = this.this$0;
        if (Result.a(value) != null) {
            gVar2.I.m(a.c);
        }
        this.this$0.c.m(Boolean.FALSE);
        return zy11.a;
    }
}
