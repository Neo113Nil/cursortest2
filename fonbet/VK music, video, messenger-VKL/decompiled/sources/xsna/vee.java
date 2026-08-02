package xsna;

import com.vk.dto.common.ClipVideoFile;

/* compiled from: ClipsGridVideoEntry.kt */
/* loaded from: classes18.dex */
public final class vee implements nmv, jde {
    public final ClipVideoFile a;
    public final Integer b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public vee(ClipVideoFile clipVideoFile, Integer num, boolean z, String str, boolean z2, boolean z3) {
        this.a = clipVideoFile;
        this.b = num;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.f = z3;
    }

    public static vee b(vee veeVar, ClipVideoFile clipVideoFile) {
        Integer num = veeVar.b;
        boolean z = veeVar.c;
        String str = veeVar.d;
        boolean z2 = veeVar.e;
        boolean z3 = veeVar.f;
        veeVar.getClass();
        return new vee(clipVideoFile, num, z, str, z2, z3);
    }

    @Override // xsna.jde
    public final Integer a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vee)) {
            return false;
        }
        vee veeVar = (vee) obj;
        return epx.f(this.a, veeVar.a) && epx.f(this.b, veeVar.b) && this.c == veeVar.c && epx.f(this.d, veeVar.d) && this.e == veeVar.e && this.f == veeVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int b = qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + qoy.b((b + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGridVideoEntry(video=");
        sb.append(this.a);
        sb.append(", indexInRow=");
        sb.append(this.b);
        sb.append(", isOriginalTrack=");
        sb.append(this.c);
        sb.append(", label=");
        sb.append(this.d);
        sb.append(", showName=");
        sb.append(this.e);
        sb.append(", hideViews=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
