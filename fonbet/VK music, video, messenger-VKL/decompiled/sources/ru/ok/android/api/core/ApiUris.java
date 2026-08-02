package ru.ok.android.api.core;

import android.net.Uri;
import io.jsonwebtoken.JwtParser;
import xsna.brm0;
import xsna.i6n0;

/* compiled from: ApiUris.kt */
/* loaded from: classes9.dex */
public final class ApiUris {
    public static final String AUTHORITY_API = "api";
    private static final String METHOD_URI_BASE = "ok://api/api/";
    public static final String SCHEME_OK = "ok";
    public static final ApiUris INSTANCE = new ApiUris();
    private static final Uri HTTP_URI_API_DEFAULT = Uri.parse("https://api.ok.ru");

    private ApiUris() {
    }

    public static final Uri methodUri(String str) {
        return Uri.parse(METHOD_URI_BASE + str.replace(JwtParser.SEPARATOR_CHAR, '/'));
    }

    public static final String parseMethod(Uri uri) {
        String uri2 = uri.toString();
        if (brm0.B(uri2, METHOD_URI_BASE, false)) {
            return uri2.substring(13).replace('/', JwtParser.SEPARATOR_CHAR);
        }
        throw new IllegalArgumentException(i6n0.a(uri, "Unknown uri "));
    }

    public final Uri getHTTP_URI_API_DEFAULT() {
        return HTTP_URI_API_DEFAULT;
    }
}
