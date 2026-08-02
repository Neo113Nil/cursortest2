package xsna;

import com.vk.clips.editor.aspectratio.impl.FormatAspectRatio;

/* compiled from: AspectRatioButton.kt */
/* loaded from: classes16.dex */
public final class qu3 {
    public final FormatAspectRatio a;
    public final int b;
    public final String c;
    public boolean d;

    public qu3(FormatAspectRatio formatAspectRatio, int i, String str, boolean z) {
        this.a = formatAspectRatio;
        this.b = i;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu3)) {
            return false;
        }
        qu3 qu3Var = (qu3) obj;
        return this.a == qu3Var.a && this.b == qu3Var.b && epx.f(this.c, qu3Var.c) && this.d == qu3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AspectRatioButton(id=");
        sb.append(this.a);
        sb.append(", iconRes=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
