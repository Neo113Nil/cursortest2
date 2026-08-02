package com.yandex.go.places.impl.ui.main;

import com.yandex.go.places.models.ui.DiscoveryMainTab$TabType;
import com.yandex.go.places.models.ui.PlacesNativeScreenTabName;
import defpackage.itj;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uiq0;
import defpackage.x43;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Luiq0;", "selectedTab", "Lx43;", "Lbtj;", "tabs", "Litj;", "<anonymous>", "(Luiq0;Lx43;)Litj;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.DiscoveryMainUiStateInteractor$uiStateFlow$1", f = "DiscoveryMainUiStateInteractor.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DiscoveryMainUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryMainUiStateInteractor$uiStateFlow$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DiscoveryMainUiStateInteractor$uiStateFlow$1 discoveryMainUiStateInteractor$uiStateFlow$1 = new DiscoveryMainUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        discoveryMainUiStateInteractor$uiStateFlow$1.L$0 = (uiq0) obj;
        discoveryMainUiStateInteractor$uiStateFlow$1.L$1 = (x43) obj2;
        return discoveryMainUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uiq0 uiq0Var = (uiq0) this.L$0;
        x43 x43Var = (x43) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.experiments.map.map_as_main_places.b bVar = this.this$0.b;
            this.L$0 = uiq0Var;
            this.L$1 = x43Var;
            this.label = 1;
            obj = bVar.b(this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean l = jl40.l(uiq0Var.b, PlacesNativeScreenTabName.MAP.getId());
        DiscoveryMainTab$TabType discoveryMainTab$TabType = uiq0Var.a;
        String str = uiq0Var.b;
        this.this$0.getClass();
        if (l && !booleanValue) {
            z = false;
        }
        return new itj(discoveryMainTab$TabType, str, l, z, kotlin.collections.a.J0(x43Var));
    }
}
