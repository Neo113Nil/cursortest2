package com.yandex.plus.home.plaque.repository.graphql;

import com.bumptech.glide.load.resource.bitmap.g;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.plaquesdk.widget.EmptyDrawable;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p5j0;
import defpackage.pgz;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.plaque.repository.graphql.PlaqueMapper$imagesDeferredMap$7$1", f = "PlaqueMapper.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlaqueMapper$imagesDeferredMap$7$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageUrl;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaqueMapper$imagesDeferredMap$7$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlaqueMapper$imagesDeferredMap$7$1 plaqueMapper$imagesDeferredMap$7$1 = new PlaqueMapper$imagesDeferredMap$7$1(this.this$0, this.$imageUrl, continuation);
        plaqueMapper$imagesDeferredMap$7$1.L$0 = obj;
        return plaqueMapper$imagesDeferredMap$7$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaqueMapper$imagesDeferredMap$7$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                com.yandex.plus.glide.a b = ((com.yandex.plus.glide.b) bVar.b).b(this.$imageUrl);
                p5j0 p5j0Var = b.a;
                p5j0Var.g(EmptyDrawable.INSTANCE);
                p5j0Var.t(g.i, Boolean.FALSE);
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
            failure = new Result.Failure(e);
            obj = failure;
            b bVar2 = this.this$0;
            String str = this.$imageUrl;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj = failure;
            b bVar22 = this.this$0;
            String str2 = this.$imageUrl;
            a = Result.a(obj);
            if (a == null) {
            }
        }
        b bVar222 = this.this$0;
        String str22 = this.$imageUrl;
        a = Result.a(obj);
        if (a == null) {
            return obj;
        }
        pgz pgzVar = bVar222.d;
        LogPriority logPriority = LogPriority.ERROR;
        if (pgzVar.e(logPriority)) {
            pgzVar.b(logPriority, "PlaqueMapper", g8e.o("Failed download image with url ", str22), a);
        }
        return EmptyDrawable.INSTANCE;
    }
}
