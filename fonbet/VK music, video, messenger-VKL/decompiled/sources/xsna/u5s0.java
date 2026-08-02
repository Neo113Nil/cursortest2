package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.VideoFile;

/* compiled from: VideoBlockEvent.kt */
/* loaded from: classes.dex */
public interface u5s0 extends smk {

    /* compiled from: VideoBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements u5s0 {
    }

    /* compiled from: VideoBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements u5s0 {
    }

    /* compiled from: VideoBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class c implements u5s0 {
    }

    /* compiled from: VideoBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class d implements u5s0 {
        public final BlockId a;
        public final VideoFile b;
        public final String c;

        public d(BlockId blockId, VideoFile videoFile, String str) {
            this.a = blockId;
            this.b = videoFile;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int b = jq.b(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenVideo(blockId=");
            sb.append(this.a);
            sb.append(", videoFile=");
            sb.append(this.b);
            sb.append(", trackCode=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: VideoBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class e implements u5s0 {
    }

    /* compiled from: VideoBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class f implements u5s0 {
    }

    /* compiled from: VideoBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class g implements u5s0 {
    }

    /* compiled from: VideoBlockEvent.kt */
    /* loaded from: classes16.dex */
    public static final class h implements u5s0 {
        public final BlockId a;
        public final VideoFile b;

        public h(BlockId blockId, VideoFile videoFile) {
            this.a = blockId;
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
            StringBuilder sb = new StringBuilder("ToggleWatchLater(blockId=");
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
