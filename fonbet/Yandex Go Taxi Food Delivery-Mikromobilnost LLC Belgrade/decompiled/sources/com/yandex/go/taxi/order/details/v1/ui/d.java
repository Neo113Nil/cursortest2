package com.yandex.go.taxi.order.details.v1.ui;

import android.graphics.drawable.Drawable;
import defpackage.jl40;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class d extends f {
    public final Drawable a;

    public d(Drawable drawable) {
        this.a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && jl40.l(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return 0;
        }
        return drawable.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + Extension.C_BRAKE;
    }
}
