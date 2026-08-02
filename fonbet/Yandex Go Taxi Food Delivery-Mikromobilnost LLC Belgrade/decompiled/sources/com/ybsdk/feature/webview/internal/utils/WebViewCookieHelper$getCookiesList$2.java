package com.ybsdk.feature.webview.internal.utils;

import android.webkit.CookieManager;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ynh;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.webview.internal.utils.WebViewCookieHelper$getCookiesList$2", f = "WebViewCookieHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WebViewCookieHelper$getCookiesList$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewCookieHelper$getCookiesList$2(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewCookieHelper$getCookiesList$2(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewCookieHelper$getCookiesList$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CookieManager cookieManager;
        List W;
        EmptyList emptyList = EmptyList.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            ynh.a aVar = this.this$0.b;
            String str = this.$url;
            aVar.getClass();
            try {
                cookieManager = CookieManager.getInstance();
            } catch (UnsupportedOperationException e) {
                x4c.g("Failed to get CookieManager instance", e, null, null, 12);
                cookieManager = null;
            }
            String cookie = cookieManager != null ? cookieManager.getCookie(str) : null;
            if (cookie == null) {
                return emptyList;
            }
            W = evu0.W(cookie, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
            return W;
        } catch (Exception e2) {
            x4c.g("Error getCookiesList", e2, g8e.o("url = ", this.$url), null, 8);
            return emptyList;
        }
    }
}
