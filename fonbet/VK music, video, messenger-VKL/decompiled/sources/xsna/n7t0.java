package xsna;

import com.vk.dto.common.Image;

/* compiled from: VideoProfileCoverState.kt */
/* loaded from: classes6.dex */
public abstract class n7t0 {

    /* compiled from: VideoProfileCoverState.kt */
    public static final class a extends n7t0 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // xsna.n7t0
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Default(isStubVisible="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileCoverState.kt */
    public static final class b extends n7t0 {
        public final int a;
        public final boolean b;

        public b(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // xsna.n7t0
        public final boolean a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gradient(averageColorInt=");
            sb.append(this.a);
            sb.append(", isStubVisible=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoProfileCoverState.kt */
    public static final class c extends n7t0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 907273059;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: VideoProfileCoverState.kt */
    public static final class d extends n7t0 {
        public final Image a;

        public d(Image image) {
            this.a = image;
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
            return er.d(new StringBuilder("ImageCover(image="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileCoverState.kt */
    public static final class e extends n7t0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1779716771;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public boolean a() {
        return false;
    }
}
