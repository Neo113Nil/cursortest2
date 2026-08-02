package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.m3b;

/* compiled from: ChannelMessagesSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class n3b extends FunctionReferenceImpl implements wzs<m3b.b, ProfilesSimpleInfo, m3b.b> {
    @Override // xsna.wzs
    public final m3b.b invoke(m3b.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        m3b.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((m3b) this.receiver).getClass();
        List<Msg> list = bVar2.a;
        for (gtx0 gtx0Var : list) {
            if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                Iterator<T> it = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                while (it.hasNext()) {
                    w04.b((Attach) it.next(), profilesSimpleInfo2);
                }
            }
        }
        return new m3b.b(list, profilesSimpleInfo2, bVar2.c, bVar2.d);
    }
}
