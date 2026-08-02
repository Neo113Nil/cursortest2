package com.yandex.passport.internal.properties;

import android.os.Bundle;
import defpackage.ny61;
import defpackage.oo31;

/* loaded from: classes2.dex */
public final class t {
    public static SocialApplicationBindProperties a(Bundle bundle) {
        SocialApplicationBindProperties socialApplicationBindProperties = (SocialApplicationBindProperties) oo31.e(bundle, com.yandex.passport.internal.util.p.class, "passport-application-bind-properties");
        if (socialApplicationBindProperties != null) {
            return socialApplicationBindProperties;
        }
        ny61.r("Bundle has no SocialApplicationBindProperties");
        return null;
    }
}
