package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class nml {
    public final Map a;
    public final lml b;

    public nml(Map map, lml lmlVar) {
        this.a = map;
        this.b = lmlVar;
    }

    public final lml a(String str) {
        lml lmlVar;
        return (str == null || (lmlVar = (lml) this.a.get(str)) == null) ? this.b : lmlVar;
    }
}
