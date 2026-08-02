package xsna;

import com.vk.dto.photo.ImageCropData;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import java.util.List;

/* compiled from: AttachmentsBottomPreviewControls.kt */
/* loaded from: classes3.dex */
public final class mfk {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final PreviewRatio d;
    public final List<ImageCropData> e;
    public final String f;

    public mfk(boolean z, boolean z2, boolean z3, PreviewRatio previewRatio, List<ImageCropData> list, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = previewRatio;
        this.e = list;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfk)) {
            return false;
        }
        mfk mfkVar = (mfk) obj;
        return this.a == mfkVar.a && this.b == mfkVar.b && this.c == mfkVar.c && epx.f(this.d, mfkVar.d) && epx.f(this.e, mfkVar.e) && epx.f(this.f, mfkVar.f);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        PreviewRatio previewRatio = this.d;
        int hashCode = (b + (previewRatio == null ? 0 : previewRatio.hashCode())) * 31;
        List<ImageCropData> list = this.e;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropDelegateConfig(allowShowingOnboarding=");
        sb.append(this.a);
        sb.append(", isComment=");
        sb.append(this.b);
        sb.append(", isGrid=");
        sb.append(this.c);
        sb.append(", ratio=");
        sb.append(this.d);
        sb.append(", crops=");
        sb.append(this.e);
        sb.append(", ratioMeta=");
        return ho8.a(sb, this.f, ')');
    }
}
