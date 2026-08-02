package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: ClipsDraftMask.kt */
/* loaded from: classes17.dex */
public final class ctd {
    public final int a;
    public final UserId b;
    public final int c;
    public final String d;

    public ctd(int i, UserId userId, int i2, String str) {
        this.a = i;
        this.b = userId;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctd)) {
            return false;
        }
        ctd ctdVar = (ctd) obj;
        return this.a == ctdVar.a && epx.f(this.b, ctdVar.b) && this.c == ctdVar.c && epx.f(this.d, ctdVar.d);
    }

    public final int hashCode() {
        int a = shy.a(this.c, bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b), 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsDraftMask(id=");
        sb.append(this.a);
        sb.append(", ownerId=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", name=");
        return ho8.a(sb, this.d, ')');
    }
}
