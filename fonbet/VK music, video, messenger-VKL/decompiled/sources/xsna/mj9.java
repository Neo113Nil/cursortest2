package xsna;

import java.io.File;
import xsna.dug0;

/* compiled from: CameraMusicDownloadState.kt */
/* loaded from: classes16.dex */
public interface mj9 {

    /* compiled from: CameraMusicDownloadState.kt */
    public static final class a implements mj9 {
        public final dug0.c a;

        public a(dug0.c cVar) {
            this.a = cVar;
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
            return "Downloading(downloadEvent=" + this.a + ')';
        }
    }

    /* compiled from: CameraMusicDownloadState.kt */
    public static final class b implements mj9 {
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
            return "Loaded(file=" + this.a + ')';
        }
    }
}
