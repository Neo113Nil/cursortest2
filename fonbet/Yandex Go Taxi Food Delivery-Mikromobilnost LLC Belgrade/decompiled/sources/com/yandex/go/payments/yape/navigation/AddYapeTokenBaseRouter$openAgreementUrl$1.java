package com.yandex.go.payments.yape.navigation;

import defpackage.dg41;
import defpackage.ff41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scg;
import defpackage.sy60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.yape.navigation.AddYapeTokenBaseRouter$openAgreementUrl$1", f = "AddYapeTokenBaseRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddYapeTokenBaseRouter$openAgreementUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddYapeTokenBaseRouter$openAgreementUrl$1(String str, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$url = str;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddYapeTokenBaseRouter$openAgreementUrl$1(this.$url, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddYapeTokenBaseRouter$openAgreementUrl$1 addYapeTokenBaseRouter$openAgreementUrl$1 = (AddYapeTokenBaseRouter$openAgreementUrl$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addYapeTokenBaseRouter$openAgreementUrl$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CoreWebViewConfig.Companion.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = this.$url;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, true, false, false, false, null, false, true, null, false, false, null, null, null, 1, 0, true, false, null, false, false, 4030202, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        c cVar = this.this$0;
        cVar.A(((scg) ((ff41) cVar.O.getValue())).b(), new dg41(uiWebViewConfig, null, null, null, null, null, null, 254), sy60.Q2);
        return zy11.a;
    }
}
