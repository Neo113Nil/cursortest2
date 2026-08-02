package yads;

/* loaded from: classes10.dex */
public final class zn2 extends x51 {
    public static final zn2 j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        j = new zn2(objArr, 0, objArr, 0, 0);
    }

    public zn2(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.g = i2;
        this.h = i3;
    }

    @Override // yads.m51
    public final int a(int i, Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, i, this.h);
        return i + this.h;
    }

    @Override // yads.m51
    public final Object[] b() {
        return this.d;
    }

    @Override // yads.m51
    public final int c() {
        return this.h;
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = q01.a(obj.hashCode());
        while (true) {
            int i = a & this.g;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    @Override // yads.m51
    public final int d() {
        return 0;
    }

    @Override // yads.m51
    public final boolean e() {
        return false;
    }

    @Override // yads.x51
    public final s51 f() {
        return s51.b(this.h, this.d);
    }

    @Override // yads.x51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // yads.m51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final nb3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
