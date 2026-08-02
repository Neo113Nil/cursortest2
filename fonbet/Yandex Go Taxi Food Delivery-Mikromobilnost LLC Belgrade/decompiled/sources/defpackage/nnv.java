package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class nnv implements gov {
    public static final knv Companion = new knv();
    public static final i3y[] d;
    public final String a;
    public final InMessage$StoryIsVisibleEvent$MiniStoryControlType b;
    public final InMessage$StoryIsVisibleEvent$StoryNavigationType c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{null, a.b(lazyThreadSafetyMode, new smv(12)), a.b(lazyThreadSafetyMode, new smv(13))};
    }

    public /* synthetic */ nnv(int i, String str, InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType, InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, jnv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = inMessage$StoryIsVisibleEvent$MiniStoryControlType;
        this.c = inMessage$StoryIsVisibleEvent$StoryNavigationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnv)) {
            return false;
        }
        nnv nnvVar = (nnv) obj;
        return jl40.l(this.a, nnvVar.a) && this.b == nnvVar.b && this.c == nnvVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "StoryIsVisibleEvent(trackId=" + this.a + ", controlType=" + this.b + ", type=" + this.c + ')';
    }

    public nnv(InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType, InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType) {
        this.a = null;
        this.b = inMessage$StoryIsVisibleEvent$MiniStoryControlType;
        this.c = inMessage$StoryIsVisibleEvent$StoryNavigationType;
    }
}
