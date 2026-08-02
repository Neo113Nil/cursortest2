package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.stories.presentation.story.StoryConfig$Mode;

/* loaded from: classes5.dex */
public final class mpu0 extends x3 {
    public final String c;

    public mpu0(String str) {
        super(15, StoryConfig$Mode.ONE_STORY);
        this.c = str;
    }

    @Override // defpackage.x3
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mpu0) && jl40.l(this.c, ((mpu0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("SingleStoryMode(storyId=", this.c, Extension.C_BRAKE);
    }
}
