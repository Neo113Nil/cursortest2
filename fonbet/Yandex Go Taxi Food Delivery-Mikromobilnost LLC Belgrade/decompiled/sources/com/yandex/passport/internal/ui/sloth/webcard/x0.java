package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class x0 {
    public float a;
    public int b;
    public int c;
    public int d;
    public WebCardSlothUi$WebCardPosition e;

    public x0(float f, int i, int i2, int i3, WebCardSlothUi$WebCardPosition webCardSlothUi$WebCardPosition) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = webCardSlothUi$WebCardPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Float.compare(this.a, x0Var.a) == 0 && this.b == x0Var.b && this.c == x0Var.c && this.d == x0Var.d && this.e == x0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ViewState(cornerRadius=" + this.a + ", hMargins=" + this.b + ", vMargins=" + this.c + ", height=" + this.d + ", vBias=" + this.e + ')';
    }
}
