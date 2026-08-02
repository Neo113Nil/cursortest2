package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzcq extends d implements Serializable {
    public static final zzcq a = new zzcq();

    @Override // com.google.android.gms.internal.fido.d
    public final d a() {
        return zzcw.a;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
