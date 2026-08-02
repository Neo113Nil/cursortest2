package com.lightside.animations;

import android.view.View;
import defpackage.ak2;
import defpackage.gum;
import defpackage.tls;

/* loaded from: classes2.dex */
public final class a {
    public final View a;
    public final tls b;

    public a(View view, tls tlsVar) {
        this.a = view;
        this.b = tlsVar;
    }

    public final void a(float f, float f2) {
        ((DslAnimatorBuilder$targets$1) this.b).invoke(new ak2(new gum(f, f2, 1, this)));
    }
}
