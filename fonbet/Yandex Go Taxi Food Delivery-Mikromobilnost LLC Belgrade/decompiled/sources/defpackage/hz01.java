package defpackage;

import java.util.Collection;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class hz01 {
    public static final hz01 d;
    public final String a;
    public final Collection b;
    public final Collection c;

    static {
        EmptyList emptyList = EmptyList.a;
        d = new hz01("", emptyList, emptyList);
    }

    public hz01(String str, Collection collection, Collection collection2) {
        this.a = str;
        this.b = collection;
        this.c = collection2;
    }
}
