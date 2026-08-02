package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.Feature;
import defpackage.h591;
import defpackage.ny61;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class a {
    public Object[] a = new Object[8];
    public int b = 0;
    public h591 c;

    public final void a(String str, Feature feature) {
        int i;
        int i2 = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            if (i3 >= 0) {
                i = length + (length >> 1) + 1;
                if (i < i3) {
                    int highestOneBit = Integer.highestOneBit(i3 - 1);
                    i = highestOneBit + highestOneBit;
                }
                if (i < 0) {
                    i = Integer.MAX_VALUE;
                }
            } else {
                ny61.f("cannot store more than MAX_VALUE elements");
                i = 0;
            }
            this.a = Arrays.copyOf(objArr, i);
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = feature;
        this.b = i4 + 1;
    }

    public final zzai b() {
        h591 h591Var = this.c;
        if (h591Var != null) {
            throw h591Var.a();
        }
        zzaq a = zzaq.a(this.b, this.a, this);
        h591 h591Var2 = this.c;
        if (h591Var2 == null) {
            return a;
        }
        throw h591Var2.a();
    }
}
