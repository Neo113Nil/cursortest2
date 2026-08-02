package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.i5s;
import xsna.xe9;

/* renamed from: io.appmetrica.analytics.impl.b6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4722b6 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C4722b6> CREATOR = new C4696a6();

    @Nullable
    protected String a;

    @Nullable
    protected String b;
    public String c;
    public int d;
    public int e;
    public Pair f;
    public int g;
    public String h;
    public long i;
    public long j;
    public EnumC5088pa k;
    public EnumC5316y9 l;
    public Bundle m;
    public Boolean n;
    public Integer o;
    public Map p;

    public C4722b6() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f == null) {
            this.f = new Pair(str, str2);
        }
    }

    @Nullable
    public final Pair<String, String> b() {
        return this.f;
    }

    public final void c(@Nullable Bundle bundle) {
        this.m = bundle;
    }

    public final long d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.j;
    }

    @Nullable
    public final String f() {
        return this.c;
    }

    @NonNull
    public final EnumC5088pa g() {
        return this.k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @NonNull
    public final Map<String, byte[]> getExtras() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getName() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final String getValue() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final byte[] getValueBytes() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Nullable
    public final Integer h() {
        return this.o;
    }

    @Nullable
    public final Bundle i() {
        return this.m;
    }

    @Nullable
    public final String j() {
        return this.h;
    }

    @Nullable
    public final EnumC5316y9 k() {
        return this.l;
    }

    public final boolean l() {
        return this.a == null;
    }

    public final boolean m() {
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        return -1 == this.d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i) {
        this.g = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i) {
        this.e = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(@NonNull Map<String, byte[]> map) {
        this.p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(@Nullable String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i) {
        this.d = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(@Nullable String str) {
        this.b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(@Nullable byte[] bArr) {
        this.b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    @NonNull
    public final String toString() {
        Locale locale = Locale.US;
        String str = this.a;
        String str2 = EnumC5037nb.a(this.d).b;
        String str3 = this.b;
        if (str3 == null) {
            str3 = null;
        } else if (str3.length() > 500) {
            str3 = str3.substring(0, 500);
        }
        return i5s.a(xe9.a("[event: ", str, ", type: ", str2, ", value: "), str3, X3.j.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.a);
        bundle.putString("CounterReport.Value", this.b);
        bundle.putInt("CounterReport.Type", this.d);
        bundle.putInt("CounterReport.CustomType", this.e);
        bundle.putInt("CounterReport.TRUNCATED", this.g);
        bundle.putString("CounterReport.ProfileID", this.h);
        bundle.putInt("CounterReport.UniquenessStatus", this.k.a);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.i);
        bundle.putLong("CounterReport.CreationTimestamp", this.j);
        EnumC5316y9 enumC5316y9 = this.l;
        if (enumC5316y9 != null) {
            bundle.putInt("CounterReport.Source", enumC5316y9.a);
        }
        Boolean bool = this.n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.p));
        parcel.writeBundle(bundle);
    }

    public C4722b6(@Nullable String str, int i) {
        this("", str, i);
    }

    @NonNull
    public static C4722b6 e(@NonNull C4722b6 c4722b6) {
        return a(c4722b6, EnumC5037nb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(@Nullable String str) {
        this.c = str;
    }

    public void c(@Nullable String str) {
        this.h = str;
    }

    @NonNull
    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C4722b6(@Nullable String str, @Nullable String str2, int i) {
        this(str, str2, i, new SystemTimeProvider());
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void b(long j) {
        this.j = j;
    }

    @Nullable
    public final Boolean c() {
        return this.n;
    }

    public C4722b6(@Nullable String str, @Nullable String str2, int i, @NonNull SystemTimeProvider systemTimeProvider) {
        this.k = EnumC5088pa.UNKNOWN;
        this.p = new HashMap();
        this.a = str2;
        this.d = i;
        this.b = str;
        this.i = systemTimeProvider.elapsedRealtime();
        this.j = systemTimeProvider.currentTimeMillis();
    }

    @NonNull
    public static C4722b6 b(@Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                C4722b6 c4722b6 = (C4722b6) bundle.getParcelable("CounterReport.Object");
                if (c4722b6 != null) {
                    return c4722b6;
                }
            } catch (Throwable unused) {
                return new C4722b6("", 0);
            }
        }
        return new C4722b6("", 0);
    }

    @NonNull
    public static C4722b6 c(@NonNull C4722b6 c4722b6) {
        return a(c4722b6, EnumC5037nb.EVENT_TYPE_INIT);
    }

    @NonNull
    public static C4722b6 d(@NonNull C4722b6 c4722b6) {
        C4722b6 c4722b62 = new C4722b6("", 0);
        c4722b62.j = c4722b6.j;
        c4722b62.i = c4722b6.i;
        c4722b62.f = c4722b6.f;
        c4722b62.c = c4722b6.c;
        c4722b62.m = c4722b6.m;
        c4722b62.p = c4722b6.p;
        c4722b62.h = c4722b6.h;
        return c4722b62;
    }

    public final void a(@NonNull EnumC5088pa enumC5088pa) {
        this.k = enumC5088pa;
    }

    public final void a(@Nullable EnumC5316y9 enumC5316y9) {
        this.l = enumC5316y9;
    }

    public final void a(@Nullable Boolean bool) {
        this.n = bool;
    }

    public final void a(@Nullable Integer num) {
        this.o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    @NonNull
    public static C4722b6 b(@NonNull C4722b6 c4722b6) {
        return a(c4722b6, EnumC5037nb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static C4722b6 a(C4722b6 c4722b6, EnumC5037nb enumC5037nb) {
        C4722b6 d = d(c4722b6);
        d.d = enumC5037nb.a;
        return d;
    }

    @NonNull
    public static C4722b6 a(@NonNull C4722b6 c4722b6) {
        return a(c4722b6, EnumC5037nb.EVENT_TYPE_ALIVE);
    }

    @NonNull
    public static C4722b6 a(@NonNull C4722b6 c4722b6, @NonNull Y9 y9) {
        C4722b6 a = a(c4722b6, EnumC5037nb.EVENT_TYPE_START);
        a.setValueBytes(MessageNano.toByteArray(new B9().fromModel(new A9((String) y9.b.a()))));
        a.j = c4722b6.j;
        a.i = c4722b6.i;
        return a;
    }

    @NonNull
    public static C4722b6 a(@NonNull C4722b6 c4722b6, @NonNull Collection<PermissionState> collection, @Nullable J2 j2, @NonNull C5054o2 c5054o2, @NonNull List<String> list) {
        String str;
        String str2;
        C4722b6 d = d(c4722b6);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put("name", permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (j2 != null) {
                jSONObject.put("background_restricted", j2.b);
                I2 i2 = j2.a;
                c5054o2.getClass();
                if (i2 != null) {
                    int ordinal = i2.ordinal();
                    if (ordinal == 0) {
                        str2 = "EXEMPTED";
                    } else if (ordinal == 1) {
                        str2 = SignalingProtocol.STATE_ACTIVE;
                    } else if (ordinal == 2) {
                        str2 = "WORKING_SET";
                    } else if (ordinal == 3) {
                        str2 = "FREQUENT";
                    } else if (ordinal == 4) {
                        str2 = "RARE";
                    } else if (ordinal == 5) {
                        str2 = "RESTRICTED";
                    }
                    jSONObject.put("app_standby_bucket", str2);
                }
                str2 = null;
                jSONObject.put("app_standby_bucket", str2);
            }
            str = new JSONObject().put(SignalingProtocol.KEY_PERMISSIONS, jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            str = "";
        }
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        d.d = 12288;
        d.setValue(str);
        return d;
    }

    @NonNull
    public static C4722b6 a(@NonNull C4722b6 c4722b6, @Nullable String str) {
        C4722b6 d = d(c4722b6);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        d.d = 12289;
        d.setValue(str);
        return d;
    }

    @NonNull
    public static C4722b6 a() {
        C4722b6 c4722b6 = new C4722b6("", 0);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        c4722b6.d = 16384;
        return c4722b6;
    }

    @NonNull
    public static C4722b6 a(@NonNull String str) {
        C4722b6 c4722b6 = new C4722b6("", 0);
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        c4722b6.d = 12320;
        c4722b6.b = str;
        c4722b6.l = EnumC5316y9.JS;
        return c4722b6;
    }
}
