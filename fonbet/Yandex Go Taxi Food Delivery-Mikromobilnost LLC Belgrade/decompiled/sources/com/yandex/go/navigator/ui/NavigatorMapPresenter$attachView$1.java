package com.yandex.go.navigator.ui;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.d240;
import defpackage.dd50;
import defpackage.el00;
import defpackage.gci0;
import defpackage.gh00;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.yc50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.TaxiMapView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.ui.NavigatorMapPresenter$attachView$1", f = "NavigatorMapPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorMapPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ dd50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorMapPresenter$attachView$1(dd50 dd50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dd50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorMapPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorMapPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MapWindow mapWindow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            el00 el00Var = this.this$0.N;
            this.label = 1;
            if (el00Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        dd50 dd50Var = this.this$0;
        tje.N(dd50Var.Jg(), null, null, new NavigatorMapPresenter$dispatchNavigationChange$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(dd50Var.z.g), null, (yc50) dd50Var.Dg()), 3);
        dd50 dd50Var2 = this.this$0;
        TaxiMapView h = ((gh00) dd50Var2.I).h();
        tje.N(dd50Var2.Jg(), null, null, new NavigatorMapPresenter$ensureRotateGesturesEnabled$$inlined$safeCollectIn$1(new k(dd50Var2.O.c, (h == null || (mapWindow = h.getMapWindow()) == null) ? null : mapWindow.getMap()), null, dd50Var2), 3);
        dd50 dd50Var3 = this.this$0;
        tje.N(dd50Var3.Jg(), null, null, new NavigatorMapPresenter$dispatchCarParksState$$inlined$safeCollectIn$1(new d(dd50Var3.D.d), null, (yc50) dd50Var3.Dg()), 3);
        dd50 dd50Var4 = this.this$0;
        tje.N(dd50Var4.Jg(), null, null, new NavigatorMapPresenter$dispatchSelectedRoute$$inlined$safeCollectIn$1(new f(kotlinx.coroutines.flow.e.t(new mth(dd50Var4.x.b, 6)), dd50Var4), null, (yc50) dd50Var4.Dg()), 3);
        dd50 dd50Var5 = this.this$0;
        com.yandex.go.coroutines.b.h(dd50Var5.Jg(), new g(new tpr[]{dd50Var5.E.b, kotlinx.coroutines.flow.e.t(new i(dd50Var5.B.c)), (gci0) dd50Var5.J.b, dd50Var5.G.g, dd50Var5.H.b, dd50Var5.L.f}, dd50Var5));
        dd50 dd50Var6 = this.this$0;
        tje.N(dd50Var6.Jg(), null, null, new NavigatorMapPresenter$observeFocusModeChangeEvents$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(dd50Var6.y.b), null, dd50Var6), 3);
        dd50 dd50Var7 = this.this$0;
        tje.N(dd50Var7.Jg(), null, null, new NavigatorMapPresenter$observeSelectedRoadEvent$$inlined$safeCollectIn$1(dd50Var7.M.a(new d240(15, dd50Var7)), null, dd50Var7), 3);
        return zy11.a;
    }
}
