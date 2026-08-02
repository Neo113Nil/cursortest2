package com.yandex.go.location.provider;

import android.hardware.GeomagneticField;
import android.location.Location;
import android.os.Handler;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import defpackage.jst;
import defpackage.k0b0;
import defpackage.mvg;
import defpackage.n8a;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.q251;
import defpackage.qwc;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.source.userposition.misc.LocationListenerAdapter;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.location.provider.CompassProviderImpl$declinationFlow$2$1", f = "CompassProviderImpl.kt", l = {203, 236}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompassProviderImpl$declinationFlow$2$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qwc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompassProviderImpl$declinationFlow$2$1(qwc qwcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qwcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CompassProviderImpl$declinationFlow$2$1 compassProviderImpl$declinationFlow$2$1 = new CompassProviderImpl$declinationFlow$2$1(this.this$0, continuation);
        compassProviderImpl$declinationFlow$2$1.L$0 = obj;
        return compassProviderImpl$declinationFlow$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompassProviderImpl$declinationFlow$2$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        k0b0 k0b0Var = this.this$0.d;
        if (k0b0Var.a() || k0b0Var.g()) {
            LocationListenerAdapter locationListenerAdapter = new LocationListenerAdapter() { // from class: com.yandex.go.location.provider.CompassProviderImpl$declinationFlow$2$1$listener$1
                @Override // android.location.LocationListener
                public void onLocationChanged(Location location) {
                    Throwable a;
                    GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getTime());
                    Object d = ((x6f0) y6f0.this).y.d(Float.valueOf(geomagneticField.getDeclination()));
                    if (!(d instanceof ni9) || (a = oi9.a(d)) == null) {
                        return;
                    }
                    jst.e.k(a, "Failed to send declination");
                }
            };
            try {
                Location lastKnownLocation = this.this$0.c.getLastKnownLocation("passive");
                if (lastKnownLocation != null) {
                    locationListenerAdapter.onLocationChanged(lastKnownLocation);
                }
                qwc qwcVar = this.this$0;
                qwcVar.c.requestLocationUpdates("passive", MapiClientImpl.RETRIES_TIME_MILLIS, 500.0f, locationListenerAdapter, ((Handler) qwcVar.g.getValue()).getLooper());
            } catch (SecurityException unused) {
                jst.e.getClass();
                ((x6f0) y6f0Var).d(new Float(Float.NaN));
            }
            n8a n8aVar = new n8a(24, this.this$0, locationListenerAdapter);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            return kotlinx.coroutines.channels.b.a(y6f0Var, n8aVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        x6f0 x6f0Var = (x6f0) y6f0Var;
        x6f0Var.d(new Float(Float.NaN));
        this.L$0 = null;
        this.label = 1;
        if (kotlinx.coroutines.channels.b.a(x6f0Var, new q251(10), this) == coroutineSingletons) {
        }
    }
}
