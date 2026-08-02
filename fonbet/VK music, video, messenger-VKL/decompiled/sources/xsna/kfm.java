package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: DialogHistoryRemoteDataSource.kt */
/* loaded from: classes13.dex */
public final class kfm implements l8v {
    public final a1w a;
    public final ifm b;
    public final bpn0 c = new bpn0(new nwk(this, 1));

    public kfm(a1w a1wVar, ifm ifmVar) {
        this.a = a1wVar;
        this.b = ifmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.l8v
    public final gj30 b(de deVar, int i) throws ApiAccessDeniedException {
        long c = ((hfm) this.c.getValue()).c();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        tqm tqmVar = new tqm(new sqm(Peer.a.b(c), Source.CACHE, false, (Object) this, 16));
        a1w a1wVar = this.a;
        Dialog dialog = (Dialog) ((wpp) vdg0.c(a1wVar.n(this, tqmVar))).e(Long.valueOf(c)).b;
        if (dialog != null ? dialog.wc() : false) {
            throw new ApiAccessDeniedException((VKApiExecutionException) null);
        }
        return (gj30) vdg0.c(a1wVar.n(this, new pj30(Peer.a.b(c), deVar, i, Source.NETWORK, true, this)));
    }

    public final String toString() {
        return "DialogHistoryRemoteDataSource-" + hashCode() + ": boundDataSource=" + this.b;
    }
}
