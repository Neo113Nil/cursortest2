package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class ng3 {
    public static final ng3 e = new ng3(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ng3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = tw21.R(i3) ? tw21.t(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng3)) {
            return false;
        }
        ng3 ng3Var = (ng3) obj;
        return this.a == ng3Var.a && this.b == ng3Var.b && this.c == ng3Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return oyr.s(sb, this.c, ']');
    }
}
