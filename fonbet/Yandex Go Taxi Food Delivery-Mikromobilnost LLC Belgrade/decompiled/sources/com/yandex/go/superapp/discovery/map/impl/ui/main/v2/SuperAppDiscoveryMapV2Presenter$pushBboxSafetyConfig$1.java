package com.yandex.go.superapp.discovery.map.impl.ui.main.v2;

import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wyv0;
import defpackage.xtj;
import defpackage.ytj;
import defpackage.ztj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2Presenter$pushBboxSafetyConfig$1", f = "SuperAppDiscoveryMapV2Presenter.kt", l = {269}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppDiscoveryMapV2Presenter$pushBboxSafetyConfig$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ wyv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppDiscoveryMapV2Presenter$pushBboxSafetyConfig$1(wyv0 wyv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wyv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppDiscoveryMapV2Presenter$pushBboxSafetyConfig$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppDiscoveryMapV2Presenter$pushBboxSafetyConfig$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            p pVar = this.this$0.e0;
            this.label = 1;
            obj = pVar.c(this);
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
        SuperAppDiscoveryMapV2Experiment.MapVisibleBboxConfig mapVisibleBboxConfig = (SuperAppDiscoveryMapV2Experiment.MapVisibleBboxConfig) obj;
        SuperAppDiscoveryMapV2Experiment.MapVisibleBboxConfig.Insets insets = mapVisibleBboxConfig != null ? mapVisibleBboxConfig.b : null;
        ytj ytjVar = this.this$0.i0;
        xtj.a aVar = new xtj.a(insets != null ? insets.a : 0.0f, insets != null ? insets.b : 0.0f, insets != null ? insets.c : 0.0f, insets != null ? insets.d : 0.0f);
        Float f = mapVisibleBboxConfig != null ? mapVisibleBboxConfig.a : null;
        r0 r0Var = ((ztj) ytjVar).a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, xtj.a((xtj) value, aVar, f, null, 4)));
        return zy11.a;
    }
}
