package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.p0b;

/* compiled from: ChannelJoinApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class q0b extends FunctionReferenceImpl implements wzs<p0b.b.C3484b.a, ProfilesSimpleInfo, p0b.b.C3484b.a> {
    @Override // xsna.wzs
    public final p0b.b.C3484b.a invoke(p0b.b.C3484b.a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        p0b.b.C3484b.a aVar2 = aVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((p0b) this.receiver).getClass();
        gtx0 gtx0Var = aVar2.a.b;
        if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
            Iterator<T> it = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
            while (it.hasNext()) {
                w04.b((Attach) it.next(), profilesSimpleInfo2);
            }
        }
        return aVar2;
    }
}
