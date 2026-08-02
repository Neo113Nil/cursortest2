package com.ybsdk.feature.about.internal.presentation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import defpackage.d4;
import defpackage.ddf;
import defpackage.ds31;
import defpackage.e5;
import defpackage.g5;
import defpackage.h791;
import defpackage.i5z0;
import defpackage.m5;
import defpackage.m6;
import defpackage.tje;
import defpackage.uc5;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final Context B;
    public final g5 C;
    public final ddf D;
    public int E;
    public long F;

    public b(Context context, g5 g5Var, ddf ddfVar, e5 e5Var) {
        super(new d4(2, e5Var), new m6(0, e5Var));
        this.B = context;
        this.C = g5Var;
        this.D = ddfVar;
    }

    public final void b0(m5 m5Var) {
        h791.e(this.C.a, m5Var.b, false, null, 14);
    }

    public final void c0(Drawable drawable) {
        if (drawable != null) {
            com.ybsdk.core.utils.ext.a.h(drawable);
        }
        i5z0.a.a("Coin Image Clicked", new Object[0]);
        tje.N(ds31.a(this), null, null, new AboutViewModel$onImageCoinClick$1(this, null), 3);
    }
}
