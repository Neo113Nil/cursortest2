package com.yandex.passport.common.ui.progress;

import defpackage.oyr;

/* loaded from: classes8.dex */
public final class q implements u {
    public final int a;
    public final int b;

    public q(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Custom(widthPx=");
        sb.append(this.a);
        sb.append(", heightPx=");
        return oyr.s(sb, this.b, ')');
    }
}
