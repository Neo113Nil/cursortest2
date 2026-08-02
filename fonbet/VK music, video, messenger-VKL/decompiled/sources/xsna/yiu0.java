package xsna;

import xsna.q630;

/* compiled from: VkCellSkeleton.kt */
/* loaded from: classes17.dex */
public final class yiu0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q630 q630Var, poa poaVar, voa voaVar, jdj0 jdj0Var, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        Object obj;
        int i4;
        Object obj2;
        int i5;
        jdj0 jdj0Var2;
        int i6;
        int i7;
        q630 q630Var3;
        Object obj3;
        jdj0 jdj0Var3;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        jdj0 b;
        Object obj4;
        androidx.compose.runtime.a M = aVar.M(138511852);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i | (M.J(q630Var2) ? 4 : 2);
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i4 = i3 | 48;
            obj = poaVar;
        } else {
            obj = poaVar;
            i4 = i3 | (M.J(obj) ? 32 : 16);
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i5 = i4 | 384;
            obj2 = voaVar;
        } else {
            obj2 = voaVar;
            i5 = i4 | (M.J(obj2) ? 256 : 128);
        }
        if ((i2 & 8) == 0) {
            jdj0Var2 = jdj0Var;
            if (M.y(jdj0Var2)) {
                i6 = 2048;
                i7 = i5 | i6;
                if (M.t(i7 & 1, (i7 & 1171) == 1170)) {
                    M.h();
                    q630Var3 = q630Var2;
                    obj3 = obj;
                    jdj0Var3 = jdj0Var2;
                } else {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                        if (i9 != 0) {
                            obj = null;
                        }
                        if (i10 != 0) {
                            obj2 = null;
                        }
                        if ((i2 & 8) != 0) {
                            b = ckv0.b(null, M, 1);
                            i7 &= -7169;
                            obj4 = obj;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(138511852, i7, -1, "com.vk.core.compose.component.cell.VkCellSkeleton (VkCellSkeleton.kt:29)");
                            }
                            ckv0.a(q630Var4, b, kai.c(-10608847, new v9a(4, obj4, obj2), M), M, (i7 & 14) | 384 | ((i7 >> 6) & 112), 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var4;
                            jdj0Var3 = b;
                            obj3 = obj4;
                        }
                    } else {
                        M.h();
                        if ((i2 & 8) != 0) {
                            i7 &= -7169;
                        }
                        q630Var4 = q630Var2;
                    }
                    obj4 = obj;
                    b = jdj0Var2;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    ckv0.a(q630Var4, b, kai.c(-10608847, new v9a(4, obj4, obj2), M), M, (i7 & 14) | 384 | ((i7 >> 6) & 112), 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var3 = q630Var4;
                    jdj0Var3 = b;
                    obj3 = obj4;
                }
                Object obj5 = obj2;
                s = M.s();
                if (s == null) {
                    s.d = new yra0(q630Var3, obj3, obj5, jdj0Var3, i, i2, 1);
                    return;
                }
                return;
            }
        } else {
            jdj0Var2 = jdj0Var;
        }
        i6 = 1024;
        i7 = i5 | i6;
        if (M.t(i7 & 1, (i7 & 1171) == 1170)) {
        }
        Object obj52 = obj2;
        s = M.s();
        if (s == null) {
        }
    }
}
