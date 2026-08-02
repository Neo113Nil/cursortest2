package xsna;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: SavedStateHandleImpl.kt */
/* loaded from: classes12.dex */
public final class q1h0 {
    public final LinkedHashMap a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final rgn e = new rgn(this, 1);

    public q1h0(Map<String, ? extends Object> map) {
        this.a = new LinkedHashMap(map);
    }

    public final <T> void a(String str, T t) {
        this.a.put(str, t);
        xh50 xh50Var = (xh50) this.c.get(str);
        if (xh50Var != null) {
            xh50Var.setValue(t);
        }
        xh50 xh50Var2 = (xh50) this.d.get(str);
        if (xh50Var2 != null) {
            xh50Var2.setValue(t);
        }
    }
}
