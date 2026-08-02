package xsna;

import android.view.View;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhMembersCountV2.kt */
/* loaded from: classes2.dex */
public final class esr0 extends kqr0<yyb.g> {
    @Override // xsna.kqr0
    /* renamed from: i6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void W5(yyb.g gVar) {
        String f = enj.f(gVar.d ? R.plurals.vkim_chat_settings_invites_count : R.plurals.vkim_chat_settings_members_count, gVar.c, this.itemView.getContext());
        View view = this.itemView;
        VkGroupHeader vkGroupHeader = view instanceof VkGroupHeader ? (VkGroupHeader) view : null;
        if (vkGroupHeader != null) {
            vkGroupHeader.setTitle(new VkGroupHeader.d(f, null, null, null, 0, null, 510));
            vkGroupHeader.setSize(VkGroupHeader.Size.Small);
            vkGroupHeader.setShowTopDivider(true);
        }
    }
}
