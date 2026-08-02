package defpackage;

import com.yandex.plus.core.data.common.PlusColor;

/* loaded from: classes2.dex */
public final class edg {
    public final PlusColor a;
    public final int b;

    public edg(PlusColor plusColor, int i) {
        this.a = plusColor;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edg)) {
            return false;
        }
        edg edgVar = (edg) obj;
        return jl40.l(this.a, edgVar.a) && this.b == edgVar.b;
    }

    public final int hashCode() {
        PlusColor plusColor = this.a;
        return Integer.hashCode(this.b) + ((plusColor == null ? 0 : plusColor.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundProperties(plusColor=");
        sb.append(this.a);
        sb.append(", defaultColorInt=");
        return oyr.s(sb, this.b, ')');
    }
}
