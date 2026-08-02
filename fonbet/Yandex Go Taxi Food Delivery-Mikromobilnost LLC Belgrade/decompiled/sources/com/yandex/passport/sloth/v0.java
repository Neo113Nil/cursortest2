package com.yandex.passport.sloth;

import android.net.Uri;
import android.net.http.SslError;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class v0 {
    public final SlothMetricaEvent$Event a;
    public final Map b;

    public v0(SlothMetricaEvent$Event slothMetricaEvent$Event, Map map) {
        this.a = slothMetricaEvent$Event;
        this.b = map;
    }

    public static Map a(SslError sslError) {
        String str = "";
        Uri parse = Uri.parse(sslError.getUrl());
        try {
            String scheme = parse.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            String authority = parse.getAuthority();
            if (authority == null) {
                authority = "";
            }
            String path = parse.getPath();
            if (path == null) {
                path = "";
            }
            str = String.format("%s://%s%s", Arrays.copyOf(new Object[]{scheme, authority, path}, 3));
        } catch (Exception unused) {
        }
        return kotlin.collections.b.i(new Pair("primary_error", String.valueOf(sslError.getPrimaryError())), new Pair("safe_url", str), new Pair("certificate", sslError.getCertificate().toString()));
    }

    public /* synthetic */ v0(SlothMetricaEvent$Event slothMetricaEvent$Event) {
        this(slothMetricaEvent$Event, kotlin.collections.b.f());
    }
}
