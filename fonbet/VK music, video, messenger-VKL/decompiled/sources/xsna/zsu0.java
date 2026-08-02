package xsna;

import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: VkExternalAuthUriBuilder.kt */
/* loaded from: classes15.dex */
public final class zsu0 {
    public static final Regex g = new Regex("vk(\\d+)");
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;

    /* compiled from: VkExternalAuthUriBuilder.kt */
    public static final class a {
        public static boolean a(Uri uri) {
            String authority;
            String scheme = uri.getScheme();
            return (scheme == null || brm0.B(scheme, "http", false) || (authority = uri.getAuthority()) == null || (!authority.equals("vkcexternalauth-codeflow") && !authority.equals("vkcexternalauth"))) ? false : true;
        }
    }

    public final Uri a(String str) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            if (!e43.l(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "redirect_uri", "uuid", "action").contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            q2z.a(str2, parse.getQueryParameter(str2), arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(pn00.s(arrayList2));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.clearQuery();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String str3 = this.b;
        if (str3 == null) {
            str3 = null;
        }
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("redirect_uri", str3);
        String str4 = this.a;
        if (str4 == null) {
            str4 = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("uuid", str4);
        if (!this.e) {
            appendQueryParameter2.appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "silent_token");
        }
        if (this.e) {
            appendQueryParameter2.appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "code");
            String str5 = this.c;
            if (str5 == null) {
                str5 = null;
            }
            appendQueryParameter2.appendQueryParameter("state", str5);
            String str6 = this.d;
            appendQueryParameter2.appendQueryParameter("code_challenge", str6 != null ? str6 : null);
            appendQueryParameter2.appendQueryParameter("code_challenge_method", "sha256");
        }
        String str7 = this.f;
        if (str7 != null) {
            buildUpon.appendQueryParameter("action", str7);
        }
        return buildUpon.build();
    }
}
