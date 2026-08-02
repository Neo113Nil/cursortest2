package xsna;

import com.vk.superapp.api.dto.story.WebStoryBox;

/* compiled from: WebStoryBoxData.kt */
/* loaded from: classes6.dex */
public final class zhx0 {
    public final WebStoryBox a;
    public final Long b;
    public final Long c;
    public final String d;

    public zhx0(WebStoryBox webStoryBox, Long l, Long l2, String str) {
        this.a = webStoryBox;
        this.b = l;
        this.c = l2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhx0)) {
            return false;
        }
        zhx0 zhx0Var = (zhx0) obj;
        return epx.f(this.a, zhx0Var.a) && epx.f(this.b, zhx0Var.b) && epx.f(this.c, zhx0Var.c) && epx.f(this.d, zhx0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebStoryBoxData(storyBox=");
        sb.append(this.a);
        sb.append(", dialogId=");
        sb.append(this.b);
        sb.append(", appId=");
        sb.append(this.c);
        sb.append(", requestId=");
        return ho8.a(sb, this.d, ')');
    }
}
