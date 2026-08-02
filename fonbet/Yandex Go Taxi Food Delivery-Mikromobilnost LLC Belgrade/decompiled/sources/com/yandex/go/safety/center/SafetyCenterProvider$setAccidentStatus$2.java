package com.yandex.go.safety.center;

import com.yandex.go.safety.center.api.AccidentStatusParam;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterProvider$setAccidentStatus$2", f = "SafetyCenterProvider.kt", l = {269}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterProvider$setAccidentStatus$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $accidentHappened;
    final /* synthetic */ String $accidentId;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterProvider$setAccidentStatus$2(j jVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$accidentId = str;
        this.$accidentHappened = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterProvider$setAccidentStatus$2(this.this$0, this.$accidentId, this.$accidentHappened, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterProvider$setAccidentStatus$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            cmt<zy11> h = this.this$0.a.h(this.$accidentId, new AccidentStatusParam(this.$accidentHappened));
            this.label = 1;
            if (ru.yandex.taxi.network.api.a.a(h, null, this) == coroutineSingletons) {
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
