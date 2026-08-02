package com.yandex.passport.internal.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.chip.Chip;
import defpackage.jl40;
import defpackage.xys;

/* loaded from: classes11.dex */
public final class a extends xys {
    public final Chip b;

    public a(Chip chip) {
        this.b = chip;
    }

    @Override // defpackage.xys
    public final void a(Drawable drawable) {
        this.b.setChipIcon(drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return jl40.l(this.b, ((a) obj).b);
        }
        return false;
    }

    @Override // defpackage.nv31
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.xys, defpackage.qy01
    public final Drawable n() {
        return this.b.getChipIcon();
    }
}
