package com.yandex.mob;

import android.location.Address;
import android.location.Geocoder;
import defpackage.evu0;
import defpackage.jn20;
import defpackage.kn20;
import defpackage.ln20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmn20;", "<anonymous>", "(Ltse;)Lmn20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.AndroidDeviceGeocodeGateway$geocode$2", f = "AndroidDeviceGeocodeGateway.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AndroidDeviceGeocodeGateway$geocode$2 extends SuspendLambda implements wls {
    final /* synthetic */ double $lat;
    final /* synthetic */ double $lon;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDeviceGeocodeGateway$geocode$2(a aVar, double d, double d2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$lat = d;
        this.$lon = d2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidDeviceGeocodeGateway$geocode$2(this.this$0, this.$lat, this.$lon, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidDeviceGeocodeGateway$geocode$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AndroidDeviceGeocodeGateway$geocode$2 androidDeviceGeocodeGateway$geocode$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.this$0;
                Geocoder geocoder = (Geocoder) aVar.c.getValue();
                double d = this.$lat;
                double d2 = this.$lon;
                this.label = 1;
                androidDeviceGeocodeGateway$geocode$2 = this;
                obj = a.a(aVar, geocoder, d, d2, 1, androidDeviceGeocodeGateway$geocode$2);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                androidDeviceGeocodeGateway$geocode$2 = this;
            }
            Iterator it = ((List) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!evu0.J(((Address) next).getCountryCode())) {
                    obj2 = next;
                    break;
                }
            }
            Address address = (Address) obj2;
            if (address == null) {
                return new kn20("EmptyResponse", "Geocoder response is empty");
            }
            return new ln20(new jn20(address.getCountryCode(), new Double(androidDeviceGeocodeGateway$geocode$2.$lat), new Double(androidDeviceGeocodeGateway$geocode$2.$lon)));
        } catch (Exception e) {
            String name = e.getClass().getName();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            return new kn20(name, message);
        }
    }
}
