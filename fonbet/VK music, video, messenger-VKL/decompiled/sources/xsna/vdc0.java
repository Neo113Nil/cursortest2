package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import java.util.List;

/* compiled from: PhotoVideoAttachmentsCropData.kt */
/* loaded from: classes4.dex */
public final class vdc0 {
    public final PostingPreviewRatio a;
    public final List<ImageCropArea> b;
    public final String c;

    public vdc0() {
        throw null;
    }

    public vdc0(PostingPreviewRatio postingPreviewRatio, List list, String str, int i) {
        str = (i & 8) != 0 ? null : str;
        this.a = postingPreviewRatio;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdc0)) {
            return false;
        }
        vdc0 vdc0Var = (vdc0) obj;
        return epx.f(this.a, vdc0Var.a) && epx.f(this.b, vdc0Var.b) && epx.f(this.c, vdc0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<ImageCropArea> list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 961;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingCropsForRatio(ratio=");
        sb.append(this.a);
        sb.append(", crops=");
        sb.append(this.b);
        sb.append(", customRatio=null, ratioMeta=");
        return ho8.a(sb, this.c, ')');
    }
}
