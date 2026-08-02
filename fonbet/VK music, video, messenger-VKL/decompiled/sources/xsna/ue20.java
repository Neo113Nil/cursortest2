package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.te20;

/* compiled from: MessagesGetDiffApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class ue20 extends FunctionReferenceImpl implements wzs<te20.b, ProfilesSimpleInfo, te20.b> {
    @Override // xsna.wzs
    public final te20.b invoke(te20.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        te20.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((te20) this.receiver).getClass();
        for (bsj bsjVar : bVar2.a) {
            com.vk.im.engine.models.dialogs.a aVar = bsjVar.a;
            if (aVar != null) {
                dsj.a(aVar, profilesSimpleInfo2);
            }
            for (gtx0 gtx0Var : bsjVar.c) {
                if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                    com.vk.im.engine.models.messages.a aVar2 = (com.vk.im.engine.models.messages.a) gtx0Var;
                    Iterator<T> it = aVar2.K0().iterator();
                    while (it.hasNext()) {
                        w04.b((Attach) it.next(), profilesSimpleInfo2);
                    }
                    for (NestedMsg nestedMsg : aVar2.q7()) {
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
        }
        return new te20.b(bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.e, bVar2.f, bVar2.g, bVar2.h, bVar2.i, bVar2.j.Ib(profilesSimpleInfo2), bVar2.k, bVar2.l, bVar2.m);
    }
}
