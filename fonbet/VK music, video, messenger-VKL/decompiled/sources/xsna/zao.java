package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.libvideo.api.ui.VideoTransitionSource;

/* compiled from: DownloadedAction.kt */
/* loaded from: classes16.dex */
public interface zao extends q1a {

    /* compiled from: DownloadedAction.kt */
    public static final class a implements zao {
        public final String b;
        public final DonutVideoAction c;

        public a(String str, DonutVideoAction donutVideoAction) {
            this.b = str;
            this.c = donutVideoAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutBadgeClicked(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", action=");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }

    /* compiled from: DownloadedAction.kt */
    public static final class b implements zao {
        public final String b;
        public final DonutVideoAction c;

        public b(String str, DonutVideoAction donutVideoAction) {
            this.b = str;
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
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutChipClicked(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", action=");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }

    /* compiled from: DownloadedAction.kt */
    public static final class c implements zao {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnResume(blockId=" + ((Object) BlockId.Simple.e(this.b)) + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }

    /* compiled from: DownloadedAction.kt */
    public static final class d implements zao {
        public final String b;

        public d(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OpenAllDownloadedVideoAction(blockId=" + ((Object) BlockId.Simple.e(this.b)) + ')';
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }

    /* compiled from: DownloadedAction.kt */
    public static final class e implements zao {
        public final String b;
        public final String c;
        public final long d;
        public final long e;

        public e(String str, String str2, long j, long j2) {
            this.b = str;
            this.c = str2;
            this.d = j;
            this.e = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e;
        }

        public final int hashCode() {
            return Long.hashCode(this.e) + bh10.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoCardViewedAction(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", videoId=");
            sb.append(this.c);
            sb.append(", startViewMs=");
            sb.append(this.d);
            sb.append(", endViewMs=");
            return vu5.a(')', this.e, sb);
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }

    /* compiled from: DownloadedAction.kt */
    public static final class f implements zao {
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final VideoTransitionSource f;

        public f(String str, String str2, boolean z, boolean z2, VideoTransitionSource videoTransitionSource) {
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = z2;
            this.f = videoTransitionSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && epx.f(this.f, fVar.f);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            VideoTransitionSource videoTransitionSource = this.f;
            return b + (videoTransitionSource == null ? 0 : videoTransitionSource.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoClicked(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", videoId=");
            sb.append(this.c);
            sb.append(", isDownloadCompleted=");
            sb.append(this.d);
            sb.append(", isDownloading=");
            sb.append(this.e);
            sb.append(", videoTransitionSource=");
            sb.append(this.f);
            sb.append(')');
            return sb.toString();
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }
}
