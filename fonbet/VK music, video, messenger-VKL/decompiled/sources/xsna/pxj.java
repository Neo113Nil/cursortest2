package xsna;

import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.view.components.counter.VkCounter;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CounterExt.kt */
/* loaded from: classes17.dex */
public final class pxj {

    /* compiled from: CounterExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkCounter.Mode.values().length];
            try {
                iArr[VkCounter.Mode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkCounter.Mode.Contrast.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkCounter.Mode.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkCounter.Size.values().length];
            try {
                iArr2[VkCounter.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkCounter.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkCounter.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CounterAppearance a(VkCounter.CounterAppearance counterAppearance) {
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.Accent) {
            return CounterAppearance.Design.Accent;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.Neutral) {
            return CounterAppearance.Design.Neutral;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.AccentGreen) {
            return CounterAppearance.Design.AccentGreen;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Appearance.AccentRed) {
            return CounterAppearance.Design.AccentRed;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Priority.High) {
            return CounterAppearance.Priority.High;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Priority.Medium) {
            return CounterAppearance.Priority.Medium;
        }
        if (counterAppearance == VkCounter.CounterAppearance.Priority.Low) {
            return CounterAppearance.Priority.Low;
        }
        if (!(counterAppearance instanceof VkCounter.CounterAppearance.a)) {
            throw new NoWhenBranchMatchedException();
        }
        VkCounter.CounterAppearance.a aVar = (VkCounter.CounterAppearance.a) counterAppearance;
        return new CounterAppearance.a(f870.c(aVar.b), f870.c(aVar.c));
    }
}
