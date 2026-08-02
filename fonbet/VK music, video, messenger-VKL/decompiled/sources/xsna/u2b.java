package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.t2b;

/* compiled from: ChannelMessagesGetHistoryAttachmentsApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class u2b extends FunctionReferenceImpl implements wzs<t2b.a, ProfilesSimpleInfo, t2b.a> {
    @Override // xsna.wzs
    public final t2b.a invoke(t2b.a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        t2b.a aVar2 = aVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((t2b) this.receiver).getClass();
        Iterator it = aVar2.a.iterator();
        while (it.hasNext()) {
            w04.b((Attach) it.next(), profilesSimpleInfo2);
        }
        return aVar2;
    }
}
