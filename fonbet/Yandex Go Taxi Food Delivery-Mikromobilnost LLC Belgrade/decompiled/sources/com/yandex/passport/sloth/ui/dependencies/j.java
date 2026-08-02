package com.yandex.passport.sloth.ui.dependencies;

import defpackage.oyr;

/* loaded from: classes2.dex */
public final class j implements l {
    public final int a;
    public final int b;

    public j(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.l
    public final k toSize() {
        return new k(this.a, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Custom(widthPx=");
        sb.append(this.a);
        sb.append(", heightPx=");
        return oyr.s(sb, this.b, ')');
    }
}
