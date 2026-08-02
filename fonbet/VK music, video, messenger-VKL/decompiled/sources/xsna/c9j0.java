package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;

/* compiled from: ShareStoryState.kt */
/* loaded from: classes16.dex */
public final class c9j0 implements km50 {
    public final UserId b;
    public final StoryPrivacyType c;
    public final int d;
    public final boolean e;
    public final List<Group> f;
    public final Map<UserId, List<Narrative>> g;
    public final Map<UserId, Set<Narrative>> h;
    public final boolean i;
    public final Map<UserId, String> j;
    public final Map<UserId, Boolean> k;

    /* JADX WARN: Multi-variable type inference failed */
    public c9j0(UserId userId, StoryPrivacyType storyPrivacyType, int i, boolean z, List<? extends Group> list, Map<UserId, ? extends List<Narrative>> map, Map<UserId, ? extends Set<Narrative>> map2, boolean z2, Map<UserId, String> map3, Map<UserId, Boolean> map4) {
        this.b = userId;
        this.c = storyPrivacyType;
        this.d = i;
        this.e = z;
        this.f = list;
        this.g = map;
        this.h = map2;
        this.i = z2;
        this.j = map3;
        this.k = map4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c9j0 a(c9j0 c9j0Var, UserId userId, StoryPrivacyType storyPrivacyType, int i, List list, MapBuilder mapBuilder, MapBuilder mapBuilder2, boolean z, MapBuilder mapBuilder3, Map map, int i2) {
        if ((i2 & 1) != 0) {
            userId = c9j0Var.b;
        }
        UserId userId2 = userId;
        if ((i2 & 2) != 0) {
            storyPrivacyType = c9j0Var.c;
        }
        StoryPrivacyType storyPrivacyType2 = storyPrivacyType;
        if ((i2 & 4) != 0) {
            i = c9j0Var.d;
        }
        int i3 = i;
        boolean z2 = (i2 & 8) != 0 ? c9j0Var.e : true;
        if ((i2 & 16) != 0) {
            list = c9j0Var.f;
        }
        List list2 = list;
        Map map2 = (i2 & 32) != 0 ? c9j0Var.g : mapBuilder;
        Map map3 = (i2 & 64) != 0 ? c9j0Var.h : mapBuilder2;
        boolean z3 = (i2 & 128) != 0 ? c9j0Var.i : z;
        Map map4 = (i2 & 256) != 0 ? c9j0Var.j : mapBuilder3;
        Map map5 = (i2 & 512) != 0 ? c9j0Var.k : map;
        c9j0Var.getClass();
        return new c9j0(userId2, storyPrivacyType2, i3, z2, list2, map2, map3, z3, map4, map5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9j0)) {
            return false;
        }
        c9j0 c9j0Var = (c9j0) obj;
        return epx.f(this.b, c9j0Var.b) && this.c == c9j0Var.c && this.d == c9j0Var.d && this.e == c9j0Var.e && epx.f(this.f, c9j0Var.f) && epx.f(this.g, c9j0Var.g) && epx.f(this.h, c9j0Var.h) && this.i == c9j0Var.i && epx.f(this.j, c9j0Var.j) && epx.f(this.k, c9j0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + v11.a(qoy.b(v11.a(v11.a(fw3.a(qoy.b(shy.a(this.d, (this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareStoryState(selectedUserId=");
        sb.append(this.b);
        sb.append(", userPrivacy=");
        sb.append(this.c);
        sb.append(", lifetime=");
        sb.append(this.d);
        sb.append(", needSetPrivacy=");
        sb.append(this.e);
        sb.append(", groups=");
        sb.append(this.f);
        sb.append(", mapNarratives=");
        sb.append(this.g);
        sb.append(", mapSelectedNarratives=");
        sb.append(this.h);
        sb.append(", needUpdatePagination=");
        sb.append(this.i);
        sb.append(", mapNextForms=");
        sb.append(this.j);
        sb.append(", marketOnlineBookingValues=");
        return cjl0.a(sb, this.k, ')');
    }
}
