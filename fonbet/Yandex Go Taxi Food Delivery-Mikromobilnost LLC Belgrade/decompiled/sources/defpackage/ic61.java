package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class ic61 {
    public static final ic61 c;
    public final List a;
    public final List b;

    static {
        EmptyList emptyList = EmptyList.a;
        c = new ic61(emptyList, emptyList);
    }

    public ic61(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean a() {
        return this.a.isEmpty() || this.b.isEmpty();
    }
}
