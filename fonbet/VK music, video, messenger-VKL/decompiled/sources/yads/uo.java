package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class uo {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public uo(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.c == uoVar.c && this.d == uoVar.d && ma2.a(this.a, uoVar.a) && ma2.a(this.b, uoVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
