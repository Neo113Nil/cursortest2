package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.sta1;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class zzcv extends zzcn implements Set {
    public transient zzcs b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return sta1.c(this);
    }
}
