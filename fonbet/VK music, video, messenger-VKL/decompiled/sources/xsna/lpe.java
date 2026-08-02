package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.ye20;

/* compiled from: ClipsPaginatorGetMediaAttachHistoryCmd.kt */
/* loaded from: classes2.dex */
public final class lpe extends le6<ye20.a> {
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public lpe(int i, int i2, int i3, int i4, long j) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // xsna.le6
    public final ye20.a e(w2w w2wVar) {
        VideoFile videoFile;
        ye20.a aVar = (ye20.a) fo50.v(new df20(this.b, this.c, this.f, this.d, this.e, Collections.singletonList(MediaType.CLIP), w2wVar.Q0()), w2wVar, "ClipsPaginatorGetMediaAttachHistoryCmd.MessagesGetNewHistoryAttachmentsApiCmd", 2);
        List<HistoryAttach> list = aVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Attach attach = ((HistoryAttach) obj).d;
            AttachVideo attachVideo = attach instanceof AttachVideo ? (AttachVideo) attach : null;
            if (attachVideo != null && (videoFile = attachVideo.b) != null && videoFile.C2()) {
                arrayList.add(obj);
            }
        }
        return new ye20.a(new fgg0(arrayList), aVar.b, aVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpe)) {
            return false;
        }
        lpe lpeVar = (lpe) obj;
        return this.b == lpeVar.b && this.c == lpeVar.c && this.d == lpeVar.d && this.e == lpeVar.e && this.f == lpeVar.f;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31), 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPaginatorGetMediaAttachHistoryCmd(dialogId=");
        sb.append(this.b);
        sb.append(", mvCnvMsgId=");
        sb.append(this.c);
        sb.append(", count=");
        sb.append(this.d);
        sb.append(", offset=");
        sb.append(this.e);
        sb.append(", position=");
        return vu5.b(sb, this.f, ')');
    }
}
