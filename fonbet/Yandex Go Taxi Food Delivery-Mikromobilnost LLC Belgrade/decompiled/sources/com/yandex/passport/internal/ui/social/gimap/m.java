package com.yandex.passport.internal.ui.social.gimap;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.auth.LegacyAccountType;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m {
    public static GimapServerSettings a() {
        return new GimapServerSettings(null, null, null, null, null);
    }

    public static GimapServerSettings b(JSONObject jSONObject) {
        return new GimapServerSettings(jSONObject.getString(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), jSONObject.getString(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), Boolean.valueOf(jSONObject.getBoolean("ssl")), jSONObject.getString(LegacyAccountType.STRING_LOGIN), null);
    }
}
