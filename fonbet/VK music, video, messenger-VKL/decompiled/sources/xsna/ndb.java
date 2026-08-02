package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mdb;

/* compiled from: ChannelUnarchiveApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class ndb extends FunctionReferenceImpl implements wzs<mdb.b, ProfilesSimpleInfo, mdb.b> {
    @Override // xsna.wzs
    public final mdb.b invoke(mdb.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        mdb.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((mdb) this.receiver).getClass();
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
