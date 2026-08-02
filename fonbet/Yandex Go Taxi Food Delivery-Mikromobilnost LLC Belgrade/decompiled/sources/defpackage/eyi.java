package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class eyi {
    public final String a;
    public final String b;
    public final String c;

    public eyi(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eyi.class == obj.getClass()) {
            eyi eyiVar = (eyi) obj;
            if (Objects.equals(this.a, eyiVar.a) && Objects.equals(this.b, eyiVar.b) && Objects.equals(this.c, eyiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
