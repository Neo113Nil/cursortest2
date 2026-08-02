package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$Size;
import com.vkontakte.android.R;
import xsna.iev;
import xsna.q630;

/* compiled from: GroupPickerPlusItem.kt */
/* loaded from: classes17.dex */
public final class rlu {
    public static final void a(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        long j;
        long j2;
        lg90 lg90Var;
        androidx.compose.runtime.a M = aVar.M(1674801626);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1674801626, i2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.views.GroupPickerPlusItem (GroupPickerPlusItem.kt:20)");
            }
            HorizontalListItem$Size.WithPicture withPicture = HorizontalListItem$Size.WithPicture.Small;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            q630 b = ojc.b(q630.a.a, (sg50) x, null, false, null, gzsVar, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1869183844, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
            }
            lg90 b2 = or.b(M, -604730424, R.drawable.vk_icon_add_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j3 = ylu0Var.getIcon().b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j4 = ylu0Var2.getBackground().x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-308353366, 8, -1, "com.vk.core.compose.component.horizontal.HorizontalListItem.VisualContent.Icon.invoke (HorizontalListItem.kt:137)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new zpv(b2, j3, j4);
                lg90Var = b2;
                j = j3;
                j2 = j4;
                M.R(x2);
            } else {
                j = j3;
                j2 = j4;
                lg90Var = b2;
            }
            zpv zpvVar = (zpv) x2;
            ((zak0) zpvVar.a).setValue(lg90Var);
            ((zak0) zpvVar.b).setValue(new l5g(j));
            ((zak0) zpvVar.c).setValue(new l5g(j2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 0;
            azu0.b(withPicture, zpvVar, iev.c.a(d370.N(R.string.clips_profile_switch_create_community_btn, 0, M), null, 2, null, M, 24576, 45), b, new gev(new uco(byc0.b(80, 64)), s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 5), new u890(f, f, f, f), 8), M, 6, 0);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new f9h(gzsVar, i, 8);
        }
    }
}
