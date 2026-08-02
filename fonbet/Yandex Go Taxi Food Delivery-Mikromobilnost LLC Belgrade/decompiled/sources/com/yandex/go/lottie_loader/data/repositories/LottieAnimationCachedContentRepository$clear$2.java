package com.yandex.go.lottie_loader.data.repositories;

import defpackage.ehb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lottie_loader.data.repositories.LottieAnimationCachedContentRepository$clear$2", f = "LottieAnimationCachedContentRepository.kt", l = {HProv.PP_DHOID, HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LottieAnimationCachedContentRepository$clear$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimationCachedContentRepository$clear$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LottieAnimationCachedContentRepository$clear$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LottieAnimationCachedContentRepository$clear$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            ehb1.c(th);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            aVar = this.this$0;
            this.L$0 = aVar;
            this.label = 1;
            if (a.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                kotlin.io.b.l((File) obj);
                this.this$0.e = null;
                this.this$0.f = null;
                return zy11.a;
            }
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        obj = aVar.e(this);
    }
}
