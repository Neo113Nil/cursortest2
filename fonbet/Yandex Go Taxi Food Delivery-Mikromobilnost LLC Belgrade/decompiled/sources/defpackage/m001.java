package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class m001 {
    public final l001[] a;
    public int b;

    public m001(l001... l001VarArr) {
        this.a = l001VarArr;
        int length = l001VarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m001.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((m001) obj).a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            this.b = 527 + Arrays.hashCode(this.a);
        }
        return this.b;
    }
}
