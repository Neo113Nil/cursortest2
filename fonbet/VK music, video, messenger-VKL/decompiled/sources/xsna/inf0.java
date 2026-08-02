package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.vk.reefton.dto.ReefLocationSource;
import com.vk.reefton.literx.observable.ObservableMap;
import com.vk.reefton.literx.observable.ObservableObserveOn;
import com.vk.reefton.literx.observable.ObservableOnErrorReturn;
import com.vk.reefton.literx.observable.ObservableSubscribeOn;
import com.vk.reefton.literx.observable.ObservableTimeout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReefDefaultLocationProvider.kt */
/* loaded from: classes5.dex */
public final class inf0 implements xnf0 {
    public static final bpn0 j = new bpn0(new ta50(4));
    public final Context a;
    public final LocationManager b;
    public final fnf0 c;
    public final hof0 d;
    public final b8h0 e;
    public final f21 f;
    public final kk1 g;
    public final a h;
    public final HashMap<String, ArrayList<izs<tnf0, s3q0>>> i;

    /* compiled from: ReefDefaultLocationProvider.kt */
    public static final class a {
        public final boolean a(hof0 hof0Var, ReefLocationSource reefLocationSource) {
            if (reefLocationSource != ReefLocationSource.GPS) {
                return hof0Var.a();
            }
            hof0Var.a.getClass();
            Boolean bool = hof0Var.d;
            if (bool == null) {
                bool = Boolean.valueOf(hof0Var.b.l("android.permission.ACCESS_FINE_LOCATION"));
            }
            hof0Var.d = bool;
            return bool.booleanValue();
        }
    }

    /* compiled from: ReefDefaultLocationProvider.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReefLocationSource.values().length];
            try {
                iArr[ReefLocationSource.GPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReefLocationSource.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReefLocationSource.PASSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReefLocationSource.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public inf0(Context context, LocationManager locationManager, fnf0 fnf0Var, hof0 hof0Var, b8h0 b8h0Var) {
        f21 f21Var = new f21(4);
        kk1 kk1Var = new kk1(26);
        a aVar = (a) j.getValue();
        this.a = context;
        this.b = locationManager;
        this.c = fnf0Var;
        this.d = hof0Var;
        this.e = b8h0Var;
        this.f = f21Var;
        this.g = kk1Var;
        this.h = aVar;
        this.i = new HashMap<>();
    }

    public static String c(ReefLocationSource reefLocationSource) {
        int i = b.$EnumSwitchMapping$0[reefLocationSource.ordinal()];
        if (i == 1) {
            return "gps";
        }
        if (i == 2) {
            return "network";
        }
        if (i == 3) {
            return "passive";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("ReefLocationProvider.Source.Unknown can not be converted to LocationManager provider");
    }

    public static tnf0 e(Location location) {
        ReefLocationSource reefLocationSource;
        String provider = location.getProvider();
        if (provider != null) {
            int hashCode = provider.hashCode();
            if (hashCode != 102570) {
                if (hashCode == 1843485230 && provider.equals("network")) {
                    reefLocationSource = ReefLocationSource.NETWORK;
                }
            } else if (provider.equals("gps")) {
                reefLocationSource = ReefLocationSource.GPS;
            }
            return new tnf0(reefLocationSource, location.getLongitude(), location.getLatitude(), location.getElapsedRealtimeNanos(), location.getAccuracy(), location.getSpeed(), location.hasAltitude(), Float.valueOf((float) location.getAltitude()));
        }
        reefLocationSource = ReefLocationSource.PASSIVE;
        return new tnf0(reefLocationSource, location.getLongitude(), location.getLatitude(), location.getElapsedRealtimeNanos(), location.getAccuracy(), location.getSpeed(), location.hasAltitude(), Float.valueOf((float) location.getAltitude()));
    }

    @Override // xsna.xnf0
    @SuppressLint({"MissingPermission"})
    public final void a(ReefLocationSource reefLocationSource, long j2, long j3, ync yncVar) {
        if (this.b == null) {
            yncVar.invoke(tnf0.i);
            return;
        }
        if (this.c.a() < 17) {
            yncVar.invoke(tnf0.i);
            return;
        }
        if (this.c.a() >= 23 && !this.h.a(this.d, reefLocationSource)) {
            yncVar.invoke(tnf0.i);
            return;
        }
        String c = c(reefLocationSource);
        Location lastKnownLocation = this.b.getLastKnownLocation(c);
        tnf0 e = lastKnownLocation != null ? e(lastKnownLocation) : null;
        if (e != null && ((Number) this.g.invoke()).longValue() - (e.d / 1000000) <= j2) {
            yncVar.invoke(e);
            return;
        }
        synchronized (this.i) {
            try {
                if (this.i.get(c) != null && !this.i.get(c).isEmpty()) {
                    this.i.get(c).add(yncVar);
                }
                this.i.put(c, e43.a(yncVar));
                ObservableObserveOn observableObserveOn = new ObservableObserveOn(new ObservableSubscribeOn((iq70) this.f.invoke(this.a, new ynf0(c, 6)), this.e), this.e);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                new ObservableOnErrorReturn(new ObservableMap(new ObservableTimeout(observableObserveOn, j3, this.e), new xpt(this)), new j6e0(1)).c(new com.vk.movika.sdk.base.logic.processor.d(28, c, (Object) this), new az2(27, this, c));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.xnf0
    @SuppressLint({"MissingPermission"})
    public final tnf0 b(ReefLocationSource reefLocationSource) {
        Location lastKnownLocation;
        LocationManager locationManager = this.b;
        if (locationManager == null) {
            return null;
        }
        fnf0 fnf0Var = this.c;
        if (fnf0Var.a() < 17) {
            return null;
        }
        if ((fnf0Var.a() < 23 || this.h.a(this.d, reefLocationSource)) && (lastKnownLocation = locationManager.getLastKnownLocation(c(reefLocationSource))) != null) {
            return e(lastKnownLocation);
        }
        return null;
    }

    public final void d(String str, tnf0 tnf0Var) {
        synchronized (this.i) {
            try {
                ArrayList<izs<tnf0, s3q0>> arrayList = this.i.get(str);
                if (arrayList != null) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((izs) it.next()).invoke(tnf0Var);
                    }
                }
                this.i.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
