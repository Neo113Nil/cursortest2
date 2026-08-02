package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.stories.presentation.story.StoryConfig$Mode;

/* loaded from: classes5.dex */
public final class kpu0 extends x3 {
    public final Story c;

    public kpu0(Story story) {
        super(15, StoryConfig$Mode.ONE_STORY);
        this.c = story;
    }

    @Override // defpackage.x3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpu0) && jl40.l(this.c, ((kpu0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "BundledStoryMode(story=" + this.c + Extension.C_BRAKE;
    }
}
