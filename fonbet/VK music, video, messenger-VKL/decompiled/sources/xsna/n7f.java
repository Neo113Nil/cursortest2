package xsna;

import android.graphics.Bitmap;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.clips.editor.templates.impl.domain.ShortVideoTemplateFragment;

/* compiled from: ClipsTemplateEditorFragmentItem.kt */
/* loaded from: classes16.dex */
public final class n7f {
    public final int a;
    public final ShortVideoTemplateFragment b;
    public final ClipsTemplateEditorVideoItem c;
    public final Bitmap d;
    public final Long e;

    public n7f(int i, ShortVideoTemplateFragment shortVideoTemplateFragment, ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem, Bitmap bitmap, Long l) {
        this.a = i;
        this.b = shortVideoTemplateFragment;
        this.c = clipsTemplateEditorVideoItem;
        this.d = bitmap;
        this.e = l;
    }

    public static n7f a(n7f n7fVar, ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem, Bitmap bitmap, Long l, int i) {
        int i2 = n7fVar.a;
        ShortVideoTemplateFragment shortVideoTemplateFragment = n7fVar.b;
        if ((i & 4) != 0) {
            clipsTemplateEditorVideoItem = n7fVar.c;
        }
        ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem2 = clipsTemplateEditorVideoItem;
        if ((i & 8) != 0) {
            bitmap = n7fVar.d;
        }
        Bitmap bitmap2 = bitmap;
        if ((i & 16) != 0) {
            l = n7fVar.e;
        }
        n7fVar.getClass();
        return new n7f(i2, shortVideoTemplateFragment, clipsTemplateEditorVideoItem2, bitmap2, l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7f)) {
            return false;
        }
        n7f n7fVar = (n7f) obj;
        return this.a == n7fVar.a && epx.f(this.b, n7fVar.b) && epx.f(this.c, n7fVar.c) && epx.f(this.d, n7fVar.d) && epx.f(this.e, n7fVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = this.c;
        int hashCode2 = (hashCode + (clipsTemplateEditorVideoItem == null ? 0 : clipsTemplateEditorVideoItem.hashCode())) * 31;
        Bitmap bitmap = this.d;
        int hashCode3 = (hashCode2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Long l = this.e;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTemplateEditorFragmentItem(index=");
        sb.append(this.a);
        sb.append(", fragment=");
        sb.append(this.b);
        sb.append(", videoItem=");
        sb.append(this.c);
        sb.append(", preview=");
        sb.append(this.d);
        sb.append(", previewTimeStamp=");
        return iq.b(sb, this.e, ')');
    }
}
