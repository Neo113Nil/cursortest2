package com.yandex.passport.internal.properties;

import android.os.Bundle;
import defpackage.ny61;
import defpackage.oo31;

/* loaded from: classes2.dex */
public final class v {
    public static SocialBindProperties a(Bundle bundle) {
        SocialBindProperties socialBindProperties = (SocialBindProperties) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-bind-properties");
        if (socialBindProperties != null) {
            return socialBindProperties;
        }
        ny61.r("Bundle has no SocialBindProperties");
        return null;
    }
}
