package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.ny61;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class g implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ zzba w;
    public final /* synthetic */ int x;
    public final /* synthetic */ zzba y;

    public g(zzba zzbaVar, int i) {
        this.x = i;
        this.y = zzbaVar;
        this.w = zzbaVar;
        this.a = zzbaVar.x;
        this.b = zzbaVar.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        zzba zzbaVar = this.w;
        if (zzbaVar.x != this.a) {
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
        zzba zzbaVar2 = this.y;
        switch (i2) {
            case 0:
                Object obj2 = zzba.C;
                obj = zzbaVar2.b()[i];
                break;
            case 1:
                obj = new i(zzbaVar2, i);
                break;
            default:
                Object obj3 = zzba.C;
                obj = zzbaVar2.c()[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= zzbaVar.y) {
            i3 = -1;
        }
        this.b = i3;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzba zzbaVar = this.w;
        int i = zzbaVar.x;
        int i2 = this.a;
        if (i != i2) {
            ny61.y();
            return;
        }
        int i3 = this.c;
        if (!(i3 >= 0)) {
            ny61.r("no calls to next() since the last call to remove()");
            return;
        }
        this.a = i2 + 32;
        zzbaVar.remove(zzbaVar.b()[i3]);
        this.b--;
        this.c = -1;
    }
}
