package ru.ok.android.api.core;

import android.net.Uri;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.epx;

/* compiled from: ApiRequests.kt */
/* loaded from: classes9.dex */
public final class ApiRequests {
    public static final String extractLogTag(ApiRequest apiRequest) {
        if (!(apiRequest instanceof BatchApiRequest)) {
            return extractShortLogTag(apiRequest);
        }
        String id = ((BatchApiRequest) apiRequest).getId();
        return id != null ? "batch.executeV2-".concat(id) : BatchApiRequest.METHOD_NAME;
    }

    public static final String extractShortLogTag(ApiRequest apiRequest) {
        Uri uri = apiRequest.getUri();
        if (epx.f(uri.getScheme(), ApiUris.SCHEME_OK) && epx.f(uri.getAuthority(), "api")) {
            return ApiUris.parseMethod(uri);
        }
        String path = uri.getPath();
        return path == null ? "" : path;
    }
}
