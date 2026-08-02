package xsna;

import com.vk.channels.impl.list.g;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.channelcreation.impl.c;
import com.vk.im.channelcreation.impl.i;
import com.vk.im.ui.components.contacts.b;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ph3 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((oh3) obj2).invoke(obj);
                break;
            case 1:
                ((mz) obj2).invoke(obj);
                break;
            case 2:
                ((mz) obj2).invoke(obj);
                break;
            case 3:
                ((oh3) obj2).invoke(obj);
                break;
            case 4:
                ((tb) obj2).invoke((Integer) obj);
                break;
            case 5:
                ((p60) obj2).invoke(obj);
                break;
            case 6:
                ((izs) obj2).invoke(obj);
                break;
            case 7:
                qh8 qh8Var = (qh8) obj2;
                qh8Var.getClass();
                L.i((Throwable) obj);
                qh8Var.D = null;
                break;
            case 8:
                ((ua9) obj2).invoke(obj);
                break;
            case 9:
                ((mz) obj2).invoke(obj);
                break;
            case 10:
                ((com.vk.channels.impl.comments.b) obj2).u((Throwable) obj);
                break;
            case 11:
                com.vk.im.channelcreation.impl.b bVar = (com.vk.im.channelcreation.impl.b) obj2;
                bVar.n(i.b.a);
                bVar.m(c.b.a);
                break;
            case 12:
                ((u8) obj2).invoke(obj);
                break;
            case 13:
                com.vk.channels.impl.list.b bVar2 = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar2.s().b(th, new se0(6));
                bVar2.n(new g.b(th));
                break;
            case 14:
                ((mz) obj2).invoke(obj);
                break;
            case 15:
                ((mre) obj2).invoke(obj);
                break;
            case 16:
                ((ucg) obj2).invoke(obj);
                break;
            case 17:
                ((p60) obj2).invoke(obj);
                break;
            case 18:
                ((p60) obj2).invoke(obj);
                break;
            case 19:
                ((mre) obj2).invoke(obj);
                break;
            case 20:
                ((mre) obj2).invoke(obj);
                break;
            case 21:
                ((k7f) obj2).invoke(obj);
                break;
            case 22:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj2;
                a1w a1wVar = aVar.i;
                Set set = (Set) obj;
                ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    arrayList.add(Peer.a.b(longValue));
                }
                a1wVar.D(aVar, new b1r0(arrayList, Source.ACTUAL));
                break;
            case 23:
                ((com.vk.im.ui.components.contacts.b) obj2).p.onNext((b.a) obj);
                break;
            case 24:
                ((oh3) obj2).invoke(obj);
                break;
            case 25:
                ((p99) obj2).invoke(obj);
                break;
            case 26:
                ((r9n) obj2).invoke(obj);
                break;
            case 27:
                ((f55) obj2).invoke(obj);
                break;
            case 28:
                ((h7h) obj2).invoke(obj);
                break;
            default:
                ((oh3) obj2).invoke(obj);
                break;
        }
    }
}
