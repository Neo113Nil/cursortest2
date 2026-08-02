package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.AttachVideo;
import java.io.File;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;
import xsna.ij20;

/* compiled from: VideoUploader.kt */
/* loaded from: classes2.dex */
public final class xot0 extends qr6 {
    public final AttachVideo r;

    public xot0(w2w w2wVar, AttachVideo attachVideo) {
        super(w2wVar, attachVideo);
        this.r = attachVideo;
    }

    @Override // xsna.yjt
    public final iot0 h() {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "video.save";
        AttachVideo attachVideo = this.r;
        aVar.b("name", attachVideo.getTitle());
        String j1 = attachVideo.b.j1();
        if (j1 == null) {
            j1 = "";
        }
        aVar.b("description", j1);
        aVar.b("target", "messages");
        aVar.b("preview", "1");
        aVar.b("wallpost", "0");
        aVar.b("repeat", "0");
        w2w w2wVar = this.b;
        Peer Q0 = w2wVar.Q0();
        Q0.getClass();
        if (Q0.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(w2wVar.Q0().d).toString());
        }
        aVar.j(EndpointParameters.Name.COMPRESSION, l());
        File file = attachVideo.p;
        aVar.f.put("file_size", Long.valueOf(file != null ? z4g.f(file) : 0L).toString());
        aVar.i = true;
        aVar.g = 3;
        return (iot0) bz2.f(new ij20(aVar), bet0.b);
    }
}
