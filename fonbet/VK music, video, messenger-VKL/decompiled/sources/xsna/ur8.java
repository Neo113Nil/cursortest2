package xsna;

import android.net.Uri;
import com.vk.dto.common.Attachment;

/* compiled from: ButtonUnderMediaUiDto.kt */
/* loaded from: classes4.dex */
public final class ur8 extends ol60 {
    public final eno0 h;
    public final Attachment i;
    public final boolean j;
    public final Uri k;

    public /* synthetic */ ur8(eno0 eno0Var, Attachment attachment) {
        this(eno0Var, attachment, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur8)) {
            return false;
        }
        ur8 ur8Var = (ur8) obj;
        return epx.f(this.h, ur8Var.h) && epx.f(this.i, ur8Var.i) && this.j == ur8Var.j && epx.f(this.k, ur8Var.k);
    }

    public final int hashCode() {
        int b = qoy.b((this.i.hashCode() + (this.h.hashCode() * 31)) * 31, 31, this.j);
        Uri uri = this.k;
        return b + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonUnderMediaUiDto(buttonTextUiDto=");
        sb.append(this.h);
        sb.append(", attachment=");
        sb.append(this.i);
        sb.append(", isRecolorAvailable=");
        sb.append(this.j);
        sb.append(", photoUri=");
        return alb0.b(sb, this.k, ')');
    }

    public ur8(eno0 eno0Var, Attachment attachment, boolean z, Uri uri) {
        super(351, 0, 0, 0, null);
        this.h = eno0Var;
        this.i = attachment;
        this.j = z;
        this.k = uri;
    }
}
