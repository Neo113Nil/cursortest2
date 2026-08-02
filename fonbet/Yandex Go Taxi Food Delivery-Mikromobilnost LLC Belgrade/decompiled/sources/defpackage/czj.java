package defpackage;

import java.util.Objects;

/* loaded from: classes15.dex */
public final class czj {
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;

    public czj(String str, String str2, String str3, Boolean bool) {
        z83.d(str, null);
        z83.d(str2, null);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && czj.class == obj.getClass()) {
            czj czjVar = (czj) obj;
            if (czjVar.a.equals(this.a) && czjVar.b.equals(this.b) && Objects.equals(czjVar.c, this.c) && Objects.equals(this.d, czjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.d;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }
}
