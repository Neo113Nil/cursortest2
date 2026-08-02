package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.dto.common.VideoFile;

/* compiled from: VideoLargeListEvent.kt */
/* loaded from: classes.dex */
public interface xqs0 extends smk {

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements xqs0 {
        public final BlockId a;
        public final VideoFile b;
        public final String c;
        public final String d;

        public a(BlockId.CompositeId compositeId, VideoFile videoFile, String str, String str2) {
            this.a = compositeId;
            this.b = videoFile;
            this.c = str;
            this.d = str2;
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements xqs0 {
        public final BlockId a;
        public final a5o b;
        public final DonutVideoAction c;

        public b(BlockId.CompositeId compositeId, a5o a5oVar, DonutVideoAction donutVideoAction) {
            this.a = compositeId;
            this.b = a5oVar;
            this.c = donutVideoAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "DonutAction(blockId=" + this.a + ", params=" + this.b + ", action=" + this.c + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class c implements xqs0 {
        public final BlockId a;
        public final VideoFile b;
        public final String c;

        public c(BlockId.CompositeId compositeId, VideoFile videoFile, String str) {
            this.a = compositeId;
            this.b = videoFile;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            int b = jq.b(this.b, this.a.hashCode() * 31, 961);
            String str = this.c;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenAuthor(blockId=");
            sb.append(this.a);
            sb.append(", videoFile=");
            sb.append(this.b);
            sb.append(", trackCode=null, ref=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class d implements xqs0 {
        public final BlockId a;
        public final VideoFile b;

        public d(BlockId.CompositeId compositeId, VideoFile videoFile) {
            this.a = compositeId;
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenModalsDialog(blockId=");
            sb.append(this.a);
            sb.append(", videoFile=");
            return lq.a(sb, this.b, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class e implements xqs0 {
        public final BlockId a;
        public final VideoFile b;

        public e(BlockId.CompositeId compositeId, VideoFile videoFile) {
            this.a = compositeId;
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return jq.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "OpenVideo(blockId=" + this.a + ", videoFile=" + this.b + ", trackCode=null)";
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class f implements xqs0 {
        public final BlockId a;
        public final String b;

        public f(BlockId.CompositeId compositeId, String str) {
            this.a = compositeId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenVideoCatalog(blockId=");
            sb.append(this.a);
            sb.append(", embeddedVideoId=");
            return ho8.a(sb, this.b, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class g implements xqs0 {
        public final BlockId a;
        public final VideoFile b;
        public final String c;

        public g(BlockId blockId, VideoFile videoFile, String str) {
            this.a = blockId;
            this.b = videoFile;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && this.b.equals(gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int b = jq.b(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            return (b + (str == null ? 0 : str.hashCode())) * 31;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenVideoFeedDialog(blockId=");
            sb.append(this.a);
            sb.append(", videoFile=");
            sb.append(this.b);
            sb.append(", ref=");
            return i5s.a(sb, this.c, ", trackCode=null)");
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class h implements xqs0 {
        public final BlockId a;
        public final VideoFile b;

        public h(BlockId.CompositeId compositeId, VideoFile videoFile) {
            this.a = compositeId;
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareVideo(blockId=");
            sb.append(this.a);
            sb.append(", videoFile=");
            return lq.a(sb, this.b, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoLargeListEvent.kt */
    /* loaded from: classes16.dex */
    public static final class i implements xqs0 {
        public final BlockId a;
        public final VideoFile b;

        public i(BlockId.CompositeId compositeId, VideoFile videoFile) {
            this.a = compositeId;
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowRestrictionAlert(blockId=");
            sb.append(this.a);
            sb.append(", videoFile=");
            return lq.a(sb, this.b, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
