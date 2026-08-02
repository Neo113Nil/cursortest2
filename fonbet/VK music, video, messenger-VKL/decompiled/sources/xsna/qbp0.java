package xsna;

/* compiled from: TopshelfCardTextOverflow.kt */
/* loaded from: classes2.dex */
public final class qbp0 {
    public static final void a(final us2 us2Var, final frv0 frv0Var, final long j, final int i, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(477434019);
        int i3 = (M.J(us2Var) ? 4 : 2) | i2 | (M.J(frv0Var) ? 32 : 16) | (M.p(j) ? 256 : 128) | (M.o(i) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i3 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(477434019, i3, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.text.TopshelfOverflowText (TopshelfCardTextOverflow.kt:30)");
            }
            if (z) {
                M.K(-1694600222);
                int i4 = (i3 & 14) | ((i3 >> 12) & 112);
                int i5 = i3 << 3;
                aVar2 = M;
                ntu0.c(us2Var, q630Var, frv0Var, j, i, false, false, false, null, 0, null, 0, null, aVar2, i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 0, 8160);
                aVar2.j();
            } else {
                M.K(-1694404829);
                yqv0.d(us2Var, q630Var, j, 0, null, 2, true, i, null, null, frv0Var, M, (i3 & 14) | 905969664 | ((i3 >> 12) & 112) | (i3 & 896), ((i3 >> 9) & 14) | ((i3 << 6) & 7168), 6392);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.pbp0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qbp0.a(us2.this, frv0Var, j, i, z, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
