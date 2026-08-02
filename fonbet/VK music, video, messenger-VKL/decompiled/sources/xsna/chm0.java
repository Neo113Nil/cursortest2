package xsna;

import android.graphics.Bitmap;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.model.StoryEntry;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: StoryStatisticsState.kt */
/* loaded from: classes6.dex */
public final class chm0 implements km50 {
    public final boolean b;
    public final boolean c;
    public final int d;
    public final List<StoryEntry> e;
    public final Map<Integer, Integer> f;
    public final Pair<Integer, Bitmap> g;
    public final Set<Integer> h;
    public final StoryPrivacyType i;
    public final boolean j;
    public final int k;

    /* JADX WARN: Multi-variable type inference failed */
    public chm0(boolean z, boolean z2, int i, List<? extends StoryEntry> list, Map<Integer, Integer> map, Pair<Integer, Bitmap> pair, Set<Integer> set, StoryPrivacyType storyPrivacyType, boolean z3, int i2) {
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = list;
        this.f = map;
        this.g = pair;
        this.h = set;
        this.i = storyPrivacyType;
        this.j = z3;
        this.k = i2;
    }

    public static chm0 a(chm0 chm0Var, boolean z, boolean z2, int i, Map map, Set set, StoryPrivacyType storyPrivacyType, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = chm0Var.b;
        }
        boolean z3 = z;
        if ((i3 & 2) != 0) {
            z2 = chm0Var.c;
        }
        boolean z4 = z2;
        int i4 = (i3 & 4) != 0 ? chm0Var.d : i;
        List<StoryEntry> list = chm0Var.e;
        Map map2 = (i3 & 16) != 0 ? chm0Var.f : map;
        Pair<Integer, Bitmap> pair = chm0Var.g;
        Set set2 = (i3 & 64) != 0 ? chm0Var.h : set;
        StoryPrivacyType storyPrivacyType2 = (i3 & 128) != 0 ? chm0Var.i : storyPrivacyType;
        boolean z5 = chm0Var.j;
        int i5 = (i3 & 512) != 0 ? chm0Var.k : i2;
        chm0Var.getClass();
        return new chm0(z3, z4, i4, list, map2, pair, set2, storyPrivacyType2, z5, i5);
    }

    public final StoryEntry b() {
        return (StoryEntry) j5g.b0(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chm0)) {
            return false;
        }
        chm0 chm0Var = (chm0) obj;
        return this.b == chm0Var.b && this.c == chm0Var.c && this.d == chm0Var.d && epx.f(this.e, chm0Var.e) && epx.f(this.f, chm0Var.f) && epx.f(this.g, chm0Var.g) && epx.f(this.h, chm0Var.h) && this.i == chm0Var.i && this.j == chm0Var.j && this.k == chm0Var.k;
    }

    public final int hashCode() {
        int b = fw3.b((this.g.hashCode() + v11.a(fw3.a(shy.a(this.d, qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31), 31, this.e), 31, this.f)) * 31, 31, this.h);
        StoryPrivacyType storyPrivacyType = this.i;
        return Integer.hashCode(this.k) + qoy.b((b + (storyPrivacyType == null ? 0 : storyPrivacyType.hashCode())) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsState(isPreviewContentVisible=");
        sb.append(this.b);
        sb.append(", isPreviewBlurVisible=");
        sb.append(this.c);
        sb.append(", currentStoryIndex=");
        sb.append(this.d);
        sb.append(", storyEntries=");
        sb.append(this.e);
        sb.append(", storyEntriesViewsCount=");
        sb.append(this.f);
        sb.append(", initialStoryCadre=");
        sb.append(this.g);
        sb.append(", loadedPreviewImagesStoryIds=");
        sb.append(this.h);
        sb.append(", privacy=");
        sb.append(this.i);
        sb.append(", isGroup=");
        sb.append(this.j);
        sb.append(", currentTabPosition=");
        return vu5.b(sb, this.k, ')');
    }
}
