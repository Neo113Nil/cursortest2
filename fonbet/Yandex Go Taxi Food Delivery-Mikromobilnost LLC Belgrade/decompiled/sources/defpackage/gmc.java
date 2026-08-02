package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class gmc extends x5v {
    public final String b;
    public final String c;
    public final String w;

    public gmc(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.w = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gmc.class != obj.getClass()) {
            return false;
        }
        gmc gmcVar = (gmc) obj;
        return this.c.equals(gmcVar.c) && this.b.equals(gmcVar.b) && Objects.equals(this.w, gmcVar.w);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(527, 31, this.b), 31, this.c);
        String str = this.w;
        return b + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.x5v
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.w;
    }
}
