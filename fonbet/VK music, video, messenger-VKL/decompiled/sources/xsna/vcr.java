package xsna;

/* compiled from: FilterItem.kt */
/* loaded from: classes18.dex */
public class vcr<V> implements hfz {
    public final int b;
    public V c;
    public final V d;

    public vcr(int i, V v, V v2) {
        this.b = i;
        this.c = v;
        this.d = v2;
    }

    public void a() {
        e(null);
    }

    public V b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public V d() {
        return this.c;
    }

    public void e(V v) {
        this.c = null;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }
}
