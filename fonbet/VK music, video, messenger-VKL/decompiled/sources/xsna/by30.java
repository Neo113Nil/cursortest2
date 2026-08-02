package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.ui.components.msg_search.analytics.ImSearchLocalRequestLoggingInfo;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MsgSearchPeersInteractor.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class by30 extends FunctionReferenceImpl implements zzs<String, Long, Object, ImSearchLocalRequestLoggingInfo, io.reactivex.rxjava3.core.x<gcw>> {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r15 == null) goto L8;
     */
    @Override // xsna.zzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.x<gcw> invoke(String str, Long l, Object obj, ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo) {
        Peer peer;
        String str2 = str;
        Long l2 = l;
        ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo2 = imSearchLocalRequestLoggingInfo;
        tw30 tw30Var = ((xx30) this.receiver).c.h;
        String str3 = imSearchLocalRequestLoggingInfo2.c;
        SearchEntrypoint searchEntrypoint = imSearchLocalRequestLoggingInfo2.f;
        tw30Var.getClass();
        Source source = Source.NETWORK;
        SearchMode searchMode = SearchMode.PEERS;
        if (l2 != null) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.a.b(l2.longValue());
        }
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        peer = Peer.Unknown.e;
        return tw30Var.a.C(obj, new kx30(str2, source, searchMode, 20, 0, null, peer, true, false, str3, searchEntrypoint, 816)).l(new hl30(new bzw(tw30Var, 8), 1));
    }
}
