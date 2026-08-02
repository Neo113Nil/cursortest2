package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class h0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final WebCardMode e;

    public h0(int i, int i2, int i3, int i4, WebCardMode webCardMode) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = webCardMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a == h0Var.a && this.b == h0Var.b && this.c == h0Var.c && this.d == h0Var.d && this.e == h0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WebCardDisplayProperties(cornerRadius=" + this.a + ", hMargins=" + this.b + ", vMargins=" + this.c + ", height=" + this.d + ", mode=" + this.e + ')';
    }

    public h0() {
        this(0);
    }

    public /* synthetic */ h0(int i) {
        this(0, 0, 0, 0, WebCardMode.Fullscreen);
    }
}
