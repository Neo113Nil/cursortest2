package com.yandex.go.places.impl.ui.web_custom_tabs;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.web_custom_tabs.WebCustomTabsPresenter$loadUrl$1$result$1", f = "WebCustomTabsPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class WebCustomTabsPresenter$loadUrl$1$result$1 extends SuspendLambda implements tls {
    final /* synthetic */ noh $wrappedUrl;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCustomTabsPresenter$loadUrl$1$result$1(noh nohVar, Continuation continuation) {
        super(1, continuation);
        this.$wrappedUrl = nohVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WebCustomTabsPresenter$loadUrl$1$result$1(this.$wrappedUrl, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((WebCustomTabsPresenter$loadUrl$1$result$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        noh nohVar = this.$wrappedUrl;
        this.label = 1;
        Object k = nohVar.k(this);
        return k == coroutineSingletons ? coroutineSingletons : k;
    }
}
