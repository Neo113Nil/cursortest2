package xsna;

import com.vk.core.compose.component.defaults.SliderSize;
import ru.ok.android.webrtc.mediarecord.VideoRecord;

/* compiled from: VkSliderDefault.kt */
/* loaded from: classes17.dex */
public abstract class k0k0 {

    /* compiled from: VkSliderDefault.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SliderSize.values().length];
            try {
                iArr[SliderSize.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SliderSize.Compact.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final pml a(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        iyk0 iyk0Var = rrv0.a;
        ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getBackground().j;
        long b = b(0, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j2 = ylu0Var2.b().a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1518622954, 0, -1, "com.vk.core.compose.component.defaults.SliderDefault.colors (VkSliderDefault.kt:47)");
        }
        pml g = crx0.g(j, j, b, j2, b, j2, aVar, VideoRecord.DEFAULT_MAX_DIMENSION);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return g;
    }

    public abstract long b(int i, androidx.compose.runtime.a aVar);
}
