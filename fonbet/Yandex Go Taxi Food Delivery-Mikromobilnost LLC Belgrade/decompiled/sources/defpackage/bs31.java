package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class bs31 {
    public final g1x0 a = new g1x0();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                oo31.o(autoCloseable);
            } catch (Exception e) {
                ny61.j(e);
            }
        }
    }
}
