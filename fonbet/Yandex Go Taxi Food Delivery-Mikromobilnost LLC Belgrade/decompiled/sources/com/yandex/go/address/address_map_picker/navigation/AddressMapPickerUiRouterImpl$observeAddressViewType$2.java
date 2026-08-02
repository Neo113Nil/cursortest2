package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyModalType;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import defpackage.a21;
import defpackage.c91;
import defpackage.d91;
import defpackage.e91;
import defpackage.epb;
import defpackage.f21;
import defpackage.f91;
import defpackage.g91;
import defpackage.h91;
import defpackage.i91;
import defpackage.j91;
import defpackage.jl40;
import defpackage.k01;
import defpackage.k91;
import defpackage.l31;
import defpackage.mvg;
import defpackage.n1j0;
import defpackage.n31;
import defpackage.ny61;
import defpackage.oce0;
import defpackage.ooa1;
import defpackage.pv0;
import defpackage.rce0;
import defpackage.sce0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.uce0;
import defpackage.w21;
import defpackage.w511;
import defpackage.wls;
import defpackage.z21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf21;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lf21;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.AddressMapPickerUiRouterImpl$observeAddressViewType$2", f = "AddressMapPickerUiRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerUiRouterImpl$observeAddressViewType$2 extends SuspendLambda implements wls {
    final /* synthetic */ w21 $payload;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerUiRouterImpl$observeAddressViewType$2(j jVar, w21 w21Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$payload = w21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapPickerUiRouterImpl$observeAddressViewType$2 addressMapPickerUiRouterImpl$observeAddressViewType$2 = new AddressMapPickerUiRouterImpl$observeAddressViewType$2(this.this$0, this.$payload, continuation);
        addressMapPickerUiRouterImpl$observeAddressViewType$2.L$0 = obj;
        return addressMapPickerUiRouterImpl$observeAddressViewType$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapPickerUiRouterImpl$observeAddressViewType$2 addressMapPickerUiRouterImpl$observeAddressViewType$2 = (AddressMapPickerUiRouterImpl$observeAddressViewType$2) create((f21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapPickerUiRouterImpl$observeAddressViewType$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PointType pointType;
        f21 f21Var = (f21) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k91 k91Var = f21Var.b;
        if (jl40.l(k91Var, j91.a) || jl40.l(k91Var, f91.a)) {
            j jVar = this.this$0;
            jVar.j(new epb((n31) jVar.N.getValue(), (uce0) this.this$0.O.getValue()));
        } else if (jl40.l(k91Var, c91.a)) {
            j.P(this.this$0);
            j.Q(this.this$0, f21Var, this.$payload, ClarifyAnalytics$ClarifyModalType.Drums);
        } else if (jl40.l(k91Var, h91.a)) {
            j.P(this.this$0);
            j.Q(this.this$0, f21Var, this.$payload, ClarifyAnalytics$ClarifyModalType.PickupLocationFromPhoto);
        } else if (jl40.l(k91Var, g91.a)) {
            j.P(this.this$0);
            j.Q(this.this$0, f21Var, this.$payload, ClarifyAnalytics$ClarifyModalType.Address);
        } else if (jl40.l(k91Var, i91.a)) {
            j jVar2 = this.this$0;
            w21 w21Var = this.$payload;
            jVar2.getClass();
            pv0 pv0Var = f21Var.c;
            if (pv0Var != null) {
                n31 n31Var = (n31) jVar2.N.getValue();
                int i = a21.a[ooa1.b(w21Var.a).ordinal()];
                if (i == 1) {
                    pointType = PointType.SOURCE;
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    pointType = PointType.DESTINATION;
                }
                jVar2.B(n31Var, new l31(pv0Var, pointType), (z21) jVar2.Q.getValue(), new n1j0((k01) jVar2.P.getValue()));
            }
            j.Q(this.this$0, f21Var, this.$payload, ClarifyAnalytics$ClarifyModalType.Error);
        } else if (k91Var instanceof d91) {
            final j jVar3 = this.this$0;
            final oce0 oce0Var = ((d91) k91Var).a;
            jVar3.F.b(AddressMapPickerAddressStateRepository.State.Error);
            jVar3.B((uce0) jVar3.O.getValue(), new sce0(oce0Var), new sy60() { // from class: com.yandex.go.address.address_map_picker.navigation.h
                @Override // defpackage.sy60
                public final void a() {
                    j jVar4 = j.this;
                    tje.N(jVar4.o(), null, null, new AddressMapPickerUiRouterImpl$onPositionAlertDismissed$1(oce0Var, jVar4, null), 3);
                }
            }, new n1j0((k01) jVar3.P.getValue()));
            j.Q(this.this$0, f21Var, this.$payload, ClarifyAnalytics$ClarifyModalType.Alert);
        } else {
            if (!(k91Var instanceof e91)) {
                w511.b();
                return null;
            }
            final j jVar4 = this.this$0;
            jVar4.B((uce0) jVar4.O.getValue(), new rce0(((e91) k91Var).a), new sy60() { // from class: com.yandex.go.address.address_map_picker.navigation.i
                @Override // defpackage.sy60
                public final void a() {
                    j jVar5 = j.this;
                    tje.N(jVar5.o(), null, null, new AddressMapPickerUiRouterImpl$openBlockedZoneAlert$1$1(jVar5, null), 3);
                }
            }, new n1j0((k01) jVar4.P.getValue()));
        }
        return zy11.a;
    }
}
