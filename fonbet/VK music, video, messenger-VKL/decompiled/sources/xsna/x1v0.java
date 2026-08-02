package xsna;

import androidx.compose.foundation.layout.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.chromium.net.NetError;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkLazyColumn.kt */
/* loaded from: classes17.dex */
public final class x1v0 {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, xvy xvyVar, s890 s890Var, a.n nVar, dt1.b bVar, tpr tprVar, boolean z, e490 e490Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        xvy xvyVar2;
        s890 s890Var2;
        int i4;
        androidx.compose.runtime.a aVar2;
        final a.n nVar2;
        final tpr tprVar2;
        final e490 e490Var2;
        final q630 q630Var3;
        final xvy xvyVar3;
        final s890 s890Var3;
        final dt1.b bVar2;
        final boolean z2;
        androidx.compose.runtime.f s;
        s890 s890Var4;
        a.n nVar3;
        dt1.b bVar3;
        tpr f;
        int i5;
        e490 a;
        boolean z3;
        s890 s890Var5;
        int i6;
        androidx.compose.runtime.a M = aVar.M(-521435742);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else if ((i & 6) == 0) {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        } else {
            q630Var2 = q630Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xvyVar2 = xvyVar;
                if (M.J(xvyVar2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                xvyVar2 = xvyVar;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            xvyVar2 = xvyVar;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            s890Var2 = s890Var;
            i3 |= M.J(s890Var2) ? 256 : 128;
            int i9 = i3 | 3072;
            if ((i & 24576) == 0) {
                i9 = i3 | 11264;
            }
            int i10 = 196608 | i9;
            if ((1572864 & i) == 0) {
                i10 = 720896 | i9;
            }
            i4 = 12582912 | i10;
            if ((100663296 & i) == 0) {
                i4 = 46137344 | i10;
            }
            if ((805306368 & i) == 0) {
                i4 |= M.y(izsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            if (M.t(i4 & 1, (306783379 & i4) == 306783378)) {
                aVar2 = M;
                aVar2.h();
                nVar2 = nVar;
                tprVar2 = tprVar;
                e490Var2 = e490Var;
                q630Var3 = q630Var2;
                xvyVar3 = xvyVar2;
                s890Var3 = s890Var2;
                bVar2 = bVar;
                z2 = z;
            } else {
                M.V();
                int i11 = i & 1;
                q630.a aVar3 = q630.a.a;
                if (i11 == 0 || M.i()) {
                    if (i7 != 0) {
                        q630Var2 = aVar3;
                    }
                    if ((i2 & 2) != 0) {
                        xvy a2 = zvy.a(0, 3, M);
                        i4 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        xvyVar2 = a2;
                    }
                    if (i8 != 0) {
                        float f2 = 0;
                        s890Var4 = new u890(f2, f2, f2, f2);
                    } else {
                        s890Var4 = s890Var2;
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    nVar3 = mVar;
                    bVar3 = dt1.a.n;
                    f = k7b0.f(0, M);
                    i5 = i4 & (-238608385);
                    a = g490.a(M);
                    z3 = true;
                    s890Var5 = s890Var4;
                } else {
                    M.h();
                    if ((i2 & 2) != 0) {
                        i4 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    }
                    i5 = i4 & (-238608385);
                    nVar3 = nVar;
                    bVar3 = bVar;
                    f = tprVar;
                    z3 = z;
                    a = e490Var;
                    s890Var5 = s890Var2;
                }
                xvy xvyVar4 = xvyVar2;
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-521435742, i5, -1, "com.vk.core.tool.compose.core.VkLazyColumn (VkLazyColumn.kt:38)");
                }
                aVar2 = M;
                lqy.a(skn0.b(aVar3, s3q0.a, t630.a).g(q630Var2), xvyVar4, s890Var5, nVar3, bVar3, f, z3, a, izsVar, aVar2, i5 & 2147483632, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var2;
                xvyVar3 = xvyVar4;
                s890Var3 = s890Var5;
                nVar2 = nVar3;
                bVar2 = bVar3;
                tprVar2 = f;
                z2 = z3;
                e490Var2 = a;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.w1v0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x1v0.a(q630.this, xvyVar3, s890Var3, nVar2, bVar2, tprVar2, z2, e490Var2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        s890Var2 = s890Var;
        int i92 = i3 | 3072;
        if ((i & 24576) == 0) {
        }
        int i102 = 196608 | i92;
        if ((1572864 & i) == 0) {
        }
        i4 = 12582912 | i102;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (M.t(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
