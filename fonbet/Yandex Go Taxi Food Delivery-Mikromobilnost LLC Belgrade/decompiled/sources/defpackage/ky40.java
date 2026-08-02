package defpackage;

import java.util.Map;

/* loaded from: classes10.dex */
public final class ky40 implements Map.Entry, agx {
    public final Object[] a;
    public final Object[] b;
    public final int c;

    public ky40(int i, Object[] objArr, Object[] objArr2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a[this.c];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b[this.c];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.b;
        int i = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
