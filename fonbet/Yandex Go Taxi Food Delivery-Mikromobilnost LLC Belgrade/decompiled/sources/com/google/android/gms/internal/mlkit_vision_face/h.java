package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.ny61;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class h implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ zzbd w;
    public final /* synthetic */ int x;
    public final /* synthetic */ zzbd y;

    public h(zzbd zzbdVar, int i) {
        this.x = i;
        this.y = zzbdVar;
        this.w = zzbdVar;
        this.a = zzbdVar.x;
        this.b = zzbdVar.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        zzbd zzbdVar = this.w;
        if (zzbdVar.x != this.a) {
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
        zzbd zzbdVar2 = this.y;
        switch (i2) {
            case 0:
                Object[] objArr = zzbdVar2.c;
                objArr.getClass();
                obj = objArr[i];
                break;
            case 1:
                obj = new j(zzbdVar2, i);
                break;
            default:
                Object[] objArr2 = zzbdVar2.w;
                objArr2.getClass();
                obj = objArr2[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= zzbdVar.y) {
            i3 = -1;
        }
        this.b = i3;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzbd zzbdVar = this.w;
        int i = zzbdVar.x;
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
        Object[] objArr = zzbdVar.c;
        objArr.getClass();
        zzbdVar.remove(objArr[i3]);
        this.b--;
        this.c = -1;
    }
}
