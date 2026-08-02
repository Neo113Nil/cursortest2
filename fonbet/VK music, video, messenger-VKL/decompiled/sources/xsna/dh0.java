package xsna;

import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.id.UserId;
import com.vk.dto.notifications.NotificationItem;
import com.vk.notifications.GroupedNotificationsFragment;
import java.lang.ref.WeakReference;
import xsna.dob;
import xsna.wmb;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dh0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dh0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ip6 ip6Var;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                eh0 eh0Var = (eh0) obj2;
                ch0 ch0Var = (ch0) obj;
                if (!jjc.b() && (ip6Var = eh0Var.n) != null) {
                    WeakReference<VkContextMenu> weakReference = eh0Var.o;
                    ip6Var.invoke(weakReference != null ? weakReference.get() : null, ch0Var.a);
                    break;
                }
                break;
            case 1:
                ynb ynbVar = (ynb) obj2;
                wmb.l lVar = new wmb.l(((dob.f) obj).a);
                ynbVar.getClass();
                xn50.a.c(ynbVar, lVar);
                break;
            case 2:
                NotificationItem notificationItem = (NotificationItem) obj2;
                int i2 = GroupedNotificationsFragment.f0;
                notificationItem.r = true;
                hou houVar = ((GroupedNotificationsFragment) obj).Z;
                if (houVar != null) {
                    houVar.Q(notificationItem);
                    break;
                }
                break;
            case 3:
                ((h130) obj2).n.a((UserId) obj);
                break;
            default:
                ((izs) obj2).invoke(Integer.valueOf(((z2u0) obj).getAbsoluteAdapterPosition()));
                break;
        }
    }
}
