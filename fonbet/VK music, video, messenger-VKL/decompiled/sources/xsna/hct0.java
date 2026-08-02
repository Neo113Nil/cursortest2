package xsna;

import java.util.List;

/* compiled from: VideoRelatedVideosMoreActionsPatch.kt */
/* loaded from: classes7.dex */
public abstract class hct0 implements xl50 {

    /* compiled from: VideoRelatedVideosMoreActionsPatch.kt */
    public static final class a extends hct0 {
        public final List<cct0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends cct0> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateActions(items="), this.b);
        }
    }
}
