package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.log.L;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import java.util.List;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q6b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q6b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ri6 u1bVar;
        switch (this.b) {
            case 0:
                a7b a7bVar = (a7b) this.c;
                h7b h7bVar = (h7b) obj;
                L.e("ChannelNewMessagesNotificationsHandler", p2i0.c.a("[Push]: showNotificationFromCache(" + h7bVar + ')'));
                Context context = a7bVar.a;
                long c = h7bVar.c();
                boolean z = a7bVar.e.b;
                String k = h7bVar.k();
                String a = h7bVar.a();
                long j = h7bVar.j();
                String a2 = wh70.a(a7bVar.d);
                String q = jgz.q(c);
                String h = h7bVar.h();
                Long a3 = a7bVar.a();
                cn o = a7bVar.g.o();
                Bitmap bitmap = null;
                if (!fkq0.c(o.a)) {
                    o = null;
                }
                MessageNotificationContainer a4 = com.vk.pushes.notifications.im.a.a(k, a, j, a2, q, false, h, a3, o != null ? o.h : null, Long.valueOf(h7bVar.i()), Long.valueOf(c), c, h7bVar.e(), !z && h7bVar.l(), false, false, true, h7bVar.d());
                v1b v1bVar = v1b.b;
                v1bVar.a(a4, h7bVar.g(), h7bVar.f(), h7bVar.b());
                List<PushMessage> c2 = v1bVar.c(Long.valueOf(h7bVar.c()), a7bVar.a());
                if (ad0.B(h7bVar.d())) {
                    String b = h7bVar.b();
                    if (b != null) {
                        e870 e870Var = e870.b;
                        bitmap = e870.f(b);
                    }
                    u1bVar = new h9u0(context, a4, bitmap, c2);
                } else {
                    u1bVar = new u1b(a7bVar.a, a4, c2);
                }
                L.e("ChannelNewMessagesNotificationsHandler", "[Push]: createAndShowChannelNotification " + u1bVar);
                u1bVar.g((NotificationManager) context.getSystemService("notification"));
                return s3q0.a;
            case 1:
                return new HorizontalFiltersWithScrollView.e((b2a) obj, (m7a) this.c);
            default:
                r7x.a aVar = (r7x.a) obj;
                return Boolean.valueOf(aVar.c() && ((Boolean) ((t45) this.c).invoke(aVar)).booleanValue());
        }
    }
}
