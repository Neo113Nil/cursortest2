package xsna;

import com.vk.im.engine.models.attaches.AttachVideoMsg;
import xsna.ij20;

/* compiled from: VideoMsgUploader.kt */
/* loaded from: classes2.dex */
public final class lxs0 extends qr6 {
    public final AttachVideoMsg r;

    public lxs0(w2w w2wVar, AttachVideoMsg attachVideoMsg) {
        super(w2wVar, attachVideoMsg);
        this.r = attachVideoMsg;
    }

    @Override // xsna.yjt
    public final iot0 h() {
        ij20.a aVar = new ij20.a();
        aVar.d = bz2.m();
        aVar.c = "video.getVideoMessageUploadInfo";
        aVar.f.put("shape_id", Integer.valueOf(this.r.c).toString());
        aVar.i = true;
        aVar.g = 3;
        return (iot0) bz2.f(new ij20(aVar), bet0.b);
    }

    @Override // xsna.qr6, xsna.yjt
    public final boolean l() {
        return false;
    }
}
