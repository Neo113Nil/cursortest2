package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.ok.android.sdk.SharedKt;
import xsna.xhr0;

/* compiled from: QueryStringGenerator.kt */
/* loaded from: classes.dex */
public final class kpe0 {
    public static final kpe0 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final zqo0 c;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(kpe0.class, "strBuilder", "getStrBuilder()Ljava/lang/StringBuilder;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new kpe0();
        c = new zqo0(new wa3(12));
    }

    public static String a(kpe0 kpe0Var, Map map, String str, String str2, int i, Map map2, Collection collection, int i2) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            i = 0;
        }
        int i3 = i;
        Map map3 = (i2 & 16) != 0 ? jgp.b : map2;
        Collection collection2 = (i2 & 64) != 0 ? EmptySet.b : collection;
        kpe0Var.getClass();
        return b("", map, str, str3, null, i3, map3, false, collection2, false);
    }

    public static String b(String str, Map map, String str2, String str3, String str4, int i, Map map2, boolean z, Collection collection, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("v", str2);
        linkedHashMap.put(HttpRequest.DEFAULT_SCHEME, "1");
        if (z) {
            linkedHashMap.put("access_tokens", j5g.g0(collection, StringUtils.COMMA, null, null, 0, null, 62));
        } else if (str3 != null && !drm0.N(str3) && !z2) {
            linkedHashMap.put(SharedKt.PARAM_ACCESS_TOKEN, str3);
        } else if (i != 0) {
            linkedHashMap.put("api_id", String.valueOf(i));
        }
        return e(str, linkedHashMap, str4, map2);
    }

    public static String c(kpe0 kpe0Var, String str, Map map, String str2, String str3, String str4, int i, boolean z, Collection collection, boolean z2, int i2) {
        if ((i2 & 128) != 0) {
            z = false;
        }
        if ((i2 & 256) != 0) {
            collection = EmptySet.b;
        }
        if ((i2 & 512) != 0) {
            z2 = false;
        }
        kpe0Var.getClass();
        return b(str, map, str2, str3, str4, i, jgp.b, z, collection, z2);
    }

    public static String e(String str, LinkedHashMap linkedHashMap, String str2, Map map) {
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!epx.f(entry.getKey(), "sig")) {
                builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            String str3 = (String) entry2.getKey();
            Iterator it = ((List) entry2.getValue()).iterator();
            while (it.hasNext()) {
                builder.appendQueryParameter(str3 + "[]", (String) it.next());
            }
        }
        Uri build = builder.build();
        if (str2 == null || str2.length() == 0) {
            String encodedQuery = build.getEncodedQuery();
            if (encodedQuery != null) {
                return encodedQuery;
            }
        } else {
            String query = build.getQuery();
            f().setLength(0);
            StringBuilder f = f();
            f.append(str);
            f.append('?');
            if (query != null && !drm0.N(query)) {
                f().append(query);
            }
            f().append(str2);
            String encodedQuery2 = build.buildUpon().appendQueryParameter("sig", xhr0.a.a(f().toString())).build().getEncodedQuery();
            if (encodedQuery2 != null) {
                return encodedQuery2;
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StringBuilder f() {
        qcy<Object> qcyVar = b[0];
        return (StringBuilder) c.b.get();
    }

    public final String d(String str, Map<String, String> map, String str2, String str3, String str4, int i, boolean z, Collection<String> collection, boolean z2) {
        return c(this, "/method/".concat(str), map, str2, str3, str4, i, z, collection, z2, 64);
    }
}
