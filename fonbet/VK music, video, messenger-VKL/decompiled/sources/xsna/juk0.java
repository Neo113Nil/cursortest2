package xsna;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes11.dex */
public abstract class juk0<K, V> {
    public final hbk0<K, V> b;
    public final Iterator<Map.Entry<K, V>> c;
    public int d;
    public Map.Entry<? extends K, ? extends V> e;
    public Map.Entry<? extends K, ? extends V> f;

    /* JADX WARN: Multi-variable type inference failed */
    public juk0(hbk0<K, V> hbk0Var, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.b = hbk0Var;
        this.c = it;
        this.d = hbk0Var.b().d;
        a();
    }

    public final void a() {
        this.e = this.f;
        Iterator<Map.Entry<K, V>> it = this.c;
        this.f = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.f != null;
    }

    public final void remove() {
        hbk0<K, V> hbk0Var = this.b;
        if (hbk0Var.b().d != this.d) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.e;
        if (entry == null) {
            throw new IllegalStateException();
        }
        hbk0Var.remove(entry.getKey());
        this.e = null;
        s3q0 s3q0Var = s3q0.a;
        this.d = hbk0Var.b().d;
    }
}
