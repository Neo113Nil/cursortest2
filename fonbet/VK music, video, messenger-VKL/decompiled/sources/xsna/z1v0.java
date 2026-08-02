package xsna;

import androidx.compose.foundation.layout.a;
import org.chromium.net.NetError;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkLazyRow.kt */
/* loaded from: classes17.dex */
public final class z1v0 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q630 q630Var, xvy xvyVar, s890 s890Var, a.e eVar, dt1.c cVar, tpr tprVar, boolean z, final izs izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        xvy xvyVar2;
        s890 s890Var2;
        a.e eVar2;
        int i4;
        dt1.c cVar2;
        int i5;
        izs izsVar2;
        androidx.compose.runtime.a aVar2;
        final xvy xvyVar3;
        final s890 s890Var3;
        final a.e eVar3;
        final dt1.c cVar3;
        final tpr tprVar2;
        final boolean z2;
        androidx.compose.runtime.f s;
        a.e eVar4;
        dt1.c cVar4;
        int i6;
        a.e eVar5;
        int i7;
        dt1.c cVar5;
        boolean z3;
        tpr f;
        int i8;
        int i9;
        androidx.compose.runtime.a M = aVar.M(-927073916);
        if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                xvyVar2 = xvyVar;
                if (M.J(xvyVar2)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                xvyVar2 = xvyVar;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            xvyVar2 = xvyVar;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            s890Var2 = s890Var;
            i3 |= M.J(s890Var2) ? 256 : 128;
            int i11 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    eVar2 = eVar;
                    if (M.J(eVar2)) {
                        i8 = 16384;
                        i11 |= i8;
                    }
                } else {
                    eVar2 = eVar;
                }
                i8 = 8192;
                i11 |= i8;
            } else {
                eVar2 = eVar;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i11 |= 196608;
            } else if ((196608 & i) == 0) {
                cVar2 = cVar;
                i11 |= M.J(cVar2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    i11 |= 524288;
                }
                i5 = i11 | 12582912;
                if ((100663296 & i) == 0) {
                    izsVar2 = izsVar;
                    i5 |= M.y(izsVar2) ? 67108864 : 33554432;
                } else {
                    izsVar2 = izsVar;
                }
                if (M.t(i5 & 1, (38347923 & i5) != 38347922)) {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        if ((i2 & 2) != 0) {
                            xvyVar2 = zvy.a(0, 3, M);
                            i5 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if (i10 != 0) {
                            float f2 = 0;
                            s890Var2 = new u890(f2, f2, f2, f2);
                        }
                        if ((i2 & 16) != 0) {
                            eVar4 = androidx.compose.foundation.layout.a.a;
                            i5 &= -57345;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (i4 != 0) {
                            dt1.a.getClass();
                            cVar4 = dt1.a.l;
                        } else {
                            cVar4 = cVar2;
                        }
                        i6 = i5 & (-3670017);
                        eVar5 = eVar4;
                        i7 = 3;
                        cVar5 = cVar4;
                        z3 = true;
                        f = k7b0.f(0, M);
                    } else {
                        M.h();
                        if ((i2 & 2) != 0) {
                            i5 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        i6 = i5 & (-3670017);
                        f = tprVar;
                        z3 = z;
                        cVar5 = cVar2;
                        i7 = 3;
                        eVar5 = eVar2;
                    }
                    s890 s890Var4 = s890Var2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-927073916, i6, -1, "com.vk.core.tool.compose.core.VkLazyRow (VkLazyRow.kt:34)");
                    }
                    aVar2 = M;
                    izs izsVar3 = izsVar2;
                    xvy xvyVar4 = xvyVar2;
                    lqy.b(skn0.b(q630.a.a, s3q0.a, t630.a).g(q630Var), xvyVar4, s890Var4, eVar5, cVar5, f, z3, null, izsVar3, aVar2, (33554416 & i6) | ((i6 << i7) & 1879048192), 256);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    xvyVar3 = xvyVar4;
                    s890Var3 = s890Var4;
                    eVar3 = eVar5;
                    cVar3 = cVar5;
                    tprVar2 = f;
                    z2 = z3;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    xvyVar3 = xvyVar2;
                    s890Var3 = s890Var2;
                    eVar3 = eVar2;
                    cVar3 = cVar2;
                    tprVar2 = tprVar;
                    z2 = z;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.y1v0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            z1v0.a(q630.this, xvyVar3, s890Var3, eVar3, cVar3, tprVar2, z2, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            cVar2 = cVar;
            if ((1572864 & i) == 0) {
            }
            i5 = i11 | 12582912;
            if ((100663296 & i) == 0) {
            }
            if (M.t(i5 & 1, (38347923 & i5) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        s890Var2 = s890Var;
        int i112 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        cVar2 = cVar;
        if ((1572864 & i) == 0) {
        }
        i5 = i112 | 12582912;
        if ((100663296 & i) == 0) {
        }
        if (M.t(i5 & 1, (38347923 & i5) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
