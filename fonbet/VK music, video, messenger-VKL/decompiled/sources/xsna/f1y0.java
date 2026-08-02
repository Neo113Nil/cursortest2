package xsna;

import com.vk.dto.common.Attachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WriteBarInputState.kt */
/* loaded from: classes7.dex */
public final class f1y0 {
    public final CharSequence a;
    public final List<Attachment> b;

    public f1y0(CharSequence charSequence, ArrayList arrayList) {
        this.a = charSequence;
        this.b = arrayList;
    }

    public final boolean a() {
        return this.b.isEmpty() && drm0.N(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1y0)) {
            return false;
        }
        f1y0 f1y0Var = (f1y0) obj;
        return epx.f(this.a, f1y0Var.a) && epx.f(this.b, f1y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WriteBarInputState(text=");
        sb.append((Object) this.a);
        sb.append(", attachments=");
        return ms9.a(')', sb, this.b);
    }
}
