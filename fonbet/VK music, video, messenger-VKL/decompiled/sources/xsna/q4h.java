package xsna;

import xsna.wkj;

/* compiled from: CommunityImageContent.kt */
/* loaded from: classes17.dex */
public final class q4h {
    public static final void a(final String str, final q630 q630Var, final uog0 uog0Var, wzs wzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-850124805);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        int i4 = i3 | (M.J(uog0Var) ? 256 : 128);
        int i5 = i4 | 3072;
        int i6 = i2 & 16;
        if (i6 != 0) {
            i5 = i4 | 27648;
        } else if ((i & 24576) == 0) {
            i5 |= M.y(wzsVar) ? 16384 : 8192;
        }
        if (M.t(i5 & 1, (i5 & 9363) != 9362)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            } else if (i6 != 0) {
                wzsVar = mdi.a;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-850124805, i5, -1, "com.vk.community.design.compose.image.CommunityImageContent (CommunityImageContent.kt:34)");
            }
            float f = kqu0.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 d = rte0.d(r18.a(f, ylu0Var.getImage().a, q630Var, uog0Var), uog0Var);
            wzsVar.invoke(M, Integer.valueOf((i5 >> 12) & 14));
            M.K(1354998591);
            a3h.a(str, d, wkj.a.a, M, (i5 & 14) | 3120);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final wzs wzsVar2 = wzsVar;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p4h
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q4h.a(str, q630Var, uog0Var, wzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
