package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes.dex */
public final class d7b1 extends vqa1 implements RandomAccess {
    public static final Object[] w;
    public static final d7b1 x;
    public Object[] b;
    public int c;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new d7b1(objArr, 0, false);
    }

    public d7b1(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.c)) {
            ny61.m(v43.a(this.c, i, PKIBody._RP, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[oo31.c(length, 3, 2, 1, 10)];
            System.arraycopy(this.b, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.c) {
            ny61.m(v43.a(this.c, i, PKIBody._RP, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.z0b1
    public final /* bridge */ /* synthetic */ z0b1 b0(int i) {
        if (i >= this.c) {
            return new d7b1(i == 0 ? w : Arrays.copyOf(this.b, i), this.c, true);
        }
        w511.q();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.b[i];
    }

    @Override // defpackage.vqa1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.c;
        int length = this.b.length;
        if (i == length) {
            this.b = Arrays.copyOf(this.b, oo31.c(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
