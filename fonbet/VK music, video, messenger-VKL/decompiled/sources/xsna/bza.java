package xsna;

import com.vk.pushes.dto.MessageNotificationInfo;
import com.vk.pushes.dto.PushMessage;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bza implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bza(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                cza czaVar = (cza) this.d;
                w2w w2wVar = (w2w) this.e;
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.y().g0(0, czaVar.b, false);
                r3b y = xgl0Var.y();
                long j = this.c;
                y.f(j);
                xgl0Var.e().f(j);
                xgl0Var.a().s(j, w2wVar.f1());
                break;
            default:
                c0a c0aVar = (c0a) this.d;
                Long l = (Long) this.e;
                MessageNotificationInfo messageNotificationInfo = (MessageNotificationInfo) obj;
                Iterable iterable = messageNotificationInfo.e;
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(PushMessage.zb((PushMessage) it.next(), 0, null, null, null, true, 95));
                }
                MessageNotificationInfo messageNotificationInfo2 = new MessageNotificationInfo(messageNotificationInfo.b, messageNotificationInfo.c, messageNotificationInfo.d, arrayList, messageNotificationInfo.f);
                c0aVar.getClass();
                wmi0.a.a(c0aVar.c(this.c, l), messageNotificationInfo2);
                break;
        }
        return s3q0.a;
    }
}
