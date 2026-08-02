package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.attaches.AttachMap;
import com.vk.dto.geo.GeoLocation;
import com.vk.location.common.LocationCommon;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.c9w;

/* compiled from: LocationComponent.kt */
/* loaded from: classes2.dex */
public final class nxz extends j8i implements tb0 {
    public static final String q;
    public static final String r;
    public static final GeoLocation s;
    public final Activity i;
    public final a j;
    public final lzz k;
    public final boolean l;
    public final String m = "";
    public GeoLocation n = s;
    public final LocationCommon.GpsLocationReceiver o = new LocationCommon.GpsLocationReceiver(new c());
    public boolean p = true;

    /* compiled from: LocationComponent.kt */
    public static final class b {
        public static final GeoLocation a(GeoLocation geoLocation) {
            String str = nxz.q;
            try {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                List<Address> fromLocation = new Geocoder(context).getFromLocation(geoLocation.g, geoLocation.h, 1);
                if (fromLocation != null) {
                    Address address = (Address) j5g.Y(fromLocation);
                    if (address != null) {
                        ArrayList arrayList = new ArrayList();
                        String thoroughfare = address.getThoroughfare();
                        if (thoroughfare != null && thoroughfare.length() != 0) {
                            arrayList.add(address.getThoroughfare());
                        }
                        String subThoroughfare = address.getSubThoroughfare();
                        if (subThoroughfare != null && subThoroughfare.length() != 0) {
                            arrayList.add(address.getSubThoroughfare());
                        }
                        String featureName = address.getFeatureName();
                        if (featureName != null && featureName.length() != 0 && !epx.f(address.getFeatureName(), address.getSubThoroughfare())) {
                            arrayList.add(address.getFeatureName());
                        }
                        String join = TextUtils.join(", ", arrayList);
                        String str2 = geoLocation.i;
                        if (join == null || "null".equals(join)) {
                            join = nxz.r;
                        }
                        return GeoLocation.zb(geoLocation, 0, geoLocation.g, geoLocation.h, str2, join, 7455);
                    }
                }
                return geoLocation;
            } catch (Exception unused) {
                return geoLocation;
            }
        }

        public static final GeoLocation b(Location location) {
            String str = nxz.q;
            if (location != null) {
                LocationCommon.a.getClass();
                if (!location.equals(LocationCommon.b)) {
                    return new GeoLocation(-1, 0, 0, 0, 0, location.getLatitude(), location.getLongitude(), nxz.q, null, null, null, null, null, 7966, null);
                }
            }
            return nxz.s;
        }
    }

    /* compiled from: LocationComponent.kt */
    public final class c {
        public c() {
        }
    }

    /* compiled from: LocationComponent.kt */
    public final class d implements c9w.b {
        public d() {
        }

        @Override // xsna.wj00
        public final void N() {
            nxz.this.j.N();
        }

        @Override // xsna.wj00
        public final void a() {
            nxz.this.p = true;
        }

        @Override // xsna.wj00
        public final void b() {
            nxz.this.j.b();
        }

        @Override // xsna.wj00
        public final void c() {
            nxz.this.j.c();
        }

        public final void d(GeoLocation geoLocation) {
            a aVar = nxz.this.j;
            AttachMap attachMap = new AttachMap();
            attachMap.e = geoLocation.g;
            attachMap.f = geoLocation.h;
            String str = geoLocation.i;
            if (str == null) {
                str = "";
            }
            attachMap.g = str;
            String str2 = geoLocation.m;
            if (str2 == null) {
                str2 = "";
            }
            attachMap.h = str2;
            String str3 = geoLocation.l;
            attachMap.i = str3 != null ? str3 : "";
            aVar.f(attachMap);
        }

        @Override // xsna.wj00
        public final boolean e() {
            return nxz.this.p;
        }

        @Override // xsna.wj00
        public final void f(double d, double d2) {
            nxz nxzVar = nxz.this;
            nxzVar.p = true;
            nxzVar.b1(new GeoLocation(-2, 0, 0, 0, 0, d, d2, nxz.q, null, null, null, null, null, 7966, null));
            nxzVar.k.e(nxzVar.Y0());
            nxzVar.a1();
        }

        @Override // xsna.wj00
        public final boolean g() {
            PermissionHelper permissionHelper = PermissionHelper.a;
            Activity activity = nxz.this.i;
            permissionHelper.getClass();
            return PermissionHelper.b(activity, PermissionHelper.h);
        }

        public final void h(GeoLocation geoLocation) {
            nxz nxzVar = nxz.this;
            if (!nxzVar.l) {
                d(geoLocation);
                return;
            }
            nxzVar.p = false;
            nxzVar.b1(geoLocation);
            nxzVar.k.e(nxzVar.Y0());
            nxzVar.a1();
        }

