package com.yandex.go.multimodal_route.ui.transport_tracking;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteScreenStatus;
import com.yandex.go.multimodal_route.taxi_feedback.TaxiFeedbackStateRepository;
import defpackage.agd;
import defpackage.bvx0;
import defpackage.cvx0;
import defpackage.dvx0;
import defpackage.eqc;
import defpackage.es40;
import defpackage.evx0;
import defpackage.fsq;
import defpackage.fvx0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.nvx0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q911;
import defpackage.r911;
import defpackage.s911;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wpc;
import defpackage.x611;
import defpackage.yfd;
import defpackage.z611;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_tracking.TransportTrackingCardRouter$content$1$2$2$1$1$1", f = "TransportTrackingCardRouter.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardRouter$content$1$2$2$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ fvx0 $feedbackAction;
    final /* synthetic */ o2y0 $holder;
    final /* synthetic */ r911 $innerNavigator;
    final /* synthetic */ String $offerId;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ s911 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardRouter$content$1$2$2$1$1$1(s911 s911Var, String str, yfd yfdVar, o2y0 o2y0Var, fvx0 fvx0Var, r911 r911Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s911Var;
        this.$offerId = str;
        this.$this_buildContent = yfdVar;
        this.$holder = o2y0Var;
        this.$feedbackAction = fvx0Var;
        this.$innerNavigator = r911Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportTrackingCardRouter$content$1$2$2$1$1$1(this.this$0, this.$offerId, this.$this_buildContent, this.$holder, this.$feedbackAction, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportTrackingCardRouter$content$1$2$2$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Object obj2;
        Pair pair2;
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
        com.yandex.go.multimodal_route.taxi_feedback.a aVar = this.this$0.K;
        String str = this.$offerId;
        String str2 = ((q911) ((agd) this.$this_buildContent).a).c;
        o2y0 o2y0Var = this.$holder;
        fvx0 fvx0Var = this.$feedbackAction;
        r911 r911Var = this.$innerNavigator;
        this.label = 1;
        TaxiFeedbackStateRepository taxiFeedbackStateRepository = aVar.a;
        es40 es40Var = aVar.c;
        if (fvx0Var instanceof bvx0) {
            if (str == null) {
                str = "";
            }
            es40Var.a(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.TaxiSectionDone, MultimodalRouteAnalytics$MultimodalRouteScreenStatus.InTransport);
            obj2 = aVar.a(o2y0Var, this);
        } else {
            if (fvx0Var instanceof cvx0) {
                if (str == null) {
                    str = "";
                }
                MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType = MultimodalRouteAnalytics$MultimodalRouteButtonType.RatingTap;
                String str3 = o2y0Var.b().a;
                int i2 = ((cvx0) fvx0Var).a;
                Integer num = new Integer(i2);
                nvx0 nvx0Var = (nvx0) taxiFeedbackStateRepository.b.getValue();
                z611 z611Var = (nvx0Var == null || (pair2 = nvx0Var.c) == null) ? null : (z611) pair2.f();
                es40Var.d(str, str2, multimodalRouteAnalytics$MultimodalRouteButtonType, str3, num, z611Var instanceof x611 ? ((x611) z611Var).b : null);
                r0 r0Var = taxiFeedbackStateRepository.b;
                nvx0 nvx0Var2 = (nvx0) r0Var.getValue();
                r0Var.m(null, nvx0Var2 != null ? nvx0.a(nvx0Var2, false, Integer.valueOf(i2), null, 5) : new nvx0(false, Integer.valueOf(i2), null, 4));
            } else if (fvx0Var instanceof dvx0) {
                String str4 = str == null ? "" : str;
                MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType2 = MultimodalRouteAnalytics$MultimodalRouteButtonType.Support;
                String str5 = o2y0Var.b().a;
                nvx0 nvx0Var3 = (nvx0) taxiFeedbackStateRepository.b.getValue();
                Integer num2 = nvx0Var3 != null ? nvx0Var3.b : null;
                nvx0 nvx0Var4 = (nvx0) taxiFeedbackStateRepository.b.getValue();
                z611 z611Var2 = (nvx0Var4 == null || (pair = nvx0Var4.c) == null) ? null : (z611) pair.f();
                es40Var.d(str4, str2, multimodalRouteAnalytics$MultimodalRouteButtonType2, str5, num2, z611Var2 instanceof x611 ? ((x611) z611Var2).b : null);
                String str6 = ((dvx0) fvx0Var).a;
                s911 s911Var = r911Var.a;
                s911Var.A((m950) s911Var.M.get(), new wpc(eqc.b, (String) null), new fsq(s911Var, o2y0Var, str6, 1));
            } else {
                if (!(fvx0Var instanceof evx0)) {
                    w511.b();
                    return null;
                }
                String str7 = str == null ? "" : str;
                MultimodalRouteAnalytics$MultimodalRouteButtonType multimodalRouteAnalytics$MultimodalRouteButtonType3 = MultimodalRouteAnalytics$MultimodalRouteButtonType.Tip;
                String str8 = o2y0Var.b().a;
                nvx0 nvx0Var5 = (nvx0) taxiFeedbackStateRepository.b.getValue();
                Integer num3 = nvx0Var5 != null ? nvx0Var5.b : null;
                evx0 evx0Var = (evx0) fvx0Var;
                z611 z611Var3 = evx0Var.a;
                es40Var.d(str7, str2, multimodalRouteAnalytics$MultimodalRouteButtonType3, str8, num3, z611Var3 instanceof x611 ? ((x611) z611Var3).b : null);
                int i3 = evx0Var.b;
                r0 r0Var2 = taxiFeedbackStateRepository.b;
                nvx0 nvx0Var6 = (nvx0) r0Var2.getValue();
                r0Var2.m(null, nvx0Var6 != null ? nvx0.a(nvx0Var6, false, null, new Pair(Integer.valueOf(i3), z611Var3), 3) : new nvx0(false, null, new Pair(Integer.valueOf(i3), z611Var3), 2));
            }
            obj2 = zy11Var;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
