package xsna;

import androidx.compose.runtime.a;
import com.ironsource.Z3;
import java.util.List;
import java.util.Map;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: SelectSlot.kt */
/* loaded from: classes18.dex */
public final class y9i0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, Map map, Object obj, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i, int i2) {
        String str2;
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-422484493);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(map) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? M.J(obj) : M.y(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 16384 : 8192;
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
            } else {
                q630 q630Var3 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-422484493, i3, -1, "com.vk.design.demo.presentation.components.SelectSlot (SelectSlot.kt:27)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x);
                }
                wh50 wh50Var = (wh50) x;
                boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                String valueOf = String.valueOf(obj);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new x2x(1, wh50Var);
                    M.R(x2);
                }
                u2x a = g8s.b.a.a(s2x.b.a.b(valueOf, booleanValue, (izs) x2, null, null, 0L, 0L, null, kai.c(-1852973170, new ejj(map, izsVar, 1, wh50Var), M), M, 384, Z3.l), null, false, null, M, 24576, 14);
                M = M;
                q630Var2 = q630Var3;
                nvu0.a(a, q630Var2, h8s.a.a(str2, false, null, null, null, M, (i3 & 14) | 196608, 30), null, null, M, (i3 >> 9) & 112, 24);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            q630 q630Var4 = q630Var2;
            s = M.s();
            if (s == null) {
                s.d = new j74(str, map, obj, izsVar, q630Var4, i, i2);
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        q630 q630Var42 = q630Var2;
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final List list, final Object obj, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1149047907);
        if ((i & 48) == 0) {
            i3 = (M.J(list) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | (M.J(obj) ? 256 : 128);
        if ((i & 3072) == 0) {
            i4 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 16384 : 8192;
            if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i5 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1149047907, i4, -1, "com.vk.design.demo.presentation.components.SelectSlot (SelectSlot.kt:64)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x);
                }
                wh50 wh50Var = (wh50) x;
                boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                String valueOf = String.valueOf(obj);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new dm3(4, wh50Var);
                    M.R(x2);
                }
                u2x a = g8s.b.a.a(s2x.b.a.b(valueOf, booleanValue, (izs) x2, null, null, 0L, 0L, null, kai.c(-246428120, new jf80(list, izsVar, wh50Var), M), M, 384, Z3.l), null, false, null, M, 24576, 14);
                M = M;
                q630 q630Var5 = q630Var4;
                nvu0.a(a, q630Var5, h8s.a.a(str, false, null, null, null, M, 196614, 30), null, null, M, (i4 >> 9) & 112, 24);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.x9i0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        y9i0.b(str, list, obj, izsVar, q630Var3, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i4 & 1, (i4 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
