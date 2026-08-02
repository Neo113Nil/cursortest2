package xsna;

import java.util.ArrayList;

/* compiled from: TextDecoration.kt */
/* loaded from: classes11.dex */
public final class pdo0 {
    public static final pdo0 b = new pdo0(0);
    public static final pdo0 c = new pdo0(1);
    public static final pdo0 d = new pdo0(2);
    public final int a;

    public pdo0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pdo0) {
            return this.a == ((pdo0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return ho8.a(new StringBuilder("TextDecoration["), hgz.b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
