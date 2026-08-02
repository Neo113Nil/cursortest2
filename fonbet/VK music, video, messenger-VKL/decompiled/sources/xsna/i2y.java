package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: JsAuthDelegate.kt */
/* loaded from: classes6.dex */
public final class i2y {
    public final x6y a;

    /* compiled from: JsAuthDelegate.kt */
    public static final class a {
        public final yfx0 a;
        public final ztz b;

        public a(yfx0 yfx0Var, ztz ztzVar) {
            this.a = yfx0Var;
            this.b = ztzVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ztz ztzVar = this.b;
            return hashCode + (ztzVar == null ? 0 : ztzVar.hashCode());
        }

        public final String toString() {
            return "ZippedTokenResult(token=" + this.a + ", localToken=" + this.b + ')';
        }
    }

    public i2y(x6y x6yVar, awz awzVar) {
        this.a = x6yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.vk.superapp.browser.internal.bridges.JsApiMethodType] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    public final Pair a(JsApiMethodType jsApiMethodType, String str) {
        x6y x6yVar = this.a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            List c0 = drm0.c0(jSONObject.optString(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL), new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                arrayList.add(drm0.p0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!drm0.N((String) next)) {
                    arrayList2.add(next);
                }
            }
            try {
                if (!jSONObject.has("app_id")) {
                    bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                    return null;
                }
                long j = jSONObject.getLong("app_id");
                fvv0 M = x6yVar.M();
                long appId = M != null ? M.getAppId() : 0L;
                if (appId <= 0 || appId == j) {
                    return new Pair(Long.valueOf(j), arrayList2);
                }
                bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                return null;
            } catch (JSONException unused) {
                jsApiMethodType = "app_id";
                bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                return null;
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final void b(JsApiMethodType jsApiMethodType, String str) {
        x6y x6yVar = this.a;
        JsApiMethodType jsApiMethodType2 = "group_id";
        try {
            JSONObject jSONObject = new JSONObject(str);
            Pair a2 = a(jsApiMethodType, str);
            if (a2 == null) {
                return;
            }
            long longValue = ((Number) a2.d()).longValue();
            List list = (List) a2.g();
            try {
                if (!jSONObject.has("group_id")) {
                    bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                    return;
                }
                try {
                    long j = jSONObject.getLong("group_id");
                    Long valueOf = Long.valueOf(j);
                    if (j < 0) {
                        bex0.a.a(x6yVar, jsApiMethodType, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                    } else {
                        qro0.c(new e2y(longValue, jsApiMethodType, valueOf, list, this, false, jSONObject.optBoolean("append_local")));
                    }
                } catch (JSONException unused) {
                    jsApiMethodType2 = jsApiMethodType;
                    bex0.a.a(x6yVar, jsApiMethodType2, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                }
            } catch (JSONException unused2) {
            }
        } catch (JSONException unused3) {
            jsApiMethodType2 = jsApiMethodType;
        }
    }
}
