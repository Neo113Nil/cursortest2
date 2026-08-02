package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import java.util.List;

/* compiled from: ArchiveSideEffect.kt */
/* loaded from: classes4.dex */
public abstract class zi3 {

    /* compiled from: ArchiveSideEffect.kt */
    public static final class a extends zi3 {
        public static final a a = new a();
    }

    /* compiled from: ArchiveSideEffect.kt */
    public static abstract class b extends zi3 {

        /* compiled from: ArchiveSideEffect.kt */
        public static final class a extends b {
            public final List<String> a;

            public a(List<String> list) {
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
                return ms9.a(')', new StringBuilder("MultiplePhotos(photosUrls="), this.a);
            }
        }

        /* compiled from: ArchiveSideEffect.kt */
        /* renamed from: xsna.zi3$b$b, reason: collision with other inner class name */
        public static final class C4180b extends b {
            public final String a;

            public C4180b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4180b) && epx.f(this.a, ((C4180b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("SinglePhoto(photoUrl="), this.a, ')');
            }
        }
    }

    /* compiled from: ArchiveSideEffect.kt */
    public static final class c extends zi3 {
    }

    /* compiled from: ArchiveSideEffect.kt */
    public static abstract class d extends zi3 {

        /* compiled from: ArchiveSideEffect.kt */
        public static final class a extends d {
            public final PhotoAlbum a;

            public a(PhotoAlbum photoAlbum) {
                this.a = photoAlbum;
            }
        }

        /* compiled from: ArchiveSideEffect.kt */
        public static final class b extends d {
            public final UserId a;

            public b(UserId userId) {
                this.a = userId;
            }
        }

        /* compiled from: ArchiveSideEffect.kt */
        public static final class c extends d {
            public final int a;
            public final VKList<Photo> b;

            public c(int i, VKList<Photo> vKList) {
                this.a = i;
                this.b = vKList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "ToPhotoViewer(photoPosition=" + this.a + ", photos=" + this.b + ')';
            }
        }
    }

    /* compiled from: ArchiveSideEffect.kt */
    public static final class e extends zi3 {
        public static final e a = new e();
    }

    /* compiled from: ArchiveSideEffect.kt */
    public static final class f extends zi3 {
        public final List<Photo> a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends Photo> list) {
            this.a = list;
        }
    }

    /* compiled from: ArchiveSideEffect.kt */
    public static final class g extends zi3 {
        public final j7k0 a;

        public g(j7k0 j7k0Var) {
            this.a = j7k0Var;
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
            return "Snackbar(snackbarData=" + this.a + ')';
        }
    }
}
