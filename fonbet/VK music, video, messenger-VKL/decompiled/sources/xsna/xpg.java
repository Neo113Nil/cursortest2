package xsna;

import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;

/* compiled from: CommunityAddContactsItem.kt */
/* loaded from: classes5.dex */
public final class xpg extends VkMiniInfoCell.b {

    /* compiled from: CommunityAddContactsItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkMiniInfoCell.Mode.values().length];
            try {
                iArr[VkMiniInfoCell.Mode.Link.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.core.view.components.cell.VkMiniInfoCell.b, com.vk.core.view.components.cell.VkMiniInfoCell.a
    public final cut0 a(VkMiniInfoCell.Mode mode) {
        return a.$EnumSwitchMapping$0[mode.ordinal()] == 1 ? new x7g(R.attr.vk_ui_icon_accent) : super.a(mode);
    }
}
