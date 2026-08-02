package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import xsna.f7p0;

/* compiled from: Favorite.kt */
/* loaded from: classes18.dex */
public final class zsq {
    public static final d.b.a a(int i, gzs<s3q0> gzsVar, izs<? super tgi0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        izs izsVar2;
        int i4;
        androidx.compose.runtime.a aVar2;
        f7p0.c cVar;
        String a;
        int i5 = i3 & 4;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (i5 != 0) {
            Object x = aVar.x();
            if (x == c0012a) {
                x = new xsq(0);
                aVar.R(x);
            }
            izsVar2 = (izs) x;
        } else {
            izsVar2 = izsVar;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1225477523, i2, -1, "com.vk.ecomm.design.compose.topbar.favoriteExtraTopBarIcon (Favorite.kt:50)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(963857668, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-BookmarkOutline28> (VkSdkIcons.kt:158)");
        }
        lg90 b = or.b(aVar, -1867375013, R.drawable.vk_icon_bookmark_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        boolean J = aVar.J(gzsVar);
        Object x2 = aVar.x();
        if (J || x2 == c0012a) {
            x2 = new taf(1, gzsVar);
            aVar.R(x2);
        }
        gzs gzsVar2 = (gzs) x2;
        if (i > 0) {
            aVar.K(-978557723);
            i4 = i;
            cVar = f7p0.c.a.a(i4, null, null, null, aVar, 24576, 14);
            aVar2 = aVar;
            aVar2.j();
        } else {
            i4 = i;
            aVar2 = aVar;
            aVar2.K(-978474271);
            aVar2.j();
            cVar = null;
        }
        f7p0.c cVar2 = cVar;
        int i6 = i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(880716839, i6, -1, "com.vk.ecomm.design.compose.topbar.favoriteSemanticsConfiguration (Favorite.kt:72)");
        }
        if (i4 > 0) {
            aVar2.K(-519608149);
            a = d370.F(R.plurals.ecomm_top_bar_fave_with_counter, i4, new Object[]{Integer.valueOf(i4)}, aVar2, 0);
            aVar2.j();
        } else {
            a = zq.a(aVar2, -519461984, R.string.ecomm_top_bar_fave, aVar2, 0);
        }
        String str = a;
        String N = d370.N(R.string.ecomm_top_bar_fave_action, 0, aVar2);
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        boolean J2 = aVar2.J(str) | ((((i2 & 896) ^ 384) > 256 && aVar2.J(izsVar2)) || (i2 & 384) == 256) | aVar2.J(N) | aVar2.J(gzsVar);
        Object x3 = aVar2.x();
        if (J2 || x3 == c0012a) {
            ysq ysqVar = new ysq(izsVar2, str, N, gzsVar, 0);
            aVar2.R(ysqVar);
            x3 = ysqVar;
        }
        com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        d.b.a a3 = d.b.a.C0757a.a(b, null, gzsVar2, cVar2, null, a2, aVar2, 12582968, 80);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a3;
    }
}
