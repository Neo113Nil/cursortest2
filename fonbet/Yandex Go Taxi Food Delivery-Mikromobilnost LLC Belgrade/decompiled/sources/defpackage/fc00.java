package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class fc00 {
    public static final fc00 b;
    public static final fc00 c;
    public final List a;

    static {
        EmptyList emptyList = EmptyList.a;
        b = new fc00(emptyList);
        c = new fc00(emptyList);
    }

    public fc00(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !fc00.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((fc00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
