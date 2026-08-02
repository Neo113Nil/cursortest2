package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.stories.presentation.story.StoryConfig$Mode;

/* loaded from: classes6.dex */
public final class gou0 {
    public final String a;
    public final StoryConfig$Mode b;
    public final List c;
    public final float d;
    public final String e;
    public final Story f;
    public final boolean g;
    public final RetryPolicy h;

    public gou0(String str, StoryConfig$Mode storyConfig$Mode, List list, float f, String str2, Story story, boolean z, RetryPolicy retryPolicy) {
        this.a = str;
        this.b = storyConfig$Mode;
        this.c = list;
        this.d = f;
        this.e = str2;
        this.f = story;
        this.g = z;
        this.h = retryPolicy;
        if (list.isEmpty()) {
            ny61.g("storyIds is empty");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gou0)) {
            return false;
        }
        gou0 gou0Var = (gou0) obj;
        return jl40.l(this.a, gou0Var.a) && this.b == gou0Var.b && jl40.l(this.c, gou0Var.c) && Float.compare(this.d, gou0Var.d) == 0 && jl40.l(this.e, gou0Var.e) && jl40.l(this.f, gou0Var.f) && this.g == gou0Var.g && this.h == gou0Var.h;
    }

    public final int hashCode() {
        int c = g8e.c(this.d, unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        String str = this.e;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        Story story = this.f;
        return this.h.hashCode() + unr0.e(unr0.e(unr0.e((hashCode + (story == null ? 0 : story.hashCode())) * 31, 31, false), 31, this.g), 31, false);
    }

    public final String toString() {
        return "StoryConfig(screenName=" + this.a + ", mode=" + this.b + ", storyIds=" + this.c + ", previewCornersRadius=" + this.d + ", firstStoryId=" + this.e + ", bundledStory=" + this.f + ", markStoriesViewed=false, isDismissible=" + this.g + ", isDarkStatusBar=false, retryPolicy=" + this.h + Extension.C_BRAKE;
    }
}
