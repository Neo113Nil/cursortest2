package com.google.android.gms.internal.play_billing;

import defpackage.jfa1;
import defpackage.k2a1;
import defpackage.nma1;
import defpackage.sla1;
import defpackage.su71;
import defpackage.uw91;
import defpackage.xea1;
import java.io.IOException;

/* loaded from: classes.dex */
public final class w extends p {
    private static final w zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private y zzh;

    static {
        w wVar = new w();
        zzb = wVar;
        p.o(w.class, wVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ofa1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.play_billing.p, java.lang.Object] */
    public static w r(byte[] bArr, k2a1 k2a1Var) {
        w wVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (p) wVar.g(4);
            try {
                ?? a = xea1.c.a(r2.getClass());
                a.h(r2, bArr, 0, length, new uw91(k2a1Var));
                a.b(r2);
                wVar = r2;
            } catch (zzhr e) {
                throw e;
            } catch (zzji e2) {
                su71.d(e2.getMessage());
                return null;
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzhr) {
                    throw ((zzhr) e3.getCause());
                }
                throw new zzhr(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                su71.d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (wVar == null || p.q(wVar, true)) {
            return wVar;
        }
        su71.d(new zzji().getMessage());
        return null;
    }

    public static /* synthetic */ void s(w wVar, y yVar) {
        wVar.zzh = yVar;
        wVar.zzd |= 2;
    }

    public static /* synthetic */ void t(w wVar, int i) {
        wVar.zzg = i - 1;
        wVar.zzd |= 1;
    }

    public static sla1 u() {
        return (sla1) zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", nma1.b, "zzh", d0.class});
        }
        if (i2 == 3) {
            return new w();
        }
        if (i2 == 4) {
            return new sla1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
