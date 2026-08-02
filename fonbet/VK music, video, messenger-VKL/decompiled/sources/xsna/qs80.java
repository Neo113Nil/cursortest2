package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: OpenVideoResult.kt */
/* loaded from: classes2.dex */
public abstract class qs80 {

    /* compiled from: OpenVideoResult.kt */
    public static final class a extends qs80 {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: OpenVideoResult.kt */
    public static final class b extends qs80 {
        public static final b a = new b();
    }

    /* compiled from: OpenVideoResult.kt */
    public static final class c extends qs80 {
        public final VideoFile a;

        public c(VideoFile videoFile) {
            this.a = videoFile;
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
            return lq.a(new StringBuilder("Success(file="), this.a, ')');
        }
    }
}
