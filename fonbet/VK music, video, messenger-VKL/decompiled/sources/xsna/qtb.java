package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.vk.pushes.NotificationUtils;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.List;

/* compiled from: ChatMessageNotification.kt */
/* loaded from: classes5.dex */
public final class qtb extends pa20 {
    public final NotificationUtils.Type S;

    public /* synthetic */ qtb(Context context, MessageNotificationContainer messageNotificationContainer, Bitmap bitmap, Bitmap bitmap2, List list, sfg sfgVar, xsw xswVar, int i) {
        this(context, messageNotificationContainer, bitmap, bitmap2, (List<PushMessage>) list, (Intent) null, (gzs<s3q0>) ((i & 64) != 0 ? new g13(6) : sfgVar), (gzs<s3q0>) ((i & 128) != 0 ? new h13(5) : xswVar));
    }

    @Override // xsna.pa20, xsna.dfq0
    public final String toString() {
        return "ChatMessageNotification(notify=" + this.z + ')';
    }

    @Override // xsna.pa20, com.vk.pushes.notifications.base.a
    public final NotificationUtils.Type w() {
        return this.S;
    }

    public qtb(Context context, MessageNotificationContainer messageNotificationContainer, Bitmap bitmap, Bitmap bitmap2, List<PushMessage> list, Intent intent, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        super(context, messageNotificationContainer, bitmap2, bitmap, list, intent, gzsVar, gzsVar2);
        this.S = NotificationUtils.Type.ChatMessages;
    }
}
