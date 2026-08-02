package xsna;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;

/* compiled from: LocationUpdatesGooglePlayServicesObservableOnSubscribe.kt */
/* loaded from: classes3.dex */
public final class izz extends ng6<Location> {
    public final Context e;
    public final LocationRequest f;
    public Exception g;
    public zzbp h;
    public b i;

    /* compiled from: LocationUpdatesGooglePlayServicesObservableOnSubscribe.kt */
    public static final class a {
        public static io.reactivex.rxjava3.core.q a(Context context, LocationRequest locationRequest) {
            io.reactivex.rxjava3.internal.operators.observable.q qVar = new io.reactivex.rxjava3.internal.operators.observable.q(new izz(context, locationRequest));
            int i = locationRequest.g;
            return (i <= 0 || i >= Integer.MAX_VALUE) ? qVar : qVar.t0(i);
        }
    }

    /* compiled from: LocationUpdatesGooglePlayServicesObservableOnSubscribe.kt */
    public static final class b extends kxz {
        public final io.reactivex.rxjava3.core.r<? super Location> b;

        public b(io.reactivex.rxjava3.core.r<? super Location> rVar) {
            this.b = rVar;
        }

        @Override // xsna.kxz
        public final void onLocationResult(LocationResult locationResult) {
            Location i;
            io.reactivex.rxjava3.core.r<? super Location> rVar = this.b;
            if (rVar.h() || (i = locationResult.i()) == null) {
                return;
            }
            rVar.onNext(i);
        }
    }

    public izz(Context context, LocationRequest locationRequest) {
        super(context, wyz.a);
        this.e = context;
        this.f = locationRequest;
    }

    @Override // xsna.td6, io.reactivex.rxjava3.core.s
    public final void subscribe(io.reactivex.rxjava3.core.r<Location> rVar) {
        super.subscribe(rVar);
        this.g = new Exception();
    }
}
