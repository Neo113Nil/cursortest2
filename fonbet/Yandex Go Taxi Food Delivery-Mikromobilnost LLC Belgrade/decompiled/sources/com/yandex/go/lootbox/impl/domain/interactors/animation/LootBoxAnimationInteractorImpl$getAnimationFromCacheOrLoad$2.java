package com.yandex.go.lootbox.impl.domain.interactors.animation;

import com.yandex.go.lootbox.api.domain.entities.lootbox.animation_type.LootBoxAnimationType;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxAnimationInfo;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.cpz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ljava/io/InputStream;", "<anonymous>", "(Ltse;)Ljava/io/InputStream;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.lootbox.impl.domain.interactors.animation.LootBoxAnimationInteractorImpl$getAnimationFromCacheOrLoad$2", f = "LootBoxAnimationInteractorImpl.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LootBoxAnimationInteractorImpl$getAnimationFromCacheOrLoad$2 extends SuspendLambda implements wls {
    final /* synthetic */ LootBoxAnimationType $animationEventType;
    final /* synthetic */ String $animationId;
    final /* synthetic */ sls $onAnimationLoadStart;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LootBoxAnimationInteractorImpl$getAnimationFromCacheOrLoad$2(e eVar, String str, LootBoxAnimationType lootBoxAnimationType, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$animationId = str;
        this.$animationEventType = lootBoxAnimationType;
        this.$onAnimationLoadStart = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LootBoxAnimationInteractorImpl$getAnimationFromCacheOrLoad$2(this.this$0, this.$animationId, this.$animationEventType, this.$onAnimationLoadStart, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LootBoxAnimationInteractorImpl$getAnimationFromCacheOrLoad$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.this$0.h(this.$animationId, this.$animationEventType)) {
                e eVar = this.this$0;
                File a = eVar.b.c.a(this.$animationId, this.$animationEventType);
                if (a.exists()) {
                    return new BufferedInputStream(new FileInputStream(a));
                }
            } else {
                sls slsVar = this.$onAnimationLoadStart;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                LootBoxAnimationInfo e = this.this$0.e(this.$animationId);
                if (e != null) {
                    e eVar2 = this.this$0;
                    LootBoxAnimationType lootBoxAnimationType = this.$animationEventType;
                    cpz cpzVar = new cpz(eVar2, this.$animationId, 1);
                    this.L$0 = null;
                    this.label = 1;
                    obj = eVar2.b.a(e.a, lootBoxAnimationType, e.f(e, lootBoxAnimationType), cpzVar, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return (InputStream) obj;
    }
}
