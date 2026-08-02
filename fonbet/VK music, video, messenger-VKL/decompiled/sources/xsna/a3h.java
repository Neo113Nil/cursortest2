package xsna;

/* compiled from: CommunityFrescoImage.kt */
/* loaded from: classes17.dex */
public final class a3h {
    public static final void a(String str, q630 q630Var, wkj wkjVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-906982780);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(wkjVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-906982780, i2, -1, "com.vk.community.design.compose.image.CommunityFrescoImage (CommunityFrescoImage.kt:46)");
            }
            fwu0.c(q630Var2, null, str, null, null, null, null, kai.c(280318291, new z2h(wkjVar, 0), M), M, ((i2 >> 6) & 14) | 100663296 | ((i2 << 6) & 896), 250);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mx9(i, 2, str, q630Var, wkjVar, false);
        }
    }
}
