package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.ny61;
import defpackage.qke;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class g implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ zzci w;
    public final /* synthetic */ int x;
    public final /* synthetic */ zzci y;

    public g(zzci zzciVar, int i) {
        this.x = i;
        this.y = zzciVar;
        this.w = zzciVar;
        this.a = zzciVar.x;
        this.b = zzciVar.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        zzci zzciVar = this.w;
        if (zzciVar.x != this.a) {
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
        zzci zzciVar2 = this.y;
        switch (i2) {
            case 0:
                Object obj2 = zzci.C;
                obj = zzciVar2.b()[i];
                break;
            case 1:
                obj = new i(zzciVar2, i);
                break;
            default:
                Object obj3 = zzci.C;
                obj = zzciVar2.c()[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= zzciVar.y) {
            i3 = -1;
        }
        this.b = i3;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzci zzciVar = this.w;
        if (zzciVar.x != this.a) {
            ny61.y();
            return;
        }
        qke.H("no calls to next() since the last call to remove()", this.c >= 0);
        this.a += 32;
        zzciVar.remove(zzciVar.b()[this.c]);
        this.b--;
        this.c = -1;
    }
}
