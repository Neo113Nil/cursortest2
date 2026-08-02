package xsna;

import com.vk.dto.common.ClipVideoFile;

/* compiled from: ClipsGridUploadVideoEntry.kt */
/* loaded from: classes17.dex */
public final class uee implements nmv, jde {
    public final ClipVideoFile a;
    public final ceq0 b;
    public final Integer c;

    public uee(ClipVideoFile clipVideoFile, ceq0 ceq0Var, Integer num) {
        this.a = clipVideoFile;
        this.b = ceq0Var;
        this.c = num;
    }

    public static uee b(uee ueeVar, ClipVideoFile clipVideoFile, Integer num, int i) {
        if ((i & 1) != 0) {
            clipVideoFile = ueeVar.a;
        }
        ceq0 ceq0Var = ueeVar.b;
        if ((i & 4) != 0) {
            num = ueeVar.c;
        }
        ueeVar.getClass();
        return new uee(clipVideoFile, ceq0Var, num);
    }

    @Override // xsna.jde
    public final Integer a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uee)) {
            return false;
        }
        uee ueeVar = (uee) obj;
        return epx.f(this.a, ueeVar.a) && epx.f(this.b, ueeVar.b) && epx.f(this.c, ueeVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ceq0 ceq0Var = this.b;
        int hashCode2 = (hashCode + (ceq0Var == null ? 0 : ceq0Var.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGridUploadVideoEntry(clipFile=");
        sb.append(this.a);
        sb.append(", uploadState=");
        sb.append(this.b);
        sb.append(", indexInRow=");
        return uqi.b(sb, this.c, ')');
    }
}
