package com.yandex.passport.internal.ui.sloth.webauthn;

import android.app.Activity;

/* loaded from: classes2.dex */
public interface b {
    c build();

    b setActivity(Activity activity);

    b setProgressProperties(com.yandex.passport.common.ui.progress.g gVar);

    b setProperties(RegisterWebAuthNProperties registerWebAuthNProperties);
}
