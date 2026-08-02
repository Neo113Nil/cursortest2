package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.q2b;

/* compiled from: ChannelMessagesGetHistoryApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class r2b extends FunctionReferenceImpl implements wzs<q2b.c, ProfilesSimpleInfo, q2b.c> {
    @Override // xsna.wzs
    public final q2b.c invoke(q2b.c cVar, ProfilesSimpleInfo profilesSimpleInfo) {
        q2b.c cVar2 = cVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((q2b) this.receiver).getClass();
        for (gtx0 gtx0Var : cVar2.a) {
            if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                Iterator<T> it = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                while (it.hasNext()) {
                    w04.b((Attach) it.next(), profilesSimpleInfo2);
                }
            }
        }
        return cVar2;
    }
}
