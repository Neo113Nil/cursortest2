package com.yandex.passport.internal.push;

import android.app.Application;
import defpackage.gs31;
import defpackage.hs31;
import defpackage.ny61;
import defpackage.y8f;
import defpackage.yr31;

/* loaded from: classes15.dex */
public final class n implements hs31 {
    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        Object a = y8fVar.a(gs31.x);
        if (a != null) {
            return new o(com.yandex.passport.internal.di.a.a().getNotificationHelper(), new com.yandex.passport.biometric.ui.verification.a(5, (Application) a));
        }
        ny61.r("Required value was null.");
        return null;
    }
}
