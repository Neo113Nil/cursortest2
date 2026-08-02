package com.google.android.gms.internal.play_billing;

import defpackage.dfa1;
import defpackage.fw91;
import defpackage.i7a1;
import defpackage.jfa1;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.ov91;
import defpackage.q7a1;
import defpackage.rea1;
import defpackage.s9a1;
import defpackage.zt91;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes11.dex */
public final class k extends p {
    private static final k zzb;
    private i7a1 zzd = dfa1.d();

    static {
        k kVar = new k();
        zzb = kVar;
        p.o(k.class, kVar);
    }

    public static zt91 r() {
        return (zt91) zzb.i();
    }

    public static void s(k kVar, Iterable iterable) {
        i7a1 i7a1Var = kVar.zzd;
        if (!((fw91) i7a1Var).a) {
            int size = i7a1Var.size();
            kVar.zzd = i7a1Var.D(size + size);
        }
        List list = kVar.zzd;
        Charset charset = q7a1.a;
        iterable.getClass();
        if (iterable instanceof s9a1) {
            List zza = ((s9a1) iterable).zza();
            if (list != null) {
                ny61.u();
                return;
            }
            list.size();
            Iterator it = zza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof zzgk) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                zzgk.i(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof rea1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size2);
            }
            if (list instanceof dfa1) {
                dfa1 dfa1Var = (dfa1) list;
                int i = dfa1Var.c + size2;
                int length = dfa1Var.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = oo31.c(length, 3, 2, 1, 10);
                        }
                        dfa1Var.b = Arrays.copyOf(dfa1Var.b, length);
                    } else {
                        dfa1Var.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size3 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    ov91.a(size3, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size4 = list2.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                ov91.a(size3, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", j.class});
        }
        if (i2 == 3) {
            return new k();
        }
        if (i2 == 4) {
            return new zt91(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
