package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cfb;

/* compiled from: ChannelsGetApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class dfb extends FunctionReferenceImpl implements wzs<cfb.b, ProfilesSimpleInfo, cfb.b> {
    @Override // xsna.wzs
    public final cfb.b invoke(cfb.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        cfb.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((cfb) this.receiver).getClass();
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
