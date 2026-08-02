package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: ClipActionParams.kt */
/* loaded from: classes17.dex */
public abstract class wlc {
    public final VideoFile a;

    /* compiled from: ClipActionParams.kt */
    public static final class a extends wlc {
        public final VideoFile b;
        public final boolean c;

        public a(VideoFile videoFile, boolean z) {
            super(videoFile);
            this.b = videoFile;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddToPlaylistActionParams(video=");
            sb.append(this.b);
            sb.append(", forceDarkTheme=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipActionParams.kt */
    public static final class b extends wlc {
        public final VideoFile b;
        public final boolean c;
        public final gzs<s3q0> d;

        public b(VideoFile videoFile, boolean z, gzs<s3q0> gzsVar) {
            super(videoFile);
            this.b = videoFile;
            this.c = z;
            this.d = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditActionParams(video=");
            sb.append(this.b);
            sb.append(", forceDarkTheme=");
            sb.append(this.c);
            sb.append(", onSuccess=");
            return uf3.d(sb, this.d, ')');
        }
    }

    /* compiled from: ClipActionParams.kt */
    public static final class c extends wlc {
        public final VideoFile b;
        public final boolean c;

        public c(VideoFile videoFile, boolean z) {
            super(videoFile);
            this.b = videoFile;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditPlaylistActionParams(video=");
            sb.append(this.b);
            sb.append(", forceDarkTheme=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipActionParams.kt */
    public static final class d extends wlc {
        public final VideoFile b;
        public final boolean c;
        public final gzs<s3q0> d;
        public final izs<Throwable, s3q0> e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(VideoFile videoFile, boolean z, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
            super(videoFile);
            this.b = videoFile;
            this.c = z;
            this.d = gzsVar;
            this.e = izsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + sf3.a(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoveCommunityClipActionParams(video=");
            sb.append(this.b);
            sb.append(", forceDarkTheme=");
            sb.append(this.c);
            sb.append(", onSuccess=");
            sb.append(this.d);
            sb.append(", onError=");
            return up.c(sb, this.e, ')');
        }
    }

    /* compiled from: ClipActionParams.kt */
    public static final class e extends wlc {
        public final VideoFile b;

        public e(VideoFile videoFile) {
            super(videoFile);
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "ShowStatisticActionParams(video=" + this.b + ", forceDarkTheme=false)";
        }
    }

    public wlc(VideoFile videoFile) {
        this.a = videoFile;
    }
}
