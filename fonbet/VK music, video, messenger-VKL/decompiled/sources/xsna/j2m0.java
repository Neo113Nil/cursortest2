package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoryElongatedData.kt */
/* loaded from: classes18.dex */
public final class j2m0 {
    public final List<StoriesContainer> a;
    public final String b;

    public j2m0(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2m0)) {
            return false;
        }
        j2m0 j2m0Var = (j2m0) obj;
        return epx.f(this.a, j2m0Var.a) && epx.f(this.b, j2m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryElongatedData(stories=");
        sb.append(this.a);
        sb.append(", title=");
        return ho8.a(sb, this.b, ')');
    }
}
