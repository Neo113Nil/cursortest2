package com.yandex.passport.sloth;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class w0 {
    public static final List a = Collections.singletonList("track_id");

    public static final String a(String str) {
        Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
        List list = a;
        if (Collections.disjoint(queryParameterNames, list)) {
            return str;
        }
        Uri.Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!list.contains(str2)) {
                clearQuery.appendQueryParameter(str2, Uri.parse(str).getQueryParameter(str2));
            }
        }
        com.yandex.passport.common.url.a aVar = com.yandex.passport.common.url.b.Companion;
        Uri build = clearQuery.build();
        aVar.getClass();
        return build.toString();
    }
}
