package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.efb;

/* compiled from: ChannelsGetByIdApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class ffb extends FunctionReferenceImpl implements wzs<efb.b, ProfilesSimpleInfo, efb.b> {
    @Override // xsna.wzs
    public final efb.b invoke(efb.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        efb.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((efb) this.receiver).getClass();
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
        return bVar2;
    }
}
