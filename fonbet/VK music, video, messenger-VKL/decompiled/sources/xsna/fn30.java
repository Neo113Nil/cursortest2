package xsna;

import android.content.Context;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgIncomingCallPrivacy;
import com.vkontakte.android.R;

/* compiled from: MsgNotifyFormatter.kt */
/* loaded from: classes2.dex */
public final class fn30 {
    public final Context a;
    public final com.vk.im.ui.formatters.b b;
    public final g6b c;

    public fn30(Context context) {
        this.a = context;
        this.b = new com.vk.im.ui.formatters.b(context);
        this.c = new g6b(context);
    }

    public static boolean c(Msg msg) {
        return ((msg instanceof MsgFromUser) && ((MsgFromUser) msg).Ib()) ? false : true;
    }

    public final CharSequence a(Msg msg, ProfilesSimpleInfo profilesSimpleInfo, Dialog dialog) {
        boolean z = msg instanceof MsgFromUser;
        Context context = this.a;
        if (z && ((MsgFromUser) msg).Ib()) {
            Long l = msg.v;
            return context.getString(R.string.vkim_push_msg_is_expired, this.c.b(l != null ? l.longValue() : 0L));
        }
        if ((msg instanceof MsgIncomingCallPrivacy) && msg.i) {
            return context.getString(R.string.vkim_msg_incoming_call_privacy_push_body);
        }
        return this.b.a(msg, profilesSimpleInfo, dialog, o25.a().c());
    }
}
