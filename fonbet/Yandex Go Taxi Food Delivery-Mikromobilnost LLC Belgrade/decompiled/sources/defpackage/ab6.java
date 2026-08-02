package defpackage;

import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.MessageRef;
import com.yandex.messaging.core.net.entities.proto.message.UpdateFields;
import com.yandex.messaging.data.a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes15.dex */
public final class ab6 extends ree0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ab6(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((cb6) obj3).b(obj2, (String) obj);
            case 1:
                return ((cb6) obj3).b(obj2, null);
            default:
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new UpdateFields(((ax10) obj3).b.b, ((z621) obj2).a, (Integer) obj, null), null, null, null, null, null, null, null, null, false, 0, false, 268369919, null);
        }
    }

    @Override // defpackage.ree0
    public boolean f(PostMessageResponse postMessageResponse) {
        switch (this.a) {
            case 1:
                ((r6b) this.x).run();
                return true;
            default:
                return super.f(postMessageResponse);
        }
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        ota0 ota0Var;
        int i = this.a;
        Object obj = this.x;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                ((r6b) this.w).run();
                break;
            default:
                ax10 ax10Var = (ax10) this.b;
                Integer num = (Integer) obj;
                if (num != null) {
                    a aVar = ax10Var.d;
                    int intValue = num.intValue();
                    ConcurrentHashMap concurrentHashMap = aVar.d;
                    kse.a(aVar.a);
                    MessageRef messageRef = (MessageRef) aVar.c.remove(num);
                    if (messageRef != null && (ota0Var = (ota0) concurrentHashMap.get(messageRef)) != null && ota0Var.a <= intValue) {
                        concurrentHashMap.remove(messageRef);
                        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) aVar.e.get(messageRef);
                        if (copyOnWriteArraySet != null) {
                            Iterator it = copyOnWriteArraySet.iterator();
                            while (it.hasNext()) {
                                ((tls) it.next()).invoke(null);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
