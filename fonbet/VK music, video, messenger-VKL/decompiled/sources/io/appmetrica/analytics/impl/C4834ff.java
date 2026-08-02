package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4834ff extends Jd {
    public static final Cif d = new Cif("UUID_RESULT", null);
    public static final Cif e = new Cif("DEVICE_ID_RESULT", null);
    public static final Cif f = new Cif("DEVICE_ID_HASH_RESULT", null);
    public static final Cif g = new Cif("AD_URL_GET_RESULT", null);
    public static final Cif h = new Cif("AD_URL_REPORT_RESULT", null);
    public static final Cif i = new Cif("CUSTOM_HOSTS", null);
    public static final Cif j = new Cif("SERVER_TIME_OFFSET", null);
    public static final Cif k = new Cif("RESPONSE_CLIDS_RESULT", null);
    public static final Cif l = new Cif("CUSTOM_SDK_HOSTS", null);
    public static final Cif m = new Cif("CLIENT_CLIDS", null);
    public static final Cif n = new Cif("DEFERRED_DEEP_LINK_WAS_CHECKED", null);
    public static final Cif o = new Cif("API_LEVEL", null);
    public static final Cif p = new Cif("NEXT_STARTUP_TIME", null);
    public static final Cif q = new Cif(IronSourceConstants.TYPE_GAID, null);
    public static final Cif r = new Cif("HOAID", null);
    public static final Cif s = new Cif("YANDEX_ADV_ID", null);
    public static final Cif t = new Cif("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
    public static final Cif u = new Cif("SCREEN_INFO", null);
    public static final Cif v = new Cif("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
    public static final Cif w = new Cif("FEATURES", null);
    public static final Cif x = new Cif("APPMETRICA_CLIENT_CONFIG", null);

    public C4834ff(Ta ta) {
        super(ta);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(t.b, z);
    }

    public final long b(long j2) {
        return this.a.getLong(j.a, j2);
    }

    @NonNull
    public final C4834ff c(@Nullable IdentifiersResult identifiersResult) {
        return a(l.b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(g.b);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(h.b);
    }

    @NonNull
    public final C4834ff f(@Nullable IdentifiersResult identifiersResult) {
        return a(q.b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(l.b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f.b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(e.b);
    }

    @NonNull
    public final C4881ha k() {
        String string = this.a.getString(w.b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C4881ha(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, CommonConstant.RETKEY.STATUS)), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C4881ha(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(q.b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(r.b);
    }

    @NonNull
    public final long n() {
        return this.a.getLong(p.b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(k.b);
    }

    @Nullable
    public final ScreenInfo p() {
        return AbstractC5166sb.e(this.a.getString(u.b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(d.b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(s.b);
    }

    public final boolean s() {
        return this.a.getBoolean(n.b, false);
    }

    public final boolean t() {
        return this.a.getBoolean(v.b, false);
    }

    public final C4834ff u() {
        return (C4834ff) b(n.b, true);
    }

    public final void v() {
        b(v.b, true);
    }

    public final List<String> g() {
        String string = this.a.getString(i.b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC5166sb.b(string);
    }

    public final long a(long j2) {
        return this.a.getLong(o.b, j2);
    }

    @NonNull
    public final C4834ff b(@Nullable IdentifiersResult identifiersResult) {
        return a(h.b, identifiersResult);
    }

    public final C4834ff c(long j2) {
        return (C4834ff) b(o.b, j2);
    }

    @NonNull
    public final C4834ff d(@Nullable IdentifiersResult identifiersResult) {
        return a(f.b, identifiersResult);
    }

    @NonNull
    public final C4834ff e(@Nullable IdentifiersResult identifiersResult) {
        return a(e.b, identifiersResult);
    }

    @Nullable
    public final AppMetricaConfig.Builder f() {
        String string = this.a.getString(x.b, null);
        if (string == null) {
            return null;
        }
        return new S3().a(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, CommonConstant.RETKEY.STATUS)), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            return identifiersResult != null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
        }
        identifiersResult = null;
        if (identifiersResult != null) {
        }
    }

    @NonNull
    public final C4834ff i(@Nullable IdentifiersResult identifiersResult) {
        return a(d.b, identifiersResult);
    }

    @NonNull
    public final C4834ff j(@Nullable IdentifiersResult identifiersResult) {
        return a(s.b, identifiersResult);
    }

    @NonNull
    public final C4834ff g(@Nullable IdentifiersResult identifiersResult) {
        return a(r.b, identifiersResult);
    }

    @NonNull
    public final C4834ff a(@Nullable IdentifiersResult identifiersResult) {
        return a(g.b, identifiersResult);
    }

    public final C4834ff b(boolean z) {
        return (C4834ff) b(t.b, z);
    }

    @NonNull
    public final C4834ff d(long j2) {
        return (C4834ff) b(p.b, j2);
    }

    public final C4834ff e(long j2) {
        return (C4834ff) b(j.b, j2);
    }

    @Nullable
    public final String i(@Nullable String str) {
        return this.a.getString(m.b, str);
    }

    public final C4834ff j(@Nullable String str) {
        return (C4834ff) b(m.b, str);
    }

    @Override // io.appmetrica.analytics.impl.Jd
    @NonNull
    public final String f(@NonNull String str) {
        return new Cif(str, null).b;
    }

    public final C4834ff a(List<String> list) {
        return (C4834ff) b(i.b, vo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final C4834ff h(@Nullable IdentifiersResult identifiersResult) {
        return a(k.b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Jd
    @NonNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C4834ff g(@NonNull String str) {
        return (C4834ff) d(new Cif(str, null).b);
    }

    @NonNull
    public final C4834ff a(@NonNull C4881ha c4881ha) {
        String str = w.b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c4881ha.a).put(CommonConstant.RETKEY.STATUS, c4881ha.b.getValue()).putOpt("ERROR_EXPLANATION", c4881ha.c);
        } catch (Throwable unused) {
        }
        return (C4834ff) b(str, jSONObject.toString());
    }

    public final void a(@Nullable ScreenInfo screenInfo) {
        b(u.b, AbstractC5166sb.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(x.b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4834ff a(String str, IdentifiersResult identifiersResult) {
        String jSONObject;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ID", identifiersResult.id).put(CommonConstant.RETKEY.STATUS, identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject2.toString();
            } catch (Throwable unused2) {
            }
            if (jSONObject != null) {
                b(str, jSONObject);
            }
            return this;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return this;
    }
}
