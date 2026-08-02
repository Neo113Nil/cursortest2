package xsna;

import com.vk.dto.music.Thumb;
import java.util.List;

/* compiled from: Cover.kt */
/* loaded from: classes3.dex */
public interface wzj {

    /* compiled from: Cover.kt */
    public static final class a implements wzj {
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

    /* compiled from: Cover.kt */
    public interface b extends wzj {

        /* compiled from: Cover.kt */
        public static final class a implements b {
            public static final a a = new a();
            public static final Thumb b = lso0.a;

            @Override // xsna.wzj.b
            public final Thumb getImage() {
                return b;
            }
        }

        /* compiled from: Cover.kt */
        /* renamed from: xsna.wzj$b$b, reason: collision with other inner class name */
        public static final class C3964b implements b {
            public final Thumb a;

            public C3964b(Thumb thumb) {
                this.a = thumb;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3964b) && epx.f(this.a, ((C3964b) obj).a);
            }

            @Override // xsna.wzj.b
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
