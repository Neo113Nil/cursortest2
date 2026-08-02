package xsna;

import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.group.GroupAgeMark;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkContentBadgeExt.kt */
/* loaded from: classes5.dex */
public final class gnu0 {

    /* compiled from: VkContentBadgeExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupAgeMark.values().length];
            try {
                iArr[GroupAgeMark.OVER_16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupAgeMark.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupAgeMark.OVER_18.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(VkContentBadge vkContentBadge, GroupAgeMark groupAgeMark, gzs<s3q0> gzsVar) {
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[groupAgeMark.ordinal()];
        if (i != 1) {
            if (i == 2) {
                f4m.j(vkContentBadge);
                return;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        vkContentBadge.setVisibility(0);
        vkContentBadge.setOnClickListener(new kn9(gzsVar, 14));
        vkContentBadge.setText(iArr[groupAgeMark.ordinal()] == 1 ? R.string.community_age_mark_16 : R.string.community_age_mark_18);
    }
}
