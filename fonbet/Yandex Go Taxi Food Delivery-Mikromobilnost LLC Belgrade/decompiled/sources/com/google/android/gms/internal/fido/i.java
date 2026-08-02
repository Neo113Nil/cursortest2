package com.google.android.gms.internal.fido;

import defpackage.jsa1;
import defpackage.jy91;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qx91;
import defpackage.s7a1;
import defpackage.xx91;
import java.util.Arrays;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public final class i extends s7a1 {
    public final zzgx a;

    public i(zzgx zzgxVar) {
        this.a = zzgxVar;
    }

    @Override // defpackage.s7a1
    public final int a() {
        return s7a1.d(DerValue.TAG_APPLICATION);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s7a1 s7a1Var = (s7a1) obj;
        int a = s7a1Var.a();
        int d = s7a1.d(DerValue.TAG_APPLICATION);
        if (d != a) {
            return d - s7a1Var.a();
        }
        zzgx zzgxVar = ((i) s7a1Var).a;
        zzgx zzgxVar2 = this.a;
        if (((zzgu) zzgxVar2).zza.length != ((zzgu) zzgxVar).zza.length) {
            return ((zzgu) zzgxVar2).zza.length - ((zzgu) zzgxVar).zza.length;
        }
        return h.a.compare(zzgxVar2.n(), zzgxVar.n());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            return this.a.equals(((i) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(s7a1.d(DerValue.TAG_APPLICATION)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        qx91 qx91Var;
        int i;
        boolean z;
        xx91 xx91Var = jy91.d;
        jy91 jy91Var = xx91Var.c;
        if (jy91Var == null) {
            qx91 qx91Var2 = xx91Var.a;
            char[] cArr = qx91Var2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    qx91Var = qx91Var2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (z) {
                        ny61.r("Cannot call upperCase() on a mixed-case alphabet");
                        return null;
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c3 = cArr[i4];
                        if (c3 >= 97 && c3 <= 122) {
                            c3 ^= 32;
                        }
                        cArr2[i4] = (char) c3;
                    }
                    qx91Var = new qx91(qx91Var2.a.concat(".upperCase()"), cArr2);
                    byte[] bArr = qx91Var.g;
                    if (qx91Var2.h && !qx91Var.h) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                copyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    ny61.r(jsa1.h("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                copyOf[i5] = b;
                            }
                        }
                        qx91Var = new qx91(qx91Var.a.concat(".ignoreCase()"), qx91Var.b, copyOf, true);
                    }
                }
            }
            jy91Var = qx91Var == qx91Var2 ? xx91Var : new xx91(qx91Var);
            xx91Var.c = jy91Var;
        }
        byte[] n = this.a.n();
        return oyr.p("h'", jy91Var.c(n.length, n), "'");
    }
}
