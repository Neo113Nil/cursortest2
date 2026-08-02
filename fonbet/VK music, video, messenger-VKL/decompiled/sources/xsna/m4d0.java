package xsna;

import android.graphics.Bitmap;
import com.vk.dto.stories.model.StoryEntry;

/* compiled from: PreviewItem.kt */
/* loaded from: classes6.dex */
public final class m4d0 {
    public final boolean a;
    public final boolean b;
    public final StoryEntry c;
    public final int d;
    public final Bitmap e;

    public m4d0(boolean z, boolean z2, StoryEntry storyEntry, int i, Bitmap bitmap) {
        this.a = z;
        this.b = z2;
        this.c = storyEntry;
        this.d = i;
        this.e = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4d0)) {
            return false;
        }
        m4d0 m4d0Var = (m4d0) obj;
        return this.a == m4d0Var.a && this.b == m4d0Var.b && epx.f(this.c, m4d0Var.c) && this.d == m4d0Var.d && epx.f(this.e, m4d0Var.e);
    }

    public final int hashCode() {
        int a = shy.a(this.d, (this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31);
        Bitmap bitmap = this.e;
        return a + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewItem(isSelected=");
        sb.append(this.a);
        sb.append(", isCounterVisible=");
        sb.append(this.b);
        sb.append(", storyEntry=");
        sb.append(this.c);
        sb.append(", viewsTotalCount=");
        sb.append(this.d);
        sb.append(", customBitmap=");
        return qr.c(sb, this.e, ')');
    }
}
