package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.stories.presentation.story.StoryConfig$Mode;

/* loaded from: classes6.dex */
public final class lpu0 extends x3 {
    public final List c;
    public final String w;

    public lpu0(List list, String str) {
        super(15, StoryConfig$Mode.STORIES_FOR_SCREEN);
        this.c = list;
        this.w = str;
    }

    @Override // defpackage.x3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpu0)) {
            return false;
        }
        lpu0 lpu0Var = (lpu0) obj;
        return jl40.l(this.c, lpu0Var.c) && jl40.l(this.w, lpu0Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return xvz.i("MultipleStoriesMode(storyIds=", ", firstStoryId=", this.w, Extension.C_BRAKE, this.c);
    }
}
