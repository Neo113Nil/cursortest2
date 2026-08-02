package com.yandex.plus.home.api.prefetch;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rvj0;
import defpackage.skd0;
import defpackage.sne0;
import defpackage.une0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll8x;", "loadingJob", "Ljava/io/File;", "<anonymous>", "(Ll8x;)Ljava/io/File;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.api.prefetch.PrefetchManager$loadResource$2", f = "PrefetchManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PrefetchManager$loadResource$2 extends SuspendLambda implements wls {
    final /* synthetic */ rvj0 $response;
    final /* synthetic */ String $url;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchManager$loadResource$2(rvj0 rvj0Var, String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$response = rvj0Var;
        this.$url = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PrefetchManager$loadResource$2 prefetchManager$loadResource$2 = new PrefetchManager$loadResource$2(this.$response, this.$url, this.this$0, continuation);
        prefetchManager$loadResource$2.L$0 = obj;
        return prefetchManager$loadResource$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchManager$loadResource$2) create((l8x) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l8x l8xVar = (l8x) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        rvj0 rvj0Var = this.$response;
        if (rvj0Var != null) {
            String str = this.$url;
            a aVar = this.this$0;
            skd0.h(PlusLogTag.SDK, "Loading from getResource() finished earlier than from loadPrefetch() for url = " + str, null);
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            aVar.getClass();
            une0 a = a.a(aVar, rvj0Var, a.d(str));
            sne0 sne0Var = a instanceof sne0 ? (sne0) a : null;
            if (sne0Var != null) {
                return sne0Var.a;
            }
        }
        return null;
    }
}
