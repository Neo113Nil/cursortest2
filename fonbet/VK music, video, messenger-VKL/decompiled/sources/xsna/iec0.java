package xsna;

/* compiled from: PostingDivider.kt */
/* loaded from: classes18.dex */
public final class iec0 {
    public static final void a(final float f, final int i, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-311104616);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            float f2 = 0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-311104616, i3, -1, "com.vk.feed.design.compose.posting.divider.PostingDivider (PostingDivider.kt:23)");
            }
            q630Var2 = q630Var;
            jqu0.a(q630Var2, 0L, (float) 0.33d, f2, M, (i3 & 14) | 384 | ((i3 << 6) & 7168), 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f = f2;
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hec0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    iec0.a(f, I, (androidx.compose.runtime.a) obj, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }
}
