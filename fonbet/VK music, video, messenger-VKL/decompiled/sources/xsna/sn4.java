package xsna;

import java.io.File;

/* compiled from: AudioExtractorResult.kt */
/* loaded from: classes16.dex */
public interface sn4 {

    /* compiled from: AudioExtractorResult.kt */
    public static final class a implements sn4 {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("Progress(progress="));
        }
    }

    /* compiled from: AudioExtractorResult.kt */
    public static final class b implements sn4 {
        public final File a;

        public b(File file) {
            this.a = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(file=" + this.a + ')';
        }
    }
}
