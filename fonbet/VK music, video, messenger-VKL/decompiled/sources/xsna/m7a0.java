package xsna;

import com.vk.dto.photo.Photo;
import java.util.List;
import java.util.Set;

/* compiled from: PhotoEvent.kt */
/* loaded from: classes4.dex */
public abstract class m7a0 {

    /* compiled from: PhotoEvent.kt */
    public static final class a extends m7a0 {
        public final int a;
        public final List<Photo> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, List<? extends Photo> list) {
            this.a = i;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Added(albumId=");
            sb.append(this.a);
            sb.append(", photos=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: PhotoEvent.kt */
    public static final class b extends m7a0 {
        public final List<Photo> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Photo> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("Deleted(photos="), this.a);
        }
    }

    /* compiled from: PhotoEvent.kt */
    public static abstract class c extends m7a0 {

        /* compiled from: PhotoEvent.kt */
        public static final class a extends c {
            public static final a a = new a();
        }

        /* compiled from: PhotoEvent.kt */
        public static final class b extends c {
            public static final b a = new b();
        }
    }

    /* compiled from: PhotoEvent.kt */
    public static final class d extends m7a0 {
        public final Photo a;
        public final boolean b;

        public d(Photo photo, boolean z) {
            this.a = photo;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhotoPinChanged(photo=");
            sb.append(this.a);
            sb.append(", pinned=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: PhotoEvent.kt */
    public static final class e extends m7a0 {
        public final int a;
        public final Set<Photo> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(int i, Set<? extends Photo> set) {
            this.a = i;
            this.b = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhotosUnarchived(albumId=");
            sb.append(this.a);
            sb.append(", photos=");
            return ur.c(sb, this.b, ')');
        }
    }

    /* compiled from: PhotoEvent.kt */
    public static final class f extends m7a0 {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("TabSelectMode(enable="), this.a, ')');
        }
    }

    /* compiled from: PhotoEvent.kt */
    public static final class g extends m7a0 {
        public final Photo a;

        public g(Photo photo) {
            this.a = photo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tq.c(new StringBuilder("Uploaded(photo="), this.a, ')');
        }
    }
}
