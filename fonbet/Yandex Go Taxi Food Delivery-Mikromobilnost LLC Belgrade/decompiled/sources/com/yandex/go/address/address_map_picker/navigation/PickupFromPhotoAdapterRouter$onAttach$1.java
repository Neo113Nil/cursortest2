package com.yandex.go.address.address_map_picker.navigation;

import defpackage.c11;
import defpackage.dia0;
import defpackage.inb0;
import defpackage.jl40;
import defpackage.jnb0;
import defpackage.knb0;
import defpackage.lnb0;
import defpackage.mnb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tls;
import defpackage.w511;
import defpackage.wls;
import defpackage.z01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmnb0;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lmnb0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.address_map_picker.navigation.PickupFromPhotoAdapterRouter$onAttach$1", f = "PickupFromPhotoAdapterRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class PickupFromPhotoAdapterRouter$onAttach$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoAdapterRouter$onAttach$1(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupFromPhotoAdapterRouter$onAttach$1 pickupFromPhotoAdapterRouter$onAttach$1 = new PickupFromPhotoAdapterRouter$onAttach$1(this.this$0, continuation);
        pickupFromPhotoAdapterRouter$onAttach$1.L$0 = obj;
        return pickupFromPhotoAdapterRouter$onAttach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PickupFromPhotoAdapterRouter$onAttach$1 pickupFromPhotoAdapterRouter$onAttach$1 = (PickupFromPhotoAdapterRouter$onAttach$1) create((mnb0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pickupFromPhotoAdapterRouter$onAttach$1.invokeSuspend(zy11Var);
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
        kotlin.b.b(obj);
        if (!(mnb0Var instanceof inb0)) {
            if (jl40.l(mnb0Var, jnb0.a)) {
                final int i = 0;
                this.this$0.r(new tls() { // from class: com.yandex.go.address.address_map_picker.navigation.l
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i2 = i;
                        zy11 zy11Var = zy11.a;
                        z01 z01Var = (z01) obj2;
                        switch (i2) {
                            case 0:
                                c11 c11Var = z01Var.a;
                                tje.N(c11Var.o(), null, null, new AddressMapPickerModalViewRouter$InnerNavigator$onPickupFromPhotoClicked$1$onCancel$1(c11Var, null), 3);
                                break;
                            default:
                                c11 c11Var2 = z01Var.a;
                                tje.N(c11Var2.o(), null, null, new AddressMapPickerModalViewRouter$InnerNavigator$onPickupFromPhotoClicked$1$onRecognitionSuccess$1(c11Var2, null), 3);
                                break;
                        }
                        return zy11Var;
                    }
                });
            } else if (jl40.l(mnb0Var, knb0.a)) {
                this.this$0.r(new dia0(27));
            } else {
                if (!jl40.l(mnb0Var, lnb0.a)) {
                    w511.b();
                    return null;
                }
                final int i2 = 1;
                this.this$0.r(new tls() { // from class: com.yandex.go.address.address_map_picker.navigation.l
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i22 = i2;
                        zy11 zy11Var = zy11.a;
                        z01 z01Var = (z01) obj2;
                        switch (i22) {
                            case 0:
                                c11 c11Var = z01Var.a;
                                tje.N(c11Var.o(), null, null, new AddressMapPickerModalViewRouter$InnerNavigator$onPickupFromPhotoClicked$1$onCancel$1(c11Var, null), 3);
                                break;
                            default:
                                c11 c11Var2 = z01Var.a;
                                tje.N(c11Var2.o(), null, null, new AddressMapPickerModalViewRouter$InnerNavigator$onPickupFromPhotoClicked$1$onRecognitionSuccess$1(c11Var2, null), 3);
                                break;
                        }
                        return zy11Var;
                    }
                });
            }
        }
        return zy11.a;
    }
}
