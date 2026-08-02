package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: AddToMyMusicButton.kt */
/* loaded from: classes3.dex */
public final class po0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final izs<? super Boolean, Integer> izsVar, final izs<? super sx40, s3q0> izsVar2, q630 q630Var, final boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1641513482);
        if ((i & 6) == 0) {
            i3 = (M.l(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(izsVar2) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.l(z2) ? 16384 : 8192;
            }
            if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1641513482, i3, -1, "com.vk.music.stickyplayer.presentation.components.AddToMyMusicButton (AddToMyMusicButton.kt:30)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = io.reactivex.rxjava3.internal.operators.mixed.j.d(z, M);
                }
                wh50 wh50Var = (wh50) x;
                wh50Var.setValue(Boolean.valueOf(z));
                q630 E = ahn.E(txj0.v(q630Var4, 40), ((Boolean) wh50Var.getValue()).booleanValue() ? "deleteTrackButton" : "addTrackButton");
                float f = 24;
                boolean z3 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new mo0(izsVar2, wh50Var, z);
                    M.R(x2);
                }
                gzs d = z3r0.d(0, 1, M, (gzs) x2);
                jai c = kai.c(-1284219157, new no0(izsVar, wh50Var, z2), M);
                q630 q630Var5 = q630Var4;
                nzu0.e(d, E, f, null, false, null, null, c, M, 100663680, 248);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.oo0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        po0.a(z, izsVar, izsVar2, q630Var3, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 24576) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 9363) == 9362)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
