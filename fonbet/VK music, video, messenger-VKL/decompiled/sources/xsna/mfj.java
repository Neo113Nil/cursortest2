package xsna;

import android.content.Context;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.view.components.badge.VkContentBadge;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ContentBadgeExt.kt */
/* loaded from: classes17.dex */
public final class mfj {

    /* compiled from: ContentBadgeExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkContentBadge.Mode.values().length];
            try {
                iArr[VkContentBadge.Mode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkContentBadge.Mode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkContentBadge.Mode.Outline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkContentBadge.Size.values().length];
            try {
                iArr2[VkContentBadge.Size.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkContentBadge.Size.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkContentBadge.Size.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ContentBadgeAppearance a(VkContentBadge.Appearance appearance, Context context) {
        if (appearance == VkContentBadge.Appearance.Design.Accent) {
            return ContentBadgeAppearance.Design.Accent;
        }
        if (appearance == VkContentBadge.Appearance.Design.Positive) {
            return ContentBadgeAppearance.Design.Positive;
        }
        if (appearance == VkContentBadge.Appearance.Design.Negative) {
            return ContentBadgeAppearance.Design.Negative;
        }
        if (appearance == VkContentBadge.Appearance.Design.Neutral) {
            return ContentBadgeAppearance.Design.Neutral;
        }
        if (appearance == VkContentBadge.Appearance.Design.Overlay) {
            return ContentBadgeAppearance.Design.Overlay;
        }
        if (!(appearance instanceof VkContentBadge.Appearance.a)) {
            throw new NoWhenBranchMatchedException();
        }
        VkContentBadge.Appearance.a aVar = (VkContentBadge.Appearance.a) appearance;
        return new ContentBadgeAppearance.a(8, f870.c(aVar.c.b(context)), f870.c(aVar.b.b(context)), f870.c(aVar.d.b(context)));
    }

    public static final ContentBadgeMode b(VkContentBadge.Mode mode) {
        int i = a.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            return ContentBadgeMode.Primary;
        }
        if (i == 2) {
            return ContentBadgeMode.Secondary;
        }
        if (i == 3) {
            return ContentBadgeMode.Outline;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ContentBadgeSize c(VkContentBadge.Size size) {
        int i = a.$EnumSwitchMapping$1[size.ordinal()];
        if (i == 1) {
            return ContentBadgeSize.Small;
        }
        if (i == 2) {
            return ContentBadgeSize.Medium;
        }
        if (i == 3) {
            return ContentBadgeSize.Large;
        }
        throw new NoWhenBranchMatchedException();
    }
}
