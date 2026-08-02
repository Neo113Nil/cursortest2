package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.SearchMode;
import xsna.fcw;

/* compiled from: CachedSearchedDialogsRepository.kt */
/* loaded from: classes2.dex */
public final class my8 implements fcw {
    public final a1w a;
    public final vw30 b;
    public final ww30 c;

    public my8(a1w a1wVar, vw30 vw30Var, ww30 ww30Var) {
        this.a = a1wVar;
        this.b = vw30Var;
        this.c = ww30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // xsna.fcw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.core.x<gcw> a(fcw.a aVar, Object obj) {
        Peer peer;
        String str = aVar.a;
        Source source = Source.CACHE;
        SearchMode searchMode = SearchMode.PEERS;
        Long l = aVar.b;
        if (l != null) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.a.b(l.longValue());
        }
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        peer = Peer.Unknown.e;
        return this.a.C(obj, new kx30(str, source, searchMode, 20, 0, null, peer, false, false, null, null, 3888)).l(new s41(new u9(5, aVar, this), 6));
    }
}
