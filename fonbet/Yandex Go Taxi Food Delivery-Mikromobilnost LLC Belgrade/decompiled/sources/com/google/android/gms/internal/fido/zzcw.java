package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzcw extends d implements Serializable {
    public static final zzcw a = new zzcw();

    @Override // com.google.android.gms.internal.fido.d
    public final d a() {
        return zzcq.a;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
