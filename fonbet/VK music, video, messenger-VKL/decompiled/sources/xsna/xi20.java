package xsna;

import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import xsna.fi20;

/* compiled from: MetadataUtil.java */
/* loaded from: classes12.dex */
public final class xi20 {
    @Nullable
    public static x03 a(xi90 xi90Var) {
        int p = xi90Var.p();
        if (xi90Var.p() != 1684108385) {
            ahn.F("Failed to parse cover art attribute");
            return null;
        }
        int p2 = xi90Var.p();
        byte[] bArr = oa8.a;
        int i = p2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            sn.d(i, "Unrecognized cover art flags: ");
            return null;
        }
        xi90Var.Q(4);
        int i2 = p - 16;
        byte[] bArr2 = new byte[i2];
        xi90Var.n(bArr2, 0, i2);
        return new x03(str, null, 3, bArr2);
    }

    @Nullable
    public static lio0 b(int i, String str, xi90 xi90Var) {
        int p = xi90Var.p();
        if (xi90Var.p() == 1684108385 && p >= 22) {
            xi90Var.Q(10);
            int J = xi90Var.J();
            if (J > 0) {
                String a = lhg.a(J, "");
                int J2 = xi90Var.J();
                if (J2 > 0) {
                    a = na8.a(J2, a, DomExceptionUtils.SEPARATOR);
                }
                return new lio0(str, null, ImmutableList.p(a));
            }
        }
        ahn.F("Failed to parse index/count attribute: " + sf30.a(i));
        return null;
    }

    public static int c(xi90 xi90Var) {
        int p = xi90Var.p();
        if (xi90Var.p() == 1684108385) {
            xi90Var.Q(8);
            int i = p - 16;
            if (i == 1) {
                return xi90Var.C();
            }
            if (i == 2) {
                return xi90Var.J();
            }
            if (i == 3) {
                return xi90Var.F();
            }
            if (i == 4 && (xi90Var.m() & 128) == 0) {
                return xi90Var.G();
            }
        }
        ahn.F("Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    public static asv d(int i, String str, xi90 xi90Var, boolean z, boolean z2) {
        int c = c(xi90Var);
        if (z2) {
            c = Math.min(1, c);
        }
        if (c >= 0) {
            return z ? new lio0(str, null, ImmutableList.p(Integer.toString(c))) : new pbg(C.LANGUAGE_UNDETERMINED, str, Integer.toString(c));
        }
        ahn.F("Failed to parse uint8 attribute: " + sf30.a(i));
        return null;
    }

    @Nullable
    public static lio0 e(int i, String str, xi90 xi90Var) {
        int p = xi90Var.p();
        if (xi90Var.p() == 1684108385) {
            xi90Var.Q(8);
            return new lio0(str, null, ImmutableList.p(xi90Var.y(p - 16)));
        }
        ahn.F("Failed to parse text attribute: " + sf30.a(i));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(int i, @Nullable fi20 fi20Var, a.C0043a c0043a, @Nullable fi20 fi20Var2, fi20... fi20VarArr) {
        if (fi20Var2 == null) {
            fi20Var2 = new fi20(new fi20.a[0]);
        }
        if (fi20Var != null) {
            fi20Var.getClass();
            ImmutableList.b bVar = ImmutableList.c;
            ImmutableList.a aVar = new ImmutableList.a();
            for (fi20.a aVar2 : fi20Var.a) {
                if (vo10.class.isAssignableFrom(aVar2.getClass())) {
                    aVar.c((fi20.a) vo10.class.cast(aVar2));
                }
            }
            ImmutableList.b listIterator = aVar.g().listIterator(0);
            while (listIterator.hasNext()) {
                vo10 vo10Var = (vo10) listIterator.next();
                if (!vo10Var.a.equals("com.android.capture.fps") || i == 2) {
                    fi20Var2 = fi20Var2.a(vo10Var);
                }
            }
        }
        for (fi20 fi20Var3 : fi20VarArr) {
            fi20Var2 = fi20Var2.b(fi20Var3);
        }
        if (fi20Var2.a.length > 0) {
            c0043a.k = fi20Var2;
        }
    }
}
