package com.yandex.go.address.address_map_picker.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.ry0;
import defpackage.wls;
import defpackage.x46;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv0;", "it", "Lzy11;", "<anonymous>", "(Lpv0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.domain.AddressMapPickerBlockedZonesInteractor$attach$2", f = "AddressMapPickerBlockedZonesInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AddressMapPickerBlockedZonesInteractor$attach$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ry0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickerBlockedZonesInteractor$attach$2(ry0 ry0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ry0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressMapPickerBlockedZonesInteractor$attach$2 addressMapPickerBlockedZonesInteractor$attach$2 = new AddressMapPickerBlockedZonesInteractor$attach$2(this.this$0, continuation);
        addressMapPickerBlockedZonesInteractor$attach$2.L$0 = obj;
        return addressMapPickerBlockedZonesInteractor$attach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddressMapPickerBlockedZonesInteractor$attach$2 addressMapPickerBlockedZonesInteractor$attach$2 = (AddressMapPickerBlockedZonesInteractor$attach$2) create((pv0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addressMapPickerBlockedZonesInteractor$attach$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var = (pv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ry0 ry0Var = this.this$0;
        ru.yandex.taxi.map.overlay.b bVar = ry0Var.a;
        x46 b = ry0Var.b.b(pv0Var, false);
        if (b.f != null) {
            ry0Var.d.b();
            List list = b.f;
            if (list == null) {
                list = EmptyList.a;
            }
            bVar.Mg(list);
        } else {
            bVar.Jg();
        }
        return zy11.a;
    }
}
