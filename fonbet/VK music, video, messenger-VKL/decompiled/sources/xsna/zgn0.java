package xsna;

import android.widget.ImageView;

/* compiled from: SuperappLottieBridge.kt */
/* loaded from: classes6.dex */
public final class zgn0 {
    public final String a;
    public final ImageView.ScaleType b;

    public zgn0(String str, ImageView.ScaleType scaleType) {
        this.a = str;
        this.b = scaleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgn0)) {
            return false;
        }
        zgn0 zgn0Var = (zgn0) obj;
        return epx.f(this.a, zgn0Var.a) && this.b == zgn0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewParams(url=" + this.a + ", scaleType=" + this.b + ')';
    }
}
