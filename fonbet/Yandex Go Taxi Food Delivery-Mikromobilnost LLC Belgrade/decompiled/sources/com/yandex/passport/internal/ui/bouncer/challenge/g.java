package com.yandex.passport.internal.ui.bouncer.challenge;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.ui.challenge.v;
import defpackage.ins0;
import defpackage.shd;
import defpackage.yv5;

/* loaded from: classes2.dex */
public final class g extends ins0 implements yv5 {
    public final ProgressPropertiesImpl D;
    public final ComposeView E;

    static {
        shd shdVar = ComposeView.Companion;
    }

    public g(Activity activity, ProgressPropertiesImpl progressPropertiesImpl) {
        this.D = progressPropertiesImpl;
        this.E = new ComposeView(activity, null, 0, 6, null);
    }

    @Override // defpackage.yv5
    public final void c(Object obj) {
        this.E.setContent(new androidx.compose.runtime.internal.a(-1168384356, new f((v) obj, this, 1), true));
    }

    @Override // defpackage.ins0
    public final View e() {
        return this.E;
    }
}
