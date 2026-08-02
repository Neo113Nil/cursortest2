package xsna;

import com.vk.core.store.entity.models.NotificationMention;
import com.vk.core.store.entity.models.NotificationMentions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.y320;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class x320 implements izs {
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ x320(long j, int i) {
        this.b = j;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<NotificationMention> d = ((NotificationMentions) obj).d();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : d) {
            if (((NotificationMention) obj2).d() <= this.c) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return io.reactivex.rxjava3.core.x.k(EmptyList.b);
        }
        y320 y320Var = y320.b;
        io.reactivex.rxjava3.core.a c = y320.c(this.b, new NotificationMentions(j5g.t0(d, j5g.S0(arrayList)), 2));
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NotificationMention notificationMention = (NotificationMention) it.next();
            arrayList2.add(new y320.a(notificationMention.g(), notificationMention.i()));
        }
        return c.e(io.reactivex.rxjava3.core.x.k(arrayList2));
    }
}
