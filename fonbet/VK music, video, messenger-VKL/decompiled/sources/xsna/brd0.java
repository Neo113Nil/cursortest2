package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.aku;

/* compiled from: ProductPreviewMarketHeaderContent.kt */
/* loaded from: classes18.dex */
public final class brd0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        SemanticsConfiguration.Mode mode;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-664758760);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-664758760, i, -1, "com.vk.ecomm.market.goodpreview.presentation.compose.ProductPreviewMarketHeaderContent (ProductPreviewMarketHeaderContent.kt:20)");
            }
            String N = d370.N(R.string.good_preview_market_title, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new av70(6);
                M.R(x);
            }
            com.vk.core.compose.component.group.header.f a = f.a.a(N, null, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, false, M, 805306368, 446);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, Tensorflow.FRAME_WIDTH, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                mode = null;
                x2 = new com.vk.core.compose.component.group.header.a(a, null);
                M.R(x2);
            } else {
                mode = null;
            }
            com.vk.core.compose.component.group.header.a aVar2 = (com.vk.core.compose.component.group.header.a) x2;
            ((zak0) aVar2.a).setValue(a);
            ((zak0) aVar2.b).setValue(mode);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            b.C0749b c0749b = b.C0749b.a;
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(1291943170, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-MarketCircleFillBlue28> (VkIcons.kt:7230)");
            } else {
                i2 = 0;
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_market_circle_fill_blue_28, i2, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new t6c0(1);
                M.R(x3);
            }
            aku.a a3 = aku.a.C2548a.a(a2, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 3), M, 6);
            String N2 = d370.N(R.string.good_preview_market_button, 0, M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonStyle buttonStyle = ButtonStyle.Link;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new d0k(25);
                M.R(x4);
            }
            com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x4, 3);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new vrc(izsVar, 4);
                M.R(x5);
            }
            GroupHeader$Right.a.C0743a a5 = GroupHeader$Right.a.C0743a.C0744a.a(N2, (gzs) x5, buttonSize, buttonStyle, buttonAppearance, null, a4, M, 28032, 16352);
            M = M;
            com.vk.core.compose.component.group.header.g.a(aVar2, q630Var, c0749b, a3, GroupHeader$Right.c.a(a5, null, null, null, M, 14), false, M, Tensorflow.FRAME_WIDTH, 96);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ljf(izsVar, q630Var, i, 5);
        }
    }
}
