package com.yandex.go.address_confirmation.navigation;

import com.yandex.go.address_confirmation.SourceAddressConfirmationMapFragment;
import com.yandex.go.address_confirmation.api.TargetScreenAfterConfirmation;
import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.gbt0;
import defpackage.hbt0;
import defpackage.inb0;
import defpackage.jl40;
import defpackage.jnb0;
import defpackage.knb0;
import defpackage.lnb0;
import defpackage.mnb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.w511;
import defpackage.wls;
import defpackage.zat0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmnb0;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lmnb0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address_confirmation.navigation.SourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1", f = "SourceAddressConfirmationRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1 extends SuspendLambda implements wls {
    final /* synthetic */ SourceAddressConfirmationMapFragment $fragment;
    final /* synthetic */ zat0 $modalViewRouter;
    final /* synthetic */ hbt0 $screenData;
    final /* synthetic */ TargetScreenAfterConfirmation $targetScreen;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;
    final /* synthetic */ gbt0 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1(a aVar, gbt0 gbt0Var, hbt0 hbt0Var, zat0 zat0Var, SourceAddressConfirmationMapFragment sourceAddressConfirmationMapFragment, TargetScreenAfterConfirmation targetScreenAfterConfirmation, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.this$1 = gbt0Var;
        this.$screenData = hbt0Var;
        this.$modalViewRouter = zat0Var;
        this.$fragment = sourceAddressConfirmationMapFragment;
        this.$targetScreen = targetScreenAfterConfirmation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1 sourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1 = new SourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1(this.this$0, this.this$1, this.$screenData, this.$modalViewRouter, this.$fragment, this.$targetScreen, continuation);
        sourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1.L$0 = obj;
        return sourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1 sourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1 = (SourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1) create((mnb0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sourceAddressConfirmationRouterImpl$openModalView$2$onOpenPickupFromPhoto$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mnb0 mnb0Var = (mnb0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (mnb0Var instanceof inb0) {
            this.this$0.n1(((inb0) mnb0Var).a, AddressClarificationReason.Map);
        } else if (jl40.l(mnb0Var, knb0.a)) {
            this.this$1.r(new qu(9));
        } else if (jl40.l(mnb0Var, jnb0.a)) {
            this.this$1.V(this.$screenData, this.$modalViewRouter, this.$fragment, this.$targetScreen);
        } else if (!jl40.l(mnb0Var, lnb0.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
