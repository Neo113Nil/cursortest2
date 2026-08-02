package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class oeu {
    public final Map a;

    public oeu(Map map) {
        this.a = map;
    }

    public final String a(String str) {
        List list = (List) this.a.get(str);
        if (list != null) {
            return (String) a.R(list);
        }
        return null;
    }
}
