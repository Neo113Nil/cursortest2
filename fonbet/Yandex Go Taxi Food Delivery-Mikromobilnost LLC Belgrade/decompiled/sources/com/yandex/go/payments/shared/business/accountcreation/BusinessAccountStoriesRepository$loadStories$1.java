package com.yandex.go.payments.shared.business.accountcreation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ww6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lru/yandex/taxi/communications/api/dto/Story;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.BusinessAccountStoriesRepository$loadStories$1", f = "BusinessAccountStoriesRepository.kt", l = {15}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BusinessAccountStoriesRepository$loadStories$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $screenName;
    int label;
    final /* synthetic */ ww6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessAccountStoriesRepository$loadStories$1(ww6 ww6Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ww6Var;
        this.$screenName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusinessAccountStoriesRepository$loadStories$1(this.this$0, this.$screenName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BusinessAccountStoriesRepository$loadStories$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.stories.domain.b bVar = this.this$0.a;
            Integer num = new Integer(0);
            String str = this.$screenName;
            this.label = 1;
            if (bVar.b(null, null, num, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
