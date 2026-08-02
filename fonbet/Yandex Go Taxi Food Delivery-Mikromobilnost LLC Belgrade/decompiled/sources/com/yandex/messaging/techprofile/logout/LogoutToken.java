package com.yandex.messaging.techprofile.logout;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.squareup.moshi.Json;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;

/* loaded from: classes15.dex */
public class LogoutToken {

    @Json(name = URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)
    public String host;

    @Json(name = AuthSdkActivity.RESPONSE_TYPE_TOKEN)
    public String token;
}
