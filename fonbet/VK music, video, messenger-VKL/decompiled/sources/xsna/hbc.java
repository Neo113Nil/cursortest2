package xsna;

import com.vk.dto.common.Attachment;

/* compiled from: ChipViewTag.kt */
/* loaded from: classes18.dex */
public abstract class hbc {

    /* compiled from: ChipViewTag.kt */
    public static abstract class a extends hbc {

        /* compiled from: ChipViewTag.kt */
        /* renamed from: xsna.hbc$a$a, reason: collision with other inner class name */
        public static final class C2984a extends a {
            public final Attachment a;

            public C2984a(Attachment attachment) {
                this.a = attachment;
            }

            @Override // xsna.hbc.a
            public final Attachment a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2984a) && epx.f(this.a, ((C2984a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "File(attachment=" + this.a + ')';
            }
        }

        /* compiled from: ChipViewTag.kt */
        public static final class b extends a {
            public final Attachment a;

            public b(Attachment attachment) {
                this.a = attachment;
            }

            @Override // xsna.hbc.a
            public final Attachment a() {
                return this.a;
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
                return "Link(attachment=" + this.a + ')';
            }
        }

        public abstract Attachment a();
    }

    /* compiled from: ChipViewTag.kt */
    public static final class b extends hbc {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2069239829;
        }

        public final String toString() {
            return "ChipAuthor";
        }
    }
}
