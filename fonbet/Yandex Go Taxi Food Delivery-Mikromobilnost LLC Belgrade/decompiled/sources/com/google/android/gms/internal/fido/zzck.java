package com.google.android.gms.internal.fido;

import defpackage.sb91;
import defpackage.w511;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes11.dex */
public abstract class zzck extends zzcf implements NavigableSet, Iterable {
    public final transient Comparator w;
    public transient zzck x;

    public zzck(Comparator comparator) {
        this.w = comparator;
    }

    public static zzcv q(Comparator comparator) {
        if (zzcq.a == comparator) {
            return zzcv.z;
        }
        sb91 sb91Var = zzcc.b;
        return new zzcv(zzct.x, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.w;
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
        zzcv zzcvVar = (zzcv) this;
        return zzcvVar.t(0, zzcvVar.r(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final zzck descendingSet() {
        zzck zzckVar = this.x;
        if (zzckVar == null) {
            zzcv zzcvVar = (zzcv) this;
            Comparator reverseOrder = Collections.reverseOrder(zzcvVar.w);
            zzckVar = zzcvVar.isEmpty() ? q(reverseOrder) : new zzcv(zzcvVar.y.i(), reverseOrder);
            this.x = zzckVar;
            zzckVar.x = this;
        }
        return zzckVar;
    }

    @Override // java.util.NavigableSet
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final zzck subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.w.compare(obj, obj2) > 0) {
            w511.q();
            return null;
        }
        zzcv zzcvVar = (zzcv) this;
        zzcv t = zzcvVar.t(zzcvVar.s(obj, z), zzcvVar.y.size());
        return t.t(0, t.r(obj2, z2));
    }

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
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        zzcv zzcvVar = (zzcv) this;
        return zzcvVar.t(zzcvVar.s(obj, true), zzcvVar.y.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        zzcv zzcvVar = (zzcv) this;
        return zzcvVar.t(0, zzcvVar.r(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        zzcv zzcvVar = (zzcv) this;
        return zzcvVar.t(zzcvVar.s(obj, z), zzcvVar.y.size());
    }
}
