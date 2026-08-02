package xsna;

import com.vk.stickers.api.models.question.StoryQuestionInfo;

/* compiled from: StoryCreateQuestionColor.kt */
/* loaded from: classes16.dex */
public final class t0m0 {
    public final StoryQuestionInfo.Style a;
    public final boolean b;
    public final int c;
    public final StoryQuestionInfo.a d;
    public final int e;

    public t0m0(StoryQuestionInfo.Style style, boolean z, int i, StoryQuestionInfo.a aVar, int i2) {
        this.a = style;
        this.b = z;
        this.c = i;
        this.d = aVar;
        this.e = i2;
    }

    public static t0m0 a(t0m0 t0m0Var, boolean z) {
        StoryQuestionInfo.Style style = t0m0Var.a;
        int i = t0m0Var.c;
        StoryQuestionInfo.a aVar = t0m0Var.d;
        int i2 = t0m0Var.e;
        t0m0Var.getClass();
        return new t0m0(style, z, i, aVar, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0m0)) {
            return false;
        }
        t0m0 t0m0Var = (t0m0) obj;
        return this.a == t0m0Var.a && this.b == t0m0Var.b && this.c == t0m0Var.c && epx.f(this.d, t0m0Var.d) && this.e == t0m0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + shy.a(this.c, qoy.b(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryCreateQuestionColor(style=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", colors=");
        sb.append(this.d);
        sb.append(", dotDrawableResource=");
        return vu5.b(sb, this.e, ')');
    }
}
