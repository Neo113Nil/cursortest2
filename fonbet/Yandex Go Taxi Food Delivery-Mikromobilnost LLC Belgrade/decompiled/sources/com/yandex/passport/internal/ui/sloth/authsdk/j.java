package com.yandex.passport.internal.ui.sloth.authsdk;

import android.app.Activity;
import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public interface j {
    k build();

    j setActivity(Activity activity);

    j setProgressProperties(com.yandex.passport.common.ui.progress.g gVar);

    j setSlothParams(SlothParams slothParams);
}
