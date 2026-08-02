package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.pqs0;
import xsna.sjw;

/* compiled from: CommunityLiveCoverModel.kt */
/* loaded from: classes5.dex */
public final class r8h {
    public final List<gwh<?, ?>> a;
    public final UserId b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final gwh<?, ?> j;
    public final boolean k;
    public final int l;

    /* compiled from: CommunityLiveCoverModel.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [xsna.pqs0] */
        public static r8h a(UserId userId, ArrayList arrayList, boolean z) {
            sjw sjwVar;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = ((StoriesContainer) it.next()).g;
                ArrayList arrayList3 = new ArrayList();
                Iterator<StoryEntry> it2 = copyOnWriteArrayList.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    StoryEntry next = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    StoryEntry storyEntry = next;
                    VideoFile videoFile = storyEntry.n;
                    int i3 = 2;
                    if (videoFile == null && storyEntry.m != null) {
                        sjwVar = new sjw(new sjw.a(storyEntry, z), new sjw.b(i == 0, 2));
                    } else if (videoFile != null) {
                        sjwVar = new pqs0(new pqs0.a(storyEntry, videoFile), new pqs0.b(i == 0, i3));
                    } else {
                        sjwVar = null;
                    }
                    if (sjwVar != null) {
                        arrayList3.add(sjwVar);
                    }
                    i = i2;
                }
                g5g.y(arrayList3, arrayList2);
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            int size = arrayList2.size() * 1000;
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            return new r8h(arrayList2, userId, size, false, false, true, com.vk.libvideo.autoplay.e.g(), false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r8h(List<? extends gwh<?, ?>> list, UserId userId, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = list;
        this.b = userId;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        int size = i % list.size();
        this.i = size;
        this.j = (gwh) j5g.b0(size, list);
        this.k = list.size() == 1;
        this.l = list.size();
    }

    public static r8h a(r8h r8hVar, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        if ((i2 & 1) != 0) {
            list = r8hVar.a;
        }
        List list2 = list;
        UserId userId = r8hVar.b;
        if ((i2 & 4) != 0) {
            i = r8hVar.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = r8hVar.d;
        }
        boolean z6 = z;
        if ((i2 & 16) != 0) {
            z2 = r8hVar.e;
        }
        boolean z7 = z2;
        if ((i2 & 32) != 0) {
            z3 = r8hVar.f;
        }
        boolean z8 = z3;
        if ((i2 & 64) != 0) {
            z4 = r8hVar.g;
        }
        boolean z9 = z4;
        boolean z10 = (i2 & 128) != 0 ? r8hVar.h : z5;
        r8hVar.getClass();
        return new r8h(list2, userId, i3, z6, z7, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8h)) {
            return false;
        }
        r8h r8hVar = (r8h) obj;
        return epx.f(this.a, r8hVar.a) && epx.f(this.b, r8hVar.b) && this.c == r8hVar.c && this.d == r8hVar.d && this.e == r8hVar.e && this.f == r8hVar.f && this.g == r8hVar.g && this.h == r8hVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.c, bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityLiveCoverModel(items=");
        sb.append(this.a);
        sb.append(", groupId=");
        sb.append(this.b);
        sb.append(", currentPosition=");
        sb.append(this.c);
        sb.append(", isExpanded=");
        sb.append(this.d);
        sb.append(", showNext=");
        sb.append(this.e);
        sb.append(", isTouchAvailable=");
        sb.append(this.f);
        sb.append(", canAutoPlay=");
        sb.append(this.g);
        sb.append(", forceExpand=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
