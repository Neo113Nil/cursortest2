package xsna;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: classes12.dex */
public final class a1u {
    public final Map<Class<?>, Object> a;

    /* compiled from: GlideExperiments.java */
    public static final class a {
        public final HashMap a = new HashMap();
    }

    public a1u(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }
}
