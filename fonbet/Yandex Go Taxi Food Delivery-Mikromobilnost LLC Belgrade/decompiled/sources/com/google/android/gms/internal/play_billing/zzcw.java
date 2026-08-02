package com.google.android.gms.internal.play_billing;

import defpackage.le91;
import defpackage.w511;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes11.dex */
public abstract class zzcw extends zzcv implements NavigableSet, Iterable {
    public final transient Comparator c;
    public transient zzcw w;

    public zzcw(Comparator comparator) {
        this.c = comparator;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.c;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        zzcw zzcwVar = this.w;
        if (zzcwVar == null) {
            zzdr zzdrVar = (zzdr) this;
            Comparator reverseOrder = Collections.reverseOrder(zzdrVar.c);
            if (!zzdrVar.isEmpty()) {
                zzcwVar = new zzdr(zzdrVar.x.j(), reverseOrder);
            } else if (zzdc.a != reverseOrder) {
                le91 le91Var = zzco.b;
                zzcwVar = new zzdr(zzdk.x, reverseOrder);
            } else {
                zzcwVar = zzdr.y;
            }
            this.w = zzcwVar;
            zzcwVar.w = this;
        }
        return zzcwVar;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        zzdr zzdrVar = (zzdr) this;
        return zzdrVar.p(0, zzdrVar.m(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.compare(obj, obj2) > 0) {
            w511.q();
            return null;
        }
        zzdr zzdrVar = (zzdr) this;
        zzdr p = zzdrVar.p(zzdrVar.n(obj, true), zzdrVar.x.size());
        return p.p(0, p.m(obj2, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        zzdr zzdrVar = (zzdr) this;
        return zzdrVar.p(zzdrVar.n(obj, true), zzdrVar.x.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        zzdr zzdrVar = (zzdr) this;
        return zzdrVar.p(0, zzdrVar.m(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        zzdr zzdrVar = (zzdr) this;
        return zzdrVar.p(zzdrVar.n(obj, z), zzdrVar.x.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.c.compare(obj, obj2) <= 0) {
            zzdr zzdrVar = (zzdr) this;
            zzdr p = zzdrVar.p(zzdrVar.n(obj, z), zzdrVar.x.size());
            return p.p(0, p.m(obj2, z2));
        }
        w511.q();
        return null;
    }
}
