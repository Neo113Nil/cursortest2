package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.button.IconBackgroundStyle;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhMembersInviteV2.kt */
/* loaded from: classes2.dex */
public final class gsr0 extends kqr0<yyb.h> {
    public final jj0 l;

    public gsr0(jj0 jj0Var, ViewGroup viewGroup) {
        super(R.layout.vkim_chat_settings_members_invite_v2, viewGroup);
        this.l = jj0Var;
        getContext();
        View view = this.itemView;
        VkCellButton vkCellButton = view instanceof VkCellButton ? (VkCellButton) view : null;
        if (vkCellButton != null) {
            vkCellButton.setTitle(R.string.vkim_chat_settings_members_invite);
            vkCellButton.a(true, Integer.valueOf(R.drawable.vk_icon_user_add_outline_28));
            vkCellButton.setIconBackgroundStyle(IconBackgroundStyle.Circle);
            bwt0.i0(vkCellButton, new dso0(this, 9));
        }
    }
}
