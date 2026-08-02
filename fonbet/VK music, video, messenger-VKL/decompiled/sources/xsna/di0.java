package xsna;

import com.vk.superapp.advertisement.api.dto.FullscreenAdFormat;

/* compiled from: AdSlot.kt */
/* loaded from: classes6.dex */
public final class di0 {
    public final int a;
    public final FullscreenAdFormat b;
    public final String c;

    public di0(int i, FullscreenAdFormat fullscreenAdFormat, String str) {
        this.a = i;
        this.b = fullscreenAdFormat;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di0)) {
            return false;
        }
        di0 di0Var = (di0) obj;
        return this.a == di0Var.a && this.b == di0Var.b && epx.f(this.c, di0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSlot(slotId=");
        sb.append(this.a);
        sb.append(", adFormat=");
        sb.append(this.b);
        sb.append(", tag=");
        return ho8.a(sb, this.c, ')');
    }
}
