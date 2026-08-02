package xsna;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collections;
import java.util.Set;

/* compiled from: PushTypes.kt */
/* loaded from: classes.dex */
public final class ule0 {
    public static final Set<String> a = rl3.y0(new String[]{NotificationCompat.CATEGORY_MESSAGE, "chat", "group_channel", "community_channel"});
    public static final Set<String> b = Collections.singleton("community_msg");
    public static final Set<String> c = rl3.y0(new String[]{"message_request", "message_request_accepted"});
    public static final Set<String> d = rl3.y0(new String[]{"unifyvideo_groups_publish", "unifylive", "unifyvideo_continue_watch", "unifyvideo_watch_later"});
    public static final Set<String> e = rl3.y0(new String[]{"group_invite", "event_invite"});
    public static final Set<String> f = rl3.y0(new String[]{"unifylovina_notifications", "dating_user_action"});
    public static final Set<String> g = rl3.y0(new String[]{"msg_reaction_set", "msg_reaction_del"});
    public static final Set<String> h = rl3.y0(new String[]{"erase_message", "erase_messages"});
    public static final Set<String> i = rl3.y0(new String[]{"community_msg_del", "community_msg_del_till"});
    public static final Set<String> j = rl3.y0(new String[]{NotificationCompat.CATEGORY_CALL, "custom"});
    public static final Set<String> k = rl3.y0(new String[]{"user", "group", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "community_channel"});
    public static final Set<String> l = rl3.y0(new String[]{"open_url", "validate_device", "validate_action", "show_message"});
    public static final Set<String> m = rl3.y0(new String[]{"sdk_open", "open_url", "validate_device", "validate_action", "show_message", NotificationCompat.CATEGORY_MESSAGE, "chat", "group_channel", "community_msg", "erase", "business_notify", "community_channel", "channel_activation_erase", "channel_activation"});
}
