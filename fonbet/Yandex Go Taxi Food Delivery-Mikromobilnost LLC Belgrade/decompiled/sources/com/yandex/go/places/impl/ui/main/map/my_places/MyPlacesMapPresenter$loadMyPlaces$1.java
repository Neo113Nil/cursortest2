package com.yandex.go.places.impl.ui.main.map.my_places;

import com.yandex.go.places.map.data.repositories.f;
import defpackage.go80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.s050;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y050;
import defpackage.zy11;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.my_places.MyPlacesMapPresenter$loadMyPlaces$1", f = "MyPlacesMapPresenter.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MyPlacesMapPresenter$loadMyPlaces$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ y050 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyPlacesMapPresenter$loadMyPlaces$1(y050 y050Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y050Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyPlacesMapPresenter$loadMyPlaces$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MyPlacesMapPresenter$loadMyPlaces$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y050 y050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y050 y050Var2 = this.this$0;
            com.yandex.go.places.impl.domain.interactors.my.places.a aVar = y050Var2.y;
            this.L$0 = y050Var2;
            this.label = 1;
            Serializable b = aVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            y050Var = y050Var2;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y050Var = (y050) this.L$0;
            kotlin.b.b(obj);
        }
        y050Var.I = (List) obj;
        ((s050) this.this$0.Dg()).l3(this.this$0.I);
        if (!this.this$0.I.isEmpty()) {
            y050 y050Var3 = this.this$0;
            pzt0 pzt0Var = y050Var3.G;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            y050Var3.G = tje.N(y050Var3.Jg(), null, null, new MyPlacesMapPresenter$subscribeToLocationUpdates$$inlined$safeCollectIn$1(com.yandex.go.places.impl.ui.common.map.location.d.a(y050Var3.z), null, y050Var3), 3);
            y050 y050Var4 = this.this$0;
            pzt0 pzt0Var2 = y050Var4.F;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            go80 go80Var = y050Var4.A;
            y050Var4.F = tje.N(y050Var4.Jg(), null, null, new MyPlacesMapPresenter$subscribeToZoomUpdates$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(com.yandex.go.places.map.ui.b.a(new f(go80Var.b), go80Var.a.e)), null, y050Var4), 3);
        }
        return zy11.a;
    }
}
