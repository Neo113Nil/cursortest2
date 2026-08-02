package com.yandex.go.image.internal.coil.fetcher;

import coil3.network.HttpException;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz50;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"T", "Loz50;", "response", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.internal.coil.fetcher.RemoteImageNetworkFetcher$executeNetworkRequest$2", f = "RemoteImageNetworkFetcher.kt", l = {HProv.ALG_SID_SHA_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class RemoteImageNetworkFetcher$executeNetworkRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImageNetworkFetcher$executeNetworkRequest$2(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteImageNetworkFetcher$executeNetworkRequest$2 remoteImageNetworkFetcher$executeNetworkRequest$2 = new RemoteImageNetworkFetcher$executeNetworkRequest$2(this.$block, continuation);
        remoteImageNetworkFetcher$executeNetworkRequest$2.L$0 = obj;
        return remoteImageNetworkFetcher$executeNetworkRequest$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoteImageNetworkFetcher$executeNetworkRequest$2) create((oz50) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oz50 oz50Var = (oz50) this.L$0;
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
        int i2 = oz50Var.a;
        if ((200 > i2 || i2 >= 300) && i2 != 304) {
            throw new HttpException(oz50Var);
        }
        wls wlsVar = this.$block;
        this.L$0 = null;
        this.label = 1;
        Object invoke = wlsVar.invoke(oz50Var, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
