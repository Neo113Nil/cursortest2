package xsna;

import android.location.Location;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.util.NoLocation;
import java.util.concurrent.atomic.AtomicReference;
import xsna.dra0;

/* compiled from: PlacePickerInteractor.kt */
/* loaded from: classes4.dex */
public final class xqa0 {
    public final com.vk.movika.sdk.android.defaultplayer.layout.a a;

    public xqa0(com.vk.movika.sdk.android.defaultplayer.layout.a aVar) {
        this.a = aVar;
    }

    public final io.reactivex.rxjava3.core.x<dra0.c> a(Location location, boolean z) {
        if (location != null) {
            return io.reactivex.rxjava3.core.x.k(new dra0.c(location));
        }
        if (!z) {
            return io.reactivex.rxjava3.core.x.k(new dra0.c(null));
        }
        AtomicReference<Location> atomicReference = oxz.a;
        io.reactivex.rxjava3.internal.operators.observable.i2 l0 = oxz.c(5000L, this.a.a).l0(NoLocation.b);
        asu0 asu0Var = asu0.a;
        int i = 2;
        return l0.q(asu0Var.c()).m(asu0Var.c()).l(new si60(new ev60(i), i));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y b(String str, Location location, int i, int i2) {
        String str2;
        io.reactivex.rxjava3.internal.operators.observable.f0 W;
        if (epx.f(location, NoLocation.b) || location == null) {
            str2 = str;
            W = rsg0.W(yfb.x(po40.m(new po40(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, str2, Integer.valueOf(i2), Integer.valueOf(i), 24)), 7);
        } else {
            str2 = str;
            W = rsg0.W(yfb.x(po40.m(new po40(), (float) location.getLatitude(), (float) location.getLongitude(), str2, Integer.valueOf(i2), Integer.valueOf(i), 24)), 7);
        }
        return W.l(new jo3(new wkb(str2, i2), 27));
    }
}
