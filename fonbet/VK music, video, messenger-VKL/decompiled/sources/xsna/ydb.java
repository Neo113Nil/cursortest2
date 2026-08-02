package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.AttachVideo;
import xsna.ij20;

/* compiled from: ChannelVideoUploader.kt */
/* loaded from: classes2.dex */
public final class ydb extends qr6 {
    public final Peer r;

    public ydb(w2w w2wVar, AttachVideo attachVideo, Peer peer) {
        super(w2wVar, attachVideo);
        this.r = peer;
    }

    @Override // xsna.yjt
    public final iot0 h() {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "video.save";
        aVar.b("target", "channel");
        aVar.b("preview", "1");
        Peer peer = this.r;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(Math.abs(peer.d)).toString());
        }
        aVar.i = true;
        aVar.g = 3;
        return (iot0) bz2.f(new ij20(aVar), bet0.b);
    }
}
