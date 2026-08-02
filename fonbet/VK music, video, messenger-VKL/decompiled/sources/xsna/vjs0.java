package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.ui.VideoTransitionSource;

/* compiled from: VideoEvent.kt */
/* loaded from: classes.dex */
public interface vjs0 extends smk {

    /* compiled from: VideoEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements vjs0 {
        public final BlockId.CompositeId a;
        public final DonutVideoAction b;
        public final DonutVideoClickSource c;

        public a(BlockId.CompositeId compositeId, DonutVideoAction donutVideoAction, DonutVideoClickSource donutVideoClickSource) {
            this.a = compositeId;
            this.b = donutVideoAction;
            this.c = donutVideoClickSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "HandleDonutAction(blockId=" + this.a + ", action=" + this.b + ", source=" + this.c + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements vjs0 {
        public final BlockId.CompositeId a;
        public final VideoFile b;
        public final String c;
        public final String d;

        public b(BlockId.CompositeId compositeId, VideoFile videoFile, String str, String str2) {
            this.a = compositeId;
            this.b = videoFile;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int b = jq.b(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenAuthor(blockId=");
            sb.append(this.a);
            sb.append(", videoFile=");
            sb.append(this.b);
            sb.append(", trackCode=");
            sb.append(this.c);
            sb.append(", ref=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoEvent.kt */
    /* loaded from: classes16.dex */
    public static final class c implements vjs0 {
        public final BlockId.CompositeId a;
        public final VideoFile b;
        public final String c;
        public final VideoTransitionSource d;

        public c(BlockId.CompositeId compositeId, VideoFile videoFile, String str, VideoTransitionSource videoTransitionSource) {
            this.a = compositeId;
            this.b = videoFile;
            this.c = str;
            this.d = videoTransitionSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int b = jq.b(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            VideoTransitionSource videoTransitionSource = this.d;
            return hashCode + (videoTransitionSource != null ? videoTransitionSource.hashCode() : 0);
        }

        public final String toString() {
            return "OpenVideo(blockId=" + this.a + ", videoFile=" + this.b + ", trackCode=" + this.c + ", videoTransitionSource=" + this.d + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoEvent.kt */
    /* loaded from: classes16.dex */
    public static final class d implements vjs0 {
        public final BlockId.CompositeId a;
        public final VideoFile b;
        public final k4 c;
        public final ks2 d;

        public d(BlockId.CompositeId compositeId, VideoFile videoFile, k4 k4Var, ks2 ks2Var) {
            this.a = compositeId;
            this.b = videoFile;
            this.c = k4Var;
            this.d = ks2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c) && this.d.equals(dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + jq.b(this.b, this.a.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "TryToConfirmRestriction(blockId=" + this.a + ", videoFile=" + this.b + ", afterSubscribeAction=" + this.c + ", afterDeleteAction=" + this.d + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
