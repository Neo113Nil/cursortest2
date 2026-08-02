package xsna;

import com.vk.dto.notifications.NotificationItem;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gou implements izs {
    public final /* synthetic */ hou b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ NotificationItem e;

    public /* synthetic */ gou(hou houVar, int i, int i2, NotificationItem notificationItem) {
        this.b = houVar;
        this.c = i;
        this.d = i2;
        this.e = notificationItem;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hou houVar = this.b;
        ArrayList<NotificationItem> arrayList = houVar.n;
        int size = arrayList.size();
        int i = this.c;
        NotificationItem notificationItem = this.e;
        if (size == i) {
            arrayList.add(this.d, notificationItem);
        } else {
            Iterator<NotificationItem> it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (notificationItem.c >= it.next().c) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                arrayList.add(i2, notificationItem);
            } else {
                arrayList.add(notificationItem);
            }
        }
        houVar.W0();
        return s3q0.a;
    }
}
