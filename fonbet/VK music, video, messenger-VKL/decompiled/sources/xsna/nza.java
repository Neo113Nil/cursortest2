package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mza;

/* compiled from: ChannelGetPinnedMessagesApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class nza extends FunctionReferenceImpl implements wzs<mza.a, ProfilesSimpleInfo, mza.a> {
    @Override // xsna.wzs
    public final mza.a invoke(mza.a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        mza.a aVar2 = aVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((mza) this.receiver).getClass();
        for (gtx0 gtx0Var : aVar2.a) {
            if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                Iterator<T> it = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                while (it.hasNext()) {
                    w04.b((Attach) it.next(), profilesSimpleInfo2);
                }
            }
        }
        return aVar2;
    }
}
