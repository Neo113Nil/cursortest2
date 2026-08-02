package com.yandex.passport.internal.ui.bouncer.loading;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.p;

/* loaded from: classes2.dex */
public final class g extends e {
    public final View z;

    public g(Activity activity, ProgressPropertiesImpl progressPropertiesImpl, p pVar) {
        super(activity, progressPropertiesImpl, pVar);
        this.z = com.yandex.passport.common.ui.b.a(this, activity, progressPropertiesImpl, pVar.w, 0.0f, true);
    }

    @Override // defpackage.t2y
    public final void a(View view) {
        ((LinearLayout) view).setBackgroundResource(R.drawable.passport_background_main);
    }

    @Override // com.yandex.passport.internal.ui.bouncer.loading.e, com.yandex.passport.internal.ui.bouncer.loading.a
    public final View getProgress() {
        return this.z;
    }
}
