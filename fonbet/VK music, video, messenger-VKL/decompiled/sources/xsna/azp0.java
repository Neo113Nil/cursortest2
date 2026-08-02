package xsna;

import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UiDtoUpdater.kt */
/* loaded from: classes.dex */
public final class azp0 {
    public final Object a;

    public /* synthetic */ azp0(Object obj) {
        this.a = obj;
    }

    public void a(long j, int i, String str, Long l, String str2, String str3, String str4, MessageNotificationInfo messageNotificationInfo) {
        List<PushMessage> Cb;
        Long l2 = l;
        MessageNotificationInfo messageNotificationInfo2 = messageNotificationInfo == null ? (MessageNotificationInfo) bug0.b(v1b.b.d(j, l2)) : messageNotificationInfo;
        ArrayList<PushMessage> arrayList = null;
        MessageNotificationContainer Bb = messageNotificationInfo2 != null ? messageNotificationInfo2.Bb() : null;
        if (messageNotificationInfo2 != null && (Cb = messageNotificationInfo2.Cb()) != null) {
            List D0 = j5g.D0(new z7q0(), Cb);
            if (D0 != null) {
                arrayList = new ArrayList(D0);
            }
        }
        if (Bb != null && arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            for (PushMessage pushMessage : arrayList) {
                int i3 = i2 + 1;
                if (pushMessage.Ab() == i) {
                    arrayList.set(i2, new PushMessage(i, str, str2, str3, pushMessage.Eb(), pushMessage.Bb(), pushMessage.Db()));
                    PushMessage pushMessage2 = (PushMessage) arrayList.get(arrayList.size() - 1);
                    MessageNotificationInfo messageNotificationInfo3 = messageNotificationInfo2;
                    ArrayList arrayList2 = arrayList;
                    MessageNotificationContainer a = com.vk.pushes.notifications.im.a.a(Bb.getTitle(), pushMessage2.getMessage(), pushMessage2.Eb(), Bb.d(), Bb.getUrl(), false, pushMessage2.Cb(), Bb.n(), Bb.i(), Bb.k(), Bb.f(), j, pushMessage2.Ab(), false, Bb.g(), Bb.o(), Bb.p(), Bb.e());
                    a.B();
                    MessageNotificationInfo zb = MessageNotificationInfo.zb(messageNotificationInfo3, a, arrayList2, Bb.u() ? str4 : messageNotificationInfo3.Ab(), 6);
                    v1b.b.e(j, l, zb);
                    ((iv3) this.a).a(zb);
                    return;
                }
                arrayList = arrayList;
                l2 = l2;
                i2 = i3;
                messageNotificationInfo2 = messageNotificationInfo2;
            }
        }
    }
}
