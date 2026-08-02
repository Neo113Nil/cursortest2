package com.yandex.plus.home.api.prefetch;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qne0;
import defpackage.rvj0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.api.prefetch.PrefetchManager$startLoadingWithRetry$job$1", f = "PrefetchManager.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PrefetchManager$startLoadingWithRetry$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $url;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchManager$startLoadingWithRetry$job$1(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$fileName = str;
        this.$url = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PrefetchManager$startLoadingWithRetry$job$1 prefetchManager$startLoadingWithRetry$job$1 = new PrefetchManager$startLoadingWithRetry$job$1(this.this$0, this.$fileName, this.$url, continuation);
        prefetchManager$startLoadingWithRetry$job$1.L$0 = obj;
        return prefetchManager$startLoadingWithRetry$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrefetchManager$startLoadingWithRetry$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        a aVar;
        Object e;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                aVar = this.this$0;
                String str2 = this.$fileName;
                PrefetchManager$startLoadingWithRetry$job$1$1$response$1 prefetchManager$startLoadingWithRetry$job$1$1$response$1 = new PrefetchManager$startLoadingWithRetry$job$1$1$response$1(aVar, this.$url, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = aVar;
                this.L$3 = str2;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                e = com.yandex.plus.home.common.utils.a.e(8, 1000L, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, 2.0d, null, prefetchManager$startLoadingWithRetry$job$1$1$response$1, this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str2;
                obj = e;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$3;
                aVar = (a) this.L$2;
                b.b(obj);
            }
            obj2 = a.a(aVar, (rvj0) obj, str);
        } catch (TimeoutCancellationException e2) {
            failure = new Result.Failure(e2);
            obj2 = failure;
            a aVar2 = this.this$0;
            String str3 = this.$fileName;
            if (Result.a(obj2) != null) {
            }
            return zy11.a;
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            a aVar22 = this.this$0;
            String str32 = this.$fileName;
            if (Result.a(obj2) != null) {
            }
            return zy11.a;
        }
        a aVar222 = this.this$0;
        String str322 = this.$fileName;
        if (Result.a(obj2) != null) {
            aVar222.f().put(str322, qne0.a);
        }
        return zy11.a;
    }
}
