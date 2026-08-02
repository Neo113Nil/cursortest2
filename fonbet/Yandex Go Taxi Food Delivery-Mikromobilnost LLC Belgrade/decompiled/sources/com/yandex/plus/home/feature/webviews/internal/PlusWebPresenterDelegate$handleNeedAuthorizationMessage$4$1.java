package com.yandex.plus.home.feature.webviews.internal;

import defpackage.EvgenDiagnostic$WebViewType;
import defpackage.kio;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.on3;
import defpackage.qn3;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.uho;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.PlusWebPresenterDelegate$handleNeedAuthorizationMessage$4$1", f = "PlusWebPresenterDelegate.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusWebPresenterDelegate$handleNeedAuthorizationMessage$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onAuthResult;
    final /* synthetic */ sls $onAuthShow;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusWebPresenterDelegate$handleNeedAuthorizationMessage$4$1(sls slsVar, a aVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$onAuthShow = slsVar;
        this.this$0 = aVar;
        this.$onAuthResult = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusWebPresenterDelegate$handleNeedAuthorizationMessage$4$1(this.$onAuthShow, this.this$0, this.$onAuthResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusWebPresenterDelegate$handleNeedAuthorizationMessage$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.$onAuthShow.invoke();
            com.yandex.plus.home.auth.b bVar = this.this$0.b;
            this.label = 1;
            obj = bVar.d(this);
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
        qn3 qn3Var = (qn3) obj;
        if (qn3Var instanceof on3) {
            kio kioVar = this.this$0.c;
            uho uhoVar = kioVar.a;
            EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = kioVar.b;
            Map f = kotlin.collections.b.f();
            uhoVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("webview_type", evgenDiagnostic$WebViewType.getEventValue());
            linkedHashMap.put("additional_params", f);
            linkedHashMap.put("_meta", uho.b(new HashMap()));
            uhoVar.c("Error.WebView.NativeAuth.LoginFailed", linkedHashMap);
        }
        this.$onAuthResult.invoke(qn3Var);
        return zy11.a;
    }
}
