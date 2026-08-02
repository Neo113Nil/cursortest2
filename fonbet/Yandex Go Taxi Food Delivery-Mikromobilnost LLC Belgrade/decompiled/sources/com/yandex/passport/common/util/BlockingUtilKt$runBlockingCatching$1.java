package com.yandex.passport.common.util;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Lkotlin/Result;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.common.util.BlockingUtilKt$runBlockingCatching$1", f = "blockingUtil.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class BlockingUtilKt$runBlockingCatching$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingUtilKt$runBlockingCatching$1(wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BlockingUtilKt$runBlockingCatching$1 blockingUtilKt$runBlockingCatching$1 = new BlockingUtilKt$runBlockingCatching$1(this.$block, continuation);
        blockingUtilKt$runBlockingCatching$1.L$0 = obj;
        return blockingUtilKt$runBlockingCatching$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockingUtilKt$runBlockingCatching$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tse tseVar = (tse) this.L$0;
                wls wlsVar = this.$block;
                this.label = 1;
                obj = wlsVar.invoke(tseVar, this);
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
        } catch (TimeoutCancellationException e) {
            obj = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        return new Result(obj);
    }
}
