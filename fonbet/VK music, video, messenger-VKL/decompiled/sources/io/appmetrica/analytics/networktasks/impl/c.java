package io.appmetrica.analytics.networktasks.impl;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;

/* loaded from: classes8.dex */
public final class c {
    public final String a;

    public c(String str) {
        this.a = a(str);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Uri parse = Uri.parse(str);
        return "http".equals(parse.getScheme()) ? parse.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build().toString() : str;
    }
}
