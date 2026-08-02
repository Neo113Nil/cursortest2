package com.ybsdk.feature.main.internal.screens.sbpPartners;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.main.internal.data.network.c;
import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSubscriptionScreenParams;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.presentation.QrPaymentsSubscriptionFragment;
import defpackage.a8g0;
import defpackage.dsg;
import defpackage.g8e;
import defpackage.gao;
import defpackage.him0;
import defpackage.jqp0;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.phm0;
import defpackage.qoi0;
import defpackage.qv5;
import defpackage.s1a0;
import defpackage.s6k0;
import defpackage.sfg0;
import defpackage.t1a0;
import defpackage.tfl0;
import defpackage.trp0;
import defpackage.tse;
import defpackage.u1a0;
import defpackage.w1a0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.y1a0;
import defpackage.z1a0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersViewModel$bindYBAccountWithPayCard$1", f = "SbpPartnersViewModel.kt", l = {436, 457}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpPartnersViewModel$bindYBAccountWithPayCard$1 extends SuspendLambda implements wls {
    final /* synthetic */ phm0 $item;
    final /* synthetic */ sfg0 $qrSubscriptionInteractor;
    final /* synthetic */ String $qrcScanId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpPartnersViewModel$bindYBAccountWithPayCard$1(a aVar, phm0 phm0Var, sfg0 sfg0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = phm0Var;
        this.$qrSubscriptionInteractor = sfg0Var;
        this.$qrcScanId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SbpPartnersViewModel$bindYBAccountWithPayCard$1 sbpPartnersViewModel$bindYBAccountWithPayCard$1 = new SbpPartnersViewModel$bindYBAccountWithPayCard$1(this.this$0, this.$item, this.$qrSubscriptionInteractor, this.$qrcScanId, continuation);
        sbpPartnersViewModel$bindYBAccountWithPayCard$1.L$0 = obj;
        return sbpPartnersViewModel$bindYBAccountWithPayCard$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpPartnersViewModel$bindYBAccountWithPayCard$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0108  */
    /* JADX WARN: Type inference failed for: r10v10, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ref$ObjectRef ref$ObjectRef;
        Object obj3;
        String str;
        a aVar;
        phm0 phm0Var;
        String str2;
        String X;
        Object obj4;
        Throwable a;
        lrp0 lrp0Var = lrp0.C;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str3 = null;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            c cVar = this.this$0.B;
            String str4 = this.$item.h;
            this.L$0 = tseVar;
            this.L$1 = ref$ObjectRef2;
            this.label = 1;
            Object b = cVar.b(str4, this);
            if (b != coroutineSingletons) {
                obj2 = b;
                ref$ObjectRef = ref$ObjectRef2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$3;
            String str5 = (String) this.L$2;
            phm0 phm0Var2 = (phm0) this.L$1;
            aVar = (a) this.L$0;
            b.b(obj);
            str2 = str5;
            phm0Var = phm0Var2;
            obj3 = ((Result) obj).getValue();
            if (obj3 instanceof Result.Failure) {
                w1a0 w1a0Var = (w1a0) obj3;
                if (w1a0Var instanceof u1a0) {
                    aVar.J.b(phm0Var.h, Status.DEFAULT);
                    z1a0 z1a0Var = ((u1a0) w1a0Var).a;
                    if (z1a0Var instanceof y1a0) {
                        y1a0 y1a0Var = (y1a0) z1a0Var;
                        s6k0 s6k0Var = aVar.J;
                        tfl0 tfl0Var = (tfl0) s6k0Var.a;
                        a8g0 a8g0Var = (a8g0) s6k0Var.b;
                        obj4 = obj3;
                        QrPaymentsSubscriptionScreenParams qrPaymentsSubscriptionScreenParams = new QrPaymentsSubscriptionScreenParams(str2, y1a0Var.c, y1a0Var.b, y1a0Var.d, "unknown", true);
                        a8g0Var.b.getClass();
                        tfl0Var.h(new FragmentScreen("QrPaymentSubscriptionScreen", false, qrPaymentsSubscriptionScreenParams, TransitionPolicyType.POPUP, qoi0.a(QrPaymentsSubscriptionFragment.class), OpenScreenRequirement.WithBuid.INSTANCE));
                    } else {
                        obj4 = obj3;
                        aVar.Z(new him0(gao.e(null, null, null, 7)));
                        x4c.g("Wrong value for SbpPartnersBindingInteractorImpl. It supports only subscription type", null, "from " + z1a0Var, Collections.singletonList(lrp0Var), 2);
                    }
                } else {
                    obj4 = obj3;
                    if (!(w1a0Var instanceof s1a0) && !(w1a0Var instanceof t1a0)) {
                        w511.b();
                        return null;
                    }
                    aVar.J.b(phm0Var.h, Status.DEFAULT);
                    aVar.Z(new him0(gao.e(null, null, null, 7)));
                    x4c.g("Unsupported value " + w1a0Var, null, null, Collections.singletonList(lrp0Var), 6);
                }
            } else {
                obj4 = obj3;
            }
            a = Result.a(obj4);
            if (a != null) {
                aVar.Z(new him0(gao.e(null, null, a, 3)));
                aVar.J.b(phm0Var.h, Status.DEFAULT);
                List singletonList = Collections.singletonList(lrp0Var);
                boolean isEmpty = singletonList.isEmpty();
                if (!isEmpty) {
                    if (isEmpty) {
                        w511.b();
                        return null;
                    }
                    str3 = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
                }
                trp0 trp0Var = trp0.a;
                trp0.e(new jqp0(a, "Error getting info from qr subscription", str, str3));
            }
            return zy11.a;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$1;
        b.b(obj);
        obj2 = ((Result) obj).getValue();
        if (!(obj2 instanceof Result.Failure)) {
            ref$ObjectRef.element = ((qv5) obj2).a;
        }
        a aVar2 = this.this$0;
        phm0 phm0Var3 = this.$item;
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            aVar2.J.b(phm0Var3.h, Status.DEFAULT);
            aVar2.Z(new him0(gao.e(null, null, a2, 3)));
            String o = g8e.o("in yb ", phm0Var3.h);
            List singletonList2 = Collections.singletonList(lrp0Var);
            boolean isEmpty2 = singletonList2.isEmpty();
            if (isEmpty2) {
                X = null;
            } else {
                if (isEmpty2) {
                    w511.b();
                    return null;
                }
                X = kotlin.collections.a.X(singletonList2, "", null, null, new dsg(16), 30);
            }
            trp0 trp0Var2 = trp0.a;
            trp0.e(new jqp0(a2, "Error getting during sbp account binding", o, X));
        }
        String str6 = (String) ref$ObjectRef.element;
        if (str6 == null) {
            this.this$0.J.b(this.$item.h, Status.DEFAULT);
            x4c.g("Empty deeplink from v1/sbp_accounts/bind_account", null, "in SbpPartnersBindingInteractorImpl", Collections.singletonList(lrp0Var), 2);
            return zy11.a;
        }
        sfg0 sfg0Var = this.$qrSubscriptionInteractor;
        a aVar3 = this.this$0;
        phm0 phm0Var4 = this.$item;
        String str7 = this.$qrcScanId;
        this.L$0 = aVar3;
        this.L$1 = phm0Var4;
        this.L$2 = str7;
        this.L$3 = str6;
        this.label = 2;
        Object a3 = ((com.ybsdk.feature.qr.payments.internal.domain.b) sfg0Var).a(aVar3, str6, this);
        if (a3 != coroutineSingletons) {
            obj3 = a3;
            str = str6;
            aVar = aVar3;
            phm0Var = phm0Var4;
            str2 = str7;
            if (obj3 instanceof Result.Failure) {
            }
            a = Result.a(obj4);
            if (a != null) {
            }
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
