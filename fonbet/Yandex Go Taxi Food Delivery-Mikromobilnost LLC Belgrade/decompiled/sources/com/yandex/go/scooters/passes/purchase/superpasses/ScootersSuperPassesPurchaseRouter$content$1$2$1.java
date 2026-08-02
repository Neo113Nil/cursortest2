package com.yandex.go.scooters.passes.purchase.superpasses;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScooterPassesTappedButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesTappedType;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.agd;
import defpackage.b3b1;
import defpackage.d1p0;
import defpackage.dfo0;
import defpackage.e1p0;
import defpackage.f1p0;
import defpackage.g1p0;
import defpackage.h1p0;
import defpackage.i1p0;
import defpackage.jl40;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q8p0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.t0p0;
import defpackage.tse;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseRouter$content$1$2$1", f = "ScootersSuperPassesPurchaseRouter.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseRouter$content$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ i1p0 $action;
    final /* synthetic */ t0p0 $navigator;
    final /* synthetic */ d $scootersSuperPassesPurchaseUiActionInteractor;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseRouter$content$1$2$1(d dVar, yfd yfdVar, i1p0 i1p0Var, t0p0 t0p0Var, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$scootersSuperPassesPurchaseUiActionInteractor = dVar;
        this.$this_buildContent = yfdVar;
        this.$action = i1p0Var;
        this.$navigator = t0p0Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSuperPassesPurchaseRouter$content$1$2$1(this.$scootersSuperPassesPurchaseUiActionInteractor, this.$this_buildContent, this.$action, this.$navigator, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSuperPassesPurchaseRouter$content$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        d dVar = this.$scootersSuperPassesPurchaseUiActionInteractor;
        Object obj2 = ((agd) this.$this_buildContent).a;
        ScootersPassesFromScreen scootersPassesFromScreen = ((dfo0) obj2).a;
        String str = ((dfo0) obj2).b;
        i1p0 i1p0Var = this.$action;
        t0p0 t0p0Var = this.$navigator;
        d1p0 d1p0Var = this.this$0.L;
        this.label = 1;
        dVar.getClass();
        if (!(i1p0Var instanceof f1p0)) {
            if (i1p0Var instanceof g1p0) {
                dVar.a.f(ScootersAnalytics$ScootersPassesTappedType.Superpasses, b3b1.d(scootersPassesFromScreen), ScootersAnalytics$ScooterPassesTappedButtonName.Purchase, null, str);
                a = dVar.b(((g1p0) i1p0Var).a, t0p0Var, d1p0Var, this);
            } else if (i1p0Var instanceof h1p0) {
                h1p0 h1p0Var = (h1p0) i1p0Var;
                dVar.a.f(ScootersAnalytics$ScootersPassesTappedType.Superpasses, b3b1.d(scootersPassesFromScreen), ScootersAnalytics$ScooterPassesTappedButtonName.Pass, h1p0Var.a, str);
                d1p0Var.a.l(h1p0Var.a);
            } else if (jl40.l(i1p0Var, e1p0.b)) {
                a = dVar.a(t0p0Var, this);
            } else {
                if (!jl40.l(i1p0Var, e1p0.a)) {
                    w511.b();
                    return null;
                }
                t0p0Var.a.r(new qu(9));
            }
            return a != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        String str2 = ((f1p0) i1p0Var).a;
        c cVar = t0p0Var.a;
        cVar.A((m950) cVar.H.get(), new w8p0(new q8p0(str2, false), (com.yandex.go.scooters.mosru.b) null, 6), sy60.Q2);
        a = zy11Var;
        if (a != coroutineSingletons) {
        }
    }
}
