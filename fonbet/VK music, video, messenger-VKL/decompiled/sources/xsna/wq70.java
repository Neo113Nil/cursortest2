package xsna;

/* compiled from: ObservableProperty.kt */
/* loaded from: classes8.dex */
public abstract class wq70<V> implements p7f0<Object, V> {
    private V value;

    public wq70(V v) {
        this.value = v;
    }

    public boolean beforeChange(qcy<?> qcyVar, V v, V v2) {
        return true;
    }

    @Override // xsna.i7f0
    public V getValue(Object obj, qcy<?> qcyVar) {
        return this.value;
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy<?> qcyVar, V v) {
        V v2 = this.value;
        if (beforeChange(qcyVar, v2, v)) {
            this.value = v;
            afterChange(qcyVar, v2, v);
        }
    }

    public String toString() {
        return k73.c(new StringBuilder("ObservableProperty(value="), this.value, ')');
    }

    public void afterChange(qcy<?> qcyVar, V v, V v2) {
    }
}
