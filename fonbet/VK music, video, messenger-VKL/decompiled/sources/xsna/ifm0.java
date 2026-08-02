package xsna;

import com.vk.dto.stories.model.StoryEntry;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: StoryStatisticsInfoState.kt */
/* loaded from: classes6.dex */
public final class ifm0 implements km50 {
    public final StoryEntry b;
    public final boolean c;
    public final c3m0 d;
    public final Throwable e;
    public final Set<Integer> f;

    public ifm0(StoryEntry storyEntry, boolean z, c3m0 c3m0Var, Throwable th, Set<Integer> set) {
        this.b = storyEntry;
        this.c = z;
        this.d = c3m0Var;
        this.e = th;
        this.f = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ifm0 a(ifm0 ifm0Var, StoryEntry storyEntry, boolean z, c3m0 c3m0Var, Throwable th, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            storyEntry = ifm0Var.b;
        }
        StoryEntry storyEntry2 = storyEntry;
        if ((i & 2) != 0) {
            z = ifm0Var.c;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            c3m0Var = ifm0Var.d;
        }
        c3m0 c3m0Var2 = c3m0Var;
        if ((i & 8) != 0) {
            th = ifm0Var.e;
        }
        Throwable th2 = th;
        Set set = linkedHashSet;
        if ((i & 16) != 0) {
            set = ifm0Var.f;
        }
        ifm0Var.getClass();
        return new ifm0(storyEntry2, z2, c3m0Var2, th2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifm0)) {
            return false;
        }
        ifm0 ifm0Var = (ifm0) obj;
        return epx.f(this.b, ifm0Var.b) && this.c == ifm0Var.c && epx.f(this.d, ifm0Var.d) && epx.f(this.e, ifm0Var.e) && epx.f(this.f, ifm0Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        c3m0 c3m0Var = this.d;
        int hashCode = (b + (c3m0Var == null ? 0 : c3m0Var.hashCode())) * 31;
        Throwable th = this.e;
        return this.f.hashCode() + ((hashCode + (th != null ? th.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsInfoState(currentStoryEntry=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", storyFullStatContainer=");
        sb.append(this.d);
        sb.append(", throwable=");
        sb.append(this.e);
        sb.append(", loadedAndCachedStoriesIds=");
        return ur.c(sb, this.f, ')');
    }
}
