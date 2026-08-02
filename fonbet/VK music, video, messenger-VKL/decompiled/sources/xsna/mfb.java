package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lfb;

/* compiled from: ChannelsGetRecommendationsApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class mfb extends FunctionReferenceImpl implements wzs<lfb.b, ProfilesSimpleInfo, lfb.b> {
    @Override // xsna.wzs
    public final lfb.b invoke(lfb.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        lfb.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((lfb) this.receiver).getClass();
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
