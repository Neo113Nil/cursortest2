package xsna;

import android.app.NotificationManager;
import android.content.Context;
import com.vk.pushes.NotificationUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.xdw;

/* compiled from: VkImUi.kt */
/* loaded from: classes7.dex */
public final class n0v0 implements xdw {
    public static final n0v0 a = new n0v0();

    public final void g() {
        int i;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        NotificationUtils.Id id = NotificationUtils.Id.NewMsg;
        boolean z = NotificationUtils.a;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        i = id.id;
        notificationManager.cancel(i);
    }

    public final kz30 h(xdw.a aVar) {
        return new kz30(aVar.a, aVar.b, aVar.d, aVar.f, aVar.c, aVar.e, aVar.j);
    }

    public final ets0 i(kkm kkmVar) {
        return new oew(new kew(new AtomicBoolean(true)), kkmVar);
    }
}
