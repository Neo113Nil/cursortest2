package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;
import com.yandex.passport.sloth.data.SlothParams;

/* loaded from: classes2.dex */
public interface s {
    s activity(Activity activity);

    t build();

    s params(SlothParams slothParams);

    s progressProperties(com.yandex.passport.common.ui.progress.g gVar);
}
