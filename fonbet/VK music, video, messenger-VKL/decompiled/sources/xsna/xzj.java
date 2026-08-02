package xsna;

import com.vk.dto.music.Thumb;
import java.util.List;

/* compiled from: MusicPlaylistUiDto.kt */
/* loaded from: classes4.dex */
public interface xzj {

    /* compiled from: MusicPlaylistUiDto.kt */
    public static final class a implements xzj {
        public final List<Thumb> a;

        public a(List<Thumb> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("Complex(images="), this.a);
        }
    }

    /* compiled from: MusicPlaylistUiDto.kt */
    public interface b extends xzj {

        /* compiled from: MusicPlaylistUiDto.kt */
        public static final class a implements b {
            public static final a a = new a();
            public static final Thumb b = lso0.a;

            @Override // xsna.xzj.b
            public final Thumb getImage() {
                return b;
            }
        }

        /* compiled from: MusicPlaylistUiDto.kt */
        /* renamed from: xsna.xzj$b$b, reason: collision with other inner class name */
        public static final class C4061b implements b {
            public final Thumb a;

            public C4061b(Thumb thumb) {
                this.a = thumb;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4061b) && epx.f(this.a, ((C4061b) obj).a);
            }

            @Override // xsna.xzj.b
            public final Thumb getImage() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Image(image=" + this.a + ')';
            }
        }

        Thumb getImage();
    }
}
