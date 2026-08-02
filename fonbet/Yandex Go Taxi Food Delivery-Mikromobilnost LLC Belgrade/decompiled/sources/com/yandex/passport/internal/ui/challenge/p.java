package com.yandex.passport.internal.ui.challenge;

import android.app.Activity;
import android.view.View;
import com.lightside.slab.SlotView;
import defpackage.rs11;

/* loaded from: classes2.dex */
public final class p implements rs11 {
    public final com.lightside.slab.c a;

    public p(Activity activity) {
        this.a = new com.lightside.slab.c(new SlotView(activity, null, 0, 0, 14, null));
    }

    @Override // defpackage.rs11
    public final View getRoot() {
        return this.a.a;
    }
}
