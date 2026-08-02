package ru.rustore.sdk.pushclient.a;

import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rustore.sdk.pushclient.a.h;
import xsna.b6l;
import xsna.d5o0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

@b6l(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$Companion$getToken$1", f = "VkpnsClientSdk.kt", l = {Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    public int a;
    public final /* synthetic */ d5o0<String>.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d5o0<String>.a aVar, spj<? super g> spjVar) {
        super(2, spjVar);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new g(this.b, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return new g(this.b, spjVar).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            kotlin.a.a(obj);
            h.b bVar = h.t;
            d5o0<String>.a aVar = this.b;
            if (SdkInitAwaiter.awaitInitialization$default(h.w, 0L, 1, null)) {
                h a = h.b.a();
                this.a = 1;
                if (a.getToken(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                aVar.a(new SdkIsNotInitializedException("Client SDK is not initialized, did you call init method in your Application class?"));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
