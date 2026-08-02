package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.usb1;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
final class zzbt extends AbstractSequentialList implements Serializable {
    final List zza;
    final usb1 zzb;

    public zzbt(List list, usb1 usb1Var) {
        list.getClass();
        this.zza = list;
        this.zzb = usb1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new k(this, this.zza.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
