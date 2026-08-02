package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.location.LocationRequest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import xsna.izz;

/* compiled from: BaseGooglePlayServicesObservableOnSubscribe.kt */
/* loaded from: classes3.dex */
public abstract class td6<T> implements io.reactivex.rxjava3.core.s<T> {
    public final Context b;
    public final Set<com.google.android.gms.common.api.a<? extends a.d.InterfaceC0113d>> c;
    public nlz0 d;

    /* compiled from: BaseGooglePlayServicesObservableOnSubscribe.kt */
    public final class a implements c.b, c.InterfaceC0114c {
        public final io.reactivex.rxjava3.core.r<? super T> a;

        public a(io.reactivex.rxjava3.core.r<? super T> rVar) {
            this.a = rVar;
        }

        @Override // xsna.x3j
        public final void f(Bundle bundle) {
            izz izzVar = (izz) td6.this;
            io.reactivex.rxjava3.core.r<? super T> rVar = this.a;
            izzVar.i = new izz.b(rVar);
            Context context = izzVar.e;
            com.google.android.gms.common.api.a<a.d.c> aVar = wyz.a;
            izzVar.h = new zzbp(context);
            int a = anj.a(context, "android.permission.ACCESS_FINE_LOCATION");
            int a2 = anj.a(context, "android.permission.ACCESS_COARSE_LOCATION");
            if (a != 0 && a2 != 0) {
                String a3 = efz.a(a, a2, "Trying to access location without permissions fine: ", " coarse: ");
                Exception exc = izzVar.g;
                rVar.onError(new IllegalStateException(a3, exc != null ? exc : null));
                return;
            }
            zzbp zzbpVar = izzVar.h;
            if (zzbpVar == null) {
                zzbpVar = null;
            }
            LocationRequest locationRequest = izzVar.f;
            izz.b bVar = izzVar.i;
            if (bVar == null) {
                bVar = null;
            }
            zzbpVar.requestLocationUpdates(locationRequest, bVar, (Looper) null);
        }

        @Override // xsna.i380
        public final void g(ConnectionResult connectionResult) {
            io.reactivex.rxjava3.core.r<? super T> rVar = this.a;
            if (rVar.h()) {
                return;
            }
            rVar.onError(new Exception("Error connecting to GoogleApiClient."));
        }

        @Override // xsna.x3j
        public final void onConnectionSuspended(int i) {
            io.reactivex.rxjava3.core.r<? super T> rVar = this.a;
            if (rVar.h()) {
                return;
            }
            rVar.onError(new Exception("Connection suspended."));
        }
    }

    @SafeVarargs
    public td6(Context context, com.google.android.gms.common.api.a<? extends a.d.InterfaceC0113d>... aVarArr) {
        this.b = context;
        this.c = rl3.y0(Arrays.copyOf(aVarArr, aVarArr.length));
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r<T> rVar) throws Exception {
        c.a aVar = new c.a(this.b);
        Iterator<com.google.android.gms.common.api.a<? extends a.d.InterfaceC0113d>> it = this.c.iterator();
        while (it.hasNext()) {
            aVar.a(it.next());
        }
        a aVar2 = new a(rVar);
        aVar.l.add(aVar2);
        aVar.m.add(aVar2);
        nlz0 b = aVar.b();
        this.d = b;
        try {
            b.l();
        } catch (Throwable th) {
            if (!rVar.h()) {
                rVar.onError(th);
            }
        }
        rVar.i(new io.reactivex.rxjava3.disposables.a(new sd6(this, 0)));
    }
}
