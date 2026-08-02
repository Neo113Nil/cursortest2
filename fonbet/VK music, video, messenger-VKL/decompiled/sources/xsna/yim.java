package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import java.util.Collections;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: DialogPushDisableInfoBarGetCmd.kt */
/* loaded from: classes2.dex */
public final class yim extends le6<xpp<InfoBar>> {
    public final Peer b;

    public yim(Peer peer) {
        this.b = peer;
        if (!peer.Ab(Peer.Type.USER)) {
            throw new IllegalStateException(yq.b(peer, "Only user peer is allowed. Peer=").toString());
        }
    }

    @Override // xsna.le6
    public final xpp<InfoBar> e(w2w w2wVar) {
        boolean z;
        String string;
        p9w p9wVar = w2wVar.getConfig().f;
        boolean s = BuildInfo.s();
        if (p9wVar.c.f()) {
            ImMsgPushSettingsProvider.Type type = ImMsgPushSettingsProvider.Type.PRIVATE_MESSAGES;
            if (!p9wVar.h(type) || !p9wVar.g(type)) {
                z = true;
                if (!p9wVar.f(ImMsgPushSettingsProvider.Type.PRIVATE_MESSAGES) || (s && z)) {
                    avz.f(w2wVar, "private_dialog_info_bar_msg_push_disabled");
                    return new xpp<>(null, false);
                }
                if (!avz.a(w2wVar, "private_dialog_info_bar_msg_push_disabled")) {
                    return new xpp<>(null, false);
                }
                Source source = Source.CACHE;
                Peer peer = this.b;
                User user = (User) ((wpp) w2wVar.L0(this, new b1r0(peer, source, 12))).c.get(Long.valueOf(peer.b));
                int i = R.string.im_engine_info_bar_msg_messenger_push_disabled_desc;
                if (user != null) {
                    string = s ? w2wVar.getContext().getString(R.string.im_engine_info_bar_msg_messenger_push_disabled_desc) : w2wVar.getContext().getString(R.string.im_engine_info_bar_msg_push_disabled_private_dislog_desc, user.Q2(UserNameCase.GEN));
                } else {
                    Context context = w2wVar.getContext();
                    if (!s) {
                        i = R.string.im_engine_info_bar_msg_push_disabled_desc;
                    }
                    string = context.getString(i);
                }
                String str = string;
                String string2 = s ? w2wVar.getContext().getString(R.string.im_engine_info_bar_msg_messenger_push_disabled_title) : "";
                StringBuilder sb = new StringBuilder("res:/");
                sb.append(s ? R.drawable.vk_icon_message_check_outline_28 : R.drawable.vkim_push_chats_48);
                return new xpp<>(new InfoBar("private_dialog_info_bar_msg_push_disabled", string2, str, sb.toString(), null, s ? Integer.valueOf(w2wVar.getContext().getResources().getDimensionPixelSize(R.dimen.vk_enable_only_messenger_notifications_banner_icon_size)) : null, null, true, Collections.singletonList(new InfoBar.Button(w2wVar.getContext().getString(R.string.im_engine_info_bar_msg_push_disabled_btn), InfoBar.ButtonLayout.TERTIARY, InfoBar.ButtonType.OPEN_MSG_PUSH_SETTINGS, null, null, null, false, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED, null)), true, null, null, null, 7248, null), false);
            }
        }
        z = false;
        if (p9wVar.f(ImMsgPushSettingsProvider.Type.PRIVATE_MESSAGES)) {
        }
        avz.f(w2wVar, "private_dialog_info_bar_msg_push_disabled");
        return new xpp<>(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yim) && epx.f(this.b, ((yim) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("DialogPushDisableInfoBarGetCmd(peer="), this.b, ')');
    }
}
