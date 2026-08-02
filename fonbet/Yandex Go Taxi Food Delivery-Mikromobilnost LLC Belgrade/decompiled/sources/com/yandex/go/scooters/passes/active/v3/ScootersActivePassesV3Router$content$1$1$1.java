package com.yandex.go.scooters.passes.active.v3;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersActivePassesOpenedType;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import defpackage.a60;
import defpackage.agd;
import defpackage.avm0;
import defpackage.b0b1;
import defpackage.etm0;
import defpackage.gtm0;
import defpackage.jl40;
import defpackage.ksm0;
import defpackage.m580;
import defpackage.m950;
import defpackage.mtm0;
import defpackage.mvg;
import defpackage.ntm0;
import defpackage.ny61;
import defpackage.otm0;
import defpackage.oy7;
import defpackage.ptm0;
import defpackage.q8p0;
import defpackage.qtm0;
import defpackage.qu;
import defpackage.rtm0;
import defpackage.stm0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.ttm0;
import defpackage.v770;
import defpackage.vam0;
import defpackage.w511;
import defpackage.w8p0;
import defpackage.wls;
import defpackage.wrm0;
import defpackage.y50;
import defpackage.yfd;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.ScootersActivePassesV3Router$content$1$1$1", f = "ScootersActivePassesV3Router.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3Router$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ttm0 $action;
    final /* synthetic */ etm0 $navigator;
    final /* synthetic */ d $scootersActivePassesV3UiActionInteractor;
    final /* synthetic */ mtm0 $screenStateRepository;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3Router$content$1$1$1(d dVar, ttm0 ttm0Var, yfd yfdVar, etm0 etm0Var, mtm0 mtm0Var, Continuation continuation) {
        super(2, continuation);
        this.$scootersActivePassesV3UiActionInteractor = dVar;
        this.$action = ttm0Var;
        this.$this_buildContent = yfdVar;
        this.$navigator = etm0Var;
        this.$screenStateRepository = mtm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3Router$content$1$1$1(this.$scootersActivePassesV3UiActionInteractor, this.$action, this.$this_buildContent, this.$navigator, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3Router$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fc A[RETURN] */
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
        d dVar = this.$scootersActivePassesV3UiActionInteractor;
        ttm0 ttm0Var = this.$action;
        Object obj2 = ((agd) this.$this_buildContent).a;
        ScootersPassesFromScreen scootersPassesFromScreen = ((wrm0) obj2).a;
        String str = ((wrm0) obj2).b;
        etm0 etm0Var = this.$navigator;
        mtm0 mtm0Var = this.$screenStateRepository;
        this.label = 1;
        dVar.getClass();
        if (jl40.l(ttm0Var, ntm0.b)) {
            dVar.a.a(ScootersAnalytics$ScootersActivePassesOpenedType.Superpasses, b0b1.d(scootersPassesFromScreen), str);
        } else if (ttm0Var instanceof ptm0) {
            String str2 = ((ptm0) ttm0Var).a;
            oy7 oy7Var = etm0Var.a;
            oy7Var.A((m950) ((yvf0) oy7Var.I).get(), new w8p0(new q8p0(str2, false), (com.yandex.go.scooters.mosru.b) null, 6), sy60.Q2);
        } else if (jl40.l(ttm0Var, ntm0.a)) {
            etm0Var.a.r(new qu(9));
        } else {
            if (ttm0Var instanceof stm0) {
                a = dVar.a(((stm0) ttm0Var).a, etm0Var, mtm0Var, scootersPassesFromScreen, this);
                return a != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            if (ttm0Var instanceof rtm0) {
                avm0 avm0Var = ((rtm0) ttm0Var).a.a;
                if (avm0Var != null) {
                    boolean z = dVar.c.b.a().h != null;
                    oy7 oy7Var2 = etm0Var.a;
                    oy7Var2.A((m950) ((m580) oy7Var2.K).get(), new ksm0(avm0Var, scootersPassesFromScreen), new gtm0(z, oy7Var2));
                }
            } else if (ttm0Var instanceof qtm0) {
                qtm0 qtm0Var = (qtm0) ttm0Var;
                etm0Var.a.r(new vam0(11, qtm0Var.a, qtm0Var.b));
            } else {
                if (!(ttm0Var instanceof otm0)) {
                    w511.b();
                    return null;
                }
                ((a60) ((y50) dVar.b.get())).c(((otm0) ttm0Var).a, v770.x);
            }
        }
        a = zy11Var;
        if (a != coroutineSingletons) {
        }
    }
}
