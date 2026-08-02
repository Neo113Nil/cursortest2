package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.EmptyList;

/* compiled from: AsrOnlineListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class iv3 {
    public final Object a;

    public /* synthetic */ iv3(Object obj) {
        this.a = obj;
    }

    public void a(MessageNotificationInfo messageNotificationInfo) {
        ri6 u1bVar;
        Context context = (Context) this.a;
        MessageNotificationContainer Bb = messageNotificationInfo.Bb();
        if (Bb == null) {
            return;
        }
        if (Bb.u()) {
            e870 e870Var = e870.b;
            Bitmap f = e870.f(messageNotificationInfo.Ab());
            List<PushMessage> Cb = messageNotificationInfo.Cb();
            if (Cb == null) {
                Cb = EmptyList.b;
            }
            u1bVar = new h9u0(context, Bb, f, Cb);
        } else {
            List<PushMessage> Cb2 = messageNotificationInfo.Cb();
            if (Cb2 == null) {
                Cb2 = EmptyList.b;
            }
            u1bVar = new u1b(context, Bb, Cb2);
        }
        ca70 ca70Var = ca70.a;
        u1bVar.g(ca70.f(context));
    }

    public iv3() {
        this.a = new CopyOnWriteArraySet();
    }
}
