package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.b280;

/* compiled from: OldUserOnBoardingStateBottomView.kt */
/* loaded from: classes5.dex */
public final class k080 {
    public static final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var, b280 b280Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1182621578);
        int i2 = i | (M.J(b280Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1182621578, i2, -1, "com.vk.profile.core.onboarding.mvi.view.CloseButton (OldUserOnBoardingStateBottomView.kt:73)");
            }
            if (b280Var instanceof b280.b) {
                M.K(-137077641);
                ButtonSize buttonSize = ButtonSize.Large;
                String str = ((b280.b) b280Var).b;
                ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                boolean z = (i2 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new yd1(izsVar, 5);
                    M.R(x);
                }
                bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, q630Var, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, M, 28080, 0, 0, 4190176);
                aVar2 = M;
            } else {
                aVar2 = M;
                aVar2.K(-140079464);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new vy7(i, 6, b280Var, izsVar, q630Var);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var, b280 b280Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-181105829);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(b280Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-181105829, i2, -1, "com.vk.profile.core.onboarding.mvi.view.NextButton (OldUserOnBoardingStateBottomView.kt:91)");
            }
            ButtonSize buttonSize = ButtonSize.Large;
            String a = b280Var.a();
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            int i3 = i2;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new mv7(izsVar, 4);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, q630Var, null, false, false, null, null, null, a, null, null, null, null, false, null, null, null, aVar2, ((i3 << 6) & 57344) | X2.b.f, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ni1(izsVar, b280Var, q630Var, i);
        }
    }
}
