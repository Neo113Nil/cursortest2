package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class d7a1 extends s7a1 {
    public final String a;

    public d7a1(String str) {
        this.a = str;
    }

    @Override // defpackage.s7a1
    public final int a() {
        return s7a1.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        s7a1 s7a1Var = (s7a1) obj;
        int a = s7a1Var.a();
        int d = s7a1.d((byte) 96);
        if (d != a) {
            return d - s7a1Var.a();
        }
        String str = ((d7a1) s7a1Var).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d7a1.class == obj.getClass()) {
            return this.a.equals(((d7a1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(s7a1.d((byte) 96)), this.a});
    }

    public final String toString() {
        return oyr.t(new StringBuilder("\""), this.a, "\"");
    }
}
