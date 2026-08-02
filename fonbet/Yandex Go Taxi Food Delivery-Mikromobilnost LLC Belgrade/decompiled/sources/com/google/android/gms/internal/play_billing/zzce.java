package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes11.dex */
abstract class zzce implements Comparable, Serializable {
    final Comparable zza = "";

    public abstract int a(zzce zzceVar);

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof zzce) {
            try {
                if (a((zzce) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
