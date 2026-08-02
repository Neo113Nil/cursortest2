package com.google.android.gms.internal.fido;

import defpackage.z591;
import java.util.Iterator;

/* loaded from: classes11.dex */
final class zzcu extends zzcf {
    public static final Object[] B;
    public static final zzcu C;
    public final transient int A;
    public final transient Object[] w;
    public final transient int x;
    public final transient Object[] y;
    public final transient int z;

    static {
        Object[] objArr = new Object[0];
        B = objArr;
        C = new zzcu(objArr, 0, objArr, 0, 0);
    }

    public zzcu(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.w = objArr;
        this.x = i;
        this.y = objArr2;
        this.z = i2;
        this.A = i3;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.w;
        int i = this.A;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int b() {
        return this.A;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.y;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i = rotateLeft & this.z;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final z591 g() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] h() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc m() {
        return zzcc.k(this.A, this.w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A;
    }
}
