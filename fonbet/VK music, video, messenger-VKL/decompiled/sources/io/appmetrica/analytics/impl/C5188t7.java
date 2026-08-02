package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5188t7 {
    public final Context a;
    public final int b;
    public final Ho c;
    public final L8 d;
    public final C4897i0 e;
    public final V8 f;
    public final C5264w7 g;
    public final C4722b6 h;

    public C5188t7(Context context, C4789dl c4789dl, int i, Ho ho, L8 l8, C4897i0 c4897i0, V8 v8, C5264w7 c5264w7) {
        this.a = context;
        this.b = i;
        this.c = ho;
        this.d = l8;
        this.e = c4897i0;
        this.f = v8;
        this.g = c5264w7;
        this.h = l8.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C5330yn C = C5342za.I.C();
        C5162s7 c5162s7 = new C5162s7(ref$ObjectRef);
        synchronized (C) {
            C.b.a(c5162s7);
        }
        return (String) ref$ObjectRef.element;
    }

    public final C5085p7 a() {
        long optLong;
        So so;
        Integer valueOf = Integer.valueOf(this.h.e);
        String name = this.h.getName();
        String value = this.h.getValue();
        Ho ho = this.c;
        int i = this.b;
        synchronized (ho) {
            try {
                JSONObject a = ho.a.a();
                JSONObject optJSONObject = a.optJSONObject("numbers_of_type");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                optLong = optJSONObject.optLong(String.valueOf(i));
                optJSONObject.put(String.valueOf(i), 1 + optLong);
                ho.a.a(a.put("numbers_of_type", optJSONObject));
            } catch (Throwable th) {
                throw th;
            }
        }
        Long valueOf2 = Long.valueOf(optLong);
        C5264w7 c5264w7 = this.g;
        c5264w7.getClass();
        Wb m = C5342za.I.m();
        Location userLocation = m.getUserLocation();
        if (userLocation != null) {
            int i2 = So.b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            so = new So(location, provider);
        } else {
            Location systemLocation = m.getSystemLocation();
            so = systemLocation != null ? new So(new Location(systemLocation), "") : null;
        }
        boolean z = c5264w7.a.d;
        Double valueOf3 = so != null ? Double.valueOf(so.getLatitude()) : null;
        Double valueOf4 = so != null ? Double.valueOf(so.getLongitude()) : null;
        Long valueOf5 = so != null ? Long.valueOf(so.getTime()) : null;
        Integer valueOf6 = so != null ? Integer.valueOf((int) so.getAccuracy()) : null;
        Integer valueOf7 = so != null ? Integer.valueOf((int) so.getBearing()) : null;
        Integer valueOf8 = so != null ? Integer.valueOf((int) so.getSpeed()) : null;
        C5214u7 c5214u7 = new C5214u7(Boolean.valueOf(z), valueOf4, valueOf3, so != null ? Integer.valueOf((int) so.getAltitude()) : null, valueOf7, valueOf6, valueOf8, valueOf5, so != null ? so.getProvider() : null, so != null ? so.a : null);
        String str = this.h.c;
        C4897i0 c4897i0 = this.e;
        String str2 = c4897i0.a;
        Long valueOf9 = Long.valueOf(c4897i0.b);
        Integer valueOf10 = Integer.valueOf(this.h.g);
        Context context = this.a;
        Ne ne = Re.a;
        Integer num = (Integer) Re.c.a((NetworkType) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", NetworkType.UNDEFINED, new Qe()));
        num.intValue();
        String b = b();
        U8 u8 = this.d.b;
        C4722b6 c4722b6 = this.h;
        return new C5085p7(valueOf, name, value, valueOf2, c5214u7, str, str2, valueOf9, valueOf10, num, b, u8, c4722b6.h, c4722b6.k, c4722b6.l, c4722b6.n, c4722b6.o, this.f.fromModel(c4722b6.p));
    }

    public /* synthetic */ C5188t7(Context context, C4789dl c4789dl, int i, Ho ho, L8 l8, C5224uh c5224uh, C4897i0 c4897i0) {
        this(context, c4789dl, i, ho, l8, c4897i0, new V8(), new C5264w7(c5224uh));
    }
}
