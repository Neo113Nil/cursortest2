package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.we20;

/* compiled from: MessagesGetHistoryApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class xe20 extends FunctionReferenceImpl implements wzs<we20.c, ProfilesSimpleInfo, we20.c> {
    @Override // xsna.wzs
    public final we20.c invoke(we20.c cVar, ProfilesSimpleInfo profilesSimpleInfo) {
        we20.c cVar2 = cVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((we20) this.receiver).getClass();
        for (gtx0 gtx0Var : cVar2.a) {
            if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) gtx0Var;
                Iterator<T> it = aVar.K0().iterator();
                while (it.hasNext()) {
                    w04.b((Attach) it.next(), profilesSimpleInfo2);
                }
                for (NestedMsg nestedMsg : aVar.q7()) {
                    Iterator it2 = nestedMsg.j.iterator();
                    while (it2.hasNext()) {
                        w04.b((Attach) it2.next(), profilesSimpleInfo2);
                    }
                    for (NestedMsg nestedMsg2 : nestedMsg.k) {
                        Iterator it3 = nestedMsg2.j.iterator();
                        while (it3.hasNext()) {
                            w04.b((Attach) it3.next(), profilesSimpleInfo2);
                        }
                        for (NestedMsg nestedMsg3 : nestedMsg2.k) {
                            Iterator it4 = nestedMsg3.j.iterator();
                            while (it4.hasNext()) {
                                w04.b((Attach) it4.next(), profilesSimpleInfo2);
                            }
                            Iterator it5 = nestedMsg3.k.iterator();
                            while (it5.hasNext()) {
                                bh30.c((NestedMsg) it5.next(), profilesSimpleInfo2);
                            }
                        }
                    }
                }
            }
        }
        return cVar2;
    }
}
