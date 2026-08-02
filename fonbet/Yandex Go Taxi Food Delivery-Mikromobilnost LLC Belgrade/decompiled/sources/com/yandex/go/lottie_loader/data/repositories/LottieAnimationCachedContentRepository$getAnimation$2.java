package com.yandex.go.lottie_loader.data.repositories;

import defpackage.eyj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zch;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljava/io/BufferedInputStream;", "<anonymous>", "(Ltse;)Ljava/io/BufferedInputStream;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lottie_loader.data.repositories.LottieAnimationCachedContentRepository$getAnimation$2", f = "LottieAnimationCachedContentRepository.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LottieAnimationCachedContentRepository$getAnimation$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $animationId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimationCachedContentRepository$getAnimation$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$animationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LottieAnimationCachedContentRepository$getAnimation$2(this.this$0, this.$animationId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LottieAnimationCachedContentRepository$getAnimation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            this.label = 1;
            obj = aVar.f(this);
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
        zch n = ((eyj) obj).n(this.$animationId);
        File file = n != null ? ((File[]) n.a)[0] : null;
        if (file == null || !file.exists()) {
            return null;
        }
        return new BufferedInputStream(new FileInputStream(file));
    }
}
