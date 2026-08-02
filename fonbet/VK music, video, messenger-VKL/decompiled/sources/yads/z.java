package yads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes10.dex */
public class z extends x implements List {
    public final /* synthetic */ a0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Object obj, List list, x xVar) {
        super(a0Var, obj, list, xVar);
        this.g = a0Var;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean isEmpty = this.c.isEmpty();
        ((List) this.c).add(i, obj);
        this.g.g++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.c.size();
        boolean addAll = ((List) this.c).addAll(i, collection);
        if (addAll) {
            int size2 = this.c.size();
            a0 a0Var = this.g;
            a0Var.g = (size2 - size) + a0Var.g;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    public final List e() {
        return (List) this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.c).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new y(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object remove = ((List) this.c).remove(i);
        a0 a0Var = this.g;
        a0Var.g--;
        d();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c();
        a0 a0Var = this.g;
        Object obj = this.b;
        List subList = ((List) this.c).subList(i, i2);
        x xVar = this.d;
        if (xVar == null) {
            xVar = this;
        }
        a0Var.getClass();
        return subList instanceof RandomAccess ? new t(a0Var, obj, subList, xVar) : new z(a0Var, obj, subList, xVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new y(this, i);
    }
}