        @Override // xsna.h820
        public final void onSearchRequested() {
            nxz.this.j.e();
        }
    }

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String string = context.getString(R.string.vkim_current_location);
        q = string;
        Context context2 = e43.a;
        r = (context2 != null ? context2 : null).getString(R.string.loading);
        s = new GeoLocation(-1, 0, 0, 0, 0, 59.93593d, 30.325874d, string, null, null, null, null, null, 7966, null);
    }

    public nxz(Activity activity, a aVar, lzz lzzVar, boolean z) {
        this.i = activity;
        this.j = aVar;
        this.k = lzzVar;
        this.l = z;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        d dVar = new d();
        lzz lzzVar = this.k;
        lzzVar.d(dVar);
        ComponentCallbacks2 componentCallbacks2 = this.i;
        if (componentCallbacks2 instanceof aeg0) {
            ((aeg0) componentCallbacks2).Li(this);
        }
        return lzzVar.a(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.j8i
    public final void N0() {
        Activity activity = this.i;
        if (activity instanceof aeg0) {
            ((aeg0) activity).yk(this);
        }
        activity.unregisterReceiver(this.o);
        this.k.b();
    }

    @Override // xsna.j8i
    public final void Q0() {
        lzz lzzVar = this.k;
        RecyclerView recyclerView = lzzVar.a;
        if (recyclerView != null) {
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView recyclerView2 = lzzVar.a;
                RecyclerView.e0 childViewHolder = recyclerView2 != null ? recyclerView2.getChildViewHolder(childAt) : null;
                rl00 rl00Var = childViewHolder instanceof rl00 ? (rl00) childViewHolder : null;
                if (rl00Var != null) {
                    rl00Var.onStart();
                }
            }
        }
    }

    @Override // xsna.j8i
    public final void R0() {
        lzz lzzVar = this.k;
        RecyclerView recyclerView = lzzVar.a;
        if (recyclerView != null) {
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                View childAt = recyclerView.getChildAt(i);
                RecyclerView recyclerView2 = lzzVar.a;
                RecyclerView.e0 childViewHolder = recyclerView2 != null ? recyclerView2.getChildViewHolder(childAt) : null;
                rl00 rl00Var = childViewHolder instanceof rl00 ? (rl00) childViewHolder : null;
                if (rl00Var != null) {
                    rl00Var.onStop();
                }
            }
        }
    }

    public final View X0(ViewGroup viewGroup) {
        IntentFilter a2 = z23.a("android.location.PROVIDERS_CHANGED");
        LocationCommon.GpsLocationReceiver gpsLocationReceiver = this.o;
        Activity activity = this.i;
        activity.registerReceiver(gpsLocationReceiver, a2);
        sex0 sex0Var = e370.l;
        if (sex0Var == null) {
            sex0Var = null;
        }
        if (sex0Var.i(activity)) {
            return D0(activity, viewGroup, null, null);
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.vkim_stub_play_services_map, viewGroup, false);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, iah0.u() / 2));
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GeoLocation Y0() {
        if (!epx.f(this.n, s)) {
            return this.n;
        }
        x5 x5Var = new x5(22);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        asu0.a.getClass();
        Future<?> submit = asu0.q().submit(new mxz(ref$ObjectRef, x5Var, countDownLatch, 0));
        try {
            countDownLatch.await(32L, TimeUnit.MILLISECONDS);
            return (GeoLocation) ref$ObjectRef.element;
        } catch (InterruptedException e) {
            submit.cancel(true);
            throw e;
        }
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 Z0(CharSequence charSequence) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U;
        if (epx.f(this.n, s)) {
            sex0 sex0Var = e370.l;
            if (sex0Var == null) {
                sex0Var = null;
            }
            Context context = e43.a;
            Context context2 = context != null ? context : null;
            sex0Var.getClass();
            U = oxz.d(context2).U(new t34(new b40(22), 19));
        } else {
            U = io.reactivex.rxjava3.core.q.T(GeoLocation.zb(this.n, -2, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null, 8190)).U(new v34(new tr0(23), 11));
        }
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.l2 r0 = U.a0(asu0.r()).r0(asu0.r());
        qz qzVar = new qz(new sop(this, 23), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.core.q<R> L = r0.E(qzVar, lVar, kVar, kVar).L(new rj4(new yu1(14, this, charSequence), 19), false);
        L.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(L, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final void a1() {
        this.b.e();
        zvj.c(this.h, null);
        this.k.h(false);
        I0(Z0(this.m).subscribe(new o3y(new lxz(this, 0), 1), new c2y(new rlh(this, 18), 2)));
    }

    public final void b1(GeoLocation geoLocation) {
        GeoLocation geoLocation2 = s;
        if (!epx.f(geoLocation, geoLocation2)) {
            geoLocation2 = GeoLocation.zb(geoLocation, -2, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null, 8190);
        }
        this.n = geoLocation2;
    }

    public final void c1() {
        sex0 sex0Var = e370.l;
        if (sex0Var == null) {
            sex0Var = null;
        }
        Activity activity = this.i;
        if (sex0Var.i(activity)) {
            sex0 sex0Var2 = e370.l;
            (sex0Var2 != null ? sex0Var2 : null).getClass();
            oxz.h(activity);
            this.k.e(Y0());
            a1();
        }
    }

    public final void d1(CharSequence charSequence) {
        this.b.e();
        zvj.c(this.h, null);
        if (charSequence.length() == 0) {
            c1();
            return;
        }
        this.p = true;
        this.k.h(true);
        I0(Z0(charSequence).subscribe(new f40(new d2y(this, 3), 27), new tmz(new r3h(this, 21), 1)));
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 128 && i2 == 0) {
            this.k.f();
        }
    }

    /* compiled from: LocationComponent.kt */
    public interface a {
        default void N() {
        }

        default void b() {
        }

        default void c() {
        }

        default void e() {
        }

        default void f(AttachMap attachMap) {
        }

        default void d(AttachMap attachMap, View view) {
        }
    }
}
