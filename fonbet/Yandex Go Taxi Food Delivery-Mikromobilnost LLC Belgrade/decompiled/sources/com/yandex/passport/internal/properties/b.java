package com.yandex.passport.internal.properties;

import android.os.Bundle;
import defpackage.ny61;
import defpackage.oo31;

/* loaded from: classes2.dex */
public final class b {
    public static AccountNotAuthorizedProperties a(Bundle bundle) {
        AccountNotAuthorizedProperties accountNotAuthorizedProperties = (AccountNotAuthorizedProperties) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "account-not-authorized-properties");
        if (accountNotAuthorizedProperties != null) {
            return accountNotAuthorizedProperties;
        }
        ny61.r("no account-not-authorized-properties key in bundle");
        return null;
    }
}
