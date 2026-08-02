package com.ybsdk.feature.webview.internal.utils;

import defpackage.evu0;
import defpackage.g8e;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.utils.WebViewCookieHelper$getCookiesNamesList$2", f = "WebViewCookieHelper.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WebViewCookieHelper$getCookiesNamesList$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewCookieHelper$getCookiesNamesList$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewCookieHelper$getCookiesNamesList$2(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewCookieHelper$getCookiesNamesList$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? failure;
        List W;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                String str = this.$url;
                this.label = 1;
                bVar.getClass();
                sjh sjhVar = uyj.a;
                obj = tje.k0(mdh.b, new WebViewCookieHelper$getCookiesList$2(bVar, str, null), this);
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
            List list = (List) obj;
            failure = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W = evu0.W(((HttpCookie) kotlin.collections.a.P(HttpCookie.parse((String) it.next()))).toString(), new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
                failure.add((String) kotlin.collections.a.P(W));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        String str2 = this.$url;
        Throwable a = Result.a(failure);
        if (a == null) {
            return (List) failure;
        }
        x4c.g("Error getCookiesNamesList", a, g8e.o("url = ", str2), null, 8);
        return EmptyList.a;
    }
}
