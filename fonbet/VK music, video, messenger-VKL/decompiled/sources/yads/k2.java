package yads;

import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class k2 {
    public static final j2 b = new j2();
    public static volatile k2 c;
    public final LinkedHashMap a = new LinkedHashMap();

    public k2() {
        a("window_type_browser", new u1());
        a("window_type_activity_result", new n2());
    }

    public final synchronized void a(String str, i2 i2Var) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, i2Var);
        }
    }
}
