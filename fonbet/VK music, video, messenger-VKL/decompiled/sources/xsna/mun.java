package xsna;

import com.vk.dto.common.ImageSize;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DocumentThumbnailHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class mun {
    public final DocumentAttachment a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;
    public final ImageSize f;
    public final List<ImageSize> g;

    public mun(DocumentAttachment documentAttachment, String str, String str2, boolean z, long j, ImageSize imageSize, ArrayList arrayList) {
        this.a = documentAttachment;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = j;
        this.f = imageSize;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mun)) {
            return false;
        }
        mun munVar = (mun) obj;
        return epx.f(this.a, munVar.a) && epx.f(this.b, munVar.b) && epx.f(this.c, munVar.c) && this.d == munVar.d && this.e == munVar.e && epx.f(this.f, munVar.f) && epx.f(this.g, munVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int a = bh10.a(qoy.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        ImageSize imageSize = this.f;
        int hashCode3 = (a + (imageSize == null ? 0 : imageSize.hashCode())) * 31;
        List<ImageSize> list = this.g;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocumentThumbnailHolderUiDto(attachment=");
        sb.append(this.a);
        sb.append(", extension=");
        sb.append(this.b);
        sb.append(", extensionUppercase=");
        sb.append(this.c);
        sb.append(", isGif=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", localImage=");
        sb.append(this.f);
        sb.append(", remoteImage=");
        return ms9.a(')', sb, this.g);
    }
}
