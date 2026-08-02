package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.api.ui.VideoTransitionSource;

/* compiled from: DownloadedEvent.kt */
/* loaded from: classes.dex */
public interface cbo extends smk {

    /* compiled from: DownloadedEvent.kt */
    /* loaded from: classes16.dex */
    public static final class a implements cbo {
        public final BlockId.Simple a;
        public final DonutVideoAction b;
        public final DonutVideoClickSource c;

        public a(BlockId.Simple simple, DonutVideoAction donutVideoAction, DonutVideoClickSource donutVideoClickSource) {
            this.a = simple;
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
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "HandleDonutAction(blockId=" + this.a + ", donutAction=" + this.b + ", source=" + this.c + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: DownloadedEvent.kt */
    /* loaded from: classes16.dex */
    public static final class b implements cbo {
        public final BlockId.Simple a;

        public b(BlockId.Simple simple) {
            this.a = simple;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }

        public final String toString() {
            return "OpenAllDownloadedVideosEvent(blockId=" + this.a + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: DownloadedEvent.kt */
    /* loaded from: classes16.dex */
    public static final class c implements cbo {
        public final BlockId.Simple a;
        public final VideoFileOld b;
        public final svd c;

        public c(BlockId.Simple simple, VideoFileOld videoFileOld, svd svdVar) {
            this.a = simple;
            this.b = videoFileOld;
            this.c = svdVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "OpenVideoNotLoadedBottomSheet(blockId=" + this.a + ", video=" + this.b + ", onWatchButtonClick=" + this.c + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: DownloadedEvent.kt */
    /* loaded from: classes16.dex */
    public static final class d implements cbo {
        public final BlockId.Simple a;
        public final VideoFileOld b;
        public final VideoTransitionSource c;

        public d(BlockId.Simple simple, VideoFileOld videoFileOld, VideoTransitionSource videoTransitionSource) {
            this.a = simple;
            this.b = videoFileOld;
            this.c = videoTransitionSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.b.hashCode() * 31)) * 31;
            VideoTransitionSource videoTransitionSource = this.c;
            return hashCode + (videoTransitionSource == null ? 0 : videoTransitionSource.hashCode());
        }

        public final String toString() {
            return "PlayOfflineVideo(blockId=" + this.a + ", video=" + this.b + ", videoTransitionSource=" + this.c + ')';
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }

    /* compiled from: DownloadedEvent.kt */
    /* loaded from: classes16.dex */
    public static final class e implements cbo {
        public final BlockId.Simple a;
        public final VideoFileOld b;
        public final boolean c;
        public final boolean d;

        public e(BlockId.Simple simple, VideoFileOld videoFileOld, boolean z, boolean z2) {
            this.a = simple;
            this.b = videoFileOld;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b) && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b((this.b.hashCode() + (this.a.b.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowRemoveDownloadPopup(blockId=");
            sb.append(this.a);
            sb.append(", video=");
            sb.append(this.b);
            sb.append(", isInProgress=");
            sb.append(this.c);
            sb.append(", isResumed=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        @Override // xsna.smk
        public final BlockId w() {
            return this.a;
        }
    }
}
