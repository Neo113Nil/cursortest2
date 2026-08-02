package xsna;

/* compiled from: Pools.kt */
/* loaded from: classes.dex */
public class tvb0<T> implements svb0<T> {
    public final Object[] a;
    public int b;

    public tvb0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // xsna.svb0
    public boolean a(T t) {
        Object[] objArr;
        boolean z;
        int i = this.b;
        int i2 = 0;
        while (true) {
            objArr = this.a;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == t) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = t;
        this.b = i3 + 1;
        return true;
    }

    @Override // xsna.svb0
    public T c() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return t;
    }
}
