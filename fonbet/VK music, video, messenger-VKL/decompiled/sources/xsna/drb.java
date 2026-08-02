package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.core.fragments.internal.transition.impl.TransitionAnimationSimple$Companion$Type;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.ui.components.msg_list.MsgListOpenAtLatestMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.im.ui.fragments.chat.ChatAnalyticsParams;
import com.vk.im.ui.fragments.chat.ChatFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChatFragmentBuilder.kt */
/* loaded from: classes2.dex */
public final class drb extends oz50 {
    public drb(boolean z) {
        super(ChatFragment.class, null, null);
        this.j.putBoolean("no_bottom_navigation", true);
        if (z) {
            u(TransitionAnimationSimple$Companion$Type.SLIDE_FROM_RIGHT.h());
        }
    }

    public final void A(String str) {
        if (str == null) {
            str = "unknown";
        }
        this.j.putString("app_entry_point", str);
    }

    public final void B(ArrayList arrayList) {
        this.j.putParcelableArrayList("attaches", arrayList);
    }

    public final void C(Attachment[] attachmentArr) {
        this.j.putParcelableArray("attachments", attachmentArr);
    }

    public final void D(DialogExt dialogExt) {
        if (dialogExt.g == 0) {
            tv4.b("Dialog peer id is invalid = 0", com.vk.metrics.eventtracking.b.a);
        }
        Peer peer = dialogExt.f;
        Bundle bundle = this.j;
        bundle.putParcelable("dialog_id", peer);
        n34.w(bundle, dialogExt, null);
    }

    public final void E(boolean z) {
        this.j.putBoolean("disable_initial_shimmer", z);
    }

    public final void F(Integer num) {
        this.j.putInt("from_preview", num != null ? num.intValue() : 0);
        if (num != null && num.intValue() == 1) {
            x();
        }
    }

    public final void G(String str) {
        if (str == null) {
            str = "unknown";
        }
        this.j.putString("entry_point", str);
    }

    public final void H(int i) {
        this.j.putInt("first_unread_msg_cmid", i);
    }

    public final void I(FolderType folderType) {
        this.j.putParcelable("from_folder_with_type", folderType);
    }

    public final void J(List list) {
        this.j.putParcelableArrayList("fwd_ids", new ArrayList<>(list));
    }

    public final void K(boolean z) {
        this.j.putBoolean("highlight", z);
    }

    public final void L(String str) {
        this.j.putString("inline_button_msg_text", str);
    }

    public final void M() {
        this.j.putBoolean("open_keyboard", true);
    }

    public final void N() {
        this.j.putBoolean("open_from_widget", true);
    }

    public final void O(MsgListOpenMode msgListOpenMode) {
        int i = 1;
        if (!(msgListOpenMode instanceof MsgListOpenAtUnreadMode)) {
            if (msgListOpenMode instanceof MsgListOpenAtLatestMode) {
                i = 2;
            } else {
                if (!(msgListOpenMode instanceof MsgListOpenAtMsgMode)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = MsgListOpenMode.b.$EnumSwitchMapping$0[((MsgListOpenAtMsgMode) msgListOpenMode).b.ordinal()];
                if (i2 == 1) {
                    i = 10;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 12;
                }
            }
        }
        this.j.putLong("msgListOpenModeEncoded", (i << 32) | (msgListOpenMode instanceof MsgListOpenAtMsgMode ? ((MsgListOpenAtMsgMode) msgListOpenMode).c : 0));
    }

    public final void P() {
        this.j.putString("key_url", null);
    }

    public final void Q(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.j.putParcelable("owner_id", Peer.a.b(j));
    }

    public final void R(String str) {
        this.j.putString("payload", str);
    }

    public final void S(long j) {
        if (j == 0) {
            throw new IllegalStateException("Peer id is invalid = 0");
        }
        if (this.j.containsKey("dialog_ext_state")) {
            return;
        }
        D(new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null));
    }

    public final void T(BotButton botButton) {
        this.j.putParcelable("inline_button", botButton);
    }

    public final void U(String str) {
        this.j.putString("ref", str);
    }

    public final void V(String str) {
        this.j.putString("ref_source", str);
    }

    public final void W() {
        this.j.putParcelable("snackbar_on_start", null);
    }

    public final void X(String str) {
        this.j.putString("text", str);
    }

    public final void Y(String str) {
        this.j.putString("widget_type", str);
    }

    @Override // xsna.oz50
    public final Intent n(Context context) {
        this.j.putString("performance_track_id", UUID.randomUUID().toString());
        return super.n(context);
    }

    public final void y() {
        this.j.putBoolean("can_reorder", false);
    }

    public final void z(ChatAnalyticsParams chatAnalyticsParams) {
        this.j.putParcelable("analytics_params", chatAnalyticsParams);
    }
}
