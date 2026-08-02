package com.google.android.gms.internal.mlkit_vision_face;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes11.dex */
public final class e extends b implements ListIterator {
    public final /* synthetic */ f x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i) {
        super(fVar, ((List) fVar.b).listIterator(i));
        this.x = fVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        f fVar = this.x;
        boolean isEmpty = fVar.isEmpty();
        a();
        ((ListIterator) this.b).add(obj);
        fVar.y.w++;
        if (isEmpty) {
            fVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(fVar);
        this.x = fVar;
    }
}
