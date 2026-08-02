package xsna;

import com.vk.dto.stories.model.StoryBackground;
import com.vkontakte.android.R;

/* compiled from: StoryBackgroundItem.kt */
/* loaded from: classes16.dex */
public final class qyl0 extends zif0 {
    public final StoryBackground a;
    public final boolean b;
    public boolean c;

    public qyl0(StoryBackground storyBackground, boolean z) {
        this.a = storyBackground;
        this.b = z;
    }

    public static qyl0 c(qyl0 qyl0Var, StoryBackground storyBackground, boolean z, int i) {
        if ((i & 1) != 0) {
            storyBackground = qyl0Var.a;
        }
        if ((i & 2) != 0) {
            z = qyl0Var.b;
        }
        qyl0Var.getClass();
        return new qyl0(storyBackground, z);
    }

    @Override // xsna.zif0
    public final long a() {
        if (this.a.c != null) {
            return r0.intValue();
        }
        return 0L;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_story_background;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyl0)) {
            return false;
        }
        qyl0 qyl0Var = (qyl0) obj;
        return epx.f(this.a, qyl0Var.a) && this.b == qyl0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryBackgroundItem(background=");
        sb.append(this.a);
        sb.append(", isVisible=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
