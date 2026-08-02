package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: GroupCallBannerViewStateObserver.kt */
/* loaded from: classes2.dex */
public final class fhu {
    public final a1w a;

    public fhu(a1w a1wVar) {
        this.a = a1wVar;
    }

    public final io.reactivex.rxjava3.core.q<DialogExt> a(long j, Source source) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return this.a.C("GroupCallBannerViewStateObserver", new uqm(new sqm(Peer.a.b(j), source, false, (Object) null, 28))).l(new y34(new dhu(j), 20)).w();
    }
}
