package xsna;

import com.vk.dto.stories.model.clickable.ClickableStickers;
import java.io.File;

/* compiled from: IdeasStoryRenderer.kt */
/* loaded from: classes6.dex */
public final class huv {
    public final s5m0 a;
    public final com.vk.stickers.api.styles.b b;

    /* compiled from: IdeasStoryRenderer.kt */
    public static final class a {
        public final File a;
        public final ClickableStickers b;

        public a(File file, ClickableStickers clickableStickers) {
            this.a = file;
            this.b = clickableStickers;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ClickableStickers clickableStickers = this.b;
            return hashCode + (clickableStickers == null ? 0 : clickableStickers.hashCode());
        }

        public final String toString() {
            return "Result(file=" + this.a + ", clickableStickers=" + this.b + ')';
        }
    }

    public huv(s5m0 s5m0Var, com.vk.stickers.api.styles.b bVar) {
        this.a = s5m0Var;
        this.b = bVar;
    }
}
