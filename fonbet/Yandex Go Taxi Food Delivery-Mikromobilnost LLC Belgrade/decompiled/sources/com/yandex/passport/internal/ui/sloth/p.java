package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;
import com.yandex.passport.sloth.ui.SlothUiWish;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class p implements com.yandex.passport.sloth.ui.dependencies.q {
    public final Activity a;

    public p(Activity activity) {
        this.a = activity;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(SlothUiWish slothUiWish) {
        int i = o.a[slothUiWish.ordinal()];
        Activity activity = this.a;
        if (i == 1 || i == 2) {
            activity.finish();
        } else if (i != 3) {
            w511.b();
        } else {
            activity.setResult(17121);
            activity.finish();
        }
    }
}
