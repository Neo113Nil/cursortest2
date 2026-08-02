package xsna;

import android.graphics.Bitmap;
import com.vk.dto.common.Attachment;

/* compiled from: StoryRepostAttachment.kt */
/* loaded from: classes6.dex */
public final class pbm0 {
    public final Attachment a;
    public final gzs<Bitmap> b;
    public final boolean c;

    public pbm0(Attachment attachment, gzs<Bitmap> gzsVar, boolean z) {
        this.a = attachment;
        this.b = gzsVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbm0)) {
            return false;
        }
        pbm0 pbm0Var = (pbm0) obj;
        return epx.f(this.a, pbm0Var.a) && epx.f(this.b, pbm0Var.b) && this.c == pbm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + sf3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryRepostAttachment(attachment=");
        sb.append(this.a);
        sb.append(", localPreviewProvider=");
        sb.append(this.b);
        sb.append(", requireLocalPreview=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
