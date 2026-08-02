package xsna;

import java.util.Set;
import xsna.svh0.a;

/* compiled from: SearchIndex.kt */
/* loaded from: classes4.dex */
public interface svh0<K extends a, R> {

    /* compiled from: SearchIndex.kt */
    public static abstract class a {
    }

    Set<R> a(K k);

    void add(Object obj);

    void clear();

    void remove(Object obj);
}
