package xsna;

import android.os.SystemClock;
import com.vk.ads.externalsdkstat.api.ExternalSdk;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import org.json.JSONObject;

/* compiled from: AdsSdkInitializationDevNullStatTracker.kt */
/* loaded from: classes14.dex */
public final class l11 implements m11 {
    public final ExternalSdk a;
    public long b;
    public long c;
    public long d;

    public l11(ExternalSdk externalSdk) {
        this.a = externalSdk;
    }

    @Override // xsna.m11
    public final void a(int i, String str) {
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.EXTERNAL_ADS_INITIALIZATION.h(), new JSONObject().putOpt("error_message", str).toString(), "integration_error", Integer.valueOf(i), this.a.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32, 3, null);
        l5mVar.q();
    }

    @Override // xsna.oau
    public final void b() {
        this.c = SystemClock.elapsedRealtime();
    }

    @Override // xsna.m11
    public final void c() {
        this.d = SystemClock.elapsedRealtime();
    }

    @Override // xsna.oau
    public final void d() {
        this.b = SystemClock.elapsedRealtime();
    }

    @Override // xsna.m11
    public final void e(String str, boolean z, Boolean bool, Boolean bool2) {
        String jSONObject;
        long j = this.d;
        if (bool == null && bool2 == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (bool != null) {
                jSONObject2.put("has_user_consent", bool.booleanValue());
            }
            if (bool2 != null) {
                jSONObject2.put("do_not_sell", bool2.booleanValue());
            }
            if (str != null) {
                jSONObject2.put("error_message", str);
            }
            s3q0 s3q0Var = s3q0.a;
            jSONObject = jSONObject2.toString();
        }
        if (j > 0) {
            i(Integer.valueOf((int) (SystemClock.elapsedRealtime() - j)), "sdk_init", Boolean.valueOf(z), jSONObject);
        }
        this.d = 0L;
    }

    @Override // xsna.oau
    public final void f(boolean z) {
        long j = this.b;
        if (j > 0) {
            i(Integer.valueOf((int) (SystemClock.elapsedRealtime() - j)), "user_consent", Boolean.valueOf(z), null);
        }
        this.b = 0L;
    }

    @Override // xsna.oau
    public final void g(boolean z) {
        long j = this.c;
        if (j > 0) {
            i(Integer.valueOf((int) (SystemClock.elapsedRealtime() - j)), "privacy_options", Boolean.valueOf(z), null);
        }
        this.c = 0L;
    }

    @Override // xsna.m11
    public final void h(String str) {
        i(null, "dynamic_lib_loading", null, new JSONObject().putOpt("error_message", str).toString());
    }

    public final void i(Integer num, String str, Boolean bool, String str2) {
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.EXTERNAL_ADS_INITIALIZATION.h(), str2, str, bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null, this.a.h(), num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -64, 3, null);
        l5mVar.q();
    }
}
