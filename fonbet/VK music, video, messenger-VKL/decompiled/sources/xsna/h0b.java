package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;

/* compiled from: ChannelInstantUploader.kt */
/* loaded from: classes2.dex */
public final class h0b implements odq0, yt60 {
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ h0b(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.yt60
    public zt60 Z() {
        return (cwq0) this.c;
    }

    @Override // xsna.odq0
    public g2z a(Attach attach, dh30 dh30Var) throws Exception {
        Long l = (Long) this.d;
        Peer peer = (Peer) this.c;
        w2w w2wVar = (w2w) this.b;
        if (attach instanceof AttachImage) {
            return new g0b(w2wVar, (AttachImage) attach, fkq0.a(com.vk.dto.common.a.b(peer))).a(attach, dh30Var);
        }
        if (attach instanceof AttachDoc) {
            return new rtn(w2wVar, (AttachDoc) attach).a(attach, dh30Var);
        }
        if (attach instanceof AttachVideo) {
            return new ydb(w2wVar, (AttachVideo) attach, peer).a(attach, dh30Var);
        }
        if (attach instanceof AttachVideoMsg) {
            if (l != null) {
                return new xdb(w2wVar, (AttachVideoMsg) attach, l.longValue()).a(attach, dh30Var);
            }
            throw new UnsupportedOperationException("channelId must be not null");
        }
        throw new UnsupportedOperationException("Unsupported attach: " + attach);
    }

    @Override // xsna.odq0
    public boolean c(Attach attach) {
        return (attach instanceof AttachImage) || (attach instanceof AttachVideo) || (attach instanceof AttachDoc) || (attach instanceof AttachVideoMsg);
    }

    @Override // xsna.yt60
    public au60 d0() {
        return (vwq0) this.b;
    }

    @Override // xsna.yt60
    public xt60 h1() {
        return (tvq0) this.d;
    }

    public h0b(yfm0 yfm0Var, egm0 egm0Var) {
        this.b = yfm0Var;
        this.c = egm0Var;
        this.d = new jgz(22);
    }
}
