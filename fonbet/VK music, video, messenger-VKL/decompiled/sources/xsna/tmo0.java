package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextStyle.kt */
/* loaded from: classes11.dex */
public final class tmo0 {

    /* compiled from: TextStyle.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final nmo0 a(nmo0 nmo0Var, LayoutDirection layoutDirection) {
        int i;
        hik0 hik0Var = nmo0Var.a;
        vho0 vho0Var = iik0.d;
        vho0 b = hik0Var.a.b(new xvc0(2));
        long j = hik0Var.b;
        gno0[] gno0VarArr = fno0.b;
        if ((j & 1095216660480L) == 0) {
            j = iik0.a;
        }
        long j2 = j;
        b6s b6sVar = hik0Var.c;
        if (b6sVar == null) {
            b6sVar = b6s.h;
        }
        b6s b6sVar2 = b6sVar;
        u5s u5sVar = hik0Var.d;
        u5s u5sVar2 = new u5s(u5sVar != null ? u5sVar.a : 0);
        v5s v5sVar = hik0Var.e;
        v5s v5sVar2 = new v5s(v5sVar != null ? v5sVar.a : MinElf.PN_XNUM);
        v4s v4sVar = hik0Var.f;
        if (v4sVar == null) {
            v4sVar = v4s.b;
        }
        v4s v4sVar2 = v4sVar;
        String str = hik0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = hik0Var.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = iik0.b;
        }
        long j4 = j3;
        et6 et6Var = hik0Var.i;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = et6Var != null ? et6Var.a : 0.0f;
        if (!Float.isNaN(f2)) {
            f = f2;
        }
        et6 et6Var2 = new et6(f);
        zho0 zho0Var = hik0Var.j;
        if (zho0Var == null) {
            zho0Var = zho0.c;
        }
        zho0 zho0Var2 = zho0Var;
        lwz lwzVar = hik0Var.k;
        if (lwzVar == null) {
            lwz lwzVar2 = lwz.d;
            lwzVar = sta0.a.b();
        }
        lwz lwzVar3 = lwzVar;
        long j5 = hik0Var.l;
        if (j5 == 16) {
            j5 = iik0.c;
        }
        long j6 = j5;
        pdo0 pdo0Var = hik0Var.m;
        if (pdo0Var == null) {
            pdo0Var = pdo0.b;
        }
        pdo0 pdo0Var2 = pdo0Var;
        v4j0 v4j0Var = hik0Var.n;
        if (v4j0Var == null) {
            v4j0Var = v4j0.d;
        }
        v4j0 v4j0Var2 = v4j0Var;
        hua0 hua0Var = hik0Var.o;
        qio qioVar = hik0Var.p;
        if (qioVar == null) {
            qioVar = qbr.a;
        }
        hik0 hik0Var2 = new hik0(b, j2, b6sVar2, u5sVar2, v5sVar2, v4sVar2, str2, j4, et6Var2, zho0Var2, lwzVar3, j6, pdo0Var2, v4j0Var2, hua0Var, qioVar);
        fh90 fh90Var = nmo0Var.b;
        int i2 = gh90.b;
        int i3 = fh90Var.a;
        int i4 = 5;
        int i5 = i3 == 0 ? 5 : i3;
        int i6 = fh90Var.b;
        if (i6 == 3) {
            int i7 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i7 == 1) {
                i4 = 4;
            } else if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = i4;
        } else if (i6 == 0) {
            int i8 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i8 == 1) {
                i = 1;
            } else {
                if (i8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 2;
            }
        } else {
            i = i6;
        }
        long j7 = fh90Var.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = gh90.a;
        }
        iio0 iio0Var = fh90Var.d;
        if (iio0Var == null) {
            iio0Var = iio0.c;
        }
        iio0 iio0Var2 = iio0Var;
        yta0 yta0Var = fh90Var.e;
        t7z t7zVar = fh90Var.f;
        int i9 = fh90Var.g;
        if (i9 == 0) {
            i9 = q7z.b;
        }
        int i10 = i9;
        int i11 = fh90Var.h;
        int i12 = i11 == 0 ? 1 : i11;
        zjo0 zjo0Var = fh90Var.i;
        if (zjo0Var == null) {
            zjo0Var = zjo0.c;
        }
        return new nmo0(hik0Var2, new fh90(i5, i, j7, iio0Var2, yta0Var, t7zVar, i10, i12, zjo0Var), nmo0Var.c);
    }
}
