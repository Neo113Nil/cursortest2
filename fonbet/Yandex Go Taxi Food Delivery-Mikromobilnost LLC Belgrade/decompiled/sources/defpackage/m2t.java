package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class m2t extends x5v {
    public final String b;
    public final String c;
    public final String w;
    public final byte[] x;

    public m2t(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.w = str3;
        this.x = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m2t.class != obj.getClass()) {
            return false;
        }
        m2t m2tVar = (m2t) obj;
        return Objects.equals(this.b, m2tVar.b) && this.c.equals(m2tVar.c) && this.w.equals(m2tVar.w) && Arrays.equals(this.x, m2tVar.x);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.x) + unr0.b(unr0.b((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.w);
    }

    @Override // defpackage.x5v
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.w;
    }
}
