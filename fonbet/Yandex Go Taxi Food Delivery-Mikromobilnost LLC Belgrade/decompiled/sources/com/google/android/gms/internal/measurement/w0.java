package com.google.android.gms.internal.measurement;

import defpackage.b64;
import defpackage.d7b1;
import defpackage.eqa1;
import defpackage.f1b1;
import defpackage.n7b1;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.p5b1;
import defpackage.q2b1;
import defpackage.u6b1;
import defpackage.unr0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class w0 implements p5b1 {
    protected int zza = 0;

    public static void f(Iterable iterable, List list) {
        Charset charset = f1b1.a;
        iterable.getClass();
        if (iterable instanceof q2b1) {
            List zza = ((q2b1) iterable).zza();
            q2b1 q2b1Var = (q2b1) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = q2b1Var.size() - size;
                    String q = b64.q(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                    int size3 = q2b1Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            ny61.t(q);
                            return;
                        }
                        q2b1Var.remove(size3);
                    }
                } else if (obj instanceof zzlh) {
                    q2b1Var.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzlh.g(0, bArr.length, bArr);
                    q2b1Var.zzb();
                } else {
                    q2b1Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof u6b1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof d7b1) {
                d7b1 d7b1Var = (d7b1) list;
                int i = d7b1Var.c + size4;
                int length = d7b1Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = oo31.c(length, 3, 2, 1, 10);
                        }
                        d7b1Var.b = Arrays.copyOf(d7b1Var.b, length);
                    } else {
                        d7b1Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    eqa1.a(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                eqa1.a(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    @Override // defpackage.p5b1
    public final zzlh a() {
        try {
            a1 a1Var = (a1) this;
            int m = a1Var.m();
            zzlh zzlhVar = zzlh.a;
            byte[] bArr = new byte[m];
            y0 y0Var = new y0(bArr, m);
            a1Var.c(y0Var);
            return x0.a(y0Var, bArr);
        } catch (IOException e) {
            String name = this.getClass().getName();
            ny61.n(unr0.r(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] d() {
        try {
            a1 a1Var = (a1) this;
            int m = a1Var.m();
            byte[] bArr = new byte[m];
            y0 y0Var = new y0(bArr, m);
            a1Var.c(y0Var);
            if (y0Var.c - y0Var.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            ny61.n(unr0.r(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public int e(n7b1 n7b1Var) {
        throw null;
    }
}
