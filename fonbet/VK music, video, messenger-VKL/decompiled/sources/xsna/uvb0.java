package xsna;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class uvb0<T> {
    public final Object[] a = new Object[256];
    public int b;

    public final void a(androidx.constraintlayout.core.b bVar) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = bVar;
            this.b = i + 1;
        }
    }
}
