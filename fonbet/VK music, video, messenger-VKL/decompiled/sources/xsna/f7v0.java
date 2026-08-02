package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;

/* compiled from: VkOnboarding.kt */
/* loaded from: classes17.dex */
public interface f7v0 {

    /* compiled from: VkOnboarding.kt */
    public static final class a {
        public static yp8 a(String str, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-294134900, i, -1, "com.vk.core.tool.onboarding.VkOnboarding.Button.Companion.invoke (VkOnboarding.kt:98)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                yp8 yp8Var = new yp8(str, gzsVar, buttonSize, buttonStyle, buttonAppearance);
                aVar.R(yp8Var);
                x = yp8Var;
            }
            yp8 yp8Var2 = (yp8) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return yp8Var2;
        }
    }

    void a(VkOnboardingStat$Delegate vkOnboardingStat$Delegate, androidx.compose.runtime.a aVar, int i);
}
