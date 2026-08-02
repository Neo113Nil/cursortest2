package com.yandex.passport.internal.ui.sloth;

import android.app.Activity;
import com.yandex.passport.sloth.ui.SlothUiWish;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class f0 implements com.yandex.passport.sloth.ui.dependencies.q {
    public final Activity a;

    public f0(Activity activity) {
        this.a = activity;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(SlothUiWish slothUiWish) {
        int i = e0.a[slothUiWish.ordinal()];
        if (i == 1 || i == 2) {
            this.a.finish();
        } else {
            if (i == 3) {
                return;
            }
            w511.b();
        }
    }
}
