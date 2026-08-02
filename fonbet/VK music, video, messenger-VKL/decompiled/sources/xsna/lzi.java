package xsna;

import android.content.Context;
import com.vk.ecomm.configureitemlist.ConfigureItemListFragment;
import xsna.e0j;

/* compiled from: ConfigureItemListComposeView.kt */
/* loaded from: classes18.dex */
public final class lzi extends i6v0<e0j, izi> {
    public lzi(ConfigureItemListFragment configureItemListFragment, Context context) {
        super(context, configureItemListFragment);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((e0j) ao50Var, izsVar, aVar, 512);
    }

    public final void h(e0j e0jVar, izs<? super izi, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1870542511);
        int i2 = i | (M.J(e0jVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        int i3 = 0;
        int i4 = 1;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1870542511, i2, -1, "com.vk.ecomm.configureitemlist.presentation.composeview.ConfigureItemListComposeView.ThemedContent (ConfigureItemListComposeView.kt:33)");
            }
            wh50 d = d(e0j.c.a, new n0u0[]{e0jVar.a, e0jVar.b}, M, (i2 & 896) | 518);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(null, kai.c(1461277098, new zoc(izsVar, i4), M), null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-1131915147, new jzi(i3, d, izsVar), M), aVar2, 805306416, 381);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new uff(i, 1, this, e0jVar, izsVar);
        }
    }
}
