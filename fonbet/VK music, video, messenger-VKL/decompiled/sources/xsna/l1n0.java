package xsna;

import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;

/* compiled from: SubtitlesState.kt */
/* loaded from: classes17.dex */
public interface l1n0 extends r3q0 {

    /* compiled from: SubtitlesState.kt */
    public static final class a implements l1n0 {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Hidden(uniqueKey="), this.a, ')');
        }
    }

    /* compiled from: SubtitlesState.kt */
    public static final class b implements l1n0 {
        public final String a;
        public final List<SubtitleRenderItem> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String str, List<? extends SubtitleRenderItem> list) {
            this.a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(uniqueKey=");
            sb.append(this.a);
            sb.append(", renderItems=");
            return ms9.a(')', sb, this.b);
        }
    }
}
