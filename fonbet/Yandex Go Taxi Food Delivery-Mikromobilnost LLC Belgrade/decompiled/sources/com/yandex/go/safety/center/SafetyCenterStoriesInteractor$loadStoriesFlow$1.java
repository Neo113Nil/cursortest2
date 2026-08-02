package com.yandex.go.safety.center;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lru/yandex/taxi/communications/api/dto/Story;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterStoriesInteractor$loadStoriesFlow$1", f = "SafetyCenterStoriesInteractor.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterStoriesInteractor$loadStoriesFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $screenName;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterStoriesInteractor$loadStoriesFlow$1(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$screenName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterStoriesInteractor$loadStoriesFlow$1(this.this$0, this.$screenName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterStoriesInteractor$loadStoriesFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Address address;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ZoneAddress f = this.this$0.b.f();
            zzs B = (f == null || (address = f.a) == null) ? null : address.B();
            ru.yandex.taxi.stories.domain.b bVar = this.this$0.a;
            Double d = B != null ? new Double(B.a) : null;
            Double d2 = B != null ? new Double(B.b) : null;
            Integer num = new Integer(0);
            String str = this.$screenName;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (bVar.b(d, d2, num, str, this) == coroutineSingletons) {
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
