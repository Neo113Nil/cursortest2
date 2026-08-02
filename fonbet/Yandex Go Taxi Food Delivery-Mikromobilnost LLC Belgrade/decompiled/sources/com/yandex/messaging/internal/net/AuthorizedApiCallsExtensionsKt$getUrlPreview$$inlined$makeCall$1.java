package com.yandex.messaging.internal.net;

import com.yandex.messaging.core.net.entities.GetUrlPreviewRequestParam;
import defpackage.bp5;
import defpackage.cn2;
import defpackage.dvw;
import defpackage.io3;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.to3;
import defpackage.tse;
import defpackage.uo3;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1", f = "authorizedApiCallsExtensions.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ GetUrlPreviewRequestParam $params$inlined;
    final /* synthetic */ to3 $this_getUrlPreview$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1(Continuation continuation, to3 to3Var, GetUrlPreviewRequestParam getUrlPreviewRequestParam) {
        super(2, continuation);
        this.$this_getUrlPreview$inlined = to3Var;
        this.$params$inlined = getUrlPreviewRequestParam;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1 authorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1 = new AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1(continuation, this.$this_getUrlPreview$inlined, this.$params$inlined);
        authorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1.L$0 = obj;
        return authorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizedApiCallsExtensionsKt$getUrlPreview$$inlined$makeCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        to3 to3Var = this.$this_getUrlPreview$inlined;
        j18Var.w(new uo3(tseVar, new cn2(to3Var.a.a(new io3(16, to3Var, this.$params$inlined, new bp5(j18Var))), 1), 9));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
