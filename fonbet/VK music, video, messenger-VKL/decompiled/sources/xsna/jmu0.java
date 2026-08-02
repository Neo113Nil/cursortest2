package xsna;

/* compiled from: VkComposeModalBottomSheet.kt */
/* loaded from: classes17.dex */
public abstract class jmu0 extends vpi {
    public static final /* synthetic */ int g1 = 0;

    @Override // xsna.vpi
    public final void Yn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(2114266168);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2114266168, i2, -1, "com.vk.core.compose.modal.VkComposeModalBottomSheet.BottomContent (VkComposeModalBottomSheet.kt:10)");
            }
            his0.b(6, M, kai.c(1169558426, new x7c(this, 9), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new th3(this, i, 11);
        }
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1163656669);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1163656669, i2, -1, "com.vk.core.compose.modal.VkComposeModalBottomSheet.Content (VkComposeModalBottomSheet.kt:7)");
            }
            his0.b(6, M, kai.c(-1251566843, new oac(this, 19), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bh5(this, i, 18);
        }
    }

    public abstract void co(int i, androidx.compose.runtime.a aVar);
}
