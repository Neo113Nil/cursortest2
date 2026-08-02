package xsna;

import com.vk.dto.common.Image;

/* compiled from: AudioRestrictionInfo.kt */
/* loaded from: classes3.dex */
public final class lw4 {
    public final int a;
    public final String b;
    public final String c;
    public final Image d;
    public final fw4 e;

    public lw4(int i, String str, String str2, Image image, fw4 fw4Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = image;
        this.e = fw4Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw4)) {
            return false;
        }
        lw4 lw4Var = (lw4) obj;
        return this.a == lw4Var.a && epx.f(this.b, lw4Var.b) && epx.f(this.c, lw4Var.c) && epx.f(this.d, lw4Var.d) && epx.f(this.e, lw4Var.e);
    }

    public final int hashCode() {
        int b = fq.b(this.d, urd0.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        fw4 fw4Var = this.e;
        return b + (fw4Var == null ? 0 : fw4Var.hashCode());
    }

    public final String toString() {
        return "AudioRestrictionInfo(restrictionId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", image=" + this.d + ", button=" + this.e + ')';
    }
}
