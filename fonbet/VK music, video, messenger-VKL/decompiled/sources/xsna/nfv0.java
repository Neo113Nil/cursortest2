package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.vk.reefton.dto.ReefLocationSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkReefLocationProvider.kt */
/* loaded from: classes5.dex */
public final class nfv0 implements xnf0 {
    public static final bpn0 i = new bpn0(new ltb0(18));
    public final Context a;
    public final LocationManager b;
    public final a c;
    public final fnf0 d;
    public final ldi e;
    public final eul0 f;
    public final io.reactivex.rxjava3.core.w g;
    public final HashMap<String, ArrayList<izs<tnf0, s3q0>>> h;

    /* compiled from: VkReefLocationProvider.kt */
    public static final class a {
        public final boolean a(Context context, ReefLocationSource reefLocationSource) {
            return (reefLocationSource == ReefLocationSource.GPS || reefLocationSource == ReefLocationSource.PASSIVE) ? anj.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 : anj.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        }
    }

    /* compiled from: VkReefLocationProvider.kt */
    public static final /* synthetic */ class b {
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

    public nfv0() {
        throw null;
    }

    public nfv0(Context context, LocationManager locationManager, kfv0 kfv0Var, ldi ldiVar) {
        a aVar = (a) i.getValue();
        eul0 eul0Var = new eul0(10);
        asu0.a.getClass();
        io.reactivex.rxjava3.core.w p = asu0.p();
        this.a = context;
        this.b = locationManager;
        this.c = aVar;
        this.d = kfv0Var;
        this.e = ldiVar;
        this.f = eul0Var;
        this.g = p;
        this.h = new HashMap<>();
    }

    public static String c(ReefLocationSource reefLocationSource) {
        int i2 = b.$EnumSwitchMapping$0[reefLocationSource.ordinal()];
        if (i2 == 1) {
            return "gps";
        }
        if (i2 == 2) {
            return "network";
        }
        if (i2 == 3) {
            return "passive";
        }
        if (i2 != 4) {
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
    public final void a(ReefLocationSource reefLocationSource, long j, long j2, ync yncVar) {
        LocationManager locationManager = this.b;
        if (locationManager == null) {
            yncVar.invoke(tnf0.i);
            return;
        }
        if (this.d.a() < 17) {
            yncVar.invoke(tnf0.i);
            return;
        }
        int i2 = 23;
        if (this.d.a() >= 23 && !this.c.a(this.a, reefLocationSource)) {
            yncVar.invoke(tnf0.i);
            return;
        }
        String c = c(reefLocationSource);
        Location lastKnownLocation = locationManager.getLastKnownLocation(c);
        tnf0 e = lastKnownLocation != null ? e(lastKnownLocation) : null;
        if (e != null && ((Number) this.f.invoke()).longValue() - (e.d / 1000000) <= j) {
            yncVar.invoke(e);
            return;
        }
        synchronized (this.h) {
            try {
                if (this.h.get(c) != null && !this.h.get(c).isEmpty()) {
                    this.h.get(c).add(yncVar);
                }
                this.h.put(c, e43.a(yncVar));
                cyz cyzVar = new cyz();
                cyzVar.a = c;
                cyzVar.d = 1L;
                int i3 = 25;
                int i4 = 8;
                new io.reactivex.rxjava3.internal.operators.observable.p1(((io.reactivex.rxjava3.core.q) this.e.invoke(this.a, cyzVar)).r0(this.g).a0(this.g).A0(j2, TimeUnit.MILLISECONDS, null, this.g).U(new or20(new d7l0(this), i2)), new ohl0(new p6e0(i3), i4)).k0().subscribe(new d8u0(new ab(i3, this, c), 2), new u0o0(new gs80(i4, this, c), 10));
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
        fnf0 fnf0Var = this.d;
        if (fnf0Var.a() < 17) {
            return null;
        }
        if ((fnf0Var.a() < 23 || this.c.a(this.a, reefLocationSource)) && (lastKnownLocation = locationManager.getLastKnownLocation(c(reefLocationSource))) != null) {
            return e(lastKnownLocation);
        }
        return null;
    }

    public final void d(String str, tnf0 tnf0Var) {
        synchronized (this.h) {
            try {
                ArrayList<izs<tnf0, s3q0>> arrayList = this.h.get(str);
                if (arrayList != null) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((izs) it.next()).invoke(tnf0Var);
                    }
                }
                this.h.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
