package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: LiveInlineHolderView.kt */
/* loaded from: classes16.dex */
public final class jjz {
    public static final void a(kjz kjzVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2074761888);
        if ((i & 6) == 0) {
            i2 = (M.J(kjzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2074761888, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.autoplay.player.LiveInlineHolderView (LiveInlineHolderView.kt:15)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new FrameLayout(context);
                M.R(x);
            }
            FrameLayout frameLayout = (FrameLayout) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new yjk0(context);
                M.R(x2);
            }
            yjk0 yjk0Var = (yjk0) x2;
            boolean y = M.y(frameLayout);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new cww(frameLayout, 2);
                M.R(x3);
            }
            q630Var2 = q630Var;
            ae2.a(i2 & 112, 4, M, (izs) x3, null, q630Var2);
            boolean y2 = M.y(frameLayout) | ((i2 & 14) == 4) | M.y(yjk0Var);
            Object x4 = M.x();
            if (y2 || x4 == c0012a) {
                x4 = new lf3(kjzVar, frameLayout, yjk0Var, 5);
                M.R(x4);
            }
            bap.c(frameLayout, (izs) x4, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new aak(kjzVar, q630Var2, i, 1);
        }
    }
}
