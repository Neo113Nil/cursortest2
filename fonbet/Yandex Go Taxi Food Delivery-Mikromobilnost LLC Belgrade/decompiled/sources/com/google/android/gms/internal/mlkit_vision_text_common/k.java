package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.tw01;
import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class k extends tw01 implements ListIterator {
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractList w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 1);
        this.c = i;
        this.w = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tw01
    public final Object b(Object obj) {
        int i = this.c;
        AbstractList abstractList = this.w;
        switch (i) {
            case 0:
                return ((zzbr) abstractList).zzb.d(obj);
            default:
                return ((zzbt) abstractList).zzb.d(obj);
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b(((ListIterator) this.b).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
