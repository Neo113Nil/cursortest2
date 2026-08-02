package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.log.L;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;

/* compiled from: VkAccessToken.kt */
/* loaded from: classes15.dex */
public final class v6u0 {
    public final long a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;
    public final long f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final AccountProfileType k;
    public final String l;
    public final UtilityTokens m;

    /* compiled from: VkAccessToken.kt */
    public static final class a {
        public static v6u0 a(String str) {
            if (str != null && str.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    HashMap hashMap = new HashMap();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!jSONObject.isNull(next)) {
                            hashMap.put(next, jSONObject.getString(next));
                        }
                    }
                    if (hashMap.containsKey(SharedKt.PARAM_ACCESS_TOKEN) && hashMap.containsKey("user_id") && hashMap.containsKey("secret")) {
                        return new v6u0(hashMap);
                    }
                } catch (JSONException e) {
                    L.g("Failed to parse token json", e);
                }
            }
            return null;
        }
    }

    public v6u0(long j, String str, String str2, boolean z, int i, long j2, String str3, String str4, int i2, int i3, AccountProfileType accountProfileType, String str5, UtilityTokens utilityTokens) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = i;
        this.f = j2;
        this.g = str3;
        this.h = str4;
        this.i = i2;
        this.j = i3;
        this.k = accountProfileType;
        this.l = str5;
        this.m = utilityTokens;
    }

    public static v6u0 a(v6u0 v6u0Var, long j, String str, String str2, int i, long j2, UtilityTokens utilityTokens, int i2) {
        return new v6u0((i2 & 1) != 0 ? v6u0Var.a : j, (i2 & 2) != 0 ? v6u0Var.b : str, (i2 & 4) != 0 ? v6u0Var.c : str2, v6u0Var.d, (i2 & 16) != 0 ? v6u0Var.e : i, (i2 & 32) != 0 ? v6u0Var.f : j2, v6u0Var.g, v6u0Var.h, v6u0Var.i, v6u0Var.j, v6u0Var.k, v6u0Var.l, (i2 & 4096) != 0 ? v6u0Var.m : utilityTokens);
    }

    public final long b() {
        return this.a;
    }

    public final String c() {
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap d = d();
            for (String str : d.keySet()) {
                jSONObject.put(str, d.get(str));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new IllegalArgumentException("Failed to serialize token", e);
        }
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap(15);
        hashMap.put(SharedKt.PARAM_ACCESS_TOKEN, this.b);
        hashMap.put("secret", this.c);
        hashMap.put("https_required", this.d ? "1" : "0");
        hashMap.put("created", String.valueOf(this.f));
        hashMap.put(SharedKt.PARAM_EXPIRES_IN, String.valueOf(this.e));
        hashMap.put("user_id", String.valueOf(this.a));
        hashMap.put("webview_access_token", this.g);
        hashMap.put("webview_refresh_token", this.h);
        hashMap.put("webview_access_token_expires_in", String.valueOf(this.i));
        hashMap.put("webview_refresh_token_expires_in", String.valueOf(this.j));
        hashMap.put("profile_type", String.valueOf(this.k.h()));
        hashMap.put("username", this.l);
        hashMap.put("utility_tokens", this.m.d().toString());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6u0)) {
            return false;
        }
        v6u0 v6u0Var = (v6u0) obj;
        return this.a == v6u0Var.a && epx.f(this.b, v6u0Var.b) && epx.f(this.c, v6u0Var.c) && this.d == v6u0Var.d && this.e == v6u0Var.e && this.f == v6u0Var.f && epx.f(this.g, v6u0Var.g) && epx.f(this.h, v6u0Var.h) && this.i == v6u0Var.i && this.j == v6u0Var.j && this.k == v6u0Var.k && epx.f(this.l, v6u0Var.l) && epx.f(this.m, v6u0Var.m);
    }

    public final int hashCode() {
        return this.m.b.hashCode() + urd0.a((this.k.hashCode() + shy.a(this.j, shy.a(this.i, urd0.a(urd0.a(bh10.a(shy.a(this.e, qoy.b(urd0.a(urd0.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31), 31)) * 31, 31, this.l);
    }

    public final String toString() {
        return "VkAccessToken(userId=" + this.a + ", accessToken=" + this.b + ", secret=" + this.c + ", httpsRequired=" + this.d + ", expiresInSec=" + this.e + ", createdMs=" + this.f + ", webviewAccessToken=" + this.g + ", webviewRefreshToken=" + this.h + ", webviewExpired=" + this.i + ", webviewRefreshTokenExpired=" + this.j + ", profileType=" + this.k + ", username=" + this.l + ", utilityTokens=" + this.m + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v6u0(Map<String, String> map) {
        this(r3, r5, "qVxWRF1CwHERuIrKBnqe", r7, r8, r9, r11, r12, r1, r14, r15, r16, r0);
        AccountProfileType accountProfileType;
        UtilityTokens utilityTokens;
        Integer m;
        Integer m2;
        Integer m3;
        Long n;
        long parseLong = Long.parseLong(map.get("user_id"));
        String str = map.get(SharedKt.PARAM_ACCESS_TOKEN);
        boolean equals = "1".equals(map.get("https_required"));
        String str2 = map.get("created");
        long currentTimeMillis = (str2 == null || (n = arm0.n(str2)) == null) ? System.currentTimeMillis() : n.longValue();
        String str3 = map.get(SharedKt.PARAM_EXPIRES_IN);
        int intValue = (str3 == null || (m3 = arm0.m(10, str3)) == null) ? -1 : m3.intValue();
        String str4 = map.get("webview_access_token");
        String str5 = str4 == null ? "" : str4;
        String str6 = map.get("webview_refresh_token");
        String str7 = str6 == null ? "" : str6;
        String str8 = map.get("webview_access_token_expires_in");
        int intValue2 = (str8 == null || (m2 = arm0.m(10, str8)) == null) ? 0 : m2.intValue();
        int parseInt = map.containsKey("webview_refresh_token_expires_in") ? Integer.parseInt(map.get("webview_refresh_token_expires_in")) : 0;
        String str9 = map.get("profile_type");
        if (str9 != null && (m = arm0.m(10, str9)) != null) {
            AccountProfileType.Companion.getClass();
            accountProfileType = AccountProfileType.a.a(m);
        }
        accountProfileType = AccountProfileType.NORMAL;
        AccountProfileType accountProfileType2 = accountProfileType;
        String str10 = map.get("username");
        String str11 = str10 == null ? "" : str10;
        String str12 = map.get("utility_tokens");
        if (str12 != null) {
            str12 = drm0.N(str12) ? null : str12;
            if (str12 != null) {
                UtilityTokens.a aVar = UtilityTokens.CREATOR;
                JSONObject jSONObject = new JSONObject(str12);
                aVar.getClass();
                utilityTokens = UtilityTokens.a.a(jSONObject);
            }
        }
        utilityTokens = new UtilityTokens(EmptyList.b);
    }
}
