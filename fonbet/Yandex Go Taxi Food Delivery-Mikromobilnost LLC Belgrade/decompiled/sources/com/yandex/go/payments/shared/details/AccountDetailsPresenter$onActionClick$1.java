package com.yandex.go.payments.shared.details;

import defpackage.jmr0;
import defpackage.jst;
import defpackage.mk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pne;
import defpackage.tse;
import defpackage.ua41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.details.AccountDetailsPresenter$onActionClick$1", f = "AccountDetailsPresenter.kt", l = {184}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AccountDetailsPresenter$onActionClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ jmr0 $action;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDetailsPresenter$onActionClick$1(c cVar, jmr0 jmr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = jmr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountDetailsPresenter$onActionClick$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountDetailsPresenter$onActionClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0.C;
            String str = this.$action.b;
            AuthType authType = AuthType.COOKIES;
            this.label = 1;
            b = oVar.b(str, authType, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        ua41 ua41Var = (ua41) b;
        if (ua41Var instanceof pne) {
            c cVar = this.this$0;
            String str2 = ((pne) ua41Var).a;
            cVar.getClass();
            CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
            aVar.f = true;
            aVar.b = str2;
            UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
            uiWebViewConfig.setShouldShowCloseButton(true);
            uiWebViewConfig.setCloseButtonPosition(1);
            ((mk) cVar.Dg()).showWebView(uiWebViewConfig);
        } else {
            jst.e.k(new IllegalStateException(), "Failed to wrap url with authorization with error: " + ua41Var);
            ((mk) this.this$0.Dg()).i7();
        }
        return zy11.a;
    }
}
