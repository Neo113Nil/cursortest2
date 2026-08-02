package com.google.common.collect;

import defpackage.h221;
import defpackage.ny61;

/* loaded from: classes11.dex */
public abstract class a extends h221 {
    public AbstractIterator$State b;
    public Object c;

    public a() {
        super(0);
        this.b = AbstractIterator$State.NOT_READY;
    }

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractIterator$State abstractIterator$State = this.b;
        AbstractIterator$State abstractIterator$State2 = AbstractIterator$State.FAILED;
        if (abstractIterator$State == abstractIterator$State2) {
            ny61.k();
            return false;
        }
        int ordinal = abstractIterator$State.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        this.b = abstractIterator$State2;
        this.c = a();
        if (this.b == AbstractIterator$State.DONE) {
            return false;
        }
        this.b = AbstractIterator$State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        this.b = AbstractIterator$State.NOT_READY;
        Object obj = this.c;
        this.c = null;
        return obj;
    }
}
