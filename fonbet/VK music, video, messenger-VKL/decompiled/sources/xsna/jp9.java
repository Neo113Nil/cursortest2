package xsna;

import android.content.Context;
import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import xsna.u1b;

/* compiled from: CancelChannelsNotificationsInteractor.kt */
/* loaded from: classes.dex */
public final class jp9 {
    public final Context a;
    public final iv3 b;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((PushMessage) t).b), Integer.valueOf(((PushMessage) t2).b));
        }
    }

    public jp9(Context context, iv3 iv3Var) {
        this.a = context;
        this.b = iv3Var;
    }

    public final void a(long j, Long l) {
        v1b.b.b(j, l);
        String a2 = u1b.a.a(Long.valueOf(j), l);
        ca70 ca70Var = ca70.a;
        Context context = this.a;
        ca70.a(context, a2, 1);
        if (gz80.a(24)) {
            ra20.a.getClass();
            ra20.b(context, l);
        }
    }

    public final void b(long j, int i, Long l, boolean z) {
        Integer num;
        List list;
        MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) bug0.b(v1b.b.d(j, l));
        MessageNotificationContainer Bb = messageNotificationInfo != null ? messageNotificationInfo.Bb() : null;
        List<PushMessage> Cb = messageNotificationInfo != null ? messageNotificationInfo.Cb() : null;
        if (Bb != null && Cb != null && !Cb.isEmpty()) {
            List D0 = j5g.D0(new a(), Cb);
            int size = D0.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    num = null;
                    break;
                } else if (((PushMessage) D0.get(size)).Ab() <= i) {
                    num = Integer.valueOf(size);
                    break;
                }
            }
            if (num != null) {
                if (z) {
                    list = D0.subList(num.intValue() + 1, D0.size());
                } else {
                    ArrayList arrayList = new ArrayList(D0);
                    arrayList.remove(num.intValue());
                    list = arrayList;
                }
                if (list.isEmpty()) {
                    a(j, l);
                    return;
                }
                PushMessage pushMessage = (PushMessage) j5g.i0(list);
                MessageNotificationContainer messageNotificationContainer = Bb;
                MessageNotificationContainer a2 = com.vk.pushes.notifications.im.a.a(Bb.getTitle(), pushMessage.getMessage(), pushMessage.Eb(), messageNotificationContainer.d(), messageNotificationContainer.getUrl(), false, pushMessage.Cb(), messageNotificationContainer.n(), messageNotificationContainer.i(), messageNotificationContainer.k(), messageNotificationContainer.f(), j, pushMessage.Ab(), false, messageNotificationContainer.g(), messageNotificationContainer.o(), messageNotificationContainer.p(), messageNotificationContainer.e());
                a2.B();
                MessageNotificationInfo zb = MessageNotificationInfo.zb(messageNotificationInfo, a2, list, null, 22);
                v1b.b.e(j, l, zb);
                this.b.a(zb);
            }
        }
    }
}
