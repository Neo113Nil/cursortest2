package com.yandex.go.inapp_calls.navigation.loader;

import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import defpackage.fkv;
import defpackage.jiu;
import defpackage.mvg;
import defpackage.njv;
import defpackage.ny61;
import defpackage.sjv;
import defpackage.tje;
import defpackage.tjv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.navigation.loader.InAppCallsLoaderRouter$onLaunch$1", f = "InAppCallsLoaderRouter.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsLoaderRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ sjv $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsLoaderRouter$onLaunch$1(a aVar, sjv sjvVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = sjvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InAppCallsLoaderRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsLoaderRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g c = this.this$0.D.c();
            this.label = 1;
            obj = e.y(c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = (InAppCallsFeatureWrapper$State) obj;
        a aVar = this.this$0;
        sjv sjvVar = this.$payload;
        njv njvVar = aVar.F;
        fkv fkvVar = sjvVar.b;
        if (fkvVar == null || (str = fkvVar.a) == null) {
            str = "";
        }
        njvVar.d(str, sjvVar.c.b, inAppCallsFeatureWrapper$State == InAppCallsFeatureWrapper$State.READY);
        int i2 = tjv.a[inAppCallsFeatureWrapper$State.ordinal()];
        if (i2 == 1) {
            aVar.r(new jiu(18));
        } else if (i2 == 2 || i2 == 3) {
            tje.N(aVar.o(), null, null, new InAppCallsLoaderRouter$proceedWithState$2(aVar, sjvVar, null), 3);
        } else {
            aVar.P(sjvVar);
        }
        return zy11.a;
    }
}
