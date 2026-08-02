package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.profile.community.impl.livecover.LiveCoverType;

/* compiled from: CommunityLiveCoverModel.kt */
/* loaded from: classes5.dex */
public final class pqs0 implements gwh<b, a> {
    public final a a;
    public final b b;

    /* compiled from: CommunityLiveCoverModel.kt */
    public static final class a implements hyg {
        public final StoryEntry a;
        public final VideoFile b;

        public a(StoryEntry storyEntry, VideoFile videoFile) {
            this.a = storyEntry;
            this.b = videoFile;
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
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoItemData(entry=");
            sb.append(this.a);
            sb.append(", video=");
            return lq.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityLiveCoverModel.kt */
    public static final class b implements iyg {
        public final boolean a;
        public final boolean b;

        public b() {
            this(false, 3);
        }

        public static b b(b bVar, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = bVar.a;
            }
            if ((i & 2) != 0) {
                z2 = bVar.b;
            }
            return new b(z, z2);
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
            StringBuilder sb = new StringBuilder("VideoItemState(isCurrentItem=");
            sb.append(this.a);
            sb.append(", disableSound=");
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

    public pqs0(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // xsna.gwh
    public final gwh<b, a> a(boolean z) {
        b bVar = this.b;
        if (bVar.a == z) {
            return this;
        }
        return new pqs0(this.a, b.b(bVar, z, false, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqs0)) {
            return false;
        }
        pqs0 pqs0Var = (pqs0) obj;
        return epx.f(this.a, pqs0Var.a) && epx.f(this.b, pqs0Var.b);
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
        return LiveCoverType.VIDEO;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoItem(data=" + this.a + ", state=" + this.b + ')';
    }
}
