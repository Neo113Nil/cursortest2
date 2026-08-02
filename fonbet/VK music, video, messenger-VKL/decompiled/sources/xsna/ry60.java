package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;

/* compiled from: NewsfeedSearchStoriesDto.kt */
/* loaded from: classes4.dex */
public final class ry60 {
    public final GetStoriesResponse a;
    public final String b;
    public final String c;

    public ry60(GetStoriesResponse getStoriesResponse, String str, String str2) {
        this.a = getStoriesResponse;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry60)) {
            return false;
        }
        ry60 ry60Var = (ry60) obj;
        return epx.f(this.a, ry60Var.a) && epx.f(this.b, ry60Var.b) && epx.f(this.c, ry60Var.c);
    }

    public final int hashCode() {
        GetStoriesResponse getStoriesResponse = this.a;
        int a = urd0.a((getStoriesResponse == null ? 0 : getStoriesResponse.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedSearchStoriesDto(stories=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", query=");
        return ho8.a(sb, this.c, ')');
    }
}
