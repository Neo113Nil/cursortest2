package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: SettingsButton.kt */
/* loaded from: classes18.dex */
public final class v0j0 implements znj {
    public final /* synthetic */ izs<com.vk.dialogtags.impl.list.a, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public v0j0(izs<? super com.vk.dialogtags.impl.list.a, s3q0> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.znj
    public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
        znj znjVar2;
        androidx.compose.runtime.a M = aVar.M(-364398339);
        int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-364398339, i2, -1, "com.vk.dialogtags.impl.list.ui.settingsButton.<no name provided>.Content (SettingsButton.kt:20)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1230249738, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoGearOutline28> (VkIcons.kt:4898)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_lego_gear_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 20;
            lqv B = znk0.B(a, 0L, byc0.b(f, f), M, 197000, 26);
            lzo0 d = nzo.d(3072, 6, M, d370.N(R.string.tag_settings_button, 0, M), false);
            q630 E = ahn.E(q630.a.a, "tag_settings_button");
            izs<com.vk.dialogtags.impl.list.a, s3q0> izsVar = this.b;
            boolean J = M.J(izsVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new mse(izsVar, 10);
                M.R(x);
            }
            znjVar2 = znjVar;
            aou0.d(znjVar2, (gzs) x, E, null, false, B, d, null, M, (i2 & 14) | 384, 76);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            znjVar2 = znjVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x7d(this, znjVar2, i, 8);
        }
    }
}
