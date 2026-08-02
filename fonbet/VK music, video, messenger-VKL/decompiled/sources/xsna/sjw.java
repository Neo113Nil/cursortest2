package xsna;

import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.profile.community.impl.livecover.LiveCoverType;
import java.io.File;

/* compiled from: CommunityLiveCoverModel.kt */
/* loaded from: classes5.dex */
public final class sjw implements gwh<b, a> {
    public final a a;
    public final b b;

    /* compiled from: CommunityLiveCoverModel.kt */
    public static final class a implements hyg {
        public final StoryEntry a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public a(StoryEntry storyEntry, boolean z) {
            this.a = storyEntry;
            this.b = z;
            ImageQuality imageQuality = ImageQuality.TRAFFIC_FIT;
            this.c = storyEntry.Db(false, imageQuality, false);
            this.d = storyEntry.Cb(false);
            int v = iah0.v();
            File file = storyEntry.x;
            this.e = (file == null || !vhk0.g(file)) ? storyEntry.Jb(v, imageQuality, false) : storyEntry.Eb();
            this.f = storyEntry.Bb(iah0.v());
        }

        @Override // xsna.hyg
        public final StoryEntry a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageItemData(entry=");
            sb.append(this.a);
            sb.append(", imagesIsScalable=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityLiveCoverModel.kt */
    public static final class b implements iyg {
        public final boolean a;
        public final boolean b;

        public b() {
            this(false, 3);
        }

        @Override // xsna.iyg
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageItemState(isCurrentItem=");
            sb.append(this.a);
            sb.append(", allowPlayingByUser=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public /* synthetic */ b(boolean z, int i) {
            this((i & 1) != 0 ? false : z, false);
        }

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    public sjw(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // xsna.gwh
    public final gwh<b, a> a(boolean z) {
        b bVar = this.b;
        if (bVar.a == z) {
            return this;
        }
        return new sjw(this.a, new b(z, bVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjw)) {
            return false;
        }
        sjw sjwVar = (sjw) obj;
        return epx.f(this.a, sjwVar.a) && epx.f(this.b, sjwVar.b);
    }

    @Override // xsna.gwh
    public final a getData() {
        return this.a;
    }

    @Override // xsna.gwh
    public final b getState() {
        return this.b;
    }

    @Override // xsna.gwh
    public final LiveCoverType getType() {
        return LiveCoverType.PHOTO;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageItem(data=" + this.a + ", state=" + this.b + ')';
    }
}
