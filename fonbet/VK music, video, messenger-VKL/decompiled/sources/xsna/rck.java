package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: CreationOnboardingTasksEvent.kt */
/* loaded from: classes5.dex */
public final class rck implements tck {
    public final NewsEntry a;

    public rck(NewsEntry newsEntry) {
        this.a = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rck) && epx.f(this.a, ((rck) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ck70.a(new StringBuilder("OpenPost(newsEntry="), this.a, ')');
    }
}
