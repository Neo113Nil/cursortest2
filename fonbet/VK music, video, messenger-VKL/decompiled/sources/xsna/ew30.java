package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw30;

/* compiled from: MsgSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class ew30 extends FunctionReferenceImpl implements wzs<dw30.a, ProfilesSimpleInfo, dw30.a> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final dw30.a invoke(dw30.a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        dw30.a aVar2 = aVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((dw30) this.receiver).getClass();
        boolean z = aVar2 instanceof dw30.a.C2765a;
        if (z) {
            Iterator<T> it = ((dw30.a.C2765a) aVar2).a.iterator();
            while (it.hasNext()) {
                dsj.a((com.vk.im.engine.models.dialogs.a) ((zpp) it.next()).a, profilesSimpleInfo2);
            }
        } else {
            if (!(aVar2 instanceof dw30.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            for (gtx0 gtx0Var : ((dw30.a.b) aVar2).c) {
                if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                    com.vk.im.engine.models.messages.a aVar3 = (com.vk.im.engine.models.messages.a) gtx0Var;
                    Iterator<T> it2 = aVar3.K0().iterator();
                    while (it2.hasNext()) {
                        w04.b((Attach) it2.next(), profilesSimpleInfo2);
                    }
                    for (NestedMsg nestedMsg : aVar3.q7()) {
                        Iterator it3 = nestedMsg.j.iterator();
                        while (it3.hasNext()) {
                            w04.b((Attach) it3.next(), profilesSimpleInfo2);
                        }
                        for (NestedMsg nestedMsg2 : nestedMsg.k) {
                            Iterator it4 = nestedMsg2.j.iterator();
                            while (it4.hasNext()) {
                                w04.b((Attach) it4.next(), profilesSimpleInfo2);
                            }
                            for (NestedMsg nestedMsg3 : nestedMsg2.k) {
                                Iterator it5 = nestedMsg3.j.iterator();
                                while (it5.hasNext()) {
                                    w04.b((Attach) it5.next(), profilesSimpleInfo2);
                                }
                                Iterator it6 = nestedMsg3.k.iterator();
                                while (it6.hasNext()) {
                                    bh30.c((NestedMsg) it6.next(), profilesSimpleInfo2);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            dw30.a.C2765a c2765a = (dw30.a.C2765a) aVar2;
            return new dw30.a.C2765a(c2765a.a, profilesSimpleInfo2, c2765a.c, c2765a.d);
        }
        if (!(aVar2 instanceof dw30.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        dw30.a.b bVar = (dw30.a.b) aVar2;
        return new dw30.a.b(bVar.a, profilesSimpleInfo2, bVar.c, bVar.d, bVar.e, bVar.f);
    }
}
