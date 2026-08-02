package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.animation.k;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class kla1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(lej0 lej0Var, f530 f530Var, j690 j690Var, tls tlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        j690 j690Var2;
        int i4;
        int i5;
        f530 f530Var3;
        j690 j690Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1083503044);
        int i6 = i | (btsVar.k(lej0Var) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar.k(f530Var2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 = i6 | 384;
                j690Var2 = j690Var;
            } else {
                j690Var2 = j690Var;
                i4 = i6 | (btsVar.k(j690Var2) ? 256 : 128);
            }
            i5 = i4 | (!btsVar.e(tlsVar) ? 2048 : 1024);
            if (btsVar.V(i5 & 1, (i5 & 1171) == 1170)) {
                btsVar.Y();
                f530Var3 = f530Var2;
                j690Var3 = j690Var2;
            } else {
                f530 f530Var4 = i7 != 0 ? c530.a : f530Var2;
                j690 d = i3 != 0 ? an91.d(16.0f, 0.0f, 16.0f, 16.0f, 2) : j690Var2;
                b a = a7y.a(0, 3, btsVar);
                List list = lej0Var != null ? lej0Var.a.a : null;
                bpl0 bpl0Var = (list == null || list.isEmpty()) ? null : lej0Var.a;
                f530 c = ljs0.c(f530Var4, 1.0f);
                Object Q = btsVar.Q();
                int i8 = 29;
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = new ur70(i8);
                    btsVar.o0(Q);
                }
                w2o a2 = k.q(1, (tls) Q, null).a(k.d(null, null, 15)).a(k.e(null, 3));
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new ur70(i8);
                    btsVar.o0(Q2);
                }
                ttb1.a(bpl0Var, c, a2, k.v(1, (tls) Q2, null).a(k.l(null, null, 15)).a(k.f(null, 3)), "RequirementChips", wwg.S(348106506, true, new dhj0(a, d, tlsVar, 14), btsVar), btsVar, 224640, 0);
                j690Var3 = d;
                f530Var3 = f530Var4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new p91(lej0Var, f530Var3, j690Var3, tlsVar, i, i2, 9);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        i5 = i4 | (!btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i5 & 1, (i5 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final String b(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final lum d() {
        return new lum(new txk(22), qoq.a, new mtw(26), roq.a);
    }

    public static final yd00 e(x40 x40Var, tls tlsVar, fid fidVar, int i) {
        Object u50Var;
        x40 x40Var2;
        f.n(x40Var, fidVar);
        oz40 n = f.n(tlsVar, fidVar);
        Object[] objArr = new Object[0];
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = new c20(2);
            btsVar.o0(Q);
        }
        String str = (String) cvw.V(objArr, (sls) Q, btsVar, 48);
        x50 x50Var = (x50) btsVar.m(r1z.a);
        if (x50Var == null) {
            btsVar.e0(1213380307);
            Object obj = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof x50) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            x50Var = (x50) obj;
        } else {
            btsVar.e0(1213379439);
        }
        btsVar.t(false);
        if (x50Var == null) {
            ny61.r("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        t50 activityResultRegistry = x50Var.getActivityResultRegistry();
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = new n50();
            btsVar.o0(Q2);
        }
        n50 n50Var = (n50) Q2;
        Object Q3 = btsVar.Q();
        if (Q3 == o430Var) {
            Q3 = new yd00(n50Var);
            btsVar.o0(Q3);
        }
        yd00 yd00Var = (yd00) Q3;
        boolean e = btsVar.e(n50Var) | btsVar.e(activityResultRegistry) | btsVar.k(str) | btsVar.e(x40Var) | btsVar.k(n);
        Object Q4 = btsVar.Q();
        if (e || Q4 == o430Var) {
            x40Var2 = x40Var;
            u50Var = new u50(n50Var, activityResultRegistry, str, x40Var2, n, 0);
            btsVar.o0(u50Var);
        } else {
            u50Var = Q4;
            x40Var2 = x40Var;
        }
        zpn.c(activityResultRegistry, str, x40Var2, (tls) u50Var, btsVar);
        return yd00Var;
    }
}
