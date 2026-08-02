package xsna;

import com.vk.dto.stories.model.ideas.StoryIdea;

/* compiled from: IdeasPage.kt */
/* loaded from: classes6.dex */
public final class nsv {
    public final String a;
    public final StoryIdea b;
    public final fa90 c;

    public nsv(String str, StoryIdea storyIdea, fa90 fa90Var) {
        this.a = str;
        this.b = storyIdea;
        this.c = fa90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsv)) {
            return false;
        }
        nsv nsvVar = (nsv) obj;
        return epx.f(this.a, nsvVar.a) && epx.f(this.b, nsvVar.b) && epx.f(this.c, nsvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IdeasPage(id=" + this.a + ", idea=" + this.b + ", state=" + this.c + ')';
    }
}
