package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Yg extends AbstractC4733bh {
    public Yg(C4927j5 c4927j5) {
        super(c4927j5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        String value = c4722b6.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            Ho ho = this.a.t;
            synchronized (ho) {
                ho.c(ho.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            c4722b6.n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        Ho ho = this.a.t;
        synchronized (ho) {
            ho.a(ho.a() + 1);
        }
        this.a.z();
        Y8 y8 = this.a.l;
        if (y8.c == null) {
            y8.a();
        }
        C4699a9 c4699a9 = y8.c;
        c4699a9.getClass();
        c4699a9.b = new HashSet();
        c4699a9.d = 0;
        C4699a9 c4699a92 = y8.c;
        c4699a92.a = true;
        C4777d9 c4777d9 = y8.b;
        IBinaryDataHelper iBinaryDataHelper = c4777d9.c;
        C4751c9 c4751c9 = c4777d9.b;
        c4777d9.a.getClass();
        iBinaryDataHelper.insert("event_hashes", c4751c9.toByteArray((C4751c9) C4725b9.a(c4699a92)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C5309y2 c5309y2 = this.a.t().y;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c5309y2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C5309y2 c5309y2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c5309y2 == null) {
            return false;
        }
        for (Pair pair : c5309y2.a) {
            if (vo.a(pair.first, str) && ((obj = pair.second) == null || ((C5284x2) obj).a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
