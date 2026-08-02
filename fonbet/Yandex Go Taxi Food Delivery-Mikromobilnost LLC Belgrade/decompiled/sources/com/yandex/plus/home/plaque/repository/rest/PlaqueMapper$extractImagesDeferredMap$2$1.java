package com.yandex.plus.home.plaque.repository.rest;

import com.bumptech.glide.load.resource.bitmap.g;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.rest.PlaqueMapper$extractImagesDeferredMap$2$1", f = "PlaqueMapper.kt", l = {615}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlaqueMapper$extractImagesDeferredMap$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueMapper$extractImagesDeferredMap$2$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlaqueMapper$extractImagesDeferredMap$2$1 plaqueMapper$extractImagesDeferredMap$2$1 = new PlaqueMapper$extractImagesDeferredMap$2$1(this.this$0, this.$url, continuation);
        plaqueMapper$extractImagesDeferredMap$2$1.L$0 = obj;
        return plaqueMapper$extractImagesDeferredMap$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueMapper$extractImagesDeferredMap$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                com.yandex.plus.glide.a b = ((com.yandex.plus.glide.b) aVar.b).b(this.$url);
                b.a.t(g.i, Boolean.FALSE);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = b.c(this);
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
