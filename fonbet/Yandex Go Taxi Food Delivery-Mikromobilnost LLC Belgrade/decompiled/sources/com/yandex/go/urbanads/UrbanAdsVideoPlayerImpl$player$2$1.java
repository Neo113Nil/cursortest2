package com.yandex.go.urbanads;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zf21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.list_player_manager.ListYandexPlayer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;", "<anonymous>", "(Ltse;)Lru/yandex/video/m3/list_player_manager/ListYandexPlayer;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.urbanads.UrbanAdsVideoPlayerImpl$player$2$1", f = "UrbanAdsVideoPlayerImpl.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes7.dex */
final class UrbanAdsVideoPlayerImpl$player$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ zf21 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrbanAdsVideoPlayerImpl$player$2$1(zf21 zf21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zf21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UrbanAdsVideoPlayerImpl$player$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UrbanAdsVideoPlayerImpl$player$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.feed_video.domain.manager.a aVar = this.this$0.a;
            this.label = 1;
            obj = aVar.b(this);
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
        ((ListYandexPlayer) obj).addObserver(this.this$0.c);
        return obj;
    }
}
