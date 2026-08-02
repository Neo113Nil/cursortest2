package com.yandex.go.address.address_map_picker.domain;

import defpackage.ah00;
import defpackage.gmb0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class g {
    public final tt a;
    public final ru.yandex.taxi.preorder.source.pickup.a b;
    public final ah00 c;
    public final tt2 d;
    public ru.yandex.taxi.map.overlay.pickup.d e;

    public g(tt ttVar, ru.yandex.taxi.preorder.source.pickup.a aVar, ah00 ah00Var, tt2 tt2Var) {
        this.a = ttVar;
        this.b = aVar;
        this.c = ah00Var;
        this.d = tt2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        defpackage.jst.e.k(r5, "Error fetching pickup points");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        AddressMapPickerPickupPointsInteractor$processPickupPoints$1 addressMapPickerPickupPointsInteractor$processPickupPoints$1;
        int i;
        if (continuationImpl instanceof AddressMapPickerPickupPointsInteractor$processPickupPoints$1) {
            addressMapPickerPickupPointsInteractor$processPickupPoints$1 = (AddressMapPickerPickupPointsInteractor$processPickupPoints$1) continuationImpl;
            int i2 = addressMapPickerPickupPointsInteractor$processPickupPoints$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapPickerPickupPointsInteractor$processPickupPoints$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressMapPickerPickupPointsInteractor$processPickupPoints$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapPickerPickupPointsInteractor$processPickupPoints$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.d.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    AddressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1 addressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1 = new AddressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1(this, list, str, null);
                    addressMapPickerPickupPointsInteractor$processPickupPoints$1.L$0 = null;
                    addressMapPickerPickupPointsInteractor$processPickupPoints$1.L$1 = null;
                    addressMapPickerPickupPointsInteractor$processPickupPoints$1.label = 1;
                    obj = tje.k0(mdhVar, addressMapPickerPickupPointsInteractor$processPickupPoints$2$pickup$1, addressMapPickerPickupPointsInteractor$processPickupPoints$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.b.g((gmb0) obj);
                return zy11.a;
            }
        }
        addressMapPickerPickupPointsInteractor$processPickupPoints$1 = new AddressMapPickerPickupPointsInteractor$processPickupPoints$1(this, continuationImpl);
        Object obj2 = addressMapPickerPickupPointsInteractor$processPickupPoints$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapPickerPickupPointsInteractor$processPickupPoints$1.label;
        if (i != 0) {
        }
        this.b.g((gmb0) obj2);
        return zy11.a;
    }
}
