package com.google.common.collect;

import defpackage.ffx;
import defpackage.ny61;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class o implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ CompactHashMap w;
    public final /* synthetic */ int x;
    public final /* synthetic */ CompactHashMap y;

    public o(CompactHashMap compactHashMap, int i) {
        this.x = i;
        this.y = compactHashMap;
        this.w = compactHashMap;
        this.a = compactHashMap.x;
        this.b = compactHashMap.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        CompactHashMap compactHashMap = this.w;
        if (compactHashMap.x != this.a) {
            ny61.y();
            return null;
        }
        if (!hasNext()) {
            ny61.p();
            return null;
        }
        int i = this.b;
        this.c = i;
        int i2 = this.x;
        CompactHashMap compactHashMap2 = this.y;
        switch (i2) {
            case 0:
                Object obj2 = CompactHashMap.C;
                obj = compactHashMap2.m()[i];
                break;
            case 1:
                obj = new q(compactHashMap2, i);
                break;
            default:
                Object obj3 = CompactHashMap.C;
                obj = compactHashMap2.n()[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= compactHashMap.y) {
            i3 = -1;
        }
        this.b = i3;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        CompactHashMap compactHashMap = this.w;
        if (compactHashMap.x != this.a) {
            ny61.y();
            return;
        }
        ffx.r("no calls to next() since the last call to remove()", this.c >= 0);
        this.a += 32;
        compactHashMap.remove(compactHashMap.m()[this.c]);
        this.b--;
        this.c = -1;
    }
}
