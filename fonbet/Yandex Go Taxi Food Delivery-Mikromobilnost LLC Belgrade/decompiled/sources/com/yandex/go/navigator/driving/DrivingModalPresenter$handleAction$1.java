package com.yandex.go.navigator.driving;

import android.net.Uri;
import com.yandex.go.navigator.analitycs.NavigationAnalytics$SettingsSource;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.location.Location;
import defpackage.c0m;
import defpackage.hbp0;
import defpackage.ikm;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n3h;
import defpackage.ndr0;
import defpackage.nkm;
import defpackage.ny61;
import defpackage.sle;
import defpackage.sy60;
import defpackage.tje;
import defpackage.tle;
import defpackage.tse;
import defpackage.ule;
import defpackage.vle;
import defpackage.w511;
import defpackage.wjm;
import defpackage.wle;
import defpackage.wls;
import defpackage.xle;
import defpackage.yle;
import defpackage.zch;
import defpackage.zle;
import defpackage.zvi;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalPresenter$handleAction$1", f = "DrivingModalPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class DrivingModalPresenter$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ zle $action;
    int label;
    final /* synthetic */ ikm this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingModalPresenter$handleAction$1(ikm ikmVar, zle zleVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ikmVar;
        this.$action = zleVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivingModalPresenter$handleAction$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DrivingModalPresenter$handleAction$1 drivingModalPresenter$handleAction$1 = (DrivingModalPresenter$handleAction$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        drivingModalPresenter$handleAction$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Point position;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        wjm wjmVar = this.this$0.y;
        zle zleVar = this.$action;
        nkm nkmVar = (nkm) ((zch) wjmVar.b).a;
        if (zleVar != null) {
            ((com.yandex.go.navigator.driving.analytics.a) wjmVar.x).d(zleVar.getId());
            if (zleVar instanceof sle) {
                nkmVar.r(new p());
            } else if (zleVar instanceof tle) {
                ((n3h) wjmVar.c).a(Uri.parse(((tle) zleVar).b), DeeplinkSource.UNSPECIFIED);
            } else if (zleVar instanceof ule) {
                nkmVar.r(new c0m(9));
            } else if (zleVar instanceof vle) {
                f fVar = (f) wjmVar.w;
                hbp0.e(fVar.j, null, null, new DrivingModalFocusManager$focusOnRoute$1(fVar, null), 3);
            } else if (zleVar instanceof wle) {
                nkm nkmVar2 = (nkm) ((zch) wjmVar.b).a;
                Location a = nkmVar2.M.a();
                if (a != null && (position = a.getPosition()) != null) {
                    nkmVar2.r(new zvi(28, position));
                }
            } else if (zleVar instanceof xle) {
                nkmVar.A((m950) nkmVar.J.get(), new ndr0(NavigationAnalytics$SettingsSource.WhileOnRoute), sy60.Q2);
            } else {
                if (!(zleVar instanceof yle)) {
                    w511.b();
                    return null;
                }
                tje.N(nkmVar.o(), null, null, new DrivingModalRouter$InnerDrivingModalNavigator$onShareRouteClicked$1(nkmVar, null), 3);
            }
        }
        return zy11.a;
    }
}
