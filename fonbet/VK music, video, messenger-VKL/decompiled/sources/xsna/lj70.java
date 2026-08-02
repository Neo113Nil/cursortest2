package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.vk.dto.reactions.ReactionSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationsHelper.kt */
/* loaded from: classes7.dex */
public final class lj70 {
    public final Object a;
    public Object b;

    public /* synthetic */ lj70(Object obj, Serializable serializable) {
        this.a = obj;
        this.b = serializable;
    }

    public yu8 a() {
        String str = (String) this.a;
        if (str != null) {
            return dv8.n(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + ((String) this.b) + ". Using WrapContent.");
        return dv8.n("wrap");
    }

    public void b(yj70 yj70Var) throws RuntimeException {
        bpn0 bpn0Var = (bpn0) this.b;
        StatusBarNotification[] activeNotifications = ((NotificationManager) bpn0Var.getValue()).getActiveNotifications();
        ArrayList arrayList = new ArrayList(activeNotifications.length);
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            arrayList.add(statusBarNotification.getNotification());
        }
        Collection a = yj70Var.a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (StatusBarNotification statusBarNotification2 : activeNotifications) {
            if (a.contains(statusBarNotification2.getNotification())) {
                arrayList2.add(statusBarNotification2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification3 = (StatusBarNotification) it.next();
            ((NotificationManager) bpn0Var.getValue()).cancel(statusBarNotification3.getTag(), statusBarNotification3.getId());
        }
    }

    public io.reactivex.rxjava3.internal.operators.single.y c(ArrayList arrayList, ReactionSet reactionSet) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0c0 c0c0Var = (c0c0) it.next();
            StringBuilder b = v1v.b(c0c0Var.c ? "clip" : "post", '_');
            b.append(c0c0Var.a.b);
            b.append('_');
            b.append(c0c0Var.b);
            arrayList2.add(b.toString());
        }
        List I0 = j5g.I0(10, arrayList2);
        tfx tfxVar = new tfx("newsfeed.getActivities", new zn(23), new ao(24));
        tfxVar.i("items", I0);
        return rsg0.W(yfb.x(tfxVar), 7).l(new qj4(new qm90(4, this, reactionSet), 27));
    }

    public lj70(zj60 zj60Var) {
        this.a = zj60Var;
    }

    public lj70(Context context) {
        this.a = context;
        this.b = new bpn0(new nwk(this, 29));
    }
}
