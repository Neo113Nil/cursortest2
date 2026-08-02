package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import defpackage.ny61;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.yy0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class e implements xsd0 {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r1.e(defpackage.bz0.a, r2) == r9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.xsd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        AddressMapPickerMapLayerRouterImpl$onAttach$1$launch$1 addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1;
        int i;
        f fVar = this.a;
        com.yandex.go.address.address_map_picker.domain.c cVar = fVar.H;
        if (continuation instanceof AddressMapPickerMapLayerRouterImpl$onAttach$1$launch$1) {
            addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1 = (AddressMapPickerMapLayerRouterImpl$onAttach$1$launch$1) continuation;
            int i2 = addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.L$0 = wsd0Var;
                    addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    wsd0Var = (wsd0) addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.L$0;
                    kotlin.b.b(obj);
                }
                AddressMapPickerAddressStateRepository.a(fVar.J, wsd0Var.getPosition());
                yy0 yy0Var = new yy0(wsd0Var.getPosition());
                addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.L$0 = null;
                addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.label = 2;
                Object e = cVar.e(yy0Var, addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1);
                return e != coroutineSingletons ? coroutineSingletons : e;
            }
        }
        addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1 = new AddressMapPickerMapLayerRouterImpl$onAttach$1$launch$1(this, (ContinuationImpl) continuation);
        Object obj2 = addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.label;
        if (i != 0) {
        }
        AddressMapPickerAddressStateRepository.a(fVar.J, wsd0Var.getPosition());
        yy0 yy0Var2 = new yy0(wsd0Var.getPosition());
        addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.L$0 = null;
        addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1.label = 2;
        Object e2 = cVar.e(yy0Var2, addressMapPickerMapLayerRouterImpl$onAttach$1$launch$1);
        if (e2 != coroutineSingletons2) {
        }
    }
}
