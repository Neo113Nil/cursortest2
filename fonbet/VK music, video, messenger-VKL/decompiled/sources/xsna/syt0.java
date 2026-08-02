package xsna;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: ViewModelImpl.kt */
/* loaded from: classes.dex */
public final class syt0 {
    public final bbq a = new bbq();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                ryt0.a(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
