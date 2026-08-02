package com.yandex.plus.home.api.prefetch;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll8x;", "it", "Ljava/io/File;", "<anonymous>", "(Ll8x;)Ljava/io/File;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.api.prefetch.PrefetchManager$getResource$2$1", f = "PrefetchManager.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PrefetchManager$getResource$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $fileName;
    final /* synthetic */ a $this_runSuspendCatching;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchManager$getResource$2$1(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$url = str;
        this.$this_runSuspendCatching = aVar;
        this.$fileName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrefetchManager$getResource$2$1(this.$this_runSuspendCatching, this.$url, this.$fileName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchManager$getResource$2$1) create((l8x) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        skd0.h(PlusLogTag.SDK, "Saved file not found for url = " + this.$url, null);
        a aVar = this.$this_runSuspendCatching;
        String str = this.$fileName;
        String str2 = this.$url;
        this.label = 1;
        Object b = a.b(aVar, str, str2, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
