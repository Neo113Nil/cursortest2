package com.yandex.plus.home.feature.webviews.internal.container;

import defpackage.c60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$requestPermissions$1", f = "WebViewsControllerImpl.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewsControllerImpl$requestPermissions$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onResult;
    final /* synthetic */ Collection<String> $permissions;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewsControllerImpl$requestPermissions$1(Collection collection, a aVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$permissions = collection;
        this.this$0 = aVar;
        this.$onResult = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewsControllerImpl$requestPermissions$1(this.$permissions, this.this$0, this.$onResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewsControllerImpl$requestPermissions$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String[] strArr = (String[]) this.$permissions.toArray(new String[0]);
            c60 c60Var = this.this$0.n;
            this.L$0 = null;
            this.label = 1;
            obj = c60Var.c(strArr, this);
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
        this.$onResult.invoke((Map) obj);
        return zy11.a;
    }
}
