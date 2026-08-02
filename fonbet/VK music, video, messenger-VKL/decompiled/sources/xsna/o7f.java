package xsna;

import android.graphics.Bitmap;
import com.vk.clips.editor.templates.impl.domain.ShortVideoTemplateFragment;

/* compiled from: ClipsTemplateEditorFragmentRecyclerItem.kt */
/* loaded from: classes16.dex */
public final class o7f {
    public final long a;
    public final ShortVideoTemplateFragment b;
    public final Bitmap c;
    public final boolean d;

    public o7f(long j, ShortVideoTemplateFragment shortVideoTemplateFragment, Bitmap bitmap, boolean z) {
        this.a = j;
        this.b = shortVideoTemplateFragment;
        this.c = bitmap;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7f)) {
            return false;
        }
        o7f o7fVar = (o7f) obj;
        return this.a == o7fVar.a && epx.f(this.b, o7fVar.b) && epx.f(this.c, o7fVar.c) && this.d == o7fVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Bitmap bitmap = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTemplateEditorFragmentRecyclerItem(index=");
        sb.append(this.a);
        sb.append(", fragment=");
        sb.append(this.b);
        sb.append(", photo=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
