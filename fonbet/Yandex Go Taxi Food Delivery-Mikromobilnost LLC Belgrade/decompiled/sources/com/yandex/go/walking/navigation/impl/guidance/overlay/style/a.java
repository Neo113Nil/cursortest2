package com.yandex.go.walking.navigation.impl.guidance.overlay.style;

import android.content.Context;
import defpackage.el00;
import defpackage.j24;
import defpackage.kok0;
import defpackage.t35;

/* loaded from: classes14.dex */
public final class a extends t35 {
    public final el00 d;
    public final kok0 e;

    public a(el00 el00Var, Context context) {
        kok0 kok0Var = new kok0(context, 18);
        this.d = el00Var;
        this.e = kok0Var;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        this.d.f(true, new WalkNavNavigationStyleProviderHolder$requestCreation$1(j24Var, this, null));
    }
}
