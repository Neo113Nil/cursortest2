package xsna;

/* compiled from: ClipsComposeThemeProvider.kt */
/* loaded from: classes16.dex */
public final class xnd {
    public final boolean a;

    public /* synthetic */ xnd(boolean z) {
        this.a = z;
    }

    public void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(81830819);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(81830819, i2, -1, "com.vk.clips.compose.ClipsComposeThemeProvider.Theme (ClipsComposeThemeProvider.kt:15)");
            }
            if (this.a) {
                M.K(-1719345753);
                aVar2 = M;
                rrv0.e(true, null, null, null, null, null, kai.c(-917853023, new dv4(jaiVar, 3), M), aVar2, 1572870, 62);
                aVar2.j();
            } else {
                M.K(-1719095831);
                rrv0.d(null, null, null, null, kai.c(1216243692, new oa5(jaiVar, 2), M), M, 24576, 15);
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
            s.d = new i8c(this, jaiVar, i, 1);
        }
    }
}
