package ru.rustore.sdk.review.model;

import android.os.Bundle;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class ReviewInfo {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_APP_DESCRIPTION = "KEY_APP_DESCRIPTION";

    @Deprecated
    public static final String KEY_APP_ICON_URL = "KEY_APP_ICON_URL";

    @Deprecated
    public static final String KEY_APP_NAME = "KEY_APP_NAME";

    @Deprecated
    public static final String KEY_SESSION_ID = "KEY_SESSION_ID";
    private final String appDescription;
    private final String appIconUrl;
    private final String appName;
    private final String sessionId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }
    }

    public ReviewInfo(Bundle bundle) {
        this.sessionId = getStringOrEmpty(bundle, KEY_SESSION_ID);
        this.appName = getStringOrEmpty(bundle, KEY_APP_NAME);
        this.appDescription = getStringOrEmpty(bundle, KEY_APP_DESCRIPTION);
        this.appIconUrl = getStringOrEmpty(bundle, KEY_APP_ICON_URL);
    }

    private final String getStringOrEmpty(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? "" : string;
    }

    public final Bundle toBundle$sdk_public_review_release() {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_SESSION_ID, this.sessionId);
        bundle.putString(KEY_APP_NAME, this.appName);
        bundle.putString(KEY_APP_DESCRIPTION, this.appDescription);
        bundle.putString(KEY_APP_ICON_URL, this.appIconUrl);
        return bundle;
    }
}
