package defpackage;

import java.util.Map;

/* loaded from: classes12.dex */
public final class mcw {
    public final String a;
    public final Map b;

    public mcw(int i, String str, Map map) {
        map = (i & 2) != 0 ? null : map;
        this.a = str;
        this.b = map;
    }

    public mcw(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
