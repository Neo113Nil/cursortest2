package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.view.components.tooltip.VkTooltip;
import xsna.q630;

/* compiled from: ImAdBadge.kt */
/* loaded from: classes2.dex */
public final class jwv {
    public static final void a(String str, d5p0 d5p0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-479170986);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(d5p0Var) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-479170986, i2, -1, "com.vk.im.design.view.listitem.infobar.ImAdBadge (ImAdBadge.kt:29)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new Rect();
                M.R(x);
            }
            Object obj2 = (Rect) x;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x2 = M.x();
            Object obj3 = x2;
            if (z || x2 == obj) {
                VkTooltip.a aVar3 = new VkTooltip.a(context);
                SpannableStringBuilder spannableStringBuilder = d5p0Var.a;
                if (spannableStringBuilder != null) {
                    aVar3.c = spannableStringBuilder;
                }
                aVar3.g = true;
                aVar3.e = VkTooltip.Appearance.Neutral;
                aVar3.f = VkTooltip.TooltipGravity.TOP;
                aVar3.m = new ci0(d5p0Var, 6);
                aVar3.n = new jh(d5p0Var, 14);
                M.R(aVar3);
                obj3 = aVar3;
            }
            Object obj4 = (VkTooltip.a) obj3;
            boolean y = M.y(obj2);
            Object x3 = M.x();
            if (y || x3 == obj) {
                x3 = new l2i(obj2, 16);
                M.R(x3);
            }
            q630.a aVar4 = q630.a.a;
            q630 o = egi.o(aVar4, (izs) x3);
            boolean y2 = M.y(obj4) | (i3 == 32) | M.y(obj2);
            Object x4 = M.x();
            if (y2 || x4 == obj) {
                x4 = new ctn(d5p0Var, obj4, obj2, 1);
                M.R(x4);
            }
            aVar2 = M;
            rnu0.c(ContentBadgeSize.Small, ContentBadgeMode.Secondary, ContentBadgeAppearance.Design.Neutral, ojc.c(o, false, null, null, (gzs) x4, 15), null, null, str, null, null, null, false, null, false, null, aVar2, ((i2 << 18) & 3670016) | 438, 0, 16304);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new cr7(i, 4, str, d5p0Var, q630Var2);
        }
    }
}
