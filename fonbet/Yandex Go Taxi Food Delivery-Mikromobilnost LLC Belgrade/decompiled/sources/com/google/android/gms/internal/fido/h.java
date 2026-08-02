package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class h {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(h.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = zzgk.zza;
        }
        a = comparator;
    }
}
