package com.yandex.plus.webview.internal;

import android.net.Uri;
import com.yandex.plus.webview.core.resource.WebViewNavigationReason;
import defpackage.in41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.srd0;
import defpackage.tse;
import defpackage.uvu;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.webview.internal.WebViewControllerWithContainer$loadUrl$1", f = "WebViewControllerWithContainer.kt", l = {105}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewControllerWithContainer$loadUrl$1 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $additionalHttpHeaders;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewControllerWithContainer$loadUrl$1(a aVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
        this.$additionalHttpHeaders = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewControllerWithContainer$loadUrl$1(this.this$0, this.$url, this.$additionalHttpHeaders, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewControllerWithContainer$loadUrl$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.plus.webview.internal.contract.request.a aVar = this.this$0.k;
            String str = this.$url;
            Map<String, String> map = this.$additionalHttpHeaders;
            this.label = 1;
            obj = aVar.a(str, map, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        uvu uvuVar = (uvu) obj;
        String str2 = uvuVar.a;
        Map map2 = uvuVar.b;
        srd0 srd0Var = new srd0(Uri.parse(str2), map2, WebViewNavigationReason.OTHER);
        boolean o = this.this$0.l.o(srd0Var);
        a aVar2 = this.this$0;
        if (o) {
            aVar2.n.q(srd0Var);
            Iterator it = this.this$0.t.iterator();
            while (it.hasNext()) {
                ((in41) it.next()).g();
            }
            super/*rn41*/.loadUrl(uvuVar.a, map2);
        } else {
            aVar2.n.d(srd0Var);
        }
        return zy11.a;
    }
}
