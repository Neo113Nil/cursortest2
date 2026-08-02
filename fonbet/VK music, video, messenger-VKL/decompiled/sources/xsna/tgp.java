package xsna;

/* compiled from: EmptyOverlay.kt */
/* loaded from: classes17.dex */
public final class tgp implements z190 {
    public static final tgp a = new tgp();

    @Override // xsna.z190
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-1248727897);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1248727897, i, -1, "com.vk.core.compose.component.image.overlay.EmptyOverlay.invoke (EmptyOverlay.kt:11)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sgp(this, j, q630Var, i, 0);
        }
    }
}
