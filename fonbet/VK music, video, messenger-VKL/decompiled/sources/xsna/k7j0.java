package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: ShareExternalEvent.kt */
/* loaded from: classes7.dex */
public interface k7j0 {

    /* compiled from: ShareExternalEvent.kt */
    public static final class a implements k7j0 {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
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
            StringBuilder sb = new StringBuilder("CopyLink(shareLink=");
            sb.append(this.a);
            sb.append(", shareWithTimecode=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ShareExternalEvent.kt */
    public static final class b implements k7j0 {
    }

    /* compiled from: ShareExternalEvent.kt */
    public static final class c implements k7j0 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenSystemSharing(shareLink="), this.a, ')');
        }
    }

    /* compiled from: ShareExternalEvent.kt */
    public static final class d implements k7j0 {
        public final VideoFile a;
        public final String b;
        public final String c;
        public final boolean d;

        public d(VideoFile videoFile, String str, String str2, boolean z) {
            this.a = videoFile;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d;
        }

        public final int hashCode() {
            VideoFile videoFile = this.a;
            return Boolean.hashCode(this.d) + urd0.a(urd0.a((videoFile == null ? 0 : videoFile.hashCode()) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareToExternalApp(videoFile=");
            sb.append(this.a);
            sb.append(", shareLink=");
            sb.append(this.b);
            sb.append(", externalAppPackageName=");
            sb.append(this.c);
            sb.append(", shareWithTimecode=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
