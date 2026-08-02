package com.yandex.go.safety.center;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import com.yandex.go.safety.center.experiment.p;
import defpackage.c0g;
import defpackage.d7g;
import defpackage.gtl0;
import defpackage.htl0;
import defpackage.i6r;
import defpackage.itl0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.otl0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.activity.MainActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.SafetyCenterRootRouterImpl$onLaunch$1", f = "SafetyCenterRootRouterImpl.kt", l = {36, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterRootRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ itl0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterRootRouterImpl$onLaunch$1(k kVar, itl0 itl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$payload = itl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterRootRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterRootRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
    
        if (r10 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            p pVar = this.this$0.H;
            this.label = 1;
            obj = pVar.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        SafetyCenterExperiment safetyCenterExperiment = (SafetyCenterExperiment) obj;
        if (!safetyCenterExperiment.b()) {
            jst.e.k(new IllegalStateException("Safety Center can't be shown when disabled by experiment"), "Safety Center can't be shown when disabled by experiment");
            this.this$0.i();
            return zy11Var;
        }
        k kVar = this.this$0;
        itl0 itl0Var = this.$payload;
        kVar.getClass();
        htl0 htl0Var = itl0Var.c;
        boolean z = (htl0Var instanceof gtl0) && ((gtl0) htl0Var).a != null;
        SafetyCenterWebConfig safetyCenterWebConfig = safetyCenterExperiment.p;
        if ((safetyCenterWebConfig != null ? safetyCenterWebConfig.a : null) == null || itl0Var.a == SafetyCenterParams$Source.ACCIDENT_DEEPLINK || z) {
            k kVar2 = this.this$0;
            itl0 itl0Var2 = this.$payload;
            i6r i6rVar = (i6r) kVar2.G.get();
            MainActivity mainActivity = ((c0g) i6rVar).w;
            itl0Var2.getClass();
            kVar2.A(new d7g(i6rVar, itl0Var2).a(), itl0Var2, new otl0(kVar2, 0));
            return zy11Var;
        }
        k kVar3 = this.this$0;
        itl0 itl0Var3 = this.$payload;
        String str = itl0Var3.b;
        SafetyCenterParams$Source safetyCenterParams$Source = itl0Var3.a;
        this.L$0 = null;
        this.label = 2;
        return k.P(kVar3, safetyCenterExperiment, str, safetyCenterParams$Source, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
