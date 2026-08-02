package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import java.util.List;

/* compiled from: ClipUploadEvent.kt */
/* loaded from: classes17.dex */
public interface ded {

    /* compiled from: ClipUploadEvent.kt */
    public static final class a implements ded {
        public final ShortVideoGetResponseDto a;

        public a(ShortVideoGetResponseDto shortVideoGetResponseDto) {
            this.a = shortVideoGetResponseDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AwaitServer(response=" + this.a + ')';
        }
    }

    /* compiled from: ClipUploadEvent.kt */
    public static final class b implements ded {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1389996160;
        }

        public final String toString() {
            return "Canceled";
        }
    }

    /* compiled from: ClipUploadEvent.kt */
    public static final class c implements ded {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -838638828;
        }

        public final String toString() {
            return "ClientDone";
        }
    }

    /* compiled from: ClipUploadEvent.kt */
    public static final class d implements ded {
        public final List<VideoVideoImageDto> a;

        public d(List<VideoVideoImageDto> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("CoverUploaded(images="), this.a);
        }
    }

    /* compiled from: ClipUploadEvent.kt */
    public static final class e implements ded {
        public final Throwable a;

        public e(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(th="), this.a, ')');
        }
    }

    /* compiled from: ClipUploadEvent.kt */
    public static final class f implements ded {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Progress(progress="), this.a, ')');
        }
    }

    /* compiled from: ClipUploadEvent.kt */
    public static final class g implements ded {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1605160089;
        }

        public final String toString() {
            return "Removed";
        }
    }

    /* compiled from: ClipUploadEvent.kt */
    public static final class h implements ded {
        public final ShortVideoGetResponseDto a;

        public h(ShortVideoGetResponseDto shortVideoGetResponseDto) {
            this.a = shortVideoGetResponseDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ServerDone(response=" + this.a + ')';
        }
    }

    /* compiled from: ClipUploadEvent.kt */
    public static final class i implements ded {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1383861062;
        }

        public final String toString() {
            return "Started";
        }
    }
}
