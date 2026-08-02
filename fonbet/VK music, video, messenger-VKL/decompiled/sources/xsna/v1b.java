package xsna;

import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.List;

/* compiled from: ChannelMessageNotificationCache.kt */
/* loaded from: classes5.dex */
public final class v1b {
    public static final v1b b = new v1b();
    public final /* synthetic */ c0a a = new c0a("push_message_channels_", "ChannelMessageNotificationCache");

    public final void a(MessageNotificationContainer messageNotificationContainer, String str, String str2, String str3) {
        this.a.a(messageNotificationContainer, str, str2, str3);
    }

    public final void b(long j, Long l) {
        wmi0.a.a(this.a.c(j, l), new MessageNotificationInfo(null, null, null, null, null));
    }

    public final List<PushMessage> c(Long l, Long l2) {
        return this.a.e(l, l2);
    }

    public final io.reactivex.rxjava3.core.q<MessageNotificationInfo> d(long j, Long l) {
        return this.a.f(j, l);
    }

    public final void e(long j, Long l, MessageNotificationInfo messageNotificationInfo) {
        wmi0.a.a(this.a.c(j, l), messageNotificationInfo);
    }
}
