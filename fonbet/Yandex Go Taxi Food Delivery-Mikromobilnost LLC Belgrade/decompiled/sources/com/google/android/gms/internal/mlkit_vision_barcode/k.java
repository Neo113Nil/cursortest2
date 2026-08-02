package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.ef91;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class k {
    public Object[] a = new Object[4];
    public int b = 0;
    public boolean c;

    public final void a(Object obj) {
        obj.getClass();
        b(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void b(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length >= i) {
            if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
                return;
            }
            return;
        }
        int i2 = length + (length >> 1) + 1;
        if (i2 < i) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            i2 = highestOneBit + highestOneBit;
        }
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        this.a = Arrays.copyOf(objArr, i2);
        this.c = false;
    }

    public final zzcs c() {
        this.c = true;
        Object[] objArr = this.a;
        int i = this.b;
        ef91 ef91Var = zzcs.b;
        return i == 0 ? zzdk.x : new zzdk(i, objArr);
    }
}
