package com.yandex.go.scooters.passes.purchase.packages;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScooterPassesTappedButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesOpenedType;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesTappedType;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.a8o0;
import defpackage.agd;
import defpackage.b3b1;
import defpackage.b8o0;
import defpackage.c8o0;
import defpackage.iun0;
import defpackage.jl40;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7o0;
import defpackage.q7o0;
import defpackage.q8p0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.wls;
import defpackage.x7o0;
import defpackage.y7o0;
import defpackage.yfd;
import defpackage.z7o0;
import defpackage.zgz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseRouter$content$1$1$1", f = "ScootersPackagesPurchaseRouter.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ c8o0 $action;
    final /* synthetic */ q7o0 $navigator;
    final /* synthetic */ g $scootersPackagesPurchaseUiActionInteractor;
    final /* synthetic */ x7o0 $screenStateRepository;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseRouter$content$1$1$1(g gVar, c8o0 c8o0Var, yfd yfdVar, q7o0 q7o0Var, x7o0 x7o0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersPackagesPurchaseUiActionInteractor = gVar;
        this.$action = c8o0Var;
        this.$this_buildContent = yfdVar;
        this.$navigator = q7o0Var;
        this.$screenStateRepository = x7o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPurchaseRouter$content$1$1$1(this.$scootersPackagesPurchaseUiActionInteractor, this.$action, this.$this_buildContent, this.$navigator, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.$scootersPackagesPurchaseUiActionInteractor;
        c8o0 c8o0Var = this.$action;
        Object obj2 = ((agd) this.$this_buildContent).a;
        ScootersPassesFromScreen scootersPassesFromScreen = ((p7o0) obj2).c;
        String str = ((p7o0) obj2).d;
        q7o0 q7o0Var = this.$navigator;
        x7o0 x7o0Var = this.$screenStateRepository;
        this.label = 1;
        if (c8o0Var instanceof b8o0) {
            gVar.a.e(ScootersAnalytics$ScootersPassesOpenedType.Packages, b3b1.c(scootersPassesFromScreen), ((b8o0) c8o0Var).a, str);
            if (gVar.e.a.c("package")) {
                a = gVar.c(q7o0Var, x7o0Var, this);
            }
            a = zy11Var;
        } else {
            if (c8o0Var instanceof a8o0) {
                a8o0 a8o0Var = (a8o0) c8o0Var;
                gVar.a.f(ScootersAnalytics$ScootersPassesTappedType.Packages, b3b1.d(scootersPassesFromScreen), ScootersAnalytics$ScooterPassesTappedButtonName.Pass, a8o0Var.a, str);
                x7o0Var.a.l(a8o0Var.a);
            } else {
                gVar.getClass();
                if (jl40.l(c8o0Var, z7o0.b)) {
                    String str2 = (String) x7o0Var.a.getValue();
                    if (str2 != null) {
                        gVar.a.f(ScootersAnalytics$ScootersPassesTappedType.Packages, b3b1.d(scootersPassesFromScreen), ScootersAnalytics$ScooterPassesTappedButtonName.Purchase, null, str);
                        a = gVar.b(str2, q7o0Var, x7o0Var, this);
                    } else {
                        zgz.a(null, new IllegalArgumentException("selectedId for purchase package is null"));
                    }
                } else if (jl40.l(c8o0Var, z7o0.a)) {
                    a = gVar.a(q7o0Var, this);
                } else {
                    if (!(c8o0Var instanceof y7o0)) {
                        w511.b();
                        return null;
                    }
                    String str3 = ((y7o0) c8o0Var).a;
                    iun0 iun0Var = q7o0Var.a;
                    iun0Var.A((m950) iun0Var.I.get(), new w8p0(new q8p0(str3, false), (com.yandex.go.scooters.mosru.b) null, 6), sy60.Q2);
                }
            }
            a = zy11Var;
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
