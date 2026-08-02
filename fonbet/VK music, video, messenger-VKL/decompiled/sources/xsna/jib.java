package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.iib;

/* compiled from: ChannelsSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class jib extends FunctionReferenceImpl implements wzs<iib.b, ProfilesSimpleInfo, iib.b> {
    @Override // xsna.wzs
    public final iib.b invoke(iib.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        iib.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((iib) this.receiver).getClass();
        List<eeb> list = bVar2.a;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            gtx0 gtx0Var = ((eeb) it.next()).b;
            if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                Iterator<T> it2 = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                while (it2.hasNext()) {
                    w04.b((Attach) it2.next(), profilesSimpleInfo2);
                }
            }
        }
        return new iib.b(bVar2.c, profilesSimpleInfo2, list, bVar2.d);
    }
}
