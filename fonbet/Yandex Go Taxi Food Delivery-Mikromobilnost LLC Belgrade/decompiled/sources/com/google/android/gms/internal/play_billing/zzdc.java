package com.google.android.gms.internal.play_billing;

import defpackage.yh91;
import java.io.Serializable;

/* loaded from: classes11.dex */
final class zzdc extends yh91 implements Serializable {
    public static final zzdc a = new zzdc();

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
