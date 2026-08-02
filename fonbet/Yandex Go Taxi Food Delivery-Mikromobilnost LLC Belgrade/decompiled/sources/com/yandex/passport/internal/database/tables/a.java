package com.yandex.passport.internal.database.tables;

import com.yandex.passport.internal.ui.webview.WebViewActivity;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public abstract class a {
    public static final String[] a = {"uid", ClidProvider.TIMESTAMP, "last_action", "local_timestamp"};
    public static final String[] b = {"name", "master_token_value", "uid", "user_info_body", "user_info_meta", "stash_body", "legacy_account_type", "legacy_affinity", "legacy_extra_data_body", "secure_blob"};
    public static final String[] c = {"uid", WebViewActivity.KEY_ENVIRONMENT};
}
