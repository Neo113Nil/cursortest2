package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.d8w;

/* compiled from: ImItemsGetApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class e8w extends FunctionReferenceImpl implements wzs<d8w.b, ProfilesSimpleInfo, d8w.b> {
    @Override // xsna.wzs
    public final d8w.b invoke(d8w.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        d8w.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((d8w) this.receiver).getClass();
        Iterator<T> it = bVar2.a.iterator();
        while (it.hasNext()) {
            gtx0 gtx0Var = ((eeb) it.next()).b;
            if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                Iterator<T> it2 = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                while (it2.hasNext()) {
                    w04.b((Attach) it2.next(), profilesSimpleInfo2);
                }
            }
        }
        Iterator<T> it3 = bVar2.b.iterator();
        while (it3.hasNext()) {
            gtx0 gtx0Var2 = ((pmm) it3.next()).b;
            if (gtx0Var2 != null && !profilesSimpleInfo2.isEmpty() && (gtx0Var2 instanceof com.vk.im.engine.models.messages.a)) {
                com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) gtx0Var2;
                Iterator<T> it4 = aVar.K0().iterator();
                while (it4.hasNext()) {
                    w04.b((Attach) it4.next(), profilesSimpleInfo2);
                }
                for (NestedMsg nestedMsg : aVar.q7()) {
                    Iterator it5 = nestedMsg.j.iterator();
                    while (it5.hasNext()) {
                        w04.b((Attach) it5.next(), profilesSimpleInfo2);
                    }
                    for (NestedMsg nestedMsg2 : nestedMsg.k) {
                        Iterator it6 = nestedMsg2.j.iterator();
                        while (it6.hasNext()) {
                            w04.b((Attach) it6.next(), profilesSimpleInfo2);
                        }
                        for (NestedMsg nestedMsg3 : nestedMsg2.k) {
                            Iterator it7 = nestedMsg3.j.iterator();
                            while (it7.hasNext()) {
                                w04.b((Attach) it7.next(), profilesSimpleInfo2);
                            }
                            Iterator it8 = nestedMsg3.k.iterator();
                            while (it8.hasNext()) {
                                bh30.c((NestedMsg) it8.next(), profilesSimpleInfo2);
                            }
                        }
                    }
                }
            }
        }
        bVar2.e.Hb(profilesSimpleInfo2);
        return bVar2;
    }
}
