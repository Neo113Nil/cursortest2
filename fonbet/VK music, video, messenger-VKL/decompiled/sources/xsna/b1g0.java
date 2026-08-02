package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ReplaceMsgsVideoAttachesCmd.kt */
/* loaded from: classes2.dex */
public final class b1g0 extends le6<s3q0> {
    public final VideoFile b;

    public b1g0(VideoFile videoFile) {
        this.b = videoFile;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        AttachWithId attachVideo;
        VideoFile videoFile = this.b;
        if (videoFile.Sa()) {
            gtx0 gtx0Var = (Msg) j5g.a0(w2wVar.I0().o().Y(AttachVideoMsg.class, videoFile.I0(), Long.valueOf(videoFile.o0())));
            AttachVideoMsg attachVideoMsg = null;
            if (gtx0Var instanceof com.vk.im.engine.models.messages.a) {
                Attach l4 = ((com.vk.im.engine.models.messages.a) gtx0Var).l4(new xka0(this, 5), true);
                if (l4 instanceof AttachVideoMsg) {
                    attachVideoMsg = (AttachVideoMsg) l4;
                }
            }
            attachVideo = new AttachVideoMsg(this.b, attachVideoMsg != null ? attachVideoMsg.c : 1, null, null, 0L, null, null, 0, null, null, null, 0, false, false, false, null, 65532, null);
        } else {
            attachVideo = new AttachVideo(this.b, null, null, 0L, null, 0, 0, 0L, 0, 0L, null, null, null, null, null, 32766, null);
        }
        w2wVar.O0().a(new a1g0(attachVideo));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1g0) && epx.f(this.b, ((b1g0) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return lq.a(new StringBuilder("ReplaceMsgsVideoAttachesCmd(videoFile="), this.b, ')');
    }
}
