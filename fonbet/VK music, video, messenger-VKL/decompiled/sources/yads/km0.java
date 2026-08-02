package yads;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class km0 {
    public static final Object h = new Object();
    public String a;
    public final List b = EmptyList.b;
    public final Map c = jgp.b;
    public String d;
    public String e;
    public boolean f;
    public String g;

    public final Map a() {
        return this.c;
    }

    public final String b() {
        String str;
        synchronized (h) {
            str = this.g;
        }
        return str;
    }
}
