package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.ToolbarNavButtonType;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class chc0 {
    public final String a;
    public final ToolbarNavButtonType b;
    public final String c;

    public chc0(String str, ToolbarNavButtonType toolbarNavButtonType, String str2) {
        this.a = str;
        this.b = toolbarNavButtonType;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chc0)) {
            return false;
        }
        chc0 chc0Var = (chc0) obj;
        return epx.f(this.a, chc0Var.a) && this.b == chc0Var.b && epx.f(this.c, chc0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingMediaPickerToolbarViewState(title=");
        sb.append(this.a);
        sb.append(", buttonType=");
        sb.append(this.b);
        sb.append(", authorName=");
        return ho8.a(sb, this.c, ')');
    }
}
