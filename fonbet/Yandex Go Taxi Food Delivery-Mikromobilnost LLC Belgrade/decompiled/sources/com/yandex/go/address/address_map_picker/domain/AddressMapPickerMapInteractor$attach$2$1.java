package com.yandex.go.address.address_map_picker.domain;

import defpackage.ah00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerMapInteractor$attach$2$1", f = "AddressMapPickerMapInteractor.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerMapInteractor$attach$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    final /* synthetic */ f $overlayInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerMapInteractor$attach$2$1(f fVar, pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.$overlayInteractor = fVar;
        this.$addressInfo = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickerMapInteractor$attach$2$1(this.$overlayInteractor, this.$addressInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickerMapInteractor$attach$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.$overlayInteractor;
            pv0 pv0Var = this.$addressInfo;
            List list = pv0Var.e;
            String str = pv0Var.f;
            this.label = 1;
            if (fVar.a.a(str, list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        g gVar = this.$overlayInteractor.a;
        ru.yandex.taxi.preorder.source.pickup.a aVar = gVar.b;
        ah00 ah00Var = gVar.c;
        aVar.getClass();
        boolean b = ru.yandex.taxi.preorder.source.pickup.a.b(ah00Var);
        ru.yandex.taxi.map.overlay.pickup.d dVar = gVar.e;
        if (b) {
            if (dVar != null) {
                dVar.Pg(aVar.o);
            }
        } else if (dVar != null) {
            dVar.Ig();
        }
        return zy11.a;
    }
}
