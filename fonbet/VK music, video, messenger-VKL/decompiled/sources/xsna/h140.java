package xsna;

import android.content.Context;
import android.os.Handler;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.pdg0;

/* compiled from: MsgUpdateHandler.kt */
/* loaded from: classes7.dex */
public final class h140 {
    public final yk70 a;
    public final fv30 b = new fv30(Source.ACTUAL);
    public final ExecutorService c;
    public volatile boolean d;

    public h140(yk70 yk70Var) {
        this.a = yk70Var;
        asu0.a.getClass();
        this.c = asu0.s();
    }

    public final void a(Context context, a1w a1wVar, long j, long j2, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        List<PushMessage> list;
        List<PushMessage> list2;
        fv30 fv30Var = this.b;
        pdg0 n = a1wVar.n(fv30Var, new dj30(MsgIdType.LOCAL_ID, i, fv30Var.a, true, fv30Var.b));
        if (n instanceof pdg0.a) {
            obj = null;
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        wpp wppVar = (wpp) obj;
        Msg msg = wppVar != null ? (Msg) wppVar.c.get(Integer.valueOf(i)) : null;
        if (msg == null) {
            return;
        }
        Object obj4 = this.b;
        obj4.getClass();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        pdg0 n2 = a1wVar.n(obj4, new tqm(new sqm(Collections.singletonList(Peer.a.b(j2)), null, false, null, 0, 30)));
        if (n2 instanceof pdg0.a) {
            obj2 = null;
        } else {
            if (!(n2 instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = ((pdg0.b) n2).a;
        }
        wpp wppVar2 = (wpp) obj2;
        Dialog dialog = wppVar2 != null ? (Dialog) wppVar2.c.get(Long.valueOf(j2)) : null;
        if (dialog == null) {
            return;
        }
        int i2 = 0;
        if (msg.D || msg.k) {
            try {
                ra20 ra20Var = ra20.a;
                int i3 = msg.d;
                Long valueOf = Long.valueOf(j);
                ra20Var.getClass();
                ra20.f(context, j2, i3, valueOf, true);
                Handler handler = wo8.a;
                wo8.c(context, j2, msg.d, true);
                z320.b(context, j2, msg.d, true);
                return;
            } catch (Throwable th) {
                L.E(th, new Object[0]);
                return;
            }
        }
        if (!msg.i || dialog.Fc(msg)) {
            return;
        }
        try {
            obj3 = qa20.b.a.f(j2, Long.valueOf(j)).a();
        } catch (Throwable unused) {
            obj3 = null;
        }
        MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) obj3;
        if ((messageNotificationInfo != null ? messageNotificationInfo.b : null) == null || (list = messageNotificationInfo.e) == null || list.isEmpty()) {
            return;
        }
        fv30 fv30Var2 = this.b;
        fv30Var2.getClass();
        f1e0 a = ijm.a(dialog);
        a.e(lv30.a(msg));
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        a.c(Peer.a.b(j));
        uk70 a2 = this.a.a(context, fv30Var2.f(a1wVar, j, dialog, msg, fv30Var2.e(a1wVar, a).Ob(), false));
        ra20 ra20Var2 = ra20.a;
        long j3 = a2.b;
        int i4 = a2.c;
        String str = a2.g;
        String str2 = a2.e;
        String str3 = a2.j;
        ra20Var2.getClass();
        if (messageNotificationInfo.b == null || (list2 = messageNotificationInfo.e) == null || list2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(j5g.D0(new fa80(3), messageNotificationInfo.e));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i5 = i2 + 1;
            PushMessage pushMessage = (PushMessage) it.next();
            if (pushMessage.b == i4) {
                arrayList.set(i2, new PushMessage(i4, str, str2, str3, pushMessage.f, pushMessage.g, pushMessage.h));
                if (!pushMessage.g) {
                    PushMessage pushMessage2 = (PushMessage) xy9.b(1, arrayList);
                    MessageNotificationContainer messageNotificationContainer = messageNotificationInfo.b;
                    String str4 = messageNotificationContainer.e;
                    String str5 = pushMessage2.d;
                    long j4 = pushMessage2.f;
                    String str6 = messageNotificationContainer.h;
                    String format = String.format(i5s.a(new StringBuilder("https://"), a0a.d, "/im?sel=%d"), Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1));
                    String str7 = pushMessage2.c;
                    MessageNotificationContainer messageNotificationContainer2 = messageNotificationInfo.b;
                    MessageNotificationContainer a3 = com.vk.pushes.notifications.im.a.a(str4, str5, j4, str6, format, false, str7, messageNotificationContainer2.w, messageNotificationContainer2.x, messageNotificationContainer2.B, messageNotificationContainer2.y, j3, pushMessage2.b, false, messageNotificationContainer2.p, messageNotificationContainer2.q, messageNotificationContainer2.s, messageNotificationContainer2.r);
                    a3.u = true;
                    MessageNotificationInfo zb = MessageNotificationInfo.zb(messageNotificationInfo, a3, arrayList, null, 22);
                    wmi0.a.a(qa20.b.a.c(j3, a3.j()), zb);
                    ra20.g(context, j3, zb);
                    return;
                }
                return;
            }
            i2 = i5;
        }
    }
}
