package xsna;

/* compiled from: VideoComposeThemeProvider.kt */
/* loaded from: classes7.dex */
public final class bds0 {
    public final boolean a;

    public bds0(boolean z) {
        this.a = z;
    }

    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(881019846);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(881019846, i2, -1, "com.vk.video.ui.share.impl.compose.VideoComposeThemeProvider.Theme (VideoComposeThemeProvider.kt:15)");
            }
            if (this.a) {
                M.K(-82764124);
                aVar2 = M;
                rrv0.e(true, null, null, null, null, null, kai.c(-93142972, new vcj0(jaiVar), M), aVar2, 1572870, 62);
                aVar2.j();
            } else {
                M.K(-82514202);
                rrv0.d(null, null, null, null, kai.c(-28615601, new ads0(0, jaiVar), M), M, 24576, 15);
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
            s.d = new l6(this, jaiVar, i, 8);
        }
    }
}
