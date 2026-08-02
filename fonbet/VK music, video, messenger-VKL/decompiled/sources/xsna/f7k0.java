package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: SnackbarContent.kt */
/* loaded from: classes17.dex */
public interface f7k0 {

    /* compiled from: SnackbarContent.kt */
    public static final class a {
        public static tl20 a(String str, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
            String str2;
            gzs gzsVar2;
            ButtonSize buttonSize = ButtonSize.Small;
            w65.k().getClass();
            ButtonStyle buttonStyle = ButtonStyle.Tertiary;
            w65.k().getClass();
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-488795816, i, 24576, "com.vk.core.compose.component.snackbar.SnackbarContent.Middle.Button.Companion.invoke (SnackbarContent.kt:245)");
            }
            int i2 = ((i << 3) & 896) | 2097158;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1972033225, i2, 8, "com.vk.core.compose.component.snackbar.remember (MiddleButtonImpl.kt:88)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                str2 = str;
                gzsVar2 = gzsVar;
                tl20 tl20Var = new tl20(str2, gzsVar2, buttonSize, buttonStyle, buttonAppearance);
                aVar.R(tl20Var);
                x = tl20Var;
            } else {
                str2 = str;
                gzsVar2 = gzsVar;
            }
            tl20 tl20Var2 = (tl20) x;
            ((zak0) tl20Var2.a).setValue(str2);
            ((zak0) tl20Var2.b).setValue(gzsVar2);
            ((zak0) tl20Var2.n).setValue(null);
            ((zak0) tl20Var2.d).setValue(buttonSize);
            ((zak0) tl20Var2.c).setValue(buttonStyle);
            ((zak0) tl20Var2.e).setValue(buttonAppearance);
            ((zak0) tl20Var2.f).setValue(null);
            ((zak0) tl20Var2.g).setValue(null);
            ((zak0) tl20Var2.h).setValue(null);
            ((zak0) tl20Var2.i).setValue(null);
            ((zak0) tl20Var2.j).setValue(null);
            ((zak0) tl20Var2.k).setValue(null);
            ((zak0) tl20Var2.l).setValue(null);
            ((zak0) tl20Var2.m).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return tl20Var2;
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
