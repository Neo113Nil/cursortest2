package com.yandex.passport.internal.ui.sloth.ebs;

import android.app.Activity;

/* loaded from: classes2.dex */
public interface c {
    d build();

    c setActivity(Activity activity);

    c setProgressProperties(com.yandex.passport.common.ui.progress.g gVar);

    c setProperties(BiometricVerificationProperties biometricVerificationProperties);
}
