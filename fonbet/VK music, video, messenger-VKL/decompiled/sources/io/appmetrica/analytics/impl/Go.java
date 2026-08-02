package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;
import xsna.emb;
import xsna.vr;

/* loaded from: classes8.dex */
public final class Go {
    public final Io a;

    public Go(C4937jf c4937jf, C5036na c5036na) {
        this.a = new Io(c4937jf, c5036na, new vr(15));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC5166sb.a(jSONObject2, "last_migration_api_level", AbstractC5166sb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        Io io2 = this.a;
        io2.a(io2.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        Io io2 = this.a;
        io2.a(io2.a().put("referrer_checked", true));
    }

    public final synchronized C5298xg b() {
        byte[] decode;
        C5298xg c5298xg;
        String optStringOrNull = JsonUtils.optStringOrNull(this.a.a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(emb.b), 0);
            } catch (Throwable unused) {
            }
            c5298xg = (decode == null || decode.length == 0) ? null : new C5298xg(decode);
        }
        return c5298xg;
    }

    public final synchronized void a(String str) {
        Io io2 = this.a;
        io2.a(io2.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.a.a(), "device_id_hash");
    }

    public final synchronized void a(C5298xg c5298xg) {
        try {
            Io io2 = this.a;
            io2.a(io2.a().put("referrer", c5298xg != null ? new String(Base64.encode(c5298xg.a(), 0), emb.b) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
