package xsna;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes13.dex */
public final class myi extends czi {
    public static myi c;
    public static final Map<Long, String> d;

    /* compiled from: ConfigurationConstants.java */
    public class a extends HashMap<Long, String> {
    }

    static {
        a aVar = new a();
        aVar.put(461L, "FIREPERF_AUTOPUSH");
        aVar.put(462L, "FIREPERF");
        aVar.put(675L, "FIREPERF_INTERNAL_LOW");
        aVar.put(676L, "FIREPERF_INTERNAL_HIGH");
        d = Collections.unmodifiableMap(aVar);
    }

    @Override // xsna.czi
    public final String g() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
