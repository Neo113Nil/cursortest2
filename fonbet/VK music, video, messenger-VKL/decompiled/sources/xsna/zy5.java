package xsna;

import android.content.Context;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.view.components.badge.VkBadge;
import kotlin.NoWhenBranchMatchedException;
import xsna.cut0;

/* compiled from: BadgeExt.kt */
/* loaded from: classes17.dex */
public final class zy5 {
    public static final BadgeAppearance a(VkBadge.Appearance appearance, Context context) {
        if (appearance == VkBadge.Appearance.Design.Accent) {
            return BadgeAppearance.Design.Accent;
        }
        if (appearance == VkBadge.Appearance.Design.Neutral) {
            return BadgeAppearance.Design.Neutral;
        }
        if (appearance == VkBadge.Appearance.Design.AccentGreen) {
            return BadgeAppearance.Design.AccentGreen;
        }
        if (appearance == VkBadge.Appearance.Design.AccentRed) {
            return BadgeAppearance.Design.AccentRed;
        }
        if (appearance == VkBadge.Appearance.Design.Contrast) {
            return BadgeAppearance.Design.Contrast;
        }
        if (appearance == VkBadge.Appearance.LegoDesign.High) {
            return BadgeAppearance.LegoDesign.High;
        }
        if (appearance == VkBadge.Appearance.LegoDesign.Low) {
            return BadgeAppearance.LegoDesign.Medium;
        }
        if (appearance == VkBadge.Appearance.LegoDesign.Medium) {
            return BadgeAppearance.LegoDesign.Low;
        }
        if (appearance instanceof VkBadge.Appearance.a) {
            return new BadgeAppearance.a(f870.c(cut0.a.a(((VkBadge.Appearance.a) appearance).b, context)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
