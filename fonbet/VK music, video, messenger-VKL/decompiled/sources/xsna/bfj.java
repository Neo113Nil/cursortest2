package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import java.util.List;

/* compiled from: StoriesInteractor.kt */
/* loaded from: classes6.dex */
public final class bfj {
    public final List<StoriesContainer> a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public bfj(List<? extends StoriesContainer> list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfj)) {
            return false;
        }
        bfj bfjVar = (bfj) obj;
        return epx.f(this.a, bfjVar.a) && epx.f(this.b, bfjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContainersToOpen(containers=");
        sb.append(this.a);
        sb.append(", openUniqueId=");
        return ho8.a(sb, this.b, ')');
    }
}
