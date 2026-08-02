package xsna;

import java.util.List;

/* compiled from: StoryHashtagSearchResult.kt */
/* loaded from: classes18.dex */
public final class u4m0 {
    public final List<hvu> a;

    public u4m0(List<hvu> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4m0) && epx.f(this.a, ((u4m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StoryHashtagSearchResult(list="), this.a);
    }
}
